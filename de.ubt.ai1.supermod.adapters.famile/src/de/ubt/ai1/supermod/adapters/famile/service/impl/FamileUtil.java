package de.ubt.ai1.supermod.adapters.famile.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import de.ubt.ai1.f2dmm.DependencyConflictStrategy;
import de.ubt.ai1.f2dmm.F2DMMFactory;
import de.ubt.ai1.f2dmm.F2DMMPackage;
import de.ubt.ai1.f2dmm.MappingModel;
import de.ubt.ai1.f2dmm.MissingAnnotationStrategy;
import de.ubt.ai1.f2dmm.PropagationStrategy;
import de.ubt.ai1.f2dmm.sync.dm2mm.ImperativeJavaF2DMMSynchronizer;
import de.ubt.ai1.famile.F2DMMInstance;
import de.ubt.ai1.famile.FamileFactory;
import de.ubt.ai1.famile.FamilePackage;
import de.ubt.ai1.famile.ProductLine;
import de.ubt.ai1.fm.FeaturemodelFactory;
import de.ubt.ai1.fm.FeaturemodelPackage;
import de.ubt.ai1.fm.Root;

/**
 * 
 * @author Alexander Zimmer
 * @date 2017-11-23
 *
 */
public class FamileUtil {
	private IFolder featureModelFolder;
	private IFolder mappingModelFolder;
	private IFolder domainModelFolder;

	protected Resource featureModelRes;
	protected Resource famileFileRes;

	public void toggleFamileNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();

			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 1, natures.length);
			newNatures[0] = "de.ubt.ai1.famile.nature.FamileNature";
			description.setNatureIds(newNatures);
			project.setDescription(description, null);

			prepareProject(project);

		} catch (CoreException e) {
			// Something went wrong
			e.printStackTrace();
		}
	}

	private void prepareProject(IProject project) {
		// when adding the famile nature
		// 1. create a feature model folder
		// 2. create a mapping model folder
		// 3. create an initial feature model in 1.
		// 4. create a famile model in 2.
		try {
			featureModelFolder = project.getFolder("featuremodel");
			if (!featureModelFolder.exists())
				featureModelFolder.create(IResource.FOLDER, true, new NullProgressMonitor());

			mappingModelFolder = project.getFolder("mappingmodel");
			if (!mappingModelFolder.exists())
				mappingModelFolder.create(IResource.FOLDER, true, new NullProgressMonitor());

			domainModelFolder = project.getFolder("domainmodel");
			if (!domainModelFolder.exists())
				domainModelFolder.create(IResource.FOLDER, true, new NullProgressMonitor());

			// 5. Builder hinzufügen
			IProjectDescription desc = project.getDescription();
			ICommand[] commands = desc.getBuildSpec();
			for (int i = 0; i < commands.length; ++i) {
				if (commands[i].getBuilderName().equals("de.ubt.ai1.famile.nature.IncrementalFamileProjectBuilder")) {
					break;
				} else {
					ICommand[] newCommands = new ICommand[commands.length + 1];
					System.arraycopy(commands, 0, newCommands, 0, commands.length);
					ICommand command = desc.newCommand();
					command.setBuilderName("de.ubt.ai1.famile.nature.IncrementalFamileProjectBuilder");
					newCommands[newCommands.length - 1] = command;
					desc.setBuildSpec(newCommands);

					project.setDescription(desc, null);
				}
			}
			createModels(project);

		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

	private boolean createModels(IProject project) {
		try {
			// Remember the file.
			//
			final IFile featureModelFile = getFeatureModelFile(project);
			final IFile famileModelFile = getFamileModelFile(project);

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor progressMonitor) {
					try {
						// Create a resource set
						//
						ResourceSet resourceSet = new ResourceSetImpl();

						// Get the URI of the model files.
						//
						URI featureFileURI = URI.createPlatformResourceURI(featureModelFile.getFullPath().toString(),
								true);
						URI famileFileURI = URI.createPlatformResourceURI(famileModelFile.getFullPath().toString(),
								true);

						// Create a resource for that files.
						//
						featureModelRes = resourceSet.createResource(featureFileURI);
						famileFileRes = resourceSet.createResource(famileFileURI);

						// Add the initial model object to the contents.
						//
						EObject featureRootObject = createInitialFeatureModel();
						if (featureRootObject != null) {
							featureModelRes.getContents().add(featureRootObject);
						}
						EObject productLine = createInitialFamileModel();

						// add References to feature model
						((ProductLine) productLine).setFeatureModel((Root) featureRootObject);
						if (productLine != null) {
							famileFileRes.getContents().add(productLine);
						}

						IProject project = (IProject) mappingModelFolder.getParent();
						((ProductLine) productLine).setName(project.getName());

						// Save the contents of the resources to the file
						// system.
						Map<Object, Object> options = new HashMap<Object, Object>();
						options.put(XMLResource.OPTION_ENCODING, "UTF-8");
						featureModelRes.save(options);
						famileFileRes.save(options);
					} catch (Exception exception) {
						exception.printStackTrace();
					} finally {
						progressMonitor.done();
					}
				}
			};

			operation.run(new NullProgressMonitor());

			return true;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}

	}

	public MappingModel createMapping(String pathToDomainFile, ResourceSet rs, IProject project) {
		try {
			// create domain model famile resource
			final IFile domainModelFile = project.getFile(pathToDomainFile);
			URI domainModelURI = URI.createPlatformResourceURI(domainModelFile.getFullPath().toString(), true);
			Resource domainModelFileRes = rs.getResource(domainModelURI, true);
			EObject dmRoot = domainModelFileRes.getContents().get(0);

			de.ubt.ai1.famile.Resource dmResource = createFamileResource();
			dmResource.getRootElements().add(dmRoot);
			dmResource.setUri(domainModelURI.toPlatformString(true));

			// fetch productline
			famileFileRes.load(null);
			ProductLine productLine = (ProductLine) famileFileRes.getContents().get(0);

			// fetch feature model
			featureModelRes.load(null);
			Root fmRoot = (Root) featureModelRes.getContents().get(0);

			// create f2dmm resource for mapped file
			createFolderHierarchy(project, pathToDomainFile);
			final IFile mappingFile = getF2DMMFile(pathToDomainFile);
			URI mappingFileURI = URI.createPlatformResourceURI(mappingFile.getFullPath().toString(), true);
			Resource mappingFileRes = rs.createResource(mappingFileURI);

			// set propagation strategy parameters
			PropagationStrategy propagationStrategy = createPropagationStrategy();
			propagationStrategy.setTransitive(true);
			propagationStrategy.setMissingAnnotationStrategy(MissingAnnotationStrategy.FORWARD);
			propagationStrategy.setDependencyConflictStrategy(DependencyConflictStrategy.FORWARD);
			propagationStrategy.setIncludeIncomplete(true);

			// create mapping model
			MappingModel mappModel = createMappingModel();
			mappModel.setFeatureModel(fmRoot);
			mappModel.setCurrentFeatureConfiguration(null);
			mappModel.setName("Mapping" + pathToDomainFile);
			mappModel.getDomainModel().add(dmRoot);
			mappModel.setPropagationStrategy(propagationStrategy);

			mappingFileRes.getContents().add(mappModel);

			// create f2ddm instance
			F2DMMInstance f2dmm = createF2DMMInstance();
			f2dmm.setName("F2DMM" + pathToDomainFile);
			f2dmm.setLinkToMappingModel(mappModel);
			f2dmm.setDomainModel(dmResource);
			f2dmm.setFeatureExprStr("true");

			productLine.getMappingModels().add(f2dmm);

			// build mappings
			ImperativeJavaF2DMMSynchronizer mappingSynchronizer = new ImperativeJavaF2DMMSynchronizer(null, mappModel);
			mappingSynchronizer.enforce();

			mappingFileRes.save(null);
			famileFileRes.save(null);
			return mappModel;
		} catch (Exception exception) {
			exception.printStackTrace();
			// TODO Return value
			return null;
		}
	}

	private IFile getFeatureModelFile(IProject project) throws CoreException {
		IPath featureModelPath = featureModelFolder.getFullPath().append(project.getName() + ".featuremodel");
		return ResourcesPlugin.getWorkspace().getRoot().getFile(featureModelPath);
	}

	private IFile getFamileModelFile(IProject project) throws CoreException {
		IPath famileModelPath = mappingModelFolder.getFullPath().append(project.getName() + ".famile");
		return ResourcesPlugin.getWorkspace().getRoot().getFile(famileModelPath);
	}

	private IFile getF2DMMFile(String pathToDomainFile) throws CoreException {
		IPath pathToF2DMMFile = mappingModelFolder.getFullPath().append(pathToDomainFile + ".f2dmm");
		return ResourcesPlugin.getWorkspace().getRoot().getFile(pathToF2DMMFile);
	}

	protected F2DMMInstance createF2DMMInstance() {
		FamileFactory famileFactory = FamilePackage.eINSTANCE.getFamileFactory();
		return famileFactory.createF2DMMInstance();
	}

	protected EObject createInitialFeatureModel() {
		FeaturemodelFactory featuremodelFactory = FeaturemodelPackage.eINSTANCE.getFeaturemodelFactory();
		EClass eClass = (EClass) FeaturemodelPackage.eINSTANCE.getEClassifier("Root");
		EObject rootObject = featuremodelFactory.create(eClass);
		return rootObject;
	}

	protected EObject createInitialFamileModel() {
		FamileFactory famileFactory = FamilePackage.eINSTANCE.getFamileFactory();
		ProductLine root = famileFactory.createProductLine();
		return root;
	}

	protected de.ubt.ai1.famile.Resource createFamileResource() {
		FamileFactory famileFactory = FamilePackage.eINSTANCE.getFamileFactory();
		de.ubt.ai1.famile.Resource famRes = famileFactory.createResource();
		return famRes;
	}

	protected MappingModel createMappingModel() {
		F2DMMFactory f2 = F2DMMPackage.eINSTANCE.getF2DMMFactory();
		return f2.createMappingModel();
	}

	protected PropagationStrategy createPropagationStrategy() {
		F2DMMFactory f2 = F2DMMPackage.eINSTANCE.getF2DMMFactory();
		return f2.createPropagationStrategy();
	}

	private void createFolderHierarchy(IProject project, String pathToDomainFile) throws CoreException {
		List<String> domainFileHierarchy = new ArrayList<String>(Arrays.asList(pathToDomainFile.split("/")));
		int sizeOfPath = domainFileHierarchy.size() - 1;
		domainFileHierarchy.remove(sizeOfPath);
		String mmFolder = "mappingmodel/";
		for (String file : domainFileHierarchy) {
			IFolder domainFolder = project.getFolder(mmFolder + file);
			if (!domainFolder.exists()) {
				domainFolder.create(IResource.FOLDER, true, new NullProgressMonitor());
				mmFolder = mmFolder.concat(file + "/");
			}
		}
	}

	public URI getF2DMMFileUri(String pathToDomainFile) {
		IFile mappingFile = null;
		try {
			mappingFile = getF2DMMFile(pathToDomainFile);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return URI.createPlatformResourceURI(mappingFile.getFullPath().toString(), true);
	}
}

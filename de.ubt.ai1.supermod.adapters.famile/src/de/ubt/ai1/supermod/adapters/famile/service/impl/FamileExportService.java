package de.ubt.ai1.supermod.adapters.famile.service.impl;

import java.io.IOException;
import java.util.Map.Entry;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.f2dmm.MappingModel;
import de.ubt.ai1.f2dmm.ObjectMapping;
import de.ubt.ai1.fm.Root;
import de.ubt.ai1.supermod.adapters.famile.service.IFamileExportService;
import de.ubt.ai1.supermod.adapters.famile.service.IFeatureModelTrafoService;
import de.ubt.ai1.supermod.adapters.famile.service.IVisibilityTransformationService;
import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.emffile.EMFFileContent;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.client.EMFFileExportTrace;
import de.ubt.ai1.supermod.mm.emffile.client.impl.EMFFileExportTraceImpl;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.RootRelationship;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileSystemExportTrace;
import de.ubt.ai1.supermod.service.IProductDimensionFilterService;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.IProductDimensionExportService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductSpaceDescriptorInitializationService;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.file.File;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * 
 * @author Alexander Zimmer
 * @date 2017-10-25
 *
 */
public class FamileExportService implements IFamileExportService {

	@Inject
	private FamileUtil famileUtil;

	@Inject
	private IVisibilityTransformationService visTrafoService;

	@Inject
	private IFeatureVersionDimensionProvider fmProvider;

//	@Inject
//	private IRevisionGraphProvider rgProvider;

	@Inject
	@de.ubt.ai1.supermod.service.feature.Feature
	private IProductDimensionFilterService fmFilterService;

	@Inject
	@File
	private IProductDimensionFilterService fileFilterService;

	@Inject
	@Revision
	private IChoiceSpecificationService revisionChoiceService;

	@Inject
	private ICompositeChoiceSpecificationService compChoiceService;

	@Inject
	private IFeatureModelTrafoService fmModelTrafoService;

	@Inject
	private IVersionedFileSystemProvider vsfProvider;

	@Inject
	@File
	private IProductDimensionExportService exportService;

	@Inject
	private ISingleVersionProductSpaceDescriptorInitializationService psDescInitService;

	@Inject
	private ISingleVersionFileSystemDescriptorProvider svfsProvider;

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.ubt.ai1.supermod.adapters.famile.service.IFamileExportService
	 * #canExport(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean canExport(LocalRepository repo) {
		return repo != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.ubt.ai1.supermod.adapters.famile.service.IFamileExportService
	 * #export(de.ubt.ai1.supermod.mm.client.LocalRepository,
	 * org.eclipse.emf.ecore.resource.ResourceSet,
	 * org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public boolean export(LocalRepository repo, ResourceSet rs, IProgressMonitor progressMonitor)
			throws SuperModException, CoreException, IOException {

//		VersionDimension rg = rgProvider.getRevisionGraph(repo.getVersionSpace());
		FeatureModel fm = fmProvider.getFeatureDimension(repo.getVersionSpace());
		OptionBinding choice = compChoiceService.specifyCompositeChoice(repo.getVersionSpace(), repo.getLocalChoice(),
				null);
		// OptionBinding choice = revisionChoiceService.specifyChoice(rg, null, null);
		// for (Option o : fm.getOptions()) {
		// choice.bind(o, Tristate.TRUE);
		// }
		choice = repo.getVersionSpace().applyAllCompletions(choice);

		FeatureModel filteredFm = (FeatureModel) fmFilterService.filter(fm, choice);

		IProject project = ServiceUtil.createProject("", progressMonitor);
		String projectName = project.getName();
		famileUtil.toggleFamileNature(project);
		org.eclipse.emf.ecore.resource.Resource fmRes = rs.createResource(org.eclipse.emf.common.util.URI
				.createPlatformResourceURI(projectName + "/featuremodel/" + projectName + ".featuremodel", true));

		fmRes.load(null);
		Root famileFm = (Root) fmRes.getContents().get(0);
		transformFeatureModel(filteredFm, famileFm);
		fmRes.save(null);

		SingleVersionProductSpaceDescriptor psDescriptor = psDescInitService
				.initializeSingleVersionProductSpaceDescriptor(projectName, rs, false);
		SingleVersionFileSystemDescriptor svfs = svfsProvider.getSingleVersionFileSystemDescriptor(psDescriptor);
		svfs.setRootUri("/" + projectName);

		VersionedFileSystem vfs = vsfProvider.getVersionedFileSystem(repo.getProductSpace());
		VersionedFileSystem fvfs = (VersionedFileSystem) fileFilterService.filter(vfs, choice);
		VersionedFileSystemExportTrace exportTrace = (VersionedFileSystemExportTrace) exportService.export(fvfs, svfs);

		EMap<String, VersionedFileExportTrace> pathToVersionedFile = exportTrace.getPathToVersionedFileMap();
		initializeFamileMapping(pathToVersionedFile, project, choice);

		fmRes.save(null);
		return true;
	}

	private void initializeFamileMapping(EMap<String, VersionedFileExportTrace> pathToFile, IProject project,
			OptionBinding choice) throws IOException {

		// initialize famile mapping for every EMF File in export trace
		for (Entry<String, VersionedFileExportTrace> entry : pathToFile.entrySet()) {
			if ((entry.getValue() instanceof EMFFileExportTraceImpl)) {
				EMFFileExportTrace emfFileTrace = (EMFFileExportTrace) entry.getValue();

				// fetch all EMFObjects of current file
				VersionedFileContent content = emfFileTrace.getVersionedFile().getContent();
				EList<EMFObject> emfObjects = ((EMFFileContent) content).getObjects();

				// fetch resource set of current file trace
				ResourceSet correspondingRs = ServiceUtil.getCorrespondingRsSet(emfFileTrace);

				// create famile mapping
				MappingModel mappModel = famileUtil.createMapping(entry.getKey(), correspondingRs, project);
				URI mappingFileURI = famileUtil.getF2DMMFileUri(entry.getKey());

				// load mapping file resource
				Resource mappingFileRes = correspondingRs.getResource(mappingFileURI, true);
				mappingFileRes.load(null);

				// transform visibilities for every EMFObject
				for (EMFObject emfObject : emfObjects) {
					// fetch EObject to corresponding EMFObject
					EObject eObject = emfFileTrace.getEmfObjectToEObjectMap().get(emfObject);

					// fetch ObjectMapping to corresponding EObject
					ObjectMapping objectMapping = mappModel.getObjectMapping(eObject);

					// transform visibilities of given ObjectMapping
					visTrafoService.setMappingVisibilities(emfObject, objectMapping, choice);
				}

				mappingFileRes.save(null);
			}
		}
	}

	public boolean transformFeatureModel(FeatureModel filteredFm, Root fmRoot) {
		Feature smRoot = null;

		EList<RootRelationship> roots = filteredFm.getRoots();

		if (roots.size() == 0)
			throw new IllegalArgumentException("Featuremodel of SuperMod has no root!");

		// transform root features
		if (roots.size() == 1) {
			smRoot = roots.get(0).getFeature();
			fmModelTrafoService.transformFeatureAttributes(smRoot, fmRoot);
		}

		// transform parent/child relationships
		if (smRoot.getChildren().size() > 0) {
			fmModelTrafoService.transformChildren(smRoot, fmRoot);
		}

		// transform xor/or groups
		fmModelTrafoService.transformXorOrGroups(smRoot);

		// transform require/exclude dependencies
		fmModelTrafoService.transformFeatureDependencies(smRoot);
		return true;
	}

	public String transformVisibilities(OptionExpr optionRef, OptionBinding choice) {
		return visTrafoService.transformVisibilities(optionRef, choice);
	}
}

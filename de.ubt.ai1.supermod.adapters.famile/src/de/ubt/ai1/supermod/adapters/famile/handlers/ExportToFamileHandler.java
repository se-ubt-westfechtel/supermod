package de.ubt.ai1.supermod.adapters.famile.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.adapters.famile.service.IFamileExportService;
import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.IMetadataResourceHandler;
import de.ubt.ai1.supermod.vcs.client.team.handlers.SuperModCommandHandler;

/**
 * UI action for the optional VCS operation "Export to FAMILE".
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	25.10.2017
 */
public class ExportToFamileHandler extends SuperModCommandHandler {

	@Override
	protected boolean canRun(List<?> selection) {
		for (IProject p : findRelevantProjects(selection)) {	
			try {
				ResourceSet rs = createResourceSet();
				String uri = p.getFullPath().toPortableString();
				IMetadataResourceHandler metadataHandler = 
						getServiceForResource(p, rs, IMetadataResourceHandler.class);
				LocalRepository repo = metadataHandler.getRepository(
						uri, rs);
				IFamileExportService exporter = getServiceForResource(p, rs, IFamileExportService.class);
				if (!exporter.canExport(repo)) {
					return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

	@Override
	protected void run(List<?> selection) {
		List<String> notExported = new ArrayList<>();
		for (IProject p : findRelevantProjects(selection)) {
			try {
				ResourceSet rs = createResourceSet();
				String uri = p.getFullPath().toPortableString();
				IMetadataResourceHandler metadataHandler = 
						getServiceForResource(p, rs, IMetadataResourceHandler.class);
				LocalRepository repo = metadataHandler.getRepository(uri, rs);
				IFamileExportService exporter = getServiceForResource(p, rs, IFamileExportService.class);
				if (exporter.canExport(repo)) {
					if (exporter.export(repo, rs, new NullProgressMonitor())) {
						saveAllResources(rs);
					}
					else {
						notExported.add(uri);
					}
				}
				else {
					notExported.add(uri);
				}
			} catch (Exception e) {
				handle(e);
			}
		}
		if (!notExported.isEmpty()) {
			warn("Some resources have not been exported to FAMILE.",
					"The following resources could not be exported:\n"
					+ linewise(notExported));
		}
		refresh();		
	}

	@Override
	protected String getTaskDescription() {
		return "Exporting SuperMod project to FAMILE";
	}

}

package de.ubt.ai1.supermod.adapters.famile.service;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.supermod.adapters.famile.service.impl.FamileExportService;
import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;

/**
 * Interface for the VCS operation "Export to FAMILE". It asks the user
 * for a complete version selection. Furthermore, an export location must
 * be specified. On this location, a new FAMILE project is initialized and
 * the contents are transferred from the SuperMod to the FAMILE format.
 * Only the contents of the selected revision are transferred. The selected
 * variant (i.e., feature configuration) is used as reference variant for
 * the creation of FAMILE domain models. Contents belonging to the same
 * revision but do not pass the specified choice are modeled as FAMILE
 * alternative mappings. Both the feature model and the mapping (persisted
 * in SuperMod visibilities) are transferred to a FAMILE feature model and
 * a mapping model, respectively.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	13.06.2016
 */
@ImplementedBy(FamileExportService.class)
public interface IFamileExportService {

	/**
	 * To be implemented by clients in order to return whether the given
	 * SuperMod repository can be exported to FAMILE.
	 * 
	 * @param repo
	 * @return
	 */
	public boolean canExport(LocalRepository repo);

	/**
	 * To be implemented in order to perform the export itself.
	 * 
	 * @param repo
	 * @param rs
	 * @param progressMonitor
	 * @return
	 * @throws CoreException 
	 * @throws IOException 
	 */
	public boolean export(LocalRepository repo, ResourceSet rs,
			IProgressMonitor progressMonitor) throws SuperModException, CoreException, IOException;

}

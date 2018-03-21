package de.ubt.ai1.util.emf;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * Utility class to transform EMF resources and Eclipse resource into each other
 * 
 * @author Felix Schwaegerl
 */
public class AI1ResourceUtil {
	
	/**
	 * Converts an Eclipse IPath into an EMF platform:/resource URI.
	 * 
	 * @param path
	 * @return
	 */
	public static URI iPathToPlatformURI(IPath path) {
		return URI.createPlatformResourceURI(path.toString(), true);
	}

	/**
	 * Converts an Eclipse IResource into an EMF platform:/resource URI.
	 * 
	 * @param iResource
	 * @return
	 */
	public static URI iResourceToPlatformURI(IResource iResource) {
		return URI.createPlatformResourceURI(
				iResource.getFullPath().toString(), true);
	}

	/**
	 * Creates and returns an EMF resource from a given Eclipse IPath and a
	 * EMF resource set to contain the result.
	 * 
	 * @param path
	 * @param rs
	 * @return
	 */
	public static Resource iPathToEResource(IPath path,
			ResourceSet rs) {
		URI platformUri = iPathToPlatformURI(path);
		return rs.getResource(platformUri, true);
	}
	
	/**
	 * Creates and returns an EMF resource from a given Eclipse IResource and a
	 * EMF resource set to contain the result.
	 * 
	 * @param iResource
	 * @param rs
	 * @return
	 */
	public static Resource iResourceToEResource(IResource iResource,
			ResourceSet rs) {
		URI platformUri = iResourceToPlatformURI(iResource);
		return rs.getResource(platformUri, true);
	}

	/**
	 * Converts an EMF platform:/resource URI into an Eclipse IResource.
	 * 
	 * @param uri
	 * @return
	 */
	public static IResource platformURIToIResource(URI uri) {
		if (uri == null) return null;
		String platformString = uri.toPlatformString(true);
		if (platformString == null) return null;
		return ResourcesPlugin.getWorkspace().getRoot()
				.findMember(platformString);
	}

	/**
	 * Converts an EMF resource into an Eclipse IResource.
	 * 
	 * @param eResource
	 * @return
	 */
	public static IResource eResourceToIResource(Resource eResource) {
		if (eResource != null) {
			URI uri = eResource.getURI();
			return platformURIToIResource(uri);
		}
		return null;
	}

}

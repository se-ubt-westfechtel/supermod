package de.ubt.ai1.util.emf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * Utility class that provides functions frequently needed
 * for the XMI representation of EMF objects.
 * 
 * @author Felix Schwaegerl
 */
public class AI1XMIUtil {
	
	/**
	 * Converts a given EMF object, which represents a self-contained
	 * object tree, into its XMI representation.
	 * 
	 * @param eo
	 * @param rs the resource set to use
	 * @return the XMI representation of eo
	 * @throws IOException
	 */
	public static String objectToXMI(EObject eo, ResourceSet rs) throws IOException {
		XMIResource xmiRes = new XMIResourceImpl();
		rs.getResources().add(xmiRes);
		xmiRes.getContents().add(eo);
		StringWriter writer = new StringWriter();
		xmiRes.save(writer, null);
		return writer.toString();
	}
	
	/**
	 * Parses the content of an XMI file and creates an EMF object
	 * out of it.
	 * 
	 * @param xmi
	 * @param rs the resource set to use
	 * @return the EMF object parsed from the xmi string
	 * @throws IOException
	 */
	public static EObject xmiToObject(String xmi, ResourceSet rs) throws IOException {
		XMIResource xmiRes = new XMIResourceImpl();
		rs.getResources().add(xmiRes);
		InputStream is = new ByteArrayInputStream(xmi.getBytes());
		xmiRes.load(is, null);
		return xmiRes.getContents().get(0);
	}

}

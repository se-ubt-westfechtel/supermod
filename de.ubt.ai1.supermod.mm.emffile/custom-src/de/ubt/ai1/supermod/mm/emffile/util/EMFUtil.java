package de.ubt.ai1.supermod.mm.emffile.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EMFUtil {	

	public static String eObjectToUriString(EObject eObject) {
		return EcoreUtil.getURI(eObject).toString();
	}

	public static EObject uriStringToEObject(String eObjectUri, ResourceSet rs) {
		URI uri = URI.createURI(eObjectUri, true);
		return rs.getEObject(uri, true);
	}
	
	public static EClass findRegisteredEClass(String packageUri, String className) {
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(packageUri);
		if (ePackage != null) {
			EClassifier eClassifier = ePackage.getEClassifier(className);
			if (eClassifier instanceof EClass) {
				return (EClass) eClassifier;
			}
		}
		return null;
	}
	
}

/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.client.impl;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.file.client.IFileHasher;

/**
 * An implementation of the file hasher interface that uses SHA1 digests in
 * order to hash the contents of a file in the local workspace.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class SHA1FileHasher implements IFileHasher {

	public static final String SHA1 = "SHA1";
	
	private Map<String, String> cache = new HashMap<>();
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.IFileHasher
	 * #hash(org.eclipse.core.resources.IFile)
	 */
	@Override
	public String hash(IFile file) throws SuperModClientWrappedException {
		String cacheKey = file.getFullPath().toPortableString() +
				"?" + file.getModificationStamp();
		if (cache.containsKey(cacheKey)) {
			return cache.get(cacheKey);
		}
		else {
			String cacheValue = digestFile(file);
			cache.put(cacheKey, cacheValue);
			return cacheValue;
		}
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.IFileHasher
	 * #updateHashes(de.ubt.ai1.supermod.mm.file.client.
	 * SingleVersionFileSystemDescriptor)
	 */
	@Override
	public void updateHashes(SingleVersionFileSystemDescriptor descriptor) 
			throws SuperModClientWrappedException {
		IContainer container = (IContainer) ResourcesPlugin.getWorkspace()
				.getRoot().findMember(descriptor.getRootUri());
		for (SingleVersionResourceDescriptor resDesc : descriptor
				.getAllResources()) {
			if (resDesc.isVersioned() && resDesc 
					instanceof SingleVersionFileDescriptor) {
				IResource file = container.findMember(resDesc.getPath());
				if (file instanceof IFile) {
					String hash = hash((IFile) file);
					((SingleVersionFileDescriptor) resDesc).setHash(hash);
				}
			}
		}
	}

	/**
	 * @return the SHA1 digest.
	 */
	private static MessageDigest getDigest() {
		try {
			return MessageDigest.getInstance(SHA1);
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
	}
	
	/**
	 * Digests the content of a specified input stream and returns a
	 * corresponding hexadecimal string
	 *
	 * @param bis a buffered input stream whose contents to digest.
	 * @return a hexadecimal string representing the SHA1 digest of
	 * 			<code>is</code>.
	 */
	private static String digestInputStream(BufferedInputStream bis) {
		MessageDigest sha1 = getDigest();
		byte[] buffer = new byte[1024];
		try {
			while (bis.available() > 0) {
				bis.read(buffer);
			}
			sha1.update(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		StringBuffer sb = new StringBuffer();
		byte[] hashBytes = sha1.digest();
		for (int i = 0; i < hashBytes.length; i++) {
			sb.append(Integer.toString((hashBytes[i] & 0xff) + 0x100, 16)
					.substring(1));
		}
		return sb.toString();
	}
	
	/**
	 * Digests the file by digesting its input stream.
	 * 
	 * @see #digestInputStream(InputStream)
	 * @param file the file to digest.
	 * @return the digest.
	 * @throws SuperModClientWrappedException in case an error occurs while
	 * 			creating or reading the file's input stream.
	 */
	private static String digestFile(IFile file)
			throws SuperModClientWrappedException {
		InputStream is = null;
		try {
			file.refreshLocal(0, new NullProgressMonitor());
			if (file.exists()) {
				is = file.getContents();
				if (is != null) {
					BufferedInputStream bis = new BufferedInputStream(is);
					return digestInputStream(bis);
				}
			}
		} catch (CoreException e) {
			throw new SuperModClientWrappedException(e);
		}
		finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				throw new SuperModClientWrappedException(e);
			}
		}
		return null;
	}

}

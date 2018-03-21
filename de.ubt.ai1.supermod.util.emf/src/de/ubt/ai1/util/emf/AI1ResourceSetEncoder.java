/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.util.emf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * Utility for persisting entire resource sets in text files. It is assumed
 * that resource sets are serialized in the following format:<br/>
 * <code>---URI---</code><br/>
 * <code>relative/uri/to/first/resource</code><br/>
 * <code>---CONTENT---</code><br/>
 * <code>&lt;xml&gt;XMI content of first resource&lt;/xml&gt;</code><br/>
 * <code>---END---</code><br/>
 * <code>---URI---</code><br/>
 * <code>relative/uri/to/second/resource</code><br/>
 * <code>---CONTENT---</code><br/>
 * <code>&lt;xml&gt;XMI content of second resource&lt;/xml&gt;</code><br/>
 * <code>---END---</code><br/>
 * The concrete persistence mechanism is abstracted by using input and output
 * streams.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.10.2015
 */
public class AI1ResourceSetEncoder {
	
	public static final String SEPARATOR_URI = "---URI---";
	
	public static final String SEPARATOR_CONTENT = "---CONTENT---";
	
	public static final String SEPARATOR_END = "---END---";
	
	public static final Map<Object, Object> SAVE_OPTIONS = new HashMap<>();
	static {
		SAVE_OPTIONS.put(XMLResource.OPTION_PROCESS_DANGLING_HREF,
				XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
	}
	
	public static final Map<Object, Object> LOAD_OPTIONS = new HashMap<>();
	static {
		LOAD_OPTIONS.put(XMLResource.OPTION_PROCESS_DANGLING_HREF,
				XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
	}

	/**
	 * Encodes the specified resource set and writes the resulting string
	 * representation to the specified output stream
	 *
	 * @param base all URIs will be deresolved by this URI
	 * @param rs resource set to encode
	 * @param os where to write encoded resources
	 * @throws IOException
	 */
	public static void encodeResourceSet(URI base, ResourceSet rs, OutputStream os) 
			throws IOException {
		boolean first = true;
		for (Resource r : rs.getResources()) {
			os.write(((first ? "" : "\n") + SEPARATOR_URI + "\n").getBytes());			
			os.write((r.getURI().deresolve(base).toString()).getBytes());			
			os.write(("\n" + SEPARATOR_CONTENT + "\n").getBytes());
			r.save(os, SAVE_OPTIONS);
			os.write(("\n" + SEPARATOR_END).getBytes());
			first = false;
		}
		os.flush();
	}
	
	/**
	 * Decodes a resource set from a specified input stream and adds the
	 * contents to the specified resource set. As a side effect, corresponding
	 * files are created.
	 * 
	 * @param base all URIs will be resolved by this URI
	 * @param rs resource set to contain decoded contents
	 * @param is input to decode
	 * @throws IOException
	 */
	public static void decodeResourceSet(URI base, ResourceSet rs, InputStream is) 
			throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		List<URI> uris = new ArrayList<>();
		while (reader.ready()) {
			
			String sepUri = reader.readLine();
			if (!sepUri.equals(SEPARATOR_URI)) {
				throw new IOException();
			}

			String uri = reader.readLine();
			URI resUri = URI.createURI(uri).resolve(base);
			uris.add(resUri);

			String sepContent = reader.readLine();
			if (!sepContent.equals(SEPARATOR_CONTENT)) {
				throw new IOException();
			}
			
			File xmiFile = new File(resUri.toFileString());
			if (!xmiFile.getParentFile().exists()) {
				xmiFile.getParentFile().mkdirs();
			}
			xmiFile.createNewFile();
			BufferedWriter xmiWriter = new BufferedWriter(
					new FileWriter(xmiFile));
			boolean first = true;
			while (reader.ready()) {
				String line = reader.readLine();
				if (line.equals(SEPARATOR_END)) break;
				xmiWriter.append((first ? "" : "\n") + line);
				first = false;
			}
			xmiWriter.close();
		}
		
		for (URI uri : uris) {
			Resource r = rs.createResource(uri);
			try {
				r.load(LOAD_OPTIONS);
			}
			catch (Exception e) {
				r.load(LOAD_OPTIONS);
			}
		}
	}

}

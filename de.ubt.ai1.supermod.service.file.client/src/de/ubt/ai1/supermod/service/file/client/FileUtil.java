/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.client;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

/**
 * Auxiliary operations for handling local eclipse files which appear in the
 * workspace of SuperMod repositories.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class FileUtil {

	/**
	 * Returns all direct or indirect members of a specified resource container
	 * relevant in a specific versioning scenario.
	 *
	 * @param root the container whose direct and indirect members to find.
	 * @param ignoreTeamPrivateMembers if true, team private members will not
	 * 			be included in the result.
	 * @param ignoreDerivedMembers if true, derived resources will not be
	 * 			included in the result.
	 * @param ignoreLinkedMembers if true, linked members will not be included
	 * 			in the result.
	 * @return a list of direct and indirect contents which match the
	 * 			specification given in the arguments.
	 * @throws CoreException
	 */
	public static List<IResource> allMembers(IContainer root, 
			boolean ignoreTeamPrivateMembers,
			boolean ignoreDerivedMembers, boolean ignoreLinkedMembers) 
					throws CoreException {
		List<IResource> allMembers = new ArrayList<>();
		for (IResource member : root.members()) {
			if (isRelevantToVersionControl(ignoreTeamPrivateMembers,
					ignoreDerivedMembers, ignoreLinkedMembers, member)) {
				allMembers.add(member);
				if (member instanceof IContainer) {
					allMembers.addAll(allMembers((IContainer) member, 
							ignoreTeamPrivateMembers, 
							ignoreDerivedMembers, ignoreLinkedMembers));
				}
			}
		}
		return allMembers;
	}

	/**
	 * Determines whether a specific member of a file system is relevant to
	 * version control.
	 *
	 * @param ignoreTeamPrivateMembers if true, team private members are never
	 * 			relevant.
	 * @param ignoreDerivedMembers if true, derived resources are never
	 * 			relevant.
	 * @param ignoreLinkedMembers if true, linked members are never relevant.
	 * @param member the member to determine relevance for.
	 * @return whether the member is relevant.
	 */
	public static boolean isRelevantToVersionControl(
			boolean ignoreTeamPrivateMembers, boolean ignoreDerivedMembers,
			boolean ignoreLinkedMembers, IResource member) {
		return (!ignoreTeamPrivateMembers || (!member.isTeamPrivateMember()
				&& !isMetadata(member))) &&
				(!ignoreDerivedMembers || !member.isDerived()) &&
				(!ignoreLinkedMembers || !isLinked(member));
	}
	
	/**
	 * Determines whether a specific member of an Eclipse file system is
	 * considered as Supermod meta-data.
	 *
	 * @param resource the member to check.
	 * @return whether the specified resource is considered as Supermod
	 * 			meta-data.
	 */
	public static boolean isMetadata(IResource resource) {
		String metaPath = resource.getProject().getFullPath()
				.toPortableString() + "/.supermod";
		return resource.getFullPath().toPortableString().contains(metaPath);
	}

	/**
	 * Determines whether a specific member of an Eclipse file system is linked.
	 *
	 * @param resource
	 * @return whether the specified resource is linked.
	 */
	public static boolean isLinked(IResource resource) {
		String linkedParentName = resource.getProjectRelativePath().segment(0);
		IFolder linkedParent = resource.getProject()
				.getFolder(linkedParentName);
		boolean isLinked = linkedParent.isLinked();
		return isLinked;
	}

	/**
	 * Makes a specified absolute path relative to a specified base path. Both
	 * paths are specified as simple strings, assuming that resources are
	 * nested with slashes.
	 *
	 * @param base
	 * @param absolute
	 * @return the relative path, if <code>absolute</code> contains
	 * 			<code>base</code>, else the absolute path.
	 */
	public static String makeRelative(String base, String absolute) {
		if (base != null && absolute != null && absolute.startsWith(base) &&
				absolute.length() > base.length()) {
			return absolute.substring(base.length() + 1);
		}
		return absolute;
	}

}

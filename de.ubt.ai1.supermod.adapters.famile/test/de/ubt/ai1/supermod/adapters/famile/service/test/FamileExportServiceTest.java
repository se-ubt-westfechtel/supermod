package de.ubt.ai1.supermod.adapters.famile.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

import de.ubt.ai1.fm.AtomicFeature;
import de.ubt.ai1.fm.FeatureGroup;
import de.ubt.ai1.fm.FeaturemodelFactory;
import de.ubt.ai1.fm.FeaturemodelPackage;
import de.ubt.ai1.fm.Root;
import de.ubt.ai1.supermod.adapters.famile.service.impl.FamileExportService;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.DisplayName;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureExclusion;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.FeatureRequirement;
import de.ubt.ai1.supermod.mm.feature.GroupMembership;
import de.ubt.ai1.supermod.mm.feature.Mandatory;
import de.ubt.ai1.supermod.mm.feature.OrFeatureGroup;
import de.ubt.ai1.supermod.mm.feature.RootRelationship;
import de.ubt.ai1.supermod.mm.feature.SuperModFeatureFactory;
import de.ubt.ai1.supermod.mm.feature.XorFeatureGroup;
import de.ubt.ai1.supermod.module.hetfile.revfeat.client.HetfileRevfeatClientModuleInjectorProvider;

public class FamileExportServiceTest {

	private FamileExportService famileExportService;

	private FeatureModel smFeatureModel;
	private Root fmRoot;

	private Feature smRootFeature;
	private Feature smMainFeature;
	private Feature smNormal1Feature;
	private Feature smNormal2Feature;

	// SUPERMOD
	private FeatureGroup fmMainFeature;
	private AtomicFeature fmNormal1Feature;
	private AtomicFeature fmNormal2Feature;

	@Before
	public void setup() {
		HetfileRevfeatClientModuleInjectorProvider provider = new HetfileRevfeatClientModuleInjectorProvider();
		Injector inj = provider.getModuleInjector();
		famileExportService = inj.getInstance(FamileExportService.class);

		// SUPERMOD
		smFeatureModel = createSmFeatureModel();
		Feature rootFeature = createSmFeature("Root");
		setMandatory(rootFeature);
		RootRelationship smRootRel = createSmRootRelationship(rootFeature);
		smFeatureModel.getRoots().add(smRootRel);

		Feature mainFeature = createSmFeature("Main");
		setMandatory(mainFeature);
		createSmChildRelationship(rootFeature, mainFeature);

		// NORMAL CHILDREN
		Feature normal1Feature = createSmFeature("normal1");
		setMandatory(normal1Feature);
		createSmChildRelationship(mainFeature, normal1Feature);

		Feature normal2Feature = createSmFeature("normal2");
		createSmChildRelationship(mainFeature, normal2Feature);

		// OR
		Feature or1FeatureA = createSmFeature("or1A");
		createSmChildRelationship(mainFeature, or1FeatureA);
		GroupMembership orMemberShip1A = createGroupMembership(or1FeatureA);

		Feature or2FeatureA = createSmFeature("or2A");
		createSmChildRelationship(mainFeature, or2FeatureA);
		GroupMembership orMemberShip2A = createGroupMembership(or2FeatureA);

		List<GroupMembership> orGroupMembersA = new LinkedList<GroupMembership>();
		orGroupMembersA.add(orMemberShip1A);
		orGroupMembersA.add(orMemberShip2A);
		createOrFeatureGroup(mainFeature, orGroupMembersA);

		Feature or1FeatureB = createSmFeature("or1B");
		createSmChildRelationship(mainFeature, or1FeatureB);
		GroupMembership orMemberShip1B = createGroupMembership(or1FeatureB);

		Feature or2FeatureB = createSmFeature("or2B");
		createSmChildRelationship(mainFeature, or2FeatureB);
		GroupMembership orMemberShip2B = createGroupMembership(or2FeatureB);

		Feature or3FeatureB = createSmFeature("or3B");
		createSmChildRelationship(mainFeature, or3FeatureB);
		GroupMembership orMemberShip3B = createGroupMembership(or3FeatureB);

		List<GroupMembership> orGroupMembersB = new LinkedList<GroupMembership>();
		orGroupMembersB.add(orMemberShip1B);
		orGroupMembersB.add(orMemberShip2B);
		orGroupMembersB.add(orMemberShip3B);
		createOrFeatureGroup(mainFeature, orGroupMembersB);

		// XOR
		Feature xor1Feature = createSmFeature("xor1");
		createSmChildRelationship(mainFeature, xor1Feature);
		GroupMembership xorMemberShip1 = createGroupMembership(xor1Feature);

		Feature xor2Feature = createSmFeature("xor2");
		createSmChildRelationship(mainFeature, xor2Feature);
		GroupMembership xorMemberShip2 = createGroupMembership(xor2Feature);

		Feature xor3Feature = createSmFeature("xor3");
		createSmChildRelationship(mainFeature, xor3Feature);
		GroupMembership xorMemberShip3 = createGroupMembership(xor3Feature);

		List<GroupMembership> xorGroupMembers = new LinkedList<GroupMembership>();
		xorGroupMembers.add(xorMemberShip1);
		xorGroupMembers.add(xorMemberShip2);
		xorGroupMembers.add(xorMemberShip3);
		createXorFeatureGroup(mainFeature, xorGroupMembers);

		createFeatureRequirement(or1FeatureA, xor1Feature);
		createFeatureRequirement(or2FeatureA, xor1Feature);

		createFeatureExclusion(normal1Feature, xor3Feature);
		createFeatureExclusion(normal2Feature, or2FeatureA);
		createFeatureExclusion(normal2Feature, xor1Feature);

		List<Feature> features = new LinkedList<Feature>();
		features.add(rootFeature);
		features.add(mainFeature);
		features.add(normal1Feature);
		features.add(normal2Feature);
		features.add(or1FeatureA);
		features.add(or2FeatureA);
		features.add(or1FeatureB);
		features.add(or2FeatureB);
		features.add(or3FeatureB);
		features.add(xor1Feature);
		features.add(xor2Feature);
		features.add(xor3Feature);
		smFeatureModel.getFeatures().addAll(features);

		// FAMILE
		fmRoot = createFmRootFeature();

		famileExportService.transformFeatureModel(smFeatureModel, fmRoot);

		// SUPERMOD
		smRootFeature = smFeatureModel.getRoots().get(0).getFeature();
		smMainFeature = smRootFeature.getChildren().get(0).getChild();
		smNormal1Feature = smMainFeature.getChildren().get(0).getChild();
		smNormal2Feature = smMainFeature.getChildren().get(1).getChild();

		// FAMILE
		fmMainFeature = (FeatureGroup) fmRoot.getChildren().get(0);
		fmNormal1Feature = (AtomicFeature) fmMainFeature.getChildren().get(0);
		fmNormal2Feature = (AtomicFeature) fmMainFeature.getChildren().get(1);
	}

	@Test
	public void testAtomicProperties() {
		// roots
		assertEquals(smRootFeature.getNames().get(0).getDisplayName(), fmRoot.getName());

		// mandatory
		assertEquals(smNormal1Feature.getMandatory() != null, fmNormal1Feature.isRequired());
		assertEquals(smNormal1Feature.getNames().get(0).getDisplayName(), fmNormal1Feature.getName());
		assertTrue(fmNormal1Feature.isRequired());
		assertFalse(fmNormal1Feature.isOptional());

		// optional
		assertEquals(smNormal2Feature.getMandatory() == null, fmNormal2Feature.isOptional());
		assertEquals(smNormal2Feature.getNames().get(0).getDisplayName(), fmNormal2Feature.getName());
		assertTrue(fmNormal2Feature.isOptional());
		assertFalse(fmNormal2Feature.isRequired());
	}

	@Test
	public void testOrFeatureGroups() {
		// SUPERMOD
		de.ubt.ai1.supermod.mm.feature.FeatureGroup smOrGroup1A = smMainFeature.getGroups().get(0);
		Feature smOr1A = smMainFeature.getChildren().get(2).getChild();
		Feature smOr2A = smMainFeature.getChildren().get(3).getChild();

		de.ubt.ai1.supermod.mm.feature.FeatureGroup smOrGroup1B = smMainFeature.getGroups().get(1);
		Feature smOr1B = smMainFeature.getChildren().get(4).getChild();
		Feature smOr2B = smMainFeature.getChildren().get(5).getChild();
		Feature smOr3B = smMainFeature.getChildren().get(6).getChild();

		// FAMILE
		FeatureGroup fmOrGroup1A = (FeatureGroup) fmMainFeature.getChildren().get(2);
		AtomicFeature fmOr1A = (AtomicFeature) fmOrGroup1A.getChildren().get(0);
		AtomicFeature fmOr2A = (AtomicFeature) fmOrGroup1A.getChildren().get(1);

		FeatureGroup fmOrGroup1B = (FeatureGroup) fmMainFeature.getChildren().get(3);
		AtomicFeature fmOr1B = (AtomicFeature) fmOrGroup1B.getChildren().get(0);
		AtomicFeature fmOr2B = (AtomicFeature) fmOrGroup1B.getChildren().get(1);
		AtomicFeature fmOr3B = (AtomicFeature) fmOrGroup1B.getChildren().get(2);

		// names
		assertEquals(smOr1A.getNames().get(0).getDisplayName(), fmOr1A.getName());
		assertEquals(smOr2A.getNames().get(0).getDisplayName(), fmOr2A.getName());
		assertEquals(smOr1B.getNames().get(0).getDisplayName(), fmOr1B.getName());
		assertEquals(smOr2B.getNames().get(0).getDisplayName(), fmOr2B.getName());
		assertEquals(smOr3B.getNames().get(0).getDisplayName(), fmOr3B.getName());

		// nested feature group names
		assertEquals(fmOrGroup1A.getName(), "OR");
		assertEquals(fmOrGroup1B.getName(), "OR");
		assertNotEquals(fmOrGroup1A.getName(), "XOR");

		// amount of children
		assertEquals(smOrGroup1A.getGroupedFeatures().size(), fmOrGroup1A.getChildren().size());
		assertEquals(smOrGroup1B.getGroupedFeatures().size(), fmOrGroup1B.getChildren().size());

		// min/max select of new nested featuregroups
		assertEquals(fmOrGroup1A.getMinSelect(), 1);
		assertEquals(fmOrGroup1A.getMaxSelect(), -1);
		assertEquals(fmOrGroup1B.getMinSelect(), 1);
		assertEquals(fmOrGroup1B.getMaxSelect(), -1);

	}

	@Test
	public void testXorFeatureGroups() {

		// SUPERMOD
		de.ubt.ai1.supermod.mm.feature.FeatureGroup smXorGroup = smMainFeature.getGroups().get(2);
		Feature smXor1 = smMainFeature.getChildren().get(7).getChild();
		Feature smXor2 = smMainFeature.getChildren().get(8).getChild();
		Feature smXor3 = smMainFeature.getChildren().get(9).getChild();

		// FAMILE
		FeatureGroup fmXorGroup = (FeatureGroup) fmMainFeature.getChildren().get(4);
		AtomicFeature fmXor1 = (AtomicFeature) fmXorGroup.getChildren().get(0);
		AtomicFeature fmXor2 = (AtomicFeature) fmXorGroup.getChildren().get(1);
		AtomicFeature fmXor3 = (AtomicFeature) fmXorGroup.getChildren().get(2);

		// names
		assertEquals(smXor1.getNames().get(0).getDisplayName(), fmXor1.getName());
		assertEquals(smXor2.getNames().get(0).getDisplayName(), fmXor2.getName());
		assertEquals(smXor3.getNames().get(0).getDisplayName(), fmXor3.getName());

		// nested feature group names
		assertEquals(fmXorGroup.getName(), "XOR");
		assertNotEquals(fmXorGroup.getName(), "OR");

		// amount of children
		assertEquals(smXorGroup.getGroupedFeatures().size(), fmXorGroup.getChildren().size());

		// min/max select of new nested featuregroups
		assertEquals(fmXorGroup.getMinSelect(), 1);
		assertEquals(fmXorGroup.getMaxSelect(), 1);
		assertNotEquals(fmXorGroup.getMaxSelect(), -1);

	}

	@Test
	public void testRequirements() {
		// SUPERMOD
		Feature smOr1A = smMainFeature.getChildren().get(2).getChild();
		Feature smXor1RequiredBysmOr1A = smOr1A.getOutgoingDependencies().get(0).getTargetFeature();
		
		// FAMILE
		FeatureGroup fmXorGroup = (FeatureGroup) fmMainFeature.getChildren().get(4);
		AtomicFeature fmXor1 = (AtomicFeature) fmXorGroup.getChildren().get(0);
		
		FeatureGroup fmOrGroup1A = (FeatureGroup) fmMainFeature.getChildren().get(2);
		AtomicFeature fmOr1A = (AtomicFeature) fmOrGroup1A.getChildren().get(0);
		AtomicFeature fmOr2A = (AtomicFeature) fmOrGroup1A.getChildren().get(1);
		
		// Tests
		assertEquals(smXor1RequiredBysmOr1A.getNames().get(0).getDisplayName(), fmOr1A.getRequires().get(0).getName());
		
		assertEquals(fmOr1A.getRequires().get(0), fmXor1);
		assertEquals(fmOr2A.getRequires().get(0), fmXor1);
		
		assertEquals(fmXor1.getRequiredBy().get(0), fmOr1A);
		assertEquals(fmXor1.getRequiredBy().get(1), fmOr2A);
		
		assertEquals(fmXor1.getRequiredBy().size(), 2);
		
		
	}

	@Test
	public void testExcludes() {
		// FAMILE
		FeatureGroup fmXorGroup = (FeatureGroup) fmMainFeature.getChildren().get(4);
		AtomicFeature fmXor1 = (AtomicFeature) fmXorGroup.getChildren().get(0);
		AtomicFeature fmXor3 = (AtomicFeature) fmXorGroup.getChildren().get(2);
		AtomicFeature fmXor3Excluded = (AtomicFeature) fmNormal1Feature.getExcludes().get(0);
		AtomicFeature fmOr2AExcluded = (AtomicFeature) fmNormal2Feature.getExcludes().get(0);
		AtomicFeature fmXor1Excluded = (AtomicFeature) fmNormal2Feature.getExcludes().get(1);

		assertEquals(fmNormal1Feature.getExcludes().size(), 1);
		assertNotEquals(fmNormal1Feature.getExcludes().size(), 10);
		assertEquals(fmNormal1Feature.getRequires().size(), 0);
		assertEquals(smMainFeature.getChildren().get(9).getChild().getNames().get(0).getDisplayName(),
				fmXor3Excluded.getName());
		assertEquals(fmXor3Excluded.getExcludedBy().size(), 1);
		assertEquals(fmXor3.getExcludedBy().get(0), fmNormal1Feature);
		assertEquals(fmXor3, fmXor3Excluded);

		assertEquals(fmNormal2Feature.getExcludes().size(), 2);
		assertNotEquals(fmNormal2Feature.getExcludes().size(), 1);
		assertEquals(smMainFeature.getChildren().get(3).getChild().getNames().get(0).getDisplayName(),
				fmOr2AExcluded.getName());
		assertEquals(smMainFeature.getChildren().get(7).getChild().getNames().get(0).getDisplayName(),
				fmXor1Excluded.getName());
		assertEquals(fmXor1.getExcludedBy().get(0), fmNormal2Feature);
		assertEquals(fmXor1, fmXor1Excluded);
	}

	// SUPERMOD

	private FeatureModel createSmFeatureModel() {
		return SuperModFeatureFactory.eINSTANCE.createFeatureModel();
	}

	private Feature createSmFeature(String name) {
		DisplayName displayName = SuperModFeatureFactory.eINSTANCE.createDisplayName();
		displayName.setDisplayName(name);

		Feature f = SuperModFeatureFactory.eINSTANCE.createFeature();
		f.getNames().add(displayName);
		return f;
	}

	private void setMandatory(Feature feature) {
		Mandatory mandatory = SuperModFeatureFactory.eINSTANCE.createMandatory();
		mandatory.setFeature(feature);
	}

	private RootRelationship createSmRootRelationship(Feature rootFeature) {
		RootRelationship rootRel = SuperModFeatureFactory.eINSTANCE.createRootRelationship();
		rootRel.setFeature(rootFeature);
		return rootRel;
	}

	private ChildRelationship createSmChildRelationship(Feature parent, Feature child) {
		ChildRelationship childRel = SuperModFeatureFactory.eINSTANCE.createChildRelationship();
		childRel.setParent(parent);
		childRel.setChild(child);
		return childRel;
	}

	private GroupMembership createGroupMembership(Feature groupedFeature) {
		GroupMembership groupMember = SuperModFeatureFactory.eINSTANCE.createGroupMembership();
		groupMember.setGroupedFeature(groupedFeature);
		return groupMember;
	}

	private OrFeatureGroup createOrFeatureGroup(Feature parent, List<GroupMembership> groupMembers) {
		OrFeatureGroup orGroup = SuperModFeatureFactory.eINSTANCE.createOrFeatureGroup();
		orGroup.setParentFeature(parent);
		orGroup.getGroupedFeatures().addAll(groupMembers);
		return orGroup;
	}

	private XorFeatureGroup createXorFeatureGroup(Feature parent, List<GroupMembership> groupMembers) {
		XorFeatureGroup xorGroup = SuperModFeatureFactory.eINSTANCE.createXorFeatureGroup();
		xorGroup.setParentFeature(parent);
		xorGroup.getGroupedFeatures().addAll(groupMembers);
		return xorGroup;
	}

	private FeatureRequirement createFeatureRequirement(Feature sourceFeature, Feature targetFeature) {
		FeatureRequirement requirement = SuperModFeatureFactory.eINSTANCE.createFeatureRequirement();
		requirement.setSourceFeature(sourceFeature);
		requirement.setTargetFeature(targetFeature);
		return requirement;
	}

	private FeatureExclusion createFeatureExclusion(Feature sourceFeature, Feature targetFeature) {
		FeatureExclusion exclusion = SuperModFeatureFactory.eINSTANCE.createFeatureExclusion();
		exclusion.setSourceFeature(sourceFeature);
		exclusion.setTargetFeature(targetFeature);
		return exclusion;
	}

	// FAMILE

	private Root createFmRootFeature() {
		FeaturemodelFactory featuremodelFactory = FeaturemodelPackage.eINSTANCE.getFeaturemodelFactory();
		return featuremodelFactory.createRoot();
	}
}

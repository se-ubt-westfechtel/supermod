package de.ubt.ai1.supermod.adapters.famile.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

import de.ubt.ai1.supermod.adapters.famile.service.impl.FamileExportService;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.impl.SuperModCoreFactoryImpl;
import de.ubt.ai1.supermod.mm.feature.DisplayName;
import de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl;
import de.ubt.ai1.supermod.mm.feature.impl.SuperModFeatureFactoryImpl;
import de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl;
import de.ubt.ai1.supermod.mm.revision.impl.SuperModRevisionFactoryImpl;
import de.ubt.ai1.supermod.module.hetfile.revfeat.client.HetfileRevfeatClientModuleInjectorProvider;

public class FamileExportServiceTest2 {

	private FamileExportService famileExportService;

	@Before
	public void setup() {
		HetfileRevfeatClientModuleInjectorProvider provider = new HetfileRevfeatClientModuleInjectorProvider();
		Injector inj = provider.getModuleInjector();
		famileExportService = inj.getInstance(FamileExportService.class);
	}

	@Test
	public void testSpecificNames() {
		FeatureImpl f1 = createFeature("fäö 1");
		FeatureImpl f2 = createFeature("Feature Name Test ''' 1");
		FeatureImpl f3 = createFeature("f 3");
		FeatureImpl f4 = createFeature("f?4");
		RevisionImpl rev1 = createRevision(1);

		Option featOpt1 = createOption(f1.getNames().get(0).getDisplayName());
		Option featOpt2 = createOption(f2.getNames().get(0).getDisplayName());
		Option featOpt3 = createOption(f3.getNames().get(0).getDisplayName());
		Option featOpt4 = createOption(f4.getNames().get(0).getDisplayName());
		Option revOption1 = createOption("r" + String.valueOf(rev1.getRevisionNumber()));

		OptionRef featOptionRef1 = createOptionRef(featOpt1);
		OptionRef featOptionRef2 = createOptionRef(featOpt2);
		OptionRef featOptionRef3 = createOptionRef(featOpt3);
		OptionRef featOptionRef4 = createOptionRef(featOpt4);
		OptionRef revOptionRef = createOptionRef(revOption1);

		f1.setFeatureOption(featOpt1);
		f2.setFeatureOption(featOpt2);
		f3.setFeatureOption(featOpt3);
		f4.setFeatureOption(featOpt4);
		rev1.setRevisionOption(revOption1);

		OptionBinding choiceTrueTrueTrue = createOptionBinding();
		choiceTrueTrueTrue.getBoundOptions().put(featOpt1, Tristate.TRUE);
		choiceTrueTrueTrue.getBoundOptions().put(featOpt2, Tristate.TRUE);
		choiceTrueTrueTrue.getBoundOptions().put(featOpt3, Tristate.TRUE);
		choiceTrueTrueTrue.getBoundOptions().put(featOpt4, Tristate.TRUE);
		choiceTrueTrueTrue.getBoundOptions().put(revOption1, Tristate.TRUE);

		OptionBinding choiceTrueFalseFalse = createOptionBinding();
		choiceTrueFalseFalse.getBoundOptions().put(featOpt1, Tristate.TRUE);
		choiceTrueFalseFalse.getBoundOptions().put(featOpt2, Tristate.FALSE);
		choiceTrueFalseFalse.getBoundOptions().put(revOption1, Tristate.FALSE);

		OptionExpr andTrTr = createAndExpr(featOptionRef1, revOptionRef);
		String visAndTrTr = famileExportService.transformVisibilities(andTrTr, choiceTrueTrueTrue);

		assertEquals("\"fäö 1\"", visAndTrTr);
		assertNotEquals("fäö 1", visAndTrTr);

		OptionExpr andTrFa = createAndExpr(featOptionRef1, revOptionRef);
		String visAndTrFa = famileExportService.transformVisibilities(andTrFa, choiceTrueFalseFalse);

		assertEquals("false", visAndTrFa);

		OptionExpr andFTrF2Fa = createAndExpr(featOptionRef1, featOptionRef2);
		String visAndFTrF2Fa = famileExportService.transformVisibilities(andFTrF2Fa, choiceTrueFalseFalse);

		assertEquals("(\"fäö 1\" and \"Feature Name Test ''' 1\")", visAndFTrF2Fa);

		OptionExpr andTrTr2 = createAndExpr(featOptionRef3, featOptionRef4);
		String visAndTrTr2 = famileExportService.transformVisibilities(andTrTr2, choiceTrueTrueTrue);
		assertEquals("(\"f 3\" and \"f?4\")", visAndTrTr2);
	}
	
	@Test
	public void testXorExpr() {
		FeatureImpl feat1 = createFeature("f1");
		FeatureImpl feat2 = createFeature("f2");
		FeatureImpl feat3 = createFeature("f3");
		FeatureImpl feat4 = createFeature("f4");
		RevisionImpl rev1 = createRevision(1);
		RevisionImpl rev2 = createRevision(2);
		RevisionImpl rev3 = createRevision(3);

		Option featOpt1 = createOption(feat1.getNames().get(0).getDisplayName());
		Option featOpt2 = createOption(feat2.getNames().get(0).getDisplayName());
		Option featOpt3 = createOption(feat3.getNames().get(0).getDisplayName());
		Option featOpt4 = createOption(feat4.getNames().get(0).getDisplayName());
		Option revOpt1 = createOption("r" + String.valueOf(rev1.getRevisionNumber()));
		Option revOpt2 = createOption("r" + String.valueOf(rev2.getRevisionNumber()));
		Option revOpt3 = createOption("r" + String.valueOf(rev3.getRevisionNumber()));
		
		feat1.setFeatureOption(featOpt1);
		feat2.setFeatureOption(featOpt2);
		feat3.setFeatureOption(featOpt3);
		feat4.setFeatureOption(featOpt4);
		rev1.setRevisionOption(revOpt1);
		rev2.setRevisionOption(revOpt2);
		rev3.setRevisionOption(revOpt3);

		OptionBinding choice = createOptionBinding();
		choice.getBoundOptions().put(featOpt1, Tristate.TRUE);
		choice.getBoundOptions().put(featOpt2, Tristate.FALSE);
		choice.getBoundOptions().put(featOpt3, Tristate.TRUE);
		choice.getBoundOptions().put(featOpt4, Tristate.TRUE);
		choice.getBoundOptions().put(revOpt1, Tristate.TRUE);
		choice.getBoundOptions().put(revOpt2, Tristate.TRUE);
		choice.getBoundOptions().put(revOpt3, Tristate.FALSE);

		OptionRef f1 = createOptionRef(featOpt1);
		OptionRef f2 = createOptionRef(featOpt2);
//		OptionRef f3 = createOptionRef(featOpt3);
//		OptionRef f4 = createOptionRef(featOpt4);
		OptionRef r1 = createOptionRef(revOpt1);
//		OptionRef r2 = createOptionRef(revOpt2);
		OptionRef r3 = createOptionRef(revOpt3);
		
		// (f1 xor r1) true, true --> neg(f1) --> "not f1"
		OptionExpr f1Xorr1TrTr = createXorExpr(f1, r1);
		String visF1Xorr1TrTr = famileExportService.transformVisibilities(f1Xorr1TrTr, choice);
		
		assertEquals("not f1", visF1Xorr1TrTr);
		
		// (f1 xor r3) true, false --> "f1"
		OptionExpr f1Xorr3TrFa = createXorExpr(f1, r3);
		String visF1Xorr3TrFa = famileExportService.transformVisibilities(f1Xorr3TrFa, choice);
		
		assertEquals("f1", visF1Xorr3TrFa);
		
		// ((f1 and f2) xor r1) true, true, true
		OptionExpr f1Andf2TrTr = createAndExpr(f1, f2);
		OptionExpr f1Andf2Xorr1TrTrTr = createXorExpr(f1Andf2TrTr, r1);
		String visF1Andf2Xorr1TrTrTr = famileExportService.transformVisibilities(f1Andf2Xorr1TrTrTr, choice);
		
		assertEquals("not (f1 and f2)", visF1Andf2Xorr1TrTrTr);
	}

	@Test
	public void testNegExpr() {
		FeatureImpl f1 = createFeature("f1");
		RevisionImpl rev1 = createRevision(1);

		Option featOpt = createOption(f1.getNames().get(0).getDisplayName());
		Option revOption = createOption("r" + String.valueOf(rev1.getRevisionNumber()));

		OptionRef featOptionRef = createOptionRef(featOpt);
		OptionRef revOptionRef = createOptionRef(revOption);

		f1.setFeatureOption(featOpt);
		rev1.setRevisionOption(revOption);

		OptionBinding choiceTrueTrue = createOptionBinding();
		choiceTrueTrue.getBoundOptions().put(featOpt, Tristate.TRUE);
		choiceTrueTrue.getBoundOptions().put(revOption, Tristate.TRUE);

		OptionBinding choiceTrueFalse = createOptionBinding();
		choiceTrueFalse.getBoundOptions().put(featOpt, Tristate.TRUE);
		choiceTrueFalse.getBoundOptions().put(revOption, Tristate.FALSE);

		// (f1 and r1) --> true, true
		OptionExpr andExprTrTr = createAndExpr(featOptionRef, revOptionRef);
		String visAndTrTr = famileExportService.transformVisibilities(andExprTrTr, choiceTrueTrue);

		// not (f1 and r1) --> true, true
		OptionExpr negAndExprTrTr = createNegExpr(andExprTrTr);
		String visNegAndTrTr = famileExportService.transformVisibilities(negAndExprTrTr, choiceTrueTrue);

		// (f1 and r1) --> true, false
		OptionExpr andExprTrFa = createAndExpr(featOptionRef, revOptionRef);
		String visAndTrFa = famileExportService.transformVisibilities(andExprTrFa, choiceTrueFalse);

		// not (f1 and r1) --> true, false
		OptionExpr negAndExprTrFa = createNegExpr(andExprTrFa);
		String visNegAndTrFa = famileExportService.transformVisibilities(negAndExprTrFa, choiceTrueFalse);

		assertEquals("f1", visAndTrTr);

		assertEquals("not f1", visNegAndTrTr);

		assertEquals("false", visAndTrFa);

		assertEquals("true", visNegAndTrFa);

		OptionExpr andRevFeatTrTr = createAndExpr(revOptionRef, featOptionRef);
		String visAndRevFeatTrTr = famileExportService.transformVisibilities(andRevFeatTrTr, choiceTrueTrue);

		OptionExpr andNegRevFeatTrTr = createNegExpr(andRevFeatTrTr);
		String visNegAndRevFeatTrTr = famileExportService.transformVisibilities(andNegRevFeatTrTr, choiceTrueTrue);

		assertEquals("f1", visAndRevFeatTrTr);

		assertEquals("not f1", visNegAndRevFeatTrTr);
	}

	@Test
	public void testPlainAndExpr() {
		FeatureImpl f1 = createFeature("f1");
		RevisionImpl rev1 = createRevision(1);

		Option featOpt = createOption(f1.getNames().get(0).getDisplayName());
		Option revOption = createOption("r" + String.valueOf(rev1.getRevisionNumber()));

		OptionRef featOptionRef = createOptionRef(featOpt);
		OptionRef revOptionRef = createOptionRef(revOption);

		f1.setFeatureOption(featOpt);
		rev1.setRevisionOption(revOption);

		OptionBinding choiceTrueTrue = createOptionBinding();
		choiceTrueTrue.getBoundOptions().put(featOpt, Tristate.TRUE);
		choiceTrueTrue.getBoundOptions().put(revOption, Tristate.TRUE);

		OptionBinding choiceTrueFalse = createOptionBinding();
		choiceTrueFalse.getBoundOptions().put(featOpt, Tristate.TRUE);
		choiceTrueFalse.getBoundOptions().put(revOption, Tristate.FALSE);

		// (f1 and r1) --> true, true
		OptionExpr andExprTrTr = createAndExpr(featOptionRef, revOptionRef);
		String visAndTrTr = famileExportService.transformVisibilities(andExprTrTr, choiceTrueTrue);

		// (f1 and r1) --> true, false
		OptionExpr andExprTrFa = createAndExpr(featOptionRef, revOptionRef);
		String visAndTrFa = famileExportService.transformVisibilities(andExprTrFa, choiceTrueFalse);

		// (f1 nand r1) --> true, true
		OptionExpr nandExprTrTr = featOptionRef.nand(revOptionRef);
		String visNandTrTr = famileExportService.transformVisibilities(nandExprTrTr, choiceTrueTrue);

		// (f1 or r1) --> true, true
		OptionExpr orExprTrTr = createOrExpr(featOptionRef, revOptionRef);
		String visOrTrTr = famileExportService.transformVisibilities(orExprTrTr, choiceTrueTrue);

		// (f1 or r1) --> true, false
		OptionExpr orExprTrFa = createOrExpr(featOptionRef, revOptionRef);
		String visOrTrFa = famileExportService.transformVisibilities(orExprTrFa, choiceTrueFalse);

		assertEquals("f1", visAndTrTr);
		assertNotEquals("(f1 and r1)", visAndTrTr);

		assertEquals("false", visAndTrFa);

		assertEquals("false", visNandTrTr);

		assertEquals("true", visOrTrTr);

		assertEquals("f1", visOrTrFa);
	}

	@Test
	public void testTwoRevisions() {

		RevisionImpl rev1 = createRevision(1);
		RevisionImpl rev2 = createRevision(2);
		RevisionImpl rev3 = createRevision(3);
		RevisionImpl rev4 = createRevision(4);

		Option revOpt1 = createOption("r" + String.valueOf(rev1.getRevisionNumber()));
		Option revOpt2 = createOption("r" + String.valueOf(rev2.getRevisionNumber()));
		Option revOpt3 = createOption("r" + String.valueOf(rev3.getRevisionNumber()));
		Option revOpt4 = createOption("r" + String.valueOf(rev4.getRevisionNumber()));

		OptionBinding choice = createOptionBinding();
		choice.getBoundOptions().put(revOpt1, Tristate.TRUE);
		choice.getBoundOptions().put(revOpt2, Tristate.TRUE);
		choice.getBoundOptions().put(revOpt3, Tristate.FALSE);
		choice.getBoundOptions().put(revOpt4, Tristate.FALSE);

		OptionRef r1 = createOptionRef(revOpt1);
		OptionRef r2 = createOptionRef(revOpt2);
		OptionRef r3 = createOptionRef(revOpt3);
		OptionRef r4 = createOptionRef(revOpt4);

		rev1.setRevisionOption(revOpt1);
		rev2.setRevisionOption(revOpt2);
		rev3.setRevisionOption(revOpt3);
		rev4.setRevisionOption(revOpt4);

		// all and
		OptionExpr r1AndR2TrTr = createAndExpr(r1, r2);
		String visR1AndR2TrTr = famileExportService.transformVisibilities(r1AndR2TrTr, choice);

		assertEquals("true", visR1AndR2TrTr);
		assertNotEquals("false", visR1AndR2TrTr);

		OptionExpr r1AndR3TrFa = createAndExpr(r1, r3);
		String visR1AndR3TrFa = famileExportService.transformVisibilities(r1AndR3TrFa, choice);

		assertEquals("false", visR1AndR3TrFa);
		assertNotEquals("true", visR1AndR3TrFa);

		OptionExpr r3AndR2FaTr = createAndExpr(r3, r2);
		String visR3AndR2FaTr = famileExportService.transformVisibilities(r3AndR2FaTr, choice);

		assertEquals("false", visR3AndR2FaTr);
		assertNotEquals("true", visR3AndR2FaTr);

		OptionExpr r3AndR4FaFa = createAndExpr(r3, r4);
		String visR3AndR4FaFa = famileExportService.transformVisibilities(r3AndR4FaFa, choice);

		assertEquals("false", visR3AndR4FaFa);
		assertNotEquals("falsefalse", visR3AndR4FaFa);

		// all nand
		OptionExpr r1NandR2TrTr = createNandExpr(r1, r2);
		String visR1NandR2TrTr = famileExportService.transformVisibilities(r1NandR2TrTr, choice);

		assertEquals("false", visR1NandR2TrTr);
		assertNotEquals("true", visR1NandR2TrTr);

		OptionExpr r1NandR3TrFa = createNandExpr(r1, r3);
		String visR1NandR3TrFa = famileExportService.transformVisibilities(r1NandR3TrFa, choice);

		assertEquals("true", visR1NandR3TrFa);
		assertNotEquals("false", visR1NandR3TrFa);

		OptionExpr r3NandR2FaTr = createNandExpr(r3, r2);
		String visR3NandR2FaTr = famileExportService.transformVisibilities(r3NandR2FaTr, choice);

		assertEquals("false", visR3NandR2FaTr);
		assertNotEquals("true", visR3NandR2FaTr);

		OptionExpr r3NandR4FaFa = createNandExpr(r3, r4);
		String visR3NandR4FaFa = famileExportService.transformVisibilities(r3NandR4FaFa, choice);

		assertEquals("false", visR3NandR4FaFa);
		assertNotEquals("true", visR3NandR4FaFa);

		// all or
		OptionExpr r1OrR2TrTr = createOrExpr(r1, r2);
		String visR1OrR2TrTr = famileExportService.transformVisibilities(r1OrR2TrTr, choice);

		assertEquals("true", visR1OrR2TrTr);

		OptionExpr r1OrR3TrFa = createOrExpr(r1, r3);
		String visR1OrR3TrFa = famileExportService.transformVisibilities(r1OrR3TrFa, choice);

		assertEquals("true", visR1OrR3TrFa);

		OptionExpr r3OrR2FaTr = createOrExpr(r3, r2);
		String visR3OrR2FaTr = famileExportService.transformVisibilities(r3OrR2FaTr, choice);

		assertEquals("true", visR3OrR2FaTr);

		OptionExpr r3OrR4FaFa = createOrExpr(r3, r4);
		String visR3OrR4FaFa = famileExportService.transformVisibilities(r3OrR4FaFa, choice);

		assertEquals("false", visR3OrR4FaFa);
		assertNotEquals("falsefalse", visR3OrR4FaFa);

		// ((false and true) or true) = true
		OptionExpr newR3NandR4FaFa = createNandExpr(r3, r4);
		OptionExpr r3NandR4OrR1FaFaTr = createOrExpr(newR3NandR4FaFa, r1);
		String visR3NandR4OrR1FaFaTr = famileExportService.transformVisibilities(r3NandR4OrR1FaFaTr, choice);

		assertEquals("true", visR3NandR4OrR1FaFaTr);
		assertNotEquals("false", visR3NandR4OrR1FaFaTr);
	}

	@Test
	public void testOneLevelTree() {
		FeatureImpl f1 = createFeature("f1");
		FeatureImpl f2 = createFeature("f2");
		RevisionImpl rev1 = createRevision(1);

		Option option1 = createOption(f1.getNames().get(0).getDisplayName());
		Option option2 = createOption(f2.getNames().get(0).getDisplayName());
		Option option3 = createOption("r" + String.valueOf(rev1.getRevisionNumber()));

		OptionBinding choice = createOptionBinding();
		choice.getBoundOptions().put(option1, Tristate.TRUE);
		choice.getBoundOptions().put(option2, Tristate.TRUE);
		choice.getBoundOptions().put(option3, Tristate.FALSE);

		OptionRef optionRef1 = createOptionRef(option1);
		OptionRef optionRef2 = createOptionRef(option2);
		OptionRef optionRef3 = createOptionRef(option3);

		f1.setFeatureOption(option1);
		f2.setFeatureOption(option2);
		rev1.setRevisionOption(option3);

		// ((f1 and f2)) or r1)
		OptionExpr exprBottom = createAndExpr(optionRef1, optionRef2);
		OptionExpr exprTop = createOrExpr(exprBottom, optionRef3);
		OptionExpr optionExpr = exprTop;
		String andOr = famileExportService.transformVisibilities(optionExpr, choice);

		// ((f1 and f2)) and r1)
		OptionExpr exprBottom2 = createAndExpr(optionRef1, optionRef2);
		OptionExpr exprTop2 = createAndExpr(exprBottom2, optionRef3);
		OptionExpr optionExpr2 = exprTop2;
		String andAnd = famileExportService.transformVisibilities(optionExpr2, choice);

		// ((f1 and f2)) nand r1)
		OptionExpr exprBottom3 = createAndExpr(optionRef1, optionRef2);
		OptionExpr exprTop3 = exprBottom3.nand(optionRef3);
		String andNand = famileExportService.transformVisibilities(exprTop3, choice);

		assertEquals("(f1 and f2)", andOr);
		assertNotEquals("false", andOr);
		assertNotEquals("r1", andOr);

		assertEquals("false", andAnd);
		assertNotEquals("(f1 and f2)", andAnd);

		assertEquals("(f1 and f2)", andNand);
	}

	@Test
	public void testComplexeStructure() {
		FeatureImpl feat1 = createFeature("f1");
		FeatureImpl feat2 = createFeature("f2");
		FeatureImpl feat3 = createFeature("f3");
		FeatureImpl feat4 = createFeature("f4");
		RevisionImpl rev1 = createRevision(1);
		RevisionImpl rev2 = createRevision(2);
		RevisionImpl rev3 = createRevision(3);

		Option featOpt1 = createOption(feat1.getNames().get(0).getDisplayName());
		Option featOpt2 = createOption(feat2.getNames().get(0).getDisplayName());
		Option featOpt3 = createOption(feat3.getNames().get(0).getDisplayName());
		Option featOpt4 = createOption(feat4.getNames().get(0).getDisplayName());
		Option revOpt1 = createOption("r" + String.valueOf(rev1.getRevisionNumber()));
		Option revOpt2 = createOption("r" + String.valueOf(rev2.getRevisionNumber()));
		Option revOpt3 = createOption("r" + String.valueOf(rev3.getRevisionNumber()));

		OptionBinding choice = createOptionBinding();
		choice.getBoundOptions().put(featOpt1, Tristate.TRUE);
		choice.getBoundOptions().put(featOpt2, Tristate.FALSE);
		choice.getBoundOptions().put(featOpt3, Tristate.TRUE);
		choice.getBoundOptions().put(featOpt4, Tristate.TRUE);
		choice.getBoundOptions().put(revOpt1, Tristate.TRUE);
		choice.getBoundOptions().put(revOpt2, Tristate.TRUE);
		choice.getBoundOptions().put(revOpt3, Tristate.FALSE);

		OptionRef f1 = createOptionRef(featOpt1);
		OptionRef f2 = createOptionRef(featOpt2);
		OptionRef f3 = createOptionRef(featOpt3);
		OptionRef f4 = createOptionRef(featOpt4);
		OptionRef r1 = createOptionRef(revOpt1);
		OptionRef r2 = createOptionRef(revOpt2);
		OptionRef r3 = createOptionRef(revOpt3);

		feat1.setFeatureOption(featOpt1);
		feat2.setFeatureOption(featOpt2);
		feat3.setFeatureOption(featOpt3);
		feat4.setFeatureOption(featOpt4);
		rev1.setRevisionOption(revOpt1);
		rev2.setRevisionOption(revOpt2);
		rev3.setRevisionOption(revOpt3);

		OptionExpr f1Andf2 = createAndExpr(f1, f2);
		OptionExpr f1Andf2Andr1 = createAndExpr(f1Andf2, r1);
		OptionExpr f1Andf2Andr1Orf4 = createOrExpr(f1Andf2Andr1, f4);
		OptionExpr f1Andf2Andr1Orf4Nandr2 = createNandExpr(f1Andf2Andr1Orf4, r2);
		OptionExpr f1Andf2Andr1Orf4Nandr2Orr3 = createOrExpr(f1Andf2Andr1Orf4Nandr2, r3);
		String complex1String = famileExportService.transformVisibilities(f1Andf2Andr1Orf4Nandr2Orr3, choice);

		assertEquals("false", complex1String);

		OptionExpr f1f2 = createAndExpr(f1, f2);
		OptionExpr f1f2f3 = createAndExpr(f1f2, f3);
		OptionExpr f1f2f3f4 = createAndExpr(f1f2f3, f4);
		String complex2String = famileExportService.transformVisibilities(f1f2f3f4, choice);

		assertEquals("(((f1 and f2) and f3) and f4)", complex2String);

		OptionExpr f1f2f3f4AndR1 = createAndExpr(f1f2f3f4, r1);
		String complex3String = famileExportService.transformVisibilities(f1f2f3f4AndR1, choice);

		assertEquals("(((f1 and f2) and f3) and f4)", complex3String);

		OptionExpr r1Nandf1 = createNandExpr(r1, f1);
		String complex4String = famileExportService.transformVisibilities(r1Nandf1, choice);

		assertEquals("not f1", complex4String);

		OptionExpr f4f3 = createAndExpr(f4, f3);
		OptionExpr f4f3r1 = createAndExpr(f4f3, r1);
		OptionExpr f4f3r1f2 = createAndExpr(f4f3r1, f2);
		String complex5String = famileExportService.transformVisibilities(f4f3r1f2, choice);

		assertEquals("((f4 and f3) and f2)", complex5String);

		OptionExpr r1f3 = createAndExpr(r1, f3);
		OptionExpr r1f3f2 = createAndExpr(r1f3, f2);
		OptionExpr r1f3f2f4 = createAndExpr(r1f3f2, f4);
		OptionExpr r1f3f2f4f1 = createAndExpr(r1f3f2f4, f1);
		String complex6String = famileExportService.transformVisibilities(r1f3f2f4f1, choice);

		assertEquals("(((f3 and f2) and f4) and f1)", complex6String);
	}

	private Option createOption(String name) {
		Option option = SuperModCoreFactoryImpl.eINSTANCE.createOption();
		option.setName(name);
		return option;
	}

	private OptionBinding createOptionBinding() {
		OptionBinding choice = SuperModCoreFactoryImpl.eINSTANCE.createOptionBinding();
		return choice;
	}

	private OptionRef createOptionRef(Option option) {
		OptionRef optionRef = SuperModCoreFactoryImpl.eINSTANCE.createOptionRef();
		optionRef.setOption(option);
		return optionRef;
	}

	private NegExpr createNegExpr(OptionExpr expr) {
		NegExpr negExpr = SuperModCoreFactoryImpl.eINSTANCE.createNegExpr();
		negExpr.setNeg(expr);
		return negExpr;
	}

	private de.ubt.ai1.supermod.mm.core.AndExpr createAndExpr(OptionExpr left, OptionExpr right) {
		de.ubt.ai1.supermod.mm.core.AndExpr expr = SuperModCoreFactoryImpl.eINSTANCE.createAndExpr();
		expr.setLeft(left);
		expr.setRight(right);
		return expr;
	}

	private de.ubt.ai1.supermod.mm.core.NandExpr createNandExpr(OptionExpr left, OptionExpr right) {
		de.ubt.ai1.supermod.mm.core.NandExpr expr = SuperModCoreFactoryImpl.eINSTANCE.createNandExpr();
		expr.setLeft(left);
		expr.setRight(right);
		return expr;
	}

	private de.ubt.ai1.supermod.mm.core.OrExpr createOrExpr(OptionExpr left, OptionExpr right) {
		de.ubt.ai1.supermod.mm.core.OrExpr expr = SuperModCoreFactoryImpl.eINSTANCE.createOrExpr();
		expr.setLeft(left);
		expr.setRight(right);
		return expr;
	}

	private de.ubt.ai1.supermod.mm.core.XorExpr createXorExpr(OptionExpr left, OptionExpr right) {
		de.ubt.ai1.supermod.mm.core.XorExpr expr = SuperModCoreFactoryImpl.eINSTANCE.createXorExpr();
		expr.setLeft(left);
		expr.setRight(right);
		return expr;
	}

	private RevisionImpl createRevision(int revisionNumber) {
		RevisionImpl rev = (RevisionImpl) SuperModRevisionFactoryImpl.eINSTANCE.createRevision();
		rev.setRevisionNumber(revisionNumber);
		return rev;
	}

	private FeatureImpl createFeature(String name) {
		DisplayName displayName = SuperModFeatureFactoryImpl.eINSTANCE.createDisplayName();
		displayName.setDisplayName(name);

		FeatureImpl feature = (FeatureImpl) SuperModFeatureFactoryImpl.eINSTANCE.createFeature();
		feature.getNames().add(displayName);
		return feature;
	}
}
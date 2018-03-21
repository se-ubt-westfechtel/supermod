package de.ubt.ai1.supermod.adapters.famile.service.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EMap;

import de.ubt.ai1.supermod.adapters.famile.service.IVisibilityEvaluationService;
import de.ubt.ai1.supermod.mm.core.AndExpr;
import de.ubt.ai1.supermod.mm.core.BinaryExpr;
import de.ubt.ai1.supermod.mm.core.NandExpr;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OrExpr;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.XorExpr;
import de.ubt.ai1.supermod.mm.core.impl.SuperModCoreFactoryImpl;
import de.ubt.ai1.supermod.mm.feature.DisplayName;
import de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl;
import de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl;

/**
 * 
 * 
 * @author Alexander Zimmer
 * @date 2018-01-10
 *
 */
public class VisibilityEvaluationService implements IVisibilityEvaluationService {

	private Map<OptionExpr, OptionExpr> childToParentExprMap = new LinkedHashMap<>();

	public String manageVisibilities(String visibility, OptionBinding choice, OptionExpr expr) {
		if (containsRevisions(expr)) {
			OptionBinding tempChoice = createOptionBinding(choice);

			if (isNandExpression(expr)) {
				expr = transformNandExpr((NandExpr) expr);
			}

			if (isNegExpression(expr)) {
				String negatedVisibility = manageVisibilities(visibility, tempChoice, ((NegExpr) expr).getNeg());
				return evaluateNegVisibility(negatedVisibility);
			}

			if (isBinaryExpression(expr)) {
				// evaluate possible neg expressions
				expr = transformChildNegExpr((BinaryExpr) expr, tempChoice);

				// set parent relation
				childToParentExprMap.put(((BinaryExpr) expr).getLeft(), expr);
				childToParentExprMap.put(((BinaryExpr) expr).getRight(), expr);

				if (isRevision(((BinaryExpr) expr).getRight())) {
					// right side is revision
					Option right = (Option) ((BinaryExpr) expr).getRight().getReferencedOptions().get(0);
					Tristate rightRevState = tempChoice.getBoundOptions().get(right);
					if (isNandExpression(expr)) {
						if (rightRevState == Tristate.TRUE) {
							tempChoice.getBoundOptions().put(right, Tristate.FALSE);
							rightRevState = tempChoice.getBoundOptions().get(right);
						} else {
							tempChoice.getBoundOptions().put(right, Tristate.TRUE);
							rightRevState = tempChoice.getBoundOptions().get(right);
						}
					}

					if (isRevision(((BinaryExpr) expr).getLeft())) {
						boolean value = switchTruthTable(expr, tempChoice);
						return String.valueOf(value);
					}

					if (isAndExpression(expr) || isNandExpression(expr)) {
						// x and true -> x
						if ((rightRevState == Tristate.TRUE)) {
							if (hasParent(expr)) {
								// filter right revision through reordering
								expr = reOrderTree(expr, ((BinaryExpr) expr).getLeft());
								return manageVisibilities(visibility, tempChoice, expr);
							} else {
								return manageVisibilities(visibility, tempChoice, ((BinaryExpr) expr).getLeft());
							}
						}
						// x and false -> false
						else if ((rightRevState == Tristate.FALSE)) {
							if (hasParent(expr)) {
								// filter left side through reordering
								expr = reOrderTree(expr, ((BinaryExpr) expr).getRight());
								return manageVisibilities(visibility, tempChoice, expr);
							} else {
								return manageVisibilities(visibility, tempChoice, ((BinaryExpr) expr).getRight());
							}
						}
					}
					if (isOrExpression(expr) || isXorExpression(expr)) {
						// x or true -> true
						if (rightRevState == Tristate.TRUE && isOrExpression(expr)) {
							if (hasParent(expr)) {
								// filter left side through reordering
								expr = reOrderTree(expr, ((BinaryExpr) expr).getRight());
								return manageVisibilities(visibility, tempChoice, expr);
							} else {
								return manageVisibilities(visibility, tempChoice, ((BinaryExpr) expr).getRight());
							}
						}
						else if (rightRevState == Tristate.TRUE && isXorExpression(expr)) {
							if (hasParent(expr)) {
								// filter left side through reordering
								NegExpr negatedExpr = createNegExpr(((BinaryExpr) expr).getLeft());
								expr = reOrderTree(expr, negatedExpr);
								return manageVisibilities(visibility, tempChoice, expr);
							} else {
								NegExpr negatedExpr = createNegExpr(((BinaryExpr) expr).getLeft());
								return manageVisibilities(visibility, tempChoice, negatedExpr);
							}
						}
						// x or false -> x
						else if (rightRevState == Tristate.FALSE) {
							if (hasParent(expr)) {
								// filter right revision through reordering
								expr = reOrderTree(expr, ((BinaryExpr) expr).getLeft());
								return manageVisibilities(visibility, tempChoice, expr);
							} else {
								return manageVisibilities(visibility, tempChoice, ((BinaryExpr) expr).getLeft());
							}
						}
					}
				}
				if (isFeature(((BinaryExpr) expr).getRight())) {
					if (isBinaryExpression(((BinaryExpr) expr).getLeft())) {
						return manageVisibilities(visibility, tempChoice, ((BinaryExpr) expr).getLeft());
					} else if (isFeature(((BinaryExpr) expr).getLeft())) {
						// both sides are features
						return getRealName(expr);
					} else if (isRevision(((BinaryExpr) expr).getLeft())) {
						// left side is revision and right side is feature
						Option left = (Option) ((BinaryExpr) expr).getLeft().getReferencedOptions().get(0);
						Tristate leftRevState = tempChoice.getBoundOptions().get(left);

						// true and x -> x
						if ((leftRevState == Tristate.TRUE && isAndExpression(expr))) {
							if (hasParent(expr)) {
								expr = reOrderTree(expr, ((BinaryExpr) expr).getRight());
								return manageVisibilities(visibility, tempChoice, expr);
							} else {
								return getRealName(((BinaryExpr) expr).getRight());
								// return ((BinaryExpr) expr).getRight().toString();
							}
						}
						// false and x -> false
						else if ((leftRevState == Tristate.FALSE && isAndExpression(expr))) {
							if (hasParent(expr)) {
								expr = reOrderTree(expr, ((BinaryExpr) expr).getLeft());
								return manageVisibilities(visibility, tempChoice, expr);
							} else {
								return leftRevState.toString();
							}
						}

						if (isOrExpression(expr)) {
							// true or x -> true
							if (leftRevState == Tristate.TRUE) {
								if (hasParent(expr)) {
									expr = reOrderTree(expr, ((BinaryExpr) expr).getLeft());
									return manageVisibilities(visibility, tempChoice, expr);
								} else {
									return leftRevState.toString();
								}
							}
							// false or x -> x
							else if (leftRevState == Tristate.FALSE) {
								if (hasParent(expr)) {
									expr = reOrderTree(expr, ((BinaryExpr) expr).getRight());
									return manageVisibilities(visibility, tempChoice, expr);
								} else {
									return getRealName(((BinaryExpr) expr).getRight());
									// return ((BinaryExpr) expr).getRight().toString();
								}
							}
						}
					}

				}
			} else {
				// expr is feature or revision
				if (isRevision(expr)) {
					Tristate value = tempChoice.getBoundOptions().get(expr.getReferencedOptions().get(0));
					return value.toString();
				} else {
					return getRealName(expr);
				}
			}
		} else {
			return customToString(visibility, expr);
		}
		return visibility;
	}

	public boolean containsRevisions(OptionExpr expr) {
		if (isBinaryExpression(expr)) {
			if (isRevision(((BinaryExpr) expr).getRight())) {
				return true;
			}
			expr = ((BinaryExpr) expr).getLeft();
			return containsRevisions(expr);
		}
		if (isRevision(expr)) {
			return true;
		}
		if (isNegExpression(expr)) {
			return containsRevisions(((NegExpr) expr).getNeg());
		}

		return false;
	}

	public String customToString(String visibility, OptionExpr expr) {
		if (isBinaryExpression(expr)) {
			String rightRealName = getRealName(((BinaryExpr) expr).getRight());
			visibility = rightRealName + ")" + visibility;
			if (isAndExpression(expr)) {
				visibility = " and " + visibility;
			} else if (isOrExpression(expr)) {
				visibility = " or " + visibility;
			}
			if (isBinaryExpression(((BinaryExpr) expr).getLeft())) {
				visibility = "(" + customToString(visibility, ((BinaryExpr) expr).getLeft());
			} else {
				visibility = "(" + getRealName(((BinaryExpr) expr).getLeft()) + visibility;
				return visibility;
			}
		} else if(isNegExpression(expr)) {
			visibility = "not " + customToString(visibility, ((NegExpr) expr).getNeg());
		} else {
			return getRealName(expr);
		}
		return visibility;
	}

	// returns highlevel representation of a featurename
	private String getRealName(OptionExpr expr) {
		if (!isRevision(expr)) {
			DisplayName name = ((FeatureImpl) expr.getReferencedOptions().get(0).getHighLevelConcept()).getNames()
					.get(0);
			if (name != null) {
				String realName = name.toString();

				// replace special characters
				Pattern p = Pattern.compile("[^\\w]");
				Matcher m = p.matcher(realName);
				if (m.find()) {
					realName = "\"" + realName + "\"";
				}
				if (isNegExpression(expr)) {
					return "not " + realName;
				}
				return realName;
			} else {
				return expr.toString();
			}
		}
		return expr.toString();
	}

	// reorders tree by rearranging branches
	private BinaryExpr reOrderTree(OptionExpr currentExpr, OptionExpr movedExpr) {
		BinaryExpr parent = (BinaryExpr) childToParentExprMap.get(currentExpr);
		parent.setLeft(movedExpr);
		currentExpr = parent;
		childToParentExprMap.replace(movedExpr, parent);
		BinaryExpr root = getRootOfExpr(currentExpr);
		return root;
	}

	private BinaryExpr getRootOfExpr(OptionExpr currentExpr) {
		if (childToParentExprMap.get(currentExpr) == null) {
			return (BinaryExpr) currentExpr;
		} else {
			BinaryExpr parent = (BinaryExpr) childToParentExprMap.get(currentExpr);
			currentExpr = getRootOfExpr(parent);
		}
		return (BinaryExpr) currentExpr;
	}

	// returns to an given expr the opposite boolean value
	private boolean switchTruthTable(OptionExpr expr, OptionBinding choice) {
		Option left = (Option) ((BinaryExpr) expr).getLeft().getReferencedOptions().get(0);
		Tristate leftRevState = choice.getBoundOptions().get(left);

		Option right = (Option) ((BinaryExpr) expr).getRight().getReferencedOptions().get(0);
		Tristate rightRevState = choice.getBoundOptions().get(right);

		if (isAndExpression(expr) || isNandExpression(expr)) {
			if (leftRevState == Tristate.TRUE && rightRevState == Tristate.TRUE)
				return true;
			else if (leftRevState == Tristate.TRUE && rightRevState == Tristate.FALSE)
				return false;
			else if (leftRevState == Tristate.FALSE && rightRevState == Tristate.TRUE)
				return false;
			else if (leftRevState == Tristate.FALSE && rightRevState == Tristate.FALSE)
				return false;

		} else if (isOrExpression(expr)) {
			if (leftRevState == Tristate.TRUE && rightRevState == Tristate.TRUE)
				return true;
			else if (leftRevState == Tristate.TRUE && rightRevState == Tristate.FALSE)
				return true;
			else if (leftRevState == Tristate.FALSE && rightRevState == Tristate.TRUE)
				return true;
			else if (leftRevState == Tristate.FALSE && rightRevState == Tristate.FALSE)
				return false;
		}
		return false;
	}

	private OptionExpr transformNegExpr(NegExpr negExpr, OptionBinding choice) {
		if (containsRevisions(negExpr)) {
			for (Option o : negExpr.getReferencedOptions()) {
				Tristate state = choice.getBoundOptions().get(o);
				if (state == Tristate.TRUE) {
					choice.bind(o, Tristate.FALSE);
				} else {
					choice.bind(o, Tristate.TRUE);
				}
			}
			return negExpr.getNeg();
		} else
			return negExpr;
	}
	
	private String evaluateNegVisibility(String negatedVisibility) {
		if(negatedVisibility.equals("true")) return "false";
		else if(negatedVisibility.equals("false")) return "true";
		else return "not " + negatedVisibility;
	}

	private OptionExpr transformNandExpr(NandExpr nandExpr) {
		OptionExpr negRight = createNegExpr(nandExpr.getRight());
		return createAndExpr(nandExpr.getLeft(), negRight);
	}

	private OptionExpr transformChildNegExpr(BinaryExpr expr, OptionBinding choice) {
		if (isNegExpression(expr.getLeft())) {
			OptionExpr negExpr = transformNegExpr((NegExpr) expr.getLeft(), choice);
			expr.setLeft(negExpr);
		}
		if (isNegExpression(expr.getRight())) {
			OptionExpr negExpr = transformNegExpr((NegExpr) expr.getRight(), choice);
			expr.setRight(negExpr);
		}
		return expr;
	}
	
	private boolean isRevision(OptionExpr expr) {
		return expr.getReferencedOptions().get(0).eContainer() instanceof RevisionImpl;
	}

	private boolean isFeature(OptionExpr expr) {
		return expr.getReferencedOptions().get(0).eContainer() instanceof FeatureImpl;
	}

	private boolean isNegExpression(OptionExpr expr) {
		return expr instanceof NegExpr;
	}

	private boolean isBinaryExpression(OptionExpr expr) {
		return expr instanceof BinaryExpr;
	}

	private boolean isAndExpression(OptionExpr expr) {
		return expr instanceof AndExpr;
	}

	private boolean isNandExpression(OptionExpr expr) {
		return expr instanceof NandExpr;
	}

	private boolean isOrExpression(OptionExpr expr) {
		return expr instanceof OrExpr;
	}
	
	private boolean isXorExpression(OptionExpr expr) {
		return expr instanceof XorExpr;
	}

	private boolean hasParent(OptionExpr expr) {
		return childToParentExprMap.get(expr) != null;
	}

	private de.ubt.ai1.supermod.mm.core.AndExpr createAndExpr(OptionExpr left, OptionExpr right) {
		de.ubt.ai1.supermod.mm.core.AndExpr expr = SuperModCoreFactoryImpl.eINSTANCE.createAndExpr();
		expr.setLeft(left);
		expr.setRight(right);
		return expr;
	}

	private NegExpr createNegExpr(OptionExpr expr) {
		NegExpr negExpr = SuperModCoreFactoryImpl.eINSTANCE.createNegExpr();
		negExpr.setNeg(expr);
		return negExpr;
	}

	private OptionBinding createOptionBinding(OptionBinding oldChoice) {
		OptionBinding choice = SuperModCoreFactoryImpl.eINSTANCE.createOptionBinding();

		EMap<Option, Tristate> boundOptions = choice.getBoundOptions();
		boundOptions.putAll(oldChoice.getBoundOptions());
		return choice;
	}

}

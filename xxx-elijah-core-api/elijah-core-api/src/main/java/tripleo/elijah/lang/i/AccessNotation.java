package tripleo.elijah.lang.i;

import tripleo.vendor.antlr277.*;
import tripleo.elijah.lang2.*;

public interface AccessNotation extends OS_Element {
	Token getCategory();

	void setCategory(Token category);

	@Override
	Context getContext();

	// @Override
	// default void serializeTo(SmallWriter sw) {
	// 	sw.tokenize(this, //
	// 			"category", getCategory(), //
	// 			"shortHand", getShortHand(), //
	// 			"typeNames", getTypeNames(), //
	// 			"parent", getParent() //
	// 	);
	// }

	@Override
	OS_Element getParent();

	@Override
	void visitGen(ElElementVisitor visit);

	Token getShortHand();

	void setShortHand(Token shorthand);

	TypeNameList getTypeNames();

	void setTypeNames(TypeNameList tnl);
}

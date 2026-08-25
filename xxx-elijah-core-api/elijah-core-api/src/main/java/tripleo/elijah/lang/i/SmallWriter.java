package tripleo.elijah.lang.i;

import tripleo.elijah.g.GSmallWriter;
import tripleo.elijah_fluffy.util.UnintendedUseException;
import tripleo.vendor.antlr277.Token;

import java.util.List;

public interface SmallWriter extends GSmallWriter {

	default void tokenize(Object principal, Object... mapStuff) {
		// throw new ImplementMe();
		throw new UnintendedUseException();
	}

	void fieldTypename(TypeName aTypeName);

	SW_List createList();

	SW_Ref createRef(OS_Element aFieldValue);

	SW_TypenameList createTypeNameList();

	void fieldElement(String aFieldName, OS_Element _parent);

	void fieldExpression(String aFieldName, IExpression aFieldValue);

	void fieldIdent(String aFieldName, IdentExpression aFieldValue);

	void fieldInteger(String aFieldName, int aFieldValue);

	<E> void fieldList(String aFieldName, List<E> aFieldValue);

	void fieldRef(String aParent, SW_Ref aPr);

	void fieldString(String aFieldName, String aFieldValue);

	void fieldToken(String aFieldName, Token aFieldValue);

	void fieldTypenameList(String aInheritance, SW_TypenameList aInh);

	String getString();

	interface SW_List {
		void add(OS_Element el); // ??

		List<OS_Element> items();
	}

	interface SW_Ref {
		OS_Element get();

		String name();
	}

	interface SW_TypenameList {
		void add(TypeName el); // ??

		List<TypeName> items();
	}
}

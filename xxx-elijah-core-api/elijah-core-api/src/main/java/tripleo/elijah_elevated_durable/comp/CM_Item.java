package tripleo.elijah_elevated_durable.comp;

import tripleo.elijah.comp.graph.i.Asseverate;
import tripleo.elijah.comp.graph.i.CK_ObjectTree;

public interface CM_Item {
	/// Notify `tree` that `event` has occurred for `this` object
	void asseverate(CK_ObjectTree aTree, Asseverate event);
}

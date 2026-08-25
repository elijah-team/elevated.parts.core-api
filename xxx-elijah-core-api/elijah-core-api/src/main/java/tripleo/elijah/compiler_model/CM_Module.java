package tripleo.elijah.compiler_model;

import tripleo.elijah.ci.LibraryStatementPart;
import tripleo.elijah.comp.Compilation0;
import tripleo.elijah.comp.graph.i.Asseverate;
import tripleo.elijah.comp.graph.i.CK_ObjectTree;
import tripleo.elijah.comp.nextgen.inputtree.EIT_ModuleInput;
import tripleo.elijah.comp.specs.ElijahSpec;
import tripleo.elijah.g.GLivingRepo;
import tripleo.elijah.g.GWorldModule;
import tripleo.elijah.lang.i.OS_Module;
import tripleo.elijah_elevated_durable.comp.CM_Item;
import tripleo.elijah_fluffy.util.Operation2;

import java.io.InputStream;

public interface CM_Module extends CM_Item {
	void advise(ElijahSpec aSpec);

	void advise(Operation2<OS_Module> aModuleOperation);

	GWorldModule adviseCreator(Compilation0 aCon);

	void adviseWorld(GLivingRepo aWorld);

	void advise(LibraryStatementPart aLsp);

	void advise(PreludeProvider preludeProvider);

	InputStream s();

	void asseverate(CK_ObjectTree aTree, Asseverate event);

	EIT_ModuleInput getEITInput();

	interface PreludeProvider {
		Operation2<OS_Module> getOperation();
	}
}

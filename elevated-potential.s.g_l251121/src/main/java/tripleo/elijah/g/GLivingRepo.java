package tripleo.elijah.g;

import tripleo.elijah_fluffy.util.CompletableProcess;

import java.util.Collection;

public interface GLivingRepo {
	void addModuleProcess_(CompletableProcess<GWorldModule> aCompletableProcess);

	Collection<GWorldModule> modules_();
}

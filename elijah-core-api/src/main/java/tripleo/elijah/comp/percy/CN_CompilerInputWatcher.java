package tripleo.elijah.comp.percy;

import tripleo.elijah.comp.CompilerInput;


/// fixme Assuming the origin of percy is 2024, we can remove this,
///  unless there is a specific reason - looking at persistent
public interface CN_CompilerInputWatcher {
	void event(e aEvent, CompilerInput aCompilerInput, final Object aObject);

	enum e {ACCEPT_CI, IS_EZ, APPLY0}
}

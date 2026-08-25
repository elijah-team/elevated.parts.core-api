package tripleo.elijah_elevateder.factory.comp;

import tripleo.elijah_elevated.comp.pushwork.Startable;
import tripleo.elijah_elevateder.comp.i.CompFactory_StartableI;

public interface EDL_StartTask {
	boolean isStarted();

	boolean isThreaded();

	CompFactory_StartableI getStartableI();

	void start();

	boolean isStartable();
	boolean isStartableI();

	Startable getStartable();
}

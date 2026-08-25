package tripleo.elijah_elevateder.comp.i;

public interface CompFactory_StartableI {
	void run();

	boolean isSignalled();

	String getThreadName();
}

package tripleo.elijah.nextgen.query;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tripleo.elijah.lang.i.OS_Module;

public interface QueryDatabase {
	@Nullable String getProperty(@NotNull Object object, String propertyName, Object outResult);

	public class StringHolder {
		private String _string;

		String getString() {
			return this._string;
		}

		void setString(String aString) {
			this._string = aString;
		}
	}
}

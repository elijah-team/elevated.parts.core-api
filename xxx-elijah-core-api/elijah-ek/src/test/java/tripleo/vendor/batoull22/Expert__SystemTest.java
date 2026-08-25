package tripleo.vendor.batoull22;

import org.junit.Ignore;
import org.junit.Test;
import tripleo.elijah_fluffy.util.Mode;
import tripleo.elijah_fluffy.util.Operation;
import tripleo.elijah_fluffy.util.SimplePrintLoggerToRemoveSoon;

import java.io.InputStream;

import static org.junit.Assert.assertNotSame;

public class Expert__SystemTest {

	@Test
	@Ignore
	public void testOpenfile() {
		final EK_ExpertSystem i = new EK_ExpertSystem();

		final Operation<EK_Reader> ovo2 = openfile_2(i);
		assertNotSame(Mode.FAILURE, ovo2.mode());

		final EK_Reader reader = ovo2.success();

		reader.readfile();
		// reader.print();
		reader.closefile();

		SimplePrintLoggerToRemoveSoon.println_out_4("------------------------");
		boolean f = i.Forwardchaining();
		SimplePrintLoggerToRemoveSoon.println_out_4(" ");
		SimplePrintLoggerToRemoveSoon.println_out_4("Result of Forwardchaining: " + f);

		SimplePrintLoggerToRemoveSoon.println_out_4(" ");
		i.print();

		SimplePrintLoggerToRemoveSoon.println_out_4("------------------------");
		boolean b = i.Backwardchaining();
		SimplePrintLoggerToRemoveSoon.println_out_4("Result of Backwardchaining: " + b);
		SimplePrintLoggerToRemoveSoon.println_out_4(" ");
	}

	private Operation<EK_Reader> openfile_2(final EK_ExpertSystem aSystem) {
		final Class<? extends EK_ExpertSystem> aClass = aSystem.getClass();
		try {
			final InputStream stream = aClass.getResourceAsStream("KB3.txt");
			return Operation.success(new EK_Reader1(aSystem, stream));
		} catch (Exception ex) {
			aSystem.logProgress(-49, "getResourceAsStream over " + aClass.getName());
			return Operation.failure(ex);
		}
	}
}

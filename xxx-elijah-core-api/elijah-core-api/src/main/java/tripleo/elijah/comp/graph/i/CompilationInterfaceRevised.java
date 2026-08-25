package tripleo.elijah.comp.graph.i;

import tripleo.elijah.comp.CompilerInput;
import tripleo.vendor.org.apache.commons.lang3.tuple.*;

import java.util.List;

public interface CompilationInterfaceRevised {
	Pair<CompOutput, CompInteractive> compile(List<CompilerInput> lci);
}

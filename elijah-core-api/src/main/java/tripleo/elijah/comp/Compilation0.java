package tripleo.elijah.comp;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import tripleo.elijah.ci.CompilerInstructions;
import tripleo.elijah.comp.graph.i.CK_ObjectTree;
import tripleo.elijah.comp.i.CompilationClosure;
import tripleo.elijah.comp.i.CompilerController;
import tripleo.elijah.comp.i.ErrSink;
import tripleo.elijah.comp.i.USE_Reasoning;
import tripleo.elijah.comp.i.extra.CompilerInputListener;
import tripleo.elijah.comp.nextgen.i.CP_Paths;
import tripleo.elijah.comp.nextgen.pn.PN_Ping;
import tripleo.elijah.comp.nextgen.pw.PW_PushWork;
import tripleo.elijah.comp.specs.ElijahCache;
import tripleo.elijah.g.GCompilationConfig;
import tripleo.elijah.g.GCompilationEnclosure;
import tripleo.elijah.g.GLivingRepo;
import tripleo.elijah.g.GWorldModule;
import tripleo.elijah.lang.i.OS_Package;
import tripleo.elijah.lang.i.Qualident;
import tripleo.elijah.nextgen.inputtree.EIT_InputTree;
import tripleo.elijah.nextgen.outputtree.EOT_FileNameProvider;
import tripleo.elijah.nextgen.outputtree.EOT_OutputFile;
import tripleo.elijah.nextgen.outputtree.EOT_OutputTree;
import tripleo.elijah_elevateder.factory.comp.EDL_StartTask;
import tripleo.elijah_fluffy.util.Operation2;

import java.util.List;
import java.util.function.Supplier;

public interface Compilation0 /*extends GCompilation*/ {

    //	CompilerBeginning beginning(final CompilationRunner compilationRunner);

    CK_ObjectTree getObjectTree();

    int errorCount();

    void feedCmdLine(@NotNull List<String> args) throws Exception;

    void feedInputs(@NotNull List<CompilerInput> inputs, CompilerController controller);

    CompilationClosure getCompilationClosure();

    String getCompilationNumberString();

    CompilerInputListener getCompilerInputListener();

    ErrSink getErrSink();


    @Contract(pure = true)
    List<CompilerInput> getInputs();

    OS_Package getPackage(@NotNull Qualident pkg_name);

    String getProjectName();

    CompilerInstructions getRootCI();

    void setRootCI(CompilerInstructions aRoot);

    boolean isPackage(@NotNull String pkg);

    OS_Package makePackage(Qualident pkg_name);

    void pushItem(CompilerInstructions aci);

    void use(@NotNull CompilerInstructions compilerInstructions, USE_Reasoning aReasoning);

    ElijahCache use_elijahCache();

    void pushWork(PW_PushWork aInstance, final PN_Ping aPing);

    IO getIO();

    EOT_OutputTree getOutputTree();

    EIT_InputTree getInputTree();

    Finally reports();

    void subscribeCI(ICompilerInstructionsObserver aCio);

    GCompilationConfig cfg();

    GCompilationEnclosure getCompilationEnclosure();

    Operation2<GWorldModule> findPrelude(String aC);

    CP_Paths paths();

    void addCodeOutput(EOT_FileNameProvider aFileNameProvider,
                       Supplier<EOT_OutputFile> aOutputFileSupplier,
                       boolean addFlag);

    Iterable<EDL_StartTask> startTasks();

    GLivingRepo world();
}

package tripleo.elijah.lang.i;

import org.jetbrains.annotations.NotNull;
import tripleo.elijah.ci.LibraryStatementPart;
import tripleo.elijah.comp.Compilation0;
import tripleo.elijah.contexts.ModuleContext;
import tripleo.elijah.entrypoints.EntryPoint;
import tripleo.elijah.g.GOS_Module;
import tripleo.elijah.lang2.ElElementVisitor;

import java.util.Collection;
import java.util.List;

public interface OS_Module extends OS_Element, GOS_Module {
	void add(OS_Element anElement);

	@NotNull
	List<EntryPoint> entryPoints();

	List<ClassStatement> findClassesNamed(String aClassName);

	void finish();

	@NotNull
	Compilation0 getCompilation();

	@Override
	Context getContext();

	@Override
	@org.jetbrains.annotations.Nullable
	OS_Element getParent();

	@Override
	void serializeTo(SmallWriter sw);

	@Override
	void visitGen(@NotNull ElElementVisitor visit);

	void setParent(@NotNull Compilation0 parent);

	void setContext(ModuleContext mctx);

	String getFileName();

	void setFileName(String fileName);

	@NotNull
	Collection<ModuleItem> getItems();

	LibraryStatementPart getLsp();

	void setLsp(@NotNull LibraryStatementPart lsp);

	boolean hasClass(String className); // OS_Container

	boolean isPrelude();

	void setPrelude(GOS_Module success);

	void postConstruct();

	OS_Module prelude();

	OS_Package pullPackageName();

	OS_Package pushPackageNamed(Qualident aPackageName);

	void setIndexingStatement(IndexingStatement idx);

	interface Complaint {
		void reportWarning(@NotNull OS_Module aModule, String aS);
	}
}

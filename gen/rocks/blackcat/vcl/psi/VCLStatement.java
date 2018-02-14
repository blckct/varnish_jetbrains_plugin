// This is a generated file. Not intended for manual editing.
package rocks.blackcat.vcl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VCLStatement extends PsiElement {

  @NotNull
  List<VCLAction> getActionList();

  @NotNull
  List<VCLCall> getCallList();

  @NotNull
  List<VCLCompound> getCompoundList();

  @NotNull
  List<VCLIfStatement> getIfStatementList();

  @NotNull
  List<VCLInlineC> getInlineCList();

  @NotNull
  List<VCLNew> getNewList();

  @NotNull
  List<VCLPurge> getPurgeList();

  @NotNull
  List<VCLSet> getSetList();

  @NotNull
  List<VCLUnset> getUnsetList();

}

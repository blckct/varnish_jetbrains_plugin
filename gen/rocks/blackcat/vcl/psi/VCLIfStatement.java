// This is a generated file. Not intended for manual editing.
package rocks.blackcat.vcl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VCLIfStatement extends PsiElement {

  @NotNull
  VCLCompound getCompound();

  @NotNull
  VCLCondition getCondition();

  @NotNull
  List<VCLElse> getElseList();

}

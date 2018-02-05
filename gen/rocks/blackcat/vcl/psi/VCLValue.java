// This is a generated file. Not intended for manual editing.
package rocks.blackcat.vcl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VCLValue extends PsiElement {

  @Nullable
  VCLStrings getStrings();

  @Nullable
  VCLVariable getVariable();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getNumber();

}

// This is a generated file. Not intended for manual editing.
package rocks.blackcat.vcl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VCLObjectInternal extends PsiElement {

  @NotNull
  List<VCLObjectInternal> getObjectInternalList();

  @Nullable
  VCLValue getValue();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getProperty();

}

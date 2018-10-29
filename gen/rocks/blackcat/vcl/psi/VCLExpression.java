// This is a generated file. Not intended for manual editing.
package rocks.blackcat.vcl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VCLExpression extends PsiElement {

  @Nullable
  VCLCondition getCondition();

  @NotNull
  List<VCLExpression> getExpressionList();

  @Nullable
  VCLFCall getFCall();

  @Nullable
  VCLObject getObject();

  @Nullable
  VCLOperation getOperation();

}

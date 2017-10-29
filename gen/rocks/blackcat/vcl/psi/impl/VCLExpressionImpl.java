// This is a generated file. Not intended for manual editing.
package rocks.blackcat.vcl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static rocks.blackcat.vcl.psi.VCLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import rocks.blackcat.vcl.psi.*;

public class VCLExpressionImpl extends ASTWrapperPsiElement implements VCLExpression {

  public VCLExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VCLVisitor visitor) {
    visitor.visitExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VCLVisitor) accept((VCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VCLCondition getCondition() {
    return findChildByClass(VCLCondition.class);
  }

  @Override
  @Nullable
  public VCLExpression getExpression() {
    return findChildByClass(VCLExpression.class);
  }

  @Override
  @Nullable
  public VCLFCall getFCall() {
    return findChildByClass(VCLFCall.class);
  }

  @Override
  @Nullable
  public VCLOperation getOperation() {
    return findChildByClass(VCLOperation.class);
  }

}

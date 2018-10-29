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

public class VCLElseImpl extends ASTWrapperPsiElement implements VCLElse {

  public VCLElseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VCLVisitor visitor) {
    visitor.visitElse(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VCLVisitor) accept((VCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VCLCompound getCompound() {
    return findChildByClass(VCLCompound.class);
  }

  @Override
  @Nullable
  public VCLCondition getCondition() {
    return findChildByClass(VCLCondition.class);
  }

  @Override
  @Nullable
  public VCLIfStatement getIfStatement() {
    return findChildByClass(VCLIfStatement.class);
  }

}

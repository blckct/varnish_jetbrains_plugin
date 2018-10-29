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

public class VCLIfStatementImpl extends ASTWrapperPsiElement implements VCLIfStatement {

  public VCLIfStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VCLVisitor visitor) {
    visitor.visitIfStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VCLVisitor) accept((VCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VCLCompound getCompound() {
    return findNotNullChildByClass(VCLCompound.class);
  }

  @Override
  @NotNull
  public VCLCondition getCondition() {
    return findNotNullChildByClass(VCLCondition.class);
  }

  @Override
  @NotNull
  public List<VCLElse> getElseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VCLElse.class);
  }

}

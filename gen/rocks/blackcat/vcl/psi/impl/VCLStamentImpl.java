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

public class VCLStamentImpl extends ASTWrapperPsiElement implements VCLStament {

  public VCLStamentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VCLVisitor visitor) {
    visitor.visitStament(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VCLVisitor) accept((VCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<VCLAction> getActionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VCLAction.class);
  }

  @Override
  @NotNull
  public List<VCLCompound> getCompoundList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VCLCompound.class);
  }

  @Override
  @NotNull
  public List<VCLIfStatement> getIfStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VCLIfStatement.class);
  }

  @Override
  @NotNull
  public List<VCLInlineC> getInlineCList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VCLInlineC.class);
  }

}

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

public class VCLLiteralImpl extends ASTWrapperPsiElement implements VCLLiteral {

  public VCLLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VCLVisitor visitor) {
    visitor.visitLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VCLVisitor) accept((VCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VCLNetmask getNetmask() {
    return findChildByClass(VCLNetmask.class);
  }

  @Override
  @Nullable
  public VCLObject getObject() {
    return findChildByClass(VCLObject.class);
  }

  @Override
  @Nullable
  public VCLStrings getStrings() {
    return findChildByClass(VCLStrings.class);
  }

  @Override
  @Nullable
  public PsiElement getDuration() {
    return findChildByType(DURATION);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

}

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

public class VCLActionImpl extends ASTWrapperPsiElement implements VCLAction {

  public VCLActionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VCLVisitor visitor) {
    visitor.visitAction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VCLVisitor) accept((VCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VCLCall getCall() {
    return findChildByClass(VCLCall.class);
  }

  @Override
  @Nullable
  public VCLError getError() {
    return findChildByClass(VCLError.class);
  }

  @Override
  @Nullable
  public VCLFCall getFCall() {
    return findChildByClass(VCLFCall.class);
  }

  @Override
  @Nullable
  public VCLNew getNew() {
    return findChildByClass(VCLNew.class);
  }

  @Override
  @Nullable
  public VCLPurge getPurge() {
    return findChildByClass(VCLPurge.class);
  }

  @Override
  @Nullable
  public VCLReturn getReturn() {
    return findChildByClass(VCLReturn.class);
  }

  @Override
  @Nullable
  public VCLSet getSet() {
    return findChildByClass(VCLSet.class);
  }

  @Override
  @Nullable
  public VCLSynthetic getSynthetic() {
    return findChildByClass(VCLSynthetic.class);
  }

  @Override
  @Nullable
  public VCLUnset getUnset() {
    return findChildByClass(VCLUnset.class);
  }

}

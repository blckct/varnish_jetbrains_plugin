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

public class VCLReturnImpl extends ASTWrapperPsiElement implements VCLReturn {

  public VCLReturnImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VCLVisitor visitor) {
    visitor.visitReturn(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VCLVisitor) accept((VCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VCLFFail getFFail() {
    return findChildByClass(VCLFFail.class);
  }

  @Override
  @Nullable
  public VCLFPass getFPass() {
    return findChildByClass(VCLFPass.class);
  }

  @Override
  @Nullable
  public VCLFSynth getFSynth() {
    return findChildByClass(VCLFSynth.class);
  }

  @Override
  @Nullable
  public VCLFVcl getFVcl() {
    return findChildByClass(VCLFVcl.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}

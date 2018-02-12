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

public class VCLBuitlinImpl extends ASTWrapperPsiElement implements VCLBuitlin {

  public VCLBuitlinImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VCLVisitor visitor) {
    visitor.visitBuitlin(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VCLVisitor) accept((VCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VCLError getError() {
    return findChildByClass(VCLError.class);
  }

  @Override
  @Nullable
  public VCLReturn getReturn() {
    return findChildByClass(VCLReturn.class);
  }

}

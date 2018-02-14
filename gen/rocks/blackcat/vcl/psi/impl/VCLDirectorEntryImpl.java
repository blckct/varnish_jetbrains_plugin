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

public class VCLDirectorEntryImpl extends ASTWrapperPsiElement implements VCLDirectorEntry {

  public VCLDirectorEntryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VCLVisitor visitor) {
    visitor.visitDirectorEntry(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VCLVisitor) accept((VCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VCLBackendInternal getBackendInternal() {
    return findChildByClass(VCLBackendInternal.class);
  }

  @Override
  @Nullable
  public VCLDirectorEntry getDirectorEntry() {
    return findChildByClass(VCLDirectorEntry.class);
  }

  @Override
  @Nullable
  public VCLValue getValue() {
    return findChildByClass(VCLValue.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}

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

public class VCLVariableImpl extends ASTWrapperPsiElement implements VCLVariable {

  public VCLVariableImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VCLVisitor visitor) {
    visitor.visitVariable(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VCLVisitor) accept((VCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VCLBereq getBereq() {
    return findChildByClass(VCLBereq.class);
  }

  @Override
  @Nullable
  public VCLBeresp getBeresp() {
    return findChildByClass(VCLBeresp.class);
  }

  @Override
  @Nullable
  public VCLClient getClient() {
    return findChildByClass(VCLClient.class);
  }

  @Override
  @Nullable
  public VCLLocal getLocal() {
    return findChildByClass(VCLLocal.class);
  }

  @Override
  @Nullable
  public VCLNow getNow() {
    return findChildByClass(VCLNow.class);
  }

  @Override
  @Nullable
  public VCLObj getObj() {
    return findChildByClass(VCLObj.class);
  }

  @Override
  @Nullable
  public VCLObject getObject() {
    return findChildByClass(VCLObject.class);
  }

  @Override
  @Nullable
  public VCLRemote getRemote() {
    return findChildByClass(VCLRemote.class);
  }

  @Override
  @Nullable
  public VCLReq getReq() {
    return findChildByClass(VCLReq.class);
  }

  @Override
  @Nullable
  public VCLReqTop getReqTop() {
    return findChildByClass(VCLReqTop.class);
  }

  @Override
  @Nullable
  public VCLResp getResp() {
    return findChildByClass(VCLResp.class);
  }

  @Override
  @Nullable
  public VCLServer getServer() {
    return findChildByClass(VCLServer.class);
  }

  @Override
  @Nullable
  public VCLStorage getStorage() {
    return findChildByClass(VCLStorage.class);
  }

}

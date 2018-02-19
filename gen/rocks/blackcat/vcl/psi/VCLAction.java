// This is a generated file. Not intended for manual editing.
package rocks.blackcat.vcl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VCLAction extends PsiElement {

  @Nullable
  VCLCall getCall();

  @Nullable
  VCLError getError();

  @Nullable
  VCLFCall getFCall();

  @Nullable
  VCLNew getNew();

  @Nullable
  VCLPurge getPurge();

  @Nullable
  VCLReturn getReturn();

  @Nullable
  VCLSet getSet();

  @Nullable
  VCLSynthetic getSynthetic();

  @Nullable
  VCLUnset getUnset();

}

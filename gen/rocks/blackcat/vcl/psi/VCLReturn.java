// This is a generated file. Not intended for manual editing.
package rocks.blackcat.vcl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VCLReturn extends PsiElement {

  @Nullable
  VCLFFail getFFail();

  @Nullable
  VCLFPass getFPass();

  @Nullable
  VCLFSynth getFSynth();

  @Nullable
  VCLFVcl getFVcl();

  @Nullable
  PsiElement getIdentifier();

}

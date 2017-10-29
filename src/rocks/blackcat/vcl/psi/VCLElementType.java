package rocks.blackcat.vcl.psi;

import com.intellij.psi.tree.IElementType;
import rocks.blackcat.vcl.VCLLanguage;
import org.jetbrains.annotations.*;

public class VCLElementType extends IElementType {
    public VCLElementType(@NotNull @NonNls String debugName) {
        super(debugName, VCLLanguage.INSTANCE);
    }
}
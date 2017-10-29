package rocks.blackcat.vcl.psi;

import com.intellij.psi.tree.IElementType;
import rocks.blackcat.vcl.VCLLanguage;
import org.jetbrains.annotations.*;

public class VCLTokenType extends IElementType {
    public VCLTokenType(@NotNull @NonNls String debugName) {
        super(debugName, VCLLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "VCLTokenType." + super.toString();
    }
}

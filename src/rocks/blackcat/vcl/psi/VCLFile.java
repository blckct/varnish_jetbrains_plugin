package rocks.blackcat.vcl.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import rocks.blackcat.vcl.*;
import org.jetbrains.annotations.NotNull;

        import javax.swing.*;

public class VCLFile extends PsiFileBase {
    public VCLFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, VCLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return VCLFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "VCL File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
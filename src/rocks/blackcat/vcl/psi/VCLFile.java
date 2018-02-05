package rocks.blackcat.vcl.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import rocks.blackcat.vcl.*;
import org.jetbrains.annotations.NotNull;

        import javax.swing.*;

public class VCLFile extends PsiFileBase {

    Double version;

    public VCLFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, VCLLanguage.INSTANCE);
        VCLVersion versionNode = this.findChildByClass(VCLVersion.class);
        if(versionNode == null) {
            return;
        }
        try {
            String version = versionNode.getText().replace("vcl", "").replace(";","");
            this.version = Double.parseDouble(version);
        } catch (NumberFormatException e) {
            this.version = 3.0;
        }
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
package rocks.blackcat.vcl;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class VCLFileType extends LanguageFileType {
    public static final VCLFileType INSTANCE = new VCLFileType();

    private VCLFileType() {
        super(VCLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "VCL file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Varnish Configuration Language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "vcl";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return VCLIcons.FILE;
    }
}
 
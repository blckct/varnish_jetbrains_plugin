package rocks.blackcat.vcl;

import com.intellij.lang.Language;

public class VCLLanguage extends Language {
    public static final VCLLanguage INSTANCE = new VCLLanguage();

    private VCLLanguage() {
        super("VCL");
    }
}

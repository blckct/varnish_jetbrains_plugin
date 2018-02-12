package rocks.blackcat.vcl.psi;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.FileTypeManager;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.fileTypes.impl.AbstractFileType;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;
import rocks.blackcat.vcl.psi.impl.VCLInlineCImpl;

public class VCL_C_LanguageInjector implements LanguageInjector{

    @Override
    public void getLanguagesToInject(@NotNull PsiLanguageInjectionHost host, @NotNull InjectedLanguagePlaces places) {
        if (host instanceof VCLInlineCImpl){
            this.injectC(host, places);
        } /*else if (host instanceof VCLStringsImpl) {
            this.injectRegex(host, places);
        }*/
    }

    private void injectC(@NotNull PsiLanguageInjectionHost host, @NotNull InjectedLanguagePlaces places) {
        FileType fileType = FileTypeManager.getInstance().getFileTypeByExtension("c");
        if (fileType instanceof AbstractFileType) {
            return;
        }
        Language cLanguage = ((LanguageFileType)fileType).getLanguage();
        final TextRange range = new TextRange(2, host.getTextLength()-2);
        //places.addPlace(cLanguage, ElementManipulators.getValueTextRange(host), null, null);
        places.addPlace(cLanguage, range, null, null);
    }
}
package rocks.blackcat.vcl.psi;

import com.intellij.psi.LiteralTextEscaper;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLanguageInjectionHost;
import com.intellij.psi.PsiNamedElement;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface VCLInlineCMixin extends PsiNamedElement, PsiLanguageInjectionHost {

    @Override
    default public boolean isValidHost() {
        return true;
    }

    @Override
    default public PsiLanguageInjectionHost updateText(@NotNull String s) {
        //StdLanguages.HTML;
        return this;
    }

    @NotNull
    @Override
    default public LiteralTextEscaper<? extends PsiLanguageInjectionHost> createLiteralTextEscaper() {
        return LiteralTextEscaper.createSimple(this);
    }

    @Nullable
    default String getName() {
        return "test";
    };

    default PsiElement setName(@NotNull String var1) {
        return this;
    };
}

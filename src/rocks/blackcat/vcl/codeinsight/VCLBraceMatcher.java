package rocks.blackcat.vcl.codeinsight;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rocks.blackcat.vcl.psi.VCLTypes;


public class VCLBraceMatcher implements PairedBraceMatcher{

    @NotNull
    @Override
    public BracePair[] getPairs() {
        BracePair[] bp = {new BracePair(VCLTypes.LC, VCLTypes.RC, true),
                        new BracePair(VCLTypes.LP, VCLTypes.RP, true),
                        new BracePair(VCLTypes.L_CBRACE, VCLTypes.R_CBRACE, true)};
        return bp;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType iElementType, @Nullable IElementType iElementType1) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile psiFile, int i) {
        return i;
    }
}

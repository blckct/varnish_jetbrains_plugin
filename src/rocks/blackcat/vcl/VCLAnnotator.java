package rocks.blackcat.vcl;


import com.intellij.lang.annotation.*;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;
import rocks.blackcat.vcl.psi.VCLPurge;

import java.util.List;

public class VCLAnnotator implements Annotator{
    @Override
    public void annotate(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
        // purge can be a keyword but it could also be a name of ACL list or some other object so highlight it manually
        if (element instanceof VCLPurge) {
            Annotation annotation = holder.createInfoAnnotation(element.getTextRange(), null);
            annotation.setTextAttributes(DefaultLanguageHighlighterColors.KEYWORD);
        }
    }
}
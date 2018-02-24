package rocks.blackcat.vcl;


import com.intellij.lang.annotation.*;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;
import rocks.blackcat.vcl.psi.*;

import java.util.List;

public class VCLAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
        // purge can be a keyword but it could also be a name of ACL list or some other object so highlight it manually
        if (element instanceof VCLPurge) {
            Annotation annotation = holder.createInfoAnnotation(element.getTextRange(), null);
            annotation.setTextAttributes(DefaultLanguageHighlighterColors.KEYWORD);
        }

        //Warnings fo outdated keywords
        if (isVarnish4(element)) {
            if (element instanceof VCLUnset) {
                if (element.getFirstChild().getText().equals("remove")) {
                    holder.createErrorAnnotation(element, "Remove keyword was removed in version 4, use unset");
                }
            }

            if (element instanceof VCLPurge) {
                holder.createErrorAnnotation(element, "Purge keyword was removed in version 4, use  return(purge)");

            }

            if (element instanceof VCLError) {
                holder.createErrorAnnotation(element, "Error keyword was removed in version 4, use  return (synth(999, \"Response\"))");
            }
        }
    }

    private boolean isVarnish4(@NotNull final PsiElement element) {
        VCLFile file = (VCLFile) element.getContainingFile();
        return file.getVersion() > 3.0;
    }

}
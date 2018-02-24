package rocks.blackcat.vcl;


import com.intellij.lang.annotation.*;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;
import rocks.blackcat.vcl.psi.VCLFile;
import rocks.blackcat.vcl.psi.VCLPurge;
import rocks.blackcat.vcl.psi.VCLUnset;

import java.util.List;

public class VCLAnnotator implements Annotator{
    @Override
    public void annotate(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
        // purge can be a keyword but it could also be a name of ACL list or some other object so highlight it manually
        if (element instanceof VCLPurge) {
            Annotation annotation = holder.createInfoAnnotation(element.getTextRange(), null);
            annotation.setTextAttributes(DefaultLanguageHighlighterColors.KEYWORD);
        }
        if (element instanceof VCLUnset){
            VCLFile file = (VCLFile)element.getContainingFile();
            if (file.getVersion() > 3.0){
                //System.out.print(element.getFirstChild().getText());
                if(element.getFirstChild().getText().equals("remove")){
                    holder.createWarningAnnotation(element, "Remove keyword was removed in version 4, use unset");
                    System.out.print("New Version");
                }
            }
        }
    }
}
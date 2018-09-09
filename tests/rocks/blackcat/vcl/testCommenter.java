package rocks.blackcat.vcl;

import com.intellij.codeInsight.generation.actions.CommentByBlockCommentAction;
import com.intellij.codeInsight.generation.actions.CommentByLineCommentAction;
import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase;

public class testCommenter extends LightPlatformCodeInsightFixtureTestCase{



    public void testLineComments()  {
        myFixture.configureByText(VCLFileType.INSTANCE, "<caret>vcl 4.0");
        CommentByLineCommentAction commentAction = new CommentByLineCommentAction();
        commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
        myFixture.checkResult("//vcl 4.0");
        commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
        myFixture.checkResult("vcl 4.0");
    }

    public void testBlockComments()  {
        myFixture.configureByText(VCLFileType.INSTANCE, "<selection>vcl 4.0</selection>");
        CommentByBlockCommentAction commentAction = new CommentByBlockCommentAction();
        commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
        myFixture.checkResult("/*\nvcl 4.0*/\n");
        commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
        myFixture.checkResult("vcl 4.0\n");
    }

}

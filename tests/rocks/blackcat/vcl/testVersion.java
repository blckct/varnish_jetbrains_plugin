package rocks.blackcat.vcl;

import com.intellij.codeInsight.daemon.impl.HighlightInfo;
import com.intellij.testFramework.LightIdeaTestCase;
import com.intellij.testFramework.fixtures.CodeInsightFixtureTestCase;
import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase;
import org.junit.Assert;
import rocks.blackcat.vcl.psi.VCLFile;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.testFramework.ResolveTestCase;
import com.intellij.psi.PsiReference;

import javax.help.TextHelpModel;
import java.io.File;


public class testVersion extends LightPlatformCodeInsightFixtureTestCase
{
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        myFixture.setTestDataPath("testData/version");
    }


    public void testVersion3(){
        myFixture.configureByFile("version_3.vcl");
        VCLFile file = (VCLFile) myFixture.getFile();
        Assert.assertEquals((Double)3.0, file.getVersion());
    }

    public void testVersion4(){
        myFixture.configureByFile("version_4.vcl");
        VCLFile file = (VCLFile) myFixture.getFile();
        Assert.assertEquals((Double)4.0, file.getVersion());
    }

    public void testVersion4_1(){
        myFixture.configureByFile("version_4_1.vcl");
        VCLFile file = (VCLFile) myFixture.getFile();
        Assert.assertEquals((Double)4.1, file.getVersion());
    }
}

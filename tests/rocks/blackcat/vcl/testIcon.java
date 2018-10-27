package rocks.blackcat.vcl;

import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase;
import org.junit.Assert;
import rocks.blackcat.vcl.psi.VCLFile;

public class testIcon  extends LightPlatformCodeInsightFixtureTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        myFixture.setTestDataPath("testData/icon");
    }

    public void testGetIcon() {
        Assert.assertNotNull(VCLIcons.FILE);
    }

    public void testGetIconFile() {
        myFixture.configureByFile("icon.vcl");
        VCLFile file = (VCLFile) myFixture.getFile();
        Assert.assertNotNull(file.getIcon(0));
    }
}

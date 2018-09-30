package rocks.blackcat.vcl.psi;

import com.intellij.testFramework.ParsingTestCase;
import rocks.blackcat.vcl.VCLParserDefinition;

public class testAcl extends ParsingTestCase {
    public testAcl() {
        super("", "vcl", new VCLParserDefinition());
    }

    public void testAcl() {
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "testData/psi";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}

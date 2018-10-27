package rocks.blackcat.vcl.psi;

import com.intellij.testFramework.ParsingTestCase;
import rocks.blackcat.vcl.VCLParserDefinition;

public class testPsi extends ParsingTestCase {
    public testPsi() {
        super("", "vcl", new VCLParserDefinition());
    }

    public void testAcl() {
        doTest(true);
    }

    public void testBackend() {
        doTest(true);
    }

    public void testC() {
        doTest(true);
    }

    public void testDirectors() {
        doTest(true);
    }

    public void testReturn() {
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

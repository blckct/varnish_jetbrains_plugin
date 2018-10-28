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

//    public void testCall() {
//        doTest(true);
//    }

    public void testConditionals() {
        doTest(true);
    }

    public void testDirectors() {
        doTest(true);
    }

    public void testError() {
        doTest(true);
    }

//    public void testFunctions() {
//        doTest(true);
//    }

    public void testInclude() {
        doTest(true);
    }

    public void testImport() {
        doTest(true);
    }

//    public void testNew() {
//        doTest(true);
//    }

//    public void testProbe() {
//        doTest(true);
//    }

//    public void testPurge() {
//        doTest(true);
//    }

    public void testReturn() {
        doTest(true);
    }

//    public void testSet() {
//        doTest(true);
//    }

    public void testStrings() {
        doTest(true);
    }

//    public void testSynthetic() {
//        doTest(true);
//    }

//    public void testUnset() {
//        doTest(true);
//    }

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

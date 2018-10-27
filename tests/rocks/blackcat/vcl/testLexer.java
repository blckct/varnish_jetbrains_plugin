package rocks.blackcat.vcl;

import com.intellij.lexer.FlexAdapter;
import com.intellij.psi.tree.IElementType;
import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase;
import com.intellij.ui.ActiveComponent;
import org.junit.Assert;
import rocks.blackcat.vcl.psi.VCLTypes;

public class testLexer extends LightPlatformCodeInsightFixtureTestCase{

    private String[] validIdentifiers = {"foo", "FOO", "Foo", "fooBar", "foo_bar", "foo-Bar", "foo1987"};
    private String[] invalidIdentifiers = {"_foo", "1987foo", "ąę", ".foo"};

    private static FlexAdapter lexerAdapter = new VCLLexerAdapter();

    public void testDurationUnits() {

        String[] validUnits = new String[]{"ms", "s", "m", "h", "d", "w", "y"};
        for (String test : validUnits) {
            _testTokenEquals( "1" + test, VCLTypes.DURATION);
            _testTokenEquals( "2.0" + test, VCLTypes.DURATION);
        }
    }

    public void testDurationNumbers() {
        String[] validNumbers = new String[]{"0", "1", "0.1", "12345.12345"};
        for (String test : validNumbers) {
            _testTokenEquals(test + "s", VCLTypes.DURATION);
        }
    }

    public void testNumbers() {
        String[] validNumbers = new String[]{"0", "1", "0.1", "12345.12345"};
        for (String test : validNumbers) {
            _testTokenEquals(test, VCLTypes.NUMBER);
        }
    }

    public void testLineComment() {
        String[] validLinecomments = new String[]{"//test", "//test// ", "#test", "##test"};
        for (String test : validLinecomments) {
            _testTokenEquals(test, VCLTypes.LINE_COMMENT);
        }
    }

    public void testBlockComment() {
        String[] validLinecomments = new String[]{"/*oneline*/", "/*\nmutli\nline\n*/"};
        for (String test : validLinecomments) {
            _testTokenEquals(test, VCLTypes.BLOCK_COMMENT);
        }
    }

    public void testIdentifier(){
        for (String test : validIdentifiers) {
            _testTokenEquals(test, VCLTypes.IDENTIFIER);
        }
    }

    public void testInvalidIdentifier(){
        for (String test : invalidIdentifiers) {
            _testTokenNotEquals(test, VCLTypes.IDENTIFIER);
        }
    }

    public void testProperty(){
        for (String test : validIdentifiers) {
            test = "." + test;
            _testTokenEquals(test, VCLTypes.PROPERTY);
        }
    }

    public void testInvalidProperty(){
        for (String test : invalidIdentifiers) {
            test = "." + test;
            _testTokenNotEquals(test, VCLTypes.PROPERTY);
        }
    }

    public void testOperator(){
        String[] validLinecomments = new String[]{"!=", "!~", "~=", "!", "~", "%", "&&", "&", "==", "~",
                                                    "<=", ">=", "<<", ">>", "*=", "-=", "+=", "/=", ">", "<", "/",
                                                    "+", "*", "-", "||"};
        for (String test : validLinecomments) {
            _testTokenEquals(test, VCLTypes.OPERATOR);
        }
        //@todo Should this parse as an operator?
        //It was in the previous operator definition
        //"="
        _testTokenNotEquals("=", VCLTypes.OPERATOR);
    }

    public void testString(){
        String[] validStrings = new String[]{"\"\"", "\"foo;'\"", "'foo'", "'f\"oo'"};
        for (String test : validStrings) {
            _testTokenEquals(test, VCLTypes.STRING);
        }
    }

    public void testInvalidStrings(){
        String[] validStrings = new String[]{"\"\n\"", "'\n'"};
        for (String test : validStrings) {
            _testTokenNotEquals(test, VCLTypes.STRING);
        }
    }
    
    public void testMinorTokens(){
        _testTokenEquals(";", VCLTypes.SEMI);
        _testTokenEquals("=", VCLTypes.EQ);
        _testTokenEquals("(", VCLTypes.LP);
        _testTokenEquals(")", VCLTypes.RP);
        _testTokenEquals(".", VCLTypes.DOT);
        _testTokenEquals("{", VCLTypes.LC);
        _testTokenEquals("}", VCLTypes.RC);
        _testTokenEquals(",", VCLTypes.COMMA);
        _testTokenEquals("sub", VCLTypes.KEYWORD_SUB);
        _testTokenEquals("acl", VCLTypes.KEYWORD_ACL);
        _testTokenEquals("set", VCLTypes.KEYWORD_SET);
        _testTokenEquals("backend", VCLTypes.KEYWORD_BACKEND);
        _testTokenEquals("import", VCLTypes.KEYWORD_IMPORT);
        _testTokenEquals("if", VCLTypes.KEYWORD_IF);
        _testTokenEquals("else", VCLTypes.KEYWORD_ELSE);
        _testTokenEquals("elif", VCLTypes.KEYWORD_ELIF);
        _testTokenEquals("elsif", VCLTypes.KEYWORD_ELSIF);
        _testTokenEquals("elseif", VCLTypes.KEYWORD_ELSEIF);
        _testTokenEquals("return", VCLTypes.KEYWORD_RETURN);
        _testTokenEquals("unset", VCLTypes.KEYWORD_UNSET);
        _testTokenEquals("new", VCLTypes.KEYWORD_NEW);
        _testTokenEquals("include", VCLTypes.KEYWORD_INCLUDE);
        _testTokenEquals("remove", VCLTypes.KEYWORD_REMOVE);
        _testTokenEquals("error", VCLTypes.KEYWORD_ERROR);
        _testTokenEquals("director", VCLTypes.KEYWORD_DIRECTOR);
        _testTokenEquals("probe", VCLTypes.KEYWORD_PROBE);
        _testTokenEquals("synthetic", VCLTypes.KEYWORD_SYNTHETIC);
        _testTokenEquals("C{", VCLTypes.L_CBRACE);
        _testTokenEquals("}C", VCLTypes.R_CBRACE);
        _testTokenEquals("{\"", VCLTypes.L_LSTRING);
        _testTokenEquals("\"}", VCLTypes.R_LSTRING);

    }

    private void _testTokenEquals(String testString, IElementType type){
        lexerAdapter.start( testString);
        Assert.assertEquals(type, lexerAdapter.getTokenType());
        Assert.assertEquals(testString, lexerAdapter.getTokenText());
    }

    private void _testTokenNotEquals(String testString, IElementType type){
        lexerAdapter.start( testString);
        Assert.assertNotEquals(type, lexerAdapter.getTokenType());
    }

}

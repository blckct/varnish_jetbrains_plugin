package rocks.blackcat.vcl;


import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import rocks.blackcat.vcl.psi.VCLTypes;
import org.jetbrains.annotations.NotNull;
import com.intellij.psi.tree.TokenSet;
import static rocks.blackcat.vcl.psi.VCLTypes.*;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class VCLSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("VCL_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey VALUE =
            createTextAttributesKey("VCL_VALUE", DefaultLanguageHighlighterColors.GLOBAL_VARIABLE);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("VCL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("VCL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey ACL =
            createTextAttributesKey("VCL_ACL", DefaultLanguageHighlighterColors.FUNCTION_CALL);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("VCL_KEYWORDS", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("VCL_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey OPERATOR =
            createTextAttributesKey("VCL_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey CURLIES =
            createTextAttributesKey("VCL_CURLES", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey PARENTHESES =
            createTextAttributesKey("VCL_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("VCL_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("VCL_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] ACL_KEYS = new TextAttributesKey[]{ACL};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] CURLIES_KEYS = new TextAttributesKey[]{CURLIES};
    private static final TextAttributesKey[] PARANTHESES_KEYS = new TextAttributesKey[]{PARENTHESES};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};

    private static final TokenSet KEYWORDS = TokenSet.create(
            KEYWORD_ACL,
            KEYWORD_BACKEND,
            KEYWORD_ELSE,
            KEYWORD_ELSEIF,
            KEYWORD_IF,
            KEYWORD_IMPORT,
            KEYWORD_NEW,
            KEYWORD_RETURN,
            KEYWORD_SET,
            KEYWORD_SUB,
            KEYWORD_UNSET,
            KEYWORD_INCLUDE
    );

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new VCLLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(TokenType.CODE_FRAGMENT)) {
            return SEPARATOR_KEYS;
        } else if (tokenType.equals(VCLTypes.ACL)) {
            return ACL_KEYS;
        } else if (tokenType.equals(VCLTypes.VALUE)) {
            return VALUE_KEYS;
        } else if (tokenType.equals(VCLTypes.BLOCK_COMMENT) || tokenType.equals(VCLTypes.LINE_COMMENT)) {
            return COMMENT_KEYS;
        }
        else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else if (tokenType.equals(VCLTypes.ACL_ENTRY)){
            return ACL_KEYS;
        } else if (tokenType.equals(VCLTypes.STRING)){
            return STRING_KEYS;
        } else if (tokenType.equals(VCLTypes.OPERATOR)){
            return OPERATOR_KEYS;
        } else if (tokenType.equals(VCLTypes.LC) || tokenType.equals(VCLTypes.RC)){
            return CURLIES_KEYS;
        } else if (tokenType.equals(VCLTypes.LP) || tokenType.equals(VCLTypes.RP)){
            return PARANTHESES_KEYS;
        } else if (tokenType.equals(VCLTypes.IDENTIFIER)){
            return IDENTIFIER_KEYS;
        } else if (tokenType.equals(VCLTypes.NUMBER) || tokenType.equals(VCLTypes.DURATION)){
            return NUMBER_KEYS;
        } else if (tokenType.equals(VCLTypes.EXPRESSION)) {
            return NUMBER_KEYS;
        } else if (KEYWORDS.contains(tokenType)){
            return KEYWORD_KEYS;
        }

        else {
            return EMPTY_KEYS;
        }
    }
}
package rocks.blackcat.vcl;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static rocks.blackcat.vcl.psi.VCLTypes.*;

%%


%class VCLLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}


EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
WHITESPACE=[ \t\n\x0B\f\r]+
LINE_COMMENT=("//"|#).*
NUMBER=[0-9]+(\.[0-9]*)?
DURATION=[0-9]+(\.[0-9]*)?(ms|s|m|h|d|w|y)
IP=\"\b[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\b\"
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
IDENTIFIER=([a-zA-Z][a-zA-Z0-9_-]*)
BLOCK_COMMENT= "/*"( [^*] | (\*+[^*/]) )*\*+\/
OPERATOR= "!"|%|&|==|"~"|=|<=|>=|<<|>>|&&|\|\||\*=|-=|\+="/"=|>|<|"/"|\+|\*|-

%state INLINE_C

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  ";"                  { return SEMI; }
  "="                  { return EQ; }
  "("                  { return LP; }
  ")"                  { return RP; }
  "."                  { return DOT; }
  "{"                  { return LC; }
  "}"                  { return RC; }
  ","                  { return COMMA; }
  "sub"                { return KEYWORD_SUB; }
  "acl"                { return KEYWORD_ACL; }
  "set"                { return KEYWORD_SET; }
  "backend"            { return KEYWORD_BACKEND; }
  "import"             { return KEYWORD_IMPORT; }
  "if"                 { return KEYWORD_IF; }
  "else"               { return KEYWORD_ELSE; }
  "return"             { return KEYWORD_RETURN; }
  "unset"              { return KEYWORD_UNSET; }
  "new"                { return KEYWORD_NEW; }
  "elseif"             { return KEYWORD_ELSEIF; }
  "include"            { return KEYWORD_INCLUDE; }
   "C{"                { yybegin(INLINE_C); return L_CBRACE;}

  {SPACE}              { return SPACE; }
  {WHITESPACE}         { return WHITESPACE; }
  {LINE_COMMENT}       { return LINE_COMMENT; }
  {NUMBER}             { return NUMBER; }
  {DURATION}           { return DURATION; }
  {IP}                 { return IP; }
  {STRING}             { return STRING; }
  {IDENTIFIER}         { return IDENTIFIER; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }
  {OPERATOR}           { return OPERATOR; }

}

<INLINE_C> {
    "}C" {yybegin(YYINITIAL); return R_CBRACE;}
    (.|\n)+/}C  {return C_CONTENT;}
}

[^] { return BAD_CHARACTER; }

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
STRING=('([^'\\\n]|\\.)*'|\"([^\"\\\n]|\\.)*\")
IDENTIFIER=([a-zA-Z]([a-zA-Z0-9_-]|\.)*)
BLOCK_COMMENT= "/*"( [^*] | (\*+[^*/]) )*\*+\/
OPERATOR= \!=|\!\~|\~=|\!|\~|%|&&|&|==|\~|=|<=|>=|<<|>>|\*=|-=|\+=|"/"=|>|<|"/"|\+|\*|-|\|\|

%state INLINE_C
%state LONG_STRING

%{
  private int c_start;
  private int s_start;
%}

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
  "elif"               { return KEYWORD_ELIF; }
  "elsif"              { return KEYWORD_ELSIF; }
  "elseif"             { return KEYWORD_ELSEIF; }
  "return"             { return KEYWORD_RETURN; }
  "unset"              { return KEYWORD_UNSET; }
  "new"                { return KEYWORD_NEW; }
  "include"            { return KEYWORD_INCLUDE; }
  "remove"             { return KEYWORD_REMOVE; }

   "C{"                { yybegin(INLINE_C); c_start = getTokenStart()+2; return L_CBRACE;}
   "}C"                { return R_CBRACE;}
   "{\""               { yybegin(LONG_STRING); s_start = getTokenStart()+2; return L_LSTRING; }
   "\"}"               { return R_LSTRING; }

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
    //"}C" {yybegin(YYINITIAL); return R_CBRACE;}
    "}C" {yybegin(YYINITIAL); yypushback(2); zzStartRead = c_start; return C_CONTENT; }
    .   {}
    \n  {}
    <<EOF>> {yybegin(YYINITIAL); return C_CONTENT;}
}

<LONG_STRING> {
    //"}C" {yybegin(YYINITIAL); return R_CBRACE;}
    "\"}" {yybegin(YYINITIAL); yypushback(2); zzStartRead = s_start; return STRING_CONTENT; }
    .   {}
    \n  {}
    <<EOF>> {yybegin(YYINITIAL); return STRING_CONTENT;}
}

[^] { return BAD_CHARACTER; }

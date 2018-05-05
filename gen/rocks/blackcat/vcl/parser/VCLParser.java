// This is a generated file. Not intended for manual editing.
package rocks.blackcat.vcl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static rocks.blackcat.vcl.psi.VCLTypes.*;
import static rocks.blackcat.vcl.parser.VCLParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class VCLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ACL) {
      r = ACL(b, 0);
    }
    else if (t == ACL_ENTRY) {
      r = ACL_ENTRY(b, 0);
    }
    else if (t == ACL_PART) {
      r = ACL_PART(b, 0);
    }
    else if (t == ACTION) {
      r = ACTION(b, 0);
    }
    else if (t == BACKEND) {
      r = BACKEND(b, 0);
    }
    else if (t == BUITLIN) {
      r = BUITLIN(b, 0);
    }
    else if (t == CALL) {
      r = CALL(b, 0);
    }
    else if (t == COMPOUND) {
      r = COMPOUND(b, 0);
    }
    else if (t == CONDITION) {
      r = CONDITION(b, 0);
    }
    else if (t == DIRECTOR) {
      r = DIRECTOR(b, 0);
    }
    else if (t == ELSE) {
      r = ELSE(b, 0);
    }
    else if (t == ERROR) {
      r = ERROR(b, 0);
    }
    else if (t == EXPRESSION) {
      r = EXPRESSION(b, 0);
    }
    else if (t == F_CALL) {
      r = F_CALL(b, 0);
    }
    else if (t == F_SYNTH) {
      r = F_SYNTH(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = IF_STATEMENT(b, 0);
    }
    else if (t == IMPORT) {
      r = IMPORT(b, 0);
    }
    else if (t == INCLUDE) {
      r = INCLUDE(b, 0);
    }
    else if (t == INLINE_C) {
      r = INLINE_C(b, 0);
    }
    else if (t == LITERAL) {
      r = LITERAL(b, 0);
    }
    else if (t == LONG_STRING) {
      r = LONG_STRING(b, 0);
    }
    else if (t == NETMASK) {
      r = NETMASK(b, 0);
    }
    else if (t == NEW) {
      r = NEW(b, 0);
    }
    else if (t == OBJECT) {
      r = OBJECT(b, 0);
    }
    else if (t == OBJECT_INTERNAL) {
      r = OBJECT_INTERNAL(b, 0);
    }
    else if (t == OPERATION) {
      r = OPERATION(b, 0);
    }
    else if (t == OPERATION_INTERNAL) {
      r = OPERATION_INTERNAL(b, 0);
    }
    else if (t == PROBE) {
      r = PROBE(b, 0);
    }
    else if (t == PROBE_INTERNAL) {
      r = PROBE_INTERNAL(b, 0);
    }
    else if (t == PURGE) {
      r = PURGE(b, 0);
    }
    else if (t == RETURN) {
      r = RETURN(b, 0);
    }
    else if (t == SET) {
      r = SET(b, 0);
    }
    else if (t == STATEMENT) {
      r = STATEMENT(b, 0);
    }
    else if (t == STRINGS) {
      r = STRINGS(b, 0);
    }
    else if (t == STRINGS_INTERNAL) {
      r = STRINGS_INTERNAL(b, 0);
    }
    else if (t == SUB) {
      r = SUB(b, 0);
    }
    else if (t == SYNTHETIC) {
      r = SYNTHETIC(b, 0);
    }
    else if (t == UNSET) {
      r = UNSET(b, 0);
    }
    else if (t == VALUE) {
      r = VALUE(b, 0);
    }
    else if (t == VERSION) {
      r = VERSION(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // 'acl' identifier '{'ACL_ENTRY'}'
  public static boolean ACL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ACL")) return false;
    if (!nextTokenIs(b, "<keyword>", KEYWORD_ACL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACL, "<keyword>");
    r = consumeTokens(b, 0, KEYWORD_ACL, IDENTIFIER, LC);
    r = r && ACL_ENTRY(b, l + 1);
    r = r && consumeToken(b, RC);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (ACL_PART ';' | BLANK) *
  public static boolean ACL_ENTRY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ACL_ENTRY")) return false;
    Marker m = enter_section_(b, l, _NONE_, ACL_ENTRY, "<acl entry>");
    int c = current_position_(b);
    while (true) {
      if (!ACL_ENTRY_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ACL_ENTRY", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ACL_PART ';' | BLANK
  private static boolean ACL_ENTRY_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ACL_ENTRY_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ACL_ENTRY_0_0(b, l + 1);
    if (!r) r = consumeToken(b, BLANK);
    exit_section_(b, m, null, r);
    return r;
  }

  // ACL_PART ';'
  private static boolean ACL_ENTRY_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ACL_ENTRY_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ACL_PART(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ['!'] ( NETMASK | string [])
  public static boolean ACL_PART(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ACL_PART")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACL_PART, "<acl part>");
    r = ACL_PART_0(b, l + 1);
    r = r && ACL_PART_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['!']
  private static boolean ACL_PART_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ACL_PART_0")) return false;
    consumeToken(b, "!");
    return true;
  }

  // NETMASK | string []
  private static boolean ACL_PART_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ACL_PART_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NETMASK(b, l + 1);
    if (!r) r = ACL_PART_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string []
  private static boolean ACL_PART_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ACL_PART_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && ACL_PART_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // []
  private static boolean ACL_PART_1_1_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // SYNTHETIC | F_CALL | SET | UNSET | CALL | PURGE | NEW  | ERROR | RETURN
  public static boolean ACTION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ACTION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTION, "<action>");
    r = SYNTHETIC(b, l + 1);
    if (!r) r = F_CALL(b, l + 1);
    if (!r) r = SET(b, l + 1);
    if (!r) r = UNSET(b, l + 1);
    if (!r) r = CALL(b, l + 1);
    if (!r) r = PURGE(b, l + 1);
    if (!r) r = NEW(b, l + 1);
    if (!r) r = ERROR(b, l + 1);
    if (!r) r = RETURN(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'backend' identifier '{' [OBJECT_INTERNAL *] '}'
  public static boolean BACKEND(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BACKEND")) return false;
    if (!nextTokenIs(b, KEYWORD_BACKEND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_BACKEND, IDENTIFIER, LC);
    r = r && BACKEND_3(b, l + 1);
    r = r && consumeToken(b, RC);
    exit_section_(b, m, BACKEND, r);
    return r;
  }

  // [OBJECT_INTERNAL *]
  private static boolean BACKEND_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BACKEND_3")) return false;
    BACKEND_3_0(b, l + 1);
    return true;
  }

  // OBJECT_INTERNAL *
  private static boolean BACKEND_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BACKEND_3_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OBJECT_INTERNAL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BACKEND_3_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // RETURN | ERROR
  public static boolean BUITLIN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BUITLIN")) return false;
    if (!nextTokenIs(b, "<buitlin>", KEYWORD_ERROR, KEYWORD_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUITLIN, "<buitlin>");
    r = RETURN(b, l + 1);
    if (!r) r = ERROR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'call' OBJECT
  public static boolean CALL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CALL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL, "<call>");
    r = consumeToken(b, "call");
    r = r && OBJECT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' STATEMENT '}'
  public static boolean COMPOUND(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMPOUND")) return false;
    if (!nextTokenIs(b, LC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LC);
    r = r && STATEMENT(b, l + 1);
    r = r && consumeToken(b, RC);
    exit_section_(b, m, COMPOUND, r);
    return r;
  }

  /* ********************************************************** */
  // '(' EXPRESSION ')'
  public static boolean CONDITION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CONDITION")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && EXPRESSION(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, CONDITION, r);
    return r;
  }

  /* ********************************************************** */
  // keyword_director identifier identifier '{' [ ('{' OBJECT_INTERNAL *'}' | OBJECT_INTERNAL) *]'}'
  public static boolean DIRECTOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIRECTOR")) return false;
    if (!nextTokenIs(b, KEYWORD_DIRECTOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_DIRECTOR, IDENTIFIER, IDENTIFIER, LC);
    r = r && DIRECTOR_4(b, l + 1);
    r = r && consumeToken(b, RC);
    exit_section_(b, m, DIRECTOR, r);
    return r;
  }

  // [ ('{' OBJECT_INTERNAL *'}' | OBJECT_INTERNAL) *]
  private static boolean DIRECTOR_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIRECTOR_4")) return false;
    DIRECTOR_4_0(b, l + 1);
    return true;
  }

  // ('{' OBJECT_INTERNAL *'}' | OBJECT_INTERNAL) *
  private static boolean DIRECTOR_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIRECTOR_4_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DIRECTOR_4_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DIRECTOR_4_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '{' OBJECT_INTERNAL *'}' | OBJECT_INTERNAL
  private static boolean DIRECTOR_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIRECTOR_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DIRECTOR_4_0_0_0(b, l + 1);
    if (!r) r = OBJECT_INTERNAL(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' OBJECT_INTERNAL *'}'
  private static boolean DIRECTOR_4_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIRECTOR_4_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LC);
    r = r && DIRECTOR_4_0_0_0_1(b, l + 1);
    r = r && consumeToken(b, RC);
    exit_section_(b, m, null, r);
    return r;
  }

  // OBJECT_INTERNAL *
  private static boolean DIRECTOR_4_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIRECTOR_4_0_0_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OBJECT_INTERNAL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DIRECTOR_4_0_0_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ('else' (COMPOUND | IF_STATEMENT)) | ('elif' | 'elseif'| 'elsif') IF_INTERAL
  public static boolean ELSE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELSE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELSE, "<else>");
    r = ELSE_0(b, l + 1);
    if (!r) r = ELSE_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'else' (COMPOUND | IF_STATEMENT)
  private static boolean ELSE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELSE_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_ELSE);
    r = r && ELSE_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMPOUND | IF_STATEMENT
  private static boolean ELSE_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELSE_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = COMPOUND(b, l + 1);
    if (!r) r = IF_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('elif' | 'elseif'| 'elsif') IF_INTERAL
  private static boolean ELSE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELSE_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ELSE_1_0(b, l + 1);
    r = r && IF_INTERAL(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'elif' | 'elseif'| 'elsif'
  private static boolean ELSE_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELSE_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_ELIF);
    if (!r) r = consumeToken(b, KEYWORD_ELSEIF);
    if (!r) r = consumeToken(b, KEYWORD_ELSIF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'error' number (OPERATION)
  public static boolean ERROR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ERROR")) return false;
    if (!nextTokenIs(b, KEYWORD_ERROR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_ERROR, NUMBER);
    r = r && ERROR_2(b, l + 1);
    exit_section_(b, m, ERROR, r);
    return r;
  }

  // (OPERATION)
  private static boolean ERROR_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ERROR_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OPERATION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('!' '(' EXPRESSION ')' |CONDITION | F_CALL | OPERATION | OBJECT | 'true' | 'false' ) [('&&' | '||' EXPRESSION) ]
  public static boolean EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = EXPRESSION_0(b, l + 1);
    r = r && EXPRESSION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '!' '(' EXPRESSION ')' |CONDITION | F_CALL | OPERATION | OBJECT | 'true' | 'false'
  private static boolean EXPRESSION_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPRESSION_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EXPRESSION_0_0(b, l + 1);
    if (!r) r = CONDITION(b, l + 1);
    if (!r) r = F_CALL(b, l + 1);
    if (!r) r = OPERATION(b, l + 1);
    if (!r) r = OBJECT(b, l + 1);
    if (!r) r = consumeToken(b, "true");
    if (!r) r = consumeToken(b, "false");
    exit_section_(b, m, null, r);
    return r;
  }

  // '!' '(' EXPRESSION ')'
  private static boolean EXPRESSION_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPRESSION_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "!");
    r = r && consumeToken(b, LP);
    r = r && EXPRESSION(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // [('&&' | '||' EXPRESSION) ]
  private static boolean EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPRESSION_1")) return false;
    EXPRESSION_1_0(b, l + 1);
    return true;
  }

  // '&&' | '||' EXPRESSION
  private static boolean EXPRESSION_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPRESSION_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "&&");
    if (!r) r = EXPRESSION_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '||' EXPRESSION
  private static boolean EXPRESSION_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPRESSION_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "||");
    r = r && EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (OBJECT ) '(' [OPERATION [ (',' OPERATION ) *]] ')'
  public static boolean F_CALL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "F_CALL")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = F_CALL_0(b, l + 1);
    r = r && consumeToken(b, LP);
    r = r && F_CALL_2(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, F_CALL, r);
    return r;
  }

  // (OBJECT )
  private static boolean F_CALL_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "F_CALL_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OBJECT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [OPERATION [ (',' OPERATION ) *]]
  private static boolean F_CALL_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "F_CALL_2")) return false;
    F_CALL_2_0(b, l + 1);
    return true;
  }

  // OPERATION [ (',' OPERATION ) *]
  private static boolean F_CALL_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "F_CALL_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OPERATION(b, l + 1);
    r = r && F_CALL_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ (',' OPERATION ) *]
  private static boolean F_CALL_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "F_CALL_2_0_1")) return false;
    F_CALL_2_0_1_0(b, l + 1);
    return true;
  }

  // (',' OPERATION ) *
  private static boolean F_CALL_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "F_CALL_2_0_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!F_CALL_2_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "F_CALL_2_0_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' OPERATION
  private static boolean F_CALL_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "F_CALL_2_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && OPERATION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'synth(' number ',' STRINGS ')'
  public static boolean F_SYNTH(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "F_SYNTH")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, F_SYNTH, "<f synth>");
    r = consumeToken(b, "synth(");
    r = r && consumeTokens(b, 0, NUMBER, COMMA);
    r = r && STRINGS(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CONDITION COMPOUND [ELSE]
  static boolean IF_INTERAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IF_INTERAL")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CONDITION(b, l + 1);
    r = r && COMPOUND(b, l + 1);
    r = r && IF_INTERAL_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ELSE]
  private static boolean IF_INTERAL_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IF_INTERAL_2")) return false;
    ELSE(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'if' IF_INTERAL
  public static boolean IF_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IF_STATEMENT")) return false;
    if (!nextTokenIs(b, KEYWORD_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_IF);
    r = r && IF_INTERAL(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // 'import' identifier ';'
  public static boolean IMPORT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IMPORT")) return false;
    if (!nextTokenIs(b, KEYWORD_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_IMPORT, IDENTIFIER, SEMI);
    exit_section_(b, m, IMPORT, r);
    return r;
  }

  /* ********************************************************** */
  // 'include' STRINGS ';'
  public static boolean INCLUDE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INCLUDE")) return false;
    if (!nextTokenIs(b, KEYWORD_INCLUDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_INCLUDE);
    r = r && STRINGS(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, INCLUDE, r);
    return r;
  }

  /* ********************************************************** */
  // 'C{' C_CONTENT '}C'
  public static boolean INLINE_C(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INLINE_C")) return false;
    if (!nextTokenIs(b, L_CBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, L_CBRACE, C_CONTENT, R_CBRACE);
    exit_section_(b, m, INLINE_C, r);
    return r;
  }

  /* ********************************************************** */
  // NETMASK | STRINGS | number | identifier | OBJECT | duration
  public static boolean LITERAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LITERAL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = NETMASK(b, l + 1);
    if (!r) r = STRINGS(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = OBJECT(b, l + 1);
    if (!r) r = consumeToken(b, DURATION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{"' STRING_CONTENT '"}'
  public static boolean LONG_STRING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LONG_STRING")) return false;
    if (!nextTokenIs(b, L_LSTRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, L_LSTRING, STRING_CONTENT, R_LSTRING);
    exit_section_(b, m, LONG_STRING, r);
    return r;
  }

  /* ********************************************************** */
  // string '/' number
  public static boolean NETMASK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NETMASK")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && consumeToken(b, "/");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, NETMASK, r);
    return r;
  }

  /* ********************************************************** */
  // keyword_new OBJECT '=' OPERATION
  public static boolean NEW(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NEW")) return false;
    if (!nextTokenIs(b, KEYWORD_NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_NEW);
    r = r && OBJECT(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && OPERATION(b, l + 1);
    exit_section_(b, m, NEW, r);
    return r;
  }

  /* ********************************************************** */
  // identifier ['DOT' identifier]
  public static boolean OBJECT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OBJECT")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && OBJECT_1(b, l + 1);
    exit_section_(b, m, OBJECT, r);
    return r;
  }

  // ['DOT' identifier]
  private static boolean OBJECT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OBJECT_1")) return false;
    OBJECT_1_0(b, l + 1);
    return true;
  }

  // 'DOT' identifier
  private static boolean OBJECT_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OBJECT_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "DOT");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (property|identifier) '=' (VALUE ';'| '{' OBJECT_INTERNAL * '}')
  public static boolean OBJECT_INTERNAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OBJECT_INTERNAL")) return false;
    if (!nextTokenIs(b, "<object internal>", IDENTIFIER, PROPERTY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_INTERNAL, "<object internal>");
    r = OBJECT_INTERNAL_0(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && OBJECT_INTERNAL_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // property|identifier
  private static boolean OBJECT_INTERNAL_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OBJECT_INTERNAL_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROPERTY);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUE ';'| '{' OBJECT_INTERNAL * '}'
  private static boolean OBJECT_INTERNAL_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OBJECT_INTERNAL_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OBJECT_INTERNAL_2_0(b, l + 1);
    if (!r) r = OBJECT_INTERNAL_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUE ';'
  private static boolean OBJECT_INTERNAL_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OBJECT_INTERNAL_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VALUE(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' OBJECT_INTERNAL * '}'
  private static boolean OBJECT_INTERNAL_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OBJECT_INTERNAL_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LC);
    r = r && OBJECT_INTERNAL_2_1_1(b, l + 1);
    r = r && consumeToken(b, RC);
    exit_section_(b, m, null, r);
    return r;
  }

  // OBJECT_INTERNAL *
  private static boolean OBJECT_INTERNAL_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OBJECT_INTERNAL_2_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OBJECT_INTERNAL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OBJECT_INTERNAL_2_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // OPERATION_INTERNAL [([operator *] OPERATION_INTERNAL) *]
  public static boolean OPERATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATION, "<operation>");
    r = OPERATION_INTERNAL(b, l + 1);
    r = r && OPERATION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [([operator *] OPERATION_INTERNAL) *]
  private static boolean OPERATION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_1")) return false;
    OPERATION_1_0(b, l + 1);
    return true;
  }

  // ([operator *] OPERATION_INTERNAL) *
  private static boolean OPERATION_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OPERATION_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OPERATION_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // [operator *] OPERATION_INTERNAL
  private static boolean OPERATION_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OPERATION_1_0_0_0(b, l + 1);
    r = r && OPERATION_INTERNAL(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [operator *]
  private static boolean OPERATION_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_1_0_0_0")) return false;
    OPERATION_1_0_0_0_0(b, l + 1);
    return true;
  }

  // operator *
  private static boolean OPERATION_1_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_1_0_0_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, OPERATOR)) break;
      if (!empty_element_parsed_guard_(b, "OPERATION_1_0_0_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '(' OPERATION ')'| VALUE
  public static boolean OPERATION_INTERNAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_INTERNAL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATION_INTERNAL, "<operation internal>");
    r = OPERATION_INTERNAL_0(b, l + 1);
    if (!r) r = VALUE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' OPERATION ')'
  private static boolean OPERATION_INTERNAL_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION_INTERNAL_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && OPERATION(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'probe' identifier? '{' PROBE_INTERNAL '}'
  public static boolean PROBE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROBE, "<probe>");
    r = consumeToken(b, "probe");
    r = r && PROBE_1(b, l + 1);
    r = r && consumeToken(b, LC);
    r = r && PROBE_INTERNAL(b, l + 1);
    r = r && consumeToken(b, RC);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier?
  private static boolean PROBE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // ('.url' '=' STRINGS ';'
  //                      | '.timeout' '=' duration ';'
  //                      | '.interval' '=' duration ';'
  //                      | '.window' '=' number ';'
  //                      | '.threshold' '=' number ';'
  //                      | '.request' '=' STRINGS * ';'
  //                      | '.expected_response' '=' number ';'
  //                      | '.initial' '=' number ';')+
  public static boolean PROBE_INTERNAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROBE_INTERNAL, "<probe internal>");
    r = PROBE_INTERNAL_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!PROBE_INTERNAL_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PROBE_INTERNAL", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '.url' '=' STRINGS ';'
  //                      | '.timeout' '=' duration ';'
  //                      | '.interval' '=' duration ';'
  //                      | '.window' '=' number ';'
  //                      | '.threshold' '=' number ';'
  //                      | '.request' '=' STRINGS * ';'
  //                      | '.expected_response' '=' number ';'
  //                      | '.initial' '=' number ';'
  private static boolean PROBE_INTERNAL_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PROBE_INTERNAL_0_0(b, l + 1);
    if (!r) r = PROBE_INTERNAL_0_1(b, l + 1);
    if (!r) r = PROBE_INTERNAL_0_2(b, l + 1);
    if (!r) r = PROBE_INTERNAL_0_3(b, l + 1);
    if (!r) r = PROBE_INTERNAL_0_4(b, l + 1);
    if (!r) r = PROBE_INTERNAL_0_5(b, l + 1);
    if (!r) r = PROBE_INTERNAL_0_6(b, l + 1);
    if (!r) r = PROBE_INTERNAL_0_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.url' '=' STRINGS ';'
  private static boolean PROBE_INTERNAL_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".url");
    r = r && consumeToken(b, EQ);
    r = r && STRINGS(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.timeout' '=' duration ';'
  private static boolean PROBE_INTERNAL_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".timeout");
    r = r && consumeTokens(b, 0, EQ, DURATION, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.interval' '=' duration ';'
  private static boolean PROBE_INTERNAL_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".interval");
    r = r && consumeTokens(b, 0, EQ, DURATION, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.window' '=' number ';'
  private static boolean PROBE_INTERNAL_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".window");
    r = r && consumeTokens(b, 0, EQ, NUMBER, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.threshold' '=' number ';'
  private static boolean PROBE_INTERNAL_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".threshold");
    r = r && consumeTokens(b, 0, EQ, NUMBER, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.request' '=' STRINGS * ';'
  private static boolean PROBE_INTERNAL_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_0_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".request");
    r = r && consumeToken(b, EQ);
    r = r && PROBE_INTERNAL_0_5_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRINGS *
  private static boolean PROBE_INTERNAL_0_5_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_0_5_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!STRINGS(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PROBE_INTERNAL_0_5_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.expected_response' '=' number ';'
  private static boolean PROBE_INTERNAL_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_0_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".expected_response");
    r = r && consumeTokens(b, 0, EQ, NUMBER, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.initial' '=' number ';'
  private static boolean PROBE_INTERNAL_0_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_0_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".initial");
    r = r && consumeTokens(b, 0, EQ, NUMBER, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'purge'
  public static boolean PURGE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PURGE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PURGE, "<purge>");
    r = consumeToken(b, "purge");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'return' '('( F_SYNTH | identifier ) ')'
  public static boolean RETURN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RETURN")) return false;
    if (!nextTokenIs(b, KEYWORD_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_RETURN, LP);
    r = r && RETURN_2(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, RETURN, r);
    return r;
  }

  // F_SYNTH | identifier
  private static boolean RETURN_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RETURN_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = F_SYNTH(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'set' OBJECT '=' (OPERATION)
  public static boolean SET(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SET")) return false;
    if (!nextTokenIs(b, KEYWORD_SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_SET);
    r = r && OBJECT(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && SET_3(b, l + 1);
    exit_section_(b, m, SET, r);
    return r;
  }

  // (OPERATION)
  private static boolean SET_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SET_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OPERATION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (COMPOUND | IF_STATEMENT | INLINE_C | ACTION ';' | INCLUDE) *
  public static boolean STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT")) return false;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    int c = current_position_(b);
    while (true) {
      if (!STATEMENT_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENT", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // COMPOUND | IF_STATEMENT | INLINE_C | ACTION ';' | INCLUDE
  private static boolean STATEMENT_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = COMPOUND(b, l + 1);
    if (!r) r = IF_STATEMENT(b, l + 1);
    if (!r) r = INLINE_C(b, l + 1);
    if (!r) r = STATEMENT_0_3(b, l + 1);
    if (!r) r = INCLUDE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ACTION ';'
  private static boolean STATEMENT_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ACTION(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRINGS_INTERNAL [(['+'] STRINGS_INTERNAL) *]
  public static boolean STRINGS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STRINGS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRINGS, "<strings>");
    r = STRINGS_INTERNAL(b, l + 1);
    r = r && STRINGS_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [(['+'] STRINGS_INTERNAL) *]
  private static boolean STRINGS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STRINGS_1")) return false;
    STRINGS_1_0(b, l + 1);
    return true;
  }

  // (['+'] STRINGS_INTERNAL) *
  private static boolean STRINGS_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STRINGS_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!STRINGS_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "STRINGS_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ['+'] STRINGS_INTERNAL
  private static boolean STRINGS_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STRINGS_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = STRINGS_1_0_0_0(b, l + 1);
    r = r && STRINGS_INTERNAL(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['+']
  private static boolean STRINGS_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STRINGS_1_0_0_0")) return false;
    consumeToken(b, "+");
    return true;
  }

  /* ********************************************************** */
  // string | LONG_STRING | F_CALL| OBJECT
  public static boolean STRINGS_INTERNAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STRINGS_INTERNAL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRINGS_INTERNAL, "<strings internal>");
    r = consumeToken(b, STRING);
    if (!r) r = LONG_STRING(b, l + 1);
    if (!r) r = F_CALL(b, l + 1);
    if (!r) r = OBJECT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'sub' identifier COMPOUND
  public static boolean SUB(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SUB")) return false;
    if (!nextTokenIs(b, KEYWORD_SUB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_SUB, IDENTIFIER);
    r = r && COMPOUND(b, l + 1);
    exit_section_(b, m, SUB, r);
    return r;
  }

  /* ********************************************************** */
  // 'synthetic' (STRINGS | '(' STRINGS')')
  public static boolean SYNTHETIC(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SYNTHETIC")) return false;
    if (!nextTokenIs(b, KEYWORD_SYNTHETIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_SYNTHETIC);
    r = r && SYNTHETIC_1(b, l + 1);
    exit_section_(b, m, SYNTHETIC, r);
    return r;
  }

  // STRINGS | '(' STRINGS')'
  private static boolean SYNTHETIC_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SYNTHETIC_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = STRINGS(b, l + 1);
    if (!r) r = SYNTHETIC_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' STRINGS')'
  private static boolean SYNTHETIC_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SYNTHETIC_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && STRINGS(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('unset' | 'remove') OBJECT
  public static boolean UNSET(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNSET")) return false;
    if (!nextTokenIs(b, "<unset>", KEYWORD_REMOVE, KEYWORD_UNSET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNSET, "<unset>");
    r = UNSET_0(b, l + 1);
    r = r && OBJECT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'unset' | 'remove'
  private static boolean UNSET_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UNSET_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_UNSET);
    if (!r) r = consumeToken(b, KEYWORD_REMOVE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ['!'] (F_CALL|LITERAL|OBJECT)
  public static boolean VALUE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VALUE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = VALUE_0(b, l + 1);
    r = r && VALUE_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['!']
  private static boolean VALUE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VALUE_0")) return false;
    consumeToken(b, "!");
    return true;
  }

  // F_CALL|LITERAL|OBJECT
  private static boolean VALUE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VALUE_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = F_CALL(b, l + 1);
    if (!r) r = LITERAL(b, l + 1);
    if (!r) r = OBJECT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'vcl' number ';'
  public static boolean VERSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VERSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VERSION, "<version>");
    r = consumeToken(b, "vcl");
    r = r && consumeTokens(b, 0, NUMBER, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [VERSION] (ACL | SUB | IMPORT | BACKEND | PROBE | INCLUDE | INLINE_C | DIRECTOR)*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0(b, l + 1);
    r = r && root_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [VERSION]
  private static boolean root_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0")) return false;
    VERSION(b, l + 1);
    return true;
  }

  // (ACL | SUB | IMPORT | BACKEND | PROBE | INCLUDE | INLINE_C | DIRECTOR)*
  private static boolean root_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!root_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ACL | SUB | IMPORT | BACKEND | PROBE | INCLUDE | INLINE_C | DIRECTOR
  private static boolean root_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ACL(b, l + 1);
    if (!r) r = SUB(b, l + 1);
    if (!r) r = IMPORT(b, l + 1);
    if (!r) r = BACKEND(b, l + 1);
    if (!r) r = PROBE(b, l + 1);
    if (!r) r = INCLUDE(b, l + 1);
    if (!r) r = INLINE_C(b, l + 1);
    if (!r) r = DIRECTOR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}

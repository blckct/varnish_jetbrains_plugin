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

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ACL) {
      result_ = ACL(builder_, 0);
    }
    else if (root_ == ACL_ENTRY) {
      result_ = ACL_ENTRY(builder_, 0);
    }
    else if (root_ == ACL_PART) {
      result_ = ACL_PART(builder_, 0);
    }
    else if (root_ == ACTION) {
      result_ = ACTION(builder_, 0);
    }
    else if (root_ == BACKEND) {
      result_ = BACKEND(builder_, 0);
    }
    else if (root_ == CALL) {
      result_ = CALL(builder_, 0);
    }
    else if (root_ == COMPOUND) {
      result_ = COMPOUND(builder_, 0);
    }
    else if (root_ == CONDITION) {
      result_ = CONDITION(builder_, 0);
    }
    else if (root_ == DIRECTOR) {
      result_ = DIRECTOR(builder_, 0);
    }
    else if (root_ == ELSE) {
      result_ = ELSE(builder_, 0);
    }
    else if (root_ == ERROR) {
      result_ = ERROR(builder_, 0);
    }
    else if (root_ == EXPRESSION) {
      result_ = EXPRESSION(builder_, 0);
    }
    else if (root_ == F_CALL) {
      result_ = F_CALL(builder_, 0);
    }
    else if (root_ == F_FAIL) {
      result_ = F_FAIL(builder_, 0);
    }
    else if (root_ == F_PASS) {
      result_ = F_PASS(builder_, 0);
    }
    else if (root_ == F_SYNTH) {
      result_ = F_SYNTH(builder_, 0);
    }
    else if (root_ == F_VCL) {
      result_ = F_VCL(builder_, 0);
    }
    else if (root_ == IF_STATEMENT) {
      result_ = IF_STATEMENT(builder_, 0);
    }
    else if (root_ == IMPORT) {
      result_ = IMPORT(builder_, 0);
    }
    else if (root_ == INCLUDE) {
      result_ = INCLUDE(builder_, 0);
    }
    else if (root_ == INLINE_C) {
      result_ = INLINE_C(builder_, 0);
    }
    else if (root_ == LITERAL) {
      result_ = LITERAL(builder_, 0);
    }
    else if (root_ == LONG_STRING) {
      result_ = LONG_STRING(builder_, 0);
    }
    else if (root_ == NETMASK) {
      result_ = NETMASK(builder_, 0);
    }
    else if (root_ == NEW) {
      result_ = NEW(builder_, 0);
    }
    else if (root_ == OBJECT) {
      result_ = OBJECT(builder_, 0);
    }
    else if (root_ == OBJECT_INTERNAL) {
      result_ = OBJECT_INTERNAL(builder_, 0);
    }
    else if (root_ == OPERATION) {
      result_ = OPERATION(builder_, 0);
    }
    else if (root_ == OPERATION_INTERNAL) {
      result_ = OPERATION_INTERNAL(builder_, 0);
    }
    else if (root_ == PROBE) {
      result_ = PROBE(builder_, 0);
    }
    else if (root_ == PROBE_INTERNAL) {
      result_ = PROBE_INTERNAL(builder_, 0);
    }
    else if (root_ == PURGE) {
      result_ = PURGE(builder_, 0);
    }
    else if (root_ == RETURN) {
      result_ = RETURN(builder_, 0);
    }
    else if (root_ == SET) {
      result_ = SET(builder_, 0);
    }
    else if (root_ == STATEMENT) {
      result_ = STATEMENT(builder_, 0);
    }
    else if (root_ == STRINGS) {
      result_ = STRINGS(builder_, 0);
    }
    else if (root_ == STRINGS_INTERNAL) {
      result_ = STRINGS_INTERNAL(builder_, 0);
    }
    else if (root_ == SUB) {
      result_ = SUB(builder_, 0);
    }
    else if (root_ == SYNTHETIC) {
      result_ = SYNTHETIC(builder_, 0);
    }
    else if (root_ == UNSET) {
      result_ = UNSET(builder_, 0);
    }
    else if (root_ == VALUE) {
      result_ = VALUE(builder_, 0);
    }
    else if (root_ == VERSION) {
      result_ = VERSION(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return root(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // 'acl' identifier '{'ACL_ENTRY'}'
  public static boolean ACL(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ACL")) return false;
    if (!nextTokenIs(builder_, "<keyword>", KEYWORD_ACL)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ACL, "<keyword>");
    result_ = consumeTokens(builder_, 1, KEYWORD_ACL, IDENTIFIER, LC);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ACL_ENTRY(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RC) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // (ACL_PART ';' | BLANK) *
  public static boolean ACL_ENTRY(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ACL_ENTRY")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ACL_ENTRY, "<acl entry>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ACL_ENTRY_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ACL_ENTRY", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // ACL_PART ';' | BLANK
  private static boolean ACL_ENTRY_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ACL_ENTRY_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ACL_ENTRY_0_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, BLANK);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ACL_PART ';'
  private static boolean ACL_ENTRY_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ACL_ENTRY_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ACL_PART(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ['!'] ( NETMASK | string [])
  public static boolean ACL_PART(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ACL_PART")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ACL_PART, "<acl part>");
    result_ = ACL_PART_0(builder_, level_ + 1);
    result_ = result_ && ACL_PART_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ['!']
  private static boolean ACL_PART_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ACL_PART_0")) return false;
    consumeToken(builder_, "!");
    return true;
  }

  // NETMASK | string []
  private static boolean ACL_PART_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ACL_PART_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = NETMASK(builder_, level_ + 1);
    if (!result_) result_ = ACL_PART_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // string []
  private static boolean ACL_PART_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ACL_PART_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRING);
    result_ = result_ && ACL_PART_1_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // []
  private static boolean ACL_PART_1_1_1(PsiBuilder builder_, int level_) {
    return true;
  }

  /* ********************************************************** */
  // SYNTHETIC | F_CALL ';'| SET | UNSET | CALL | PURGE | NEW  | ERROR | RETURN
  public static boolean ACTION(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ACTION")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ACTION, "<action>");
    result_ = SYNTHETIC(builder_, level_ + 1);
    if (!result_) result_ = ACTION_1(builder_, level_ + 1);
    if (!result_) result_ = SET(builder_, level_ + 1);
    if (!result_) result_ = UNSET(builder_, level_ + 1);
    if (!result_) result_ = CALL(builder_, level_ + 1);
    if (!result_) result_ = PURGE(builder_, level_ + 1);
    if (!result_) result_ = NEW(builder_, level_ + 1);
    if (!result_) result_ = ERROR(builder_, level_ + 1);
    if (!result_) result_ = RETURN(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // F_CALL ';'
  private static boolean ACTION_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ACTION_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = F_CALL(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'backend' identifier '{' [OBJECT_INTERNAL *] '}'
  public static boolean BACKEND(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BACKEND")) return false;
    if (!nextTokenIs(builder_, KEYWORD_BACKEND)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BACKEND, null);
    result_ = consumeTokens(builder_, 1, KEYWORD_BACKEND, IDENTIFIER, LC);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, BACKEND_3(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RC) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [OBJECT_INTERNAL *]
  private static boolean BACKEND_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BACKEND_3")) return false;
    BACKEND_3_0(builder_, level_ + 1);
    return true;
  }

  // OBJECT_INTERNAL *
  private static boolean BACKEND_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BACKEND_3_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OBJECT_INTERNAL(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "BACKEND_3_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'call' OBJECT ';'
  public static boolean CALL(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CALL")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CALL, "<call>");
    result_ = consumeToken(builder_, "call");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, OBJECT(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '{' STATEMENT '}'
  public static boolean COMPOUND(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "COMPOUND")) return false;
    if (!nextTokenIs(builder_, LC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LC);
    result_ = result_ && STATEMENT(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RC);
    exit_section_(builder_, marker_, COMPOUND, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' EXPRESSION ')'
  public static boolean CONDITION(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CONDITION")) return false;
    if (!nextTokenIs(builder_, LP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LP);
    result_ = result_ && EXPRESSION(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RP);
    exit_section_(builder_, marker_, CONDITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // keyword_director identifier identifier '{' [ ('{' OBJECT_INTERNAL *'}' | OBJECT_INTERNAL) *]'}'
  public static boolean DIRECTOR(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DIRECTOR")) return false;
    if (!nextTokenIs(builder_, KEYWORD_DIRECTOR)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DIRECTOR, null);
    result_ = consumeTokens(builder_, 1, KEYWORD_DIRECTOR, IDENTIFIER, IDENTIFIER, LC);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, DIRECTOR_4(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RC) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ ('{' OBJECT_INTERNAL *'}' | OBJECT_INTERNAL) *]
  private static boolean DIRECTOR_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DIRECTOR_4")) return false;
    DIRECTOR_4_0(builder_, level_ + 1);
    return true;
  }

  // ('{' OBJECT_INTERNAL *'}' | OBJECT_INTERNAL) *
  private static boolean DIRECTOR_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DIRECTOR_4_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!DIRECTOR_4_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "DIRECTOR_4_0", pos_)) break;
    }
    return true;
  }

  // '{' OBJECT_INTERNAL *'}' | OBJECT_INTERNAL
  private static boolean DIRECTOR_4_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DIRECTOR_4_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = DIRECTOR_4_0_0_0(builder_, level_ + 1);
    if (!result_) result_ = OBJECT_INTERNAL(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '{' OBJECT_INTERNAL *'}'
  private static boolean DIRECTOR_4_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DIRECTOR_4_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LC);
    result_ = result_ && DIRECTOR_4_0_0_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RC);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OBJECT_INTERNAL *
  private static boolean DIRECTOR_4_0_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DIRECTOR_4_0_0_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OBJECT_INTERNAL(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "DIRECTOR_4_0_0_0_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ('else'  (IF_STATEMENT | COMPOUND)) | ('elif' | 'elseif'| 'elsif') IF_INTERAL
  public static boolean ELSE(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ELSE")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ELSE, "<else>");
    result_ = ELSE_0(builder_, level_ + 1);
    if (!result_) result_ = ELSE_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // 'else'  (IF_STATEMENT | COMPOUND)
  private static boolean ELSE_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ELSE_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_ELSE);
    result_ = result_ && ELSE_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IF_STATEMENT | COMPOUND
  private static boolean ELSE_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ELSE_0_1")) return false;
    boolean result_;
    result_ = IF_STATEMENT(builder_, level_ + 1);
    if (!result_) result_ = COMPOUND(builder_, level_ + 1);
    return result_;
  }

  // ('elif' | 'elseif'| 'elsif') IF_INTERAL
  private static boolean ELSE_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ELSE_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ELSE_1_0(builder_, level_ + 1);
    result_ = result_ && IF_INTERAL(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'elif' | 'elseif'| 'elsif'
  private static boolean ELSE_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ELSE_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_ELIF);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_ELSEIF);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_ELSIF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'error' number [STRINGS]  ';'
  public static boolean ERROR(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ERROR")) return false;
    if (!nextTokenIs(builder_, KEYWORD_ERROR)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ERROR, null);
    result_ = consumeTokens(builder_, 1, KEYWORD_ERROR, NUMBER);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ERROR_2(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [STRINGS]
  private static boolean ERROR_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ERROR_2")) return false;
    STRINGS(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ('!' '(' EXPRESSION ')' |CONDITION | F_CALL | OPERATION | OBJECT | 'true' | 'false' ) [('&&' | '||' EXPRESSION) ]
  public static boolean EXPRESSION(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EXPRESSION")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, EXPRESSION, "<expression>");
    result_ = EXPRESSION_0(builder_, level_ + 1);
    result_ = result_ && EXPRESSION_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '!' '(' EXPRESSION ')' |CONDITION | F_CALL | OPERATION | OBJECT | 'true' | 'false'
  private static boolean EXPRESSION_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EXPRESSION_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = EXPRESSION_0_0(builder_, level_ + 1);
    if (!result_) result_ = CONDITION(builder_, level_ + 1);
    if (!result_) result_ = F_CALL(builder_, level_ + 1);
    if (!result_) result_ = OPERATION(builder_, level_ + 1);
    if (!result_) result_ = OBJECT(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, "true");
    if (!result_) result_ = consumeToken(builder_, "false");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '!' '(' EXPRESSION ')'
  private static boolean EXPRESSION_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EXPRESSION_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "!");
    result_ = result_ && consumeToken(builder_, LP);
    result_ = result_ && EXPRESSION(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RP);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [('&&' | '||' EXPRESSION) ]
  private static boolean EXPRESSION_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EXPRESSION_1")) return false;
    EXPRESSION_1_0(builder_, level_ + 1);
    return true;
  }

  // '&&' | '||' EXPRESSION
  private static boolean EXPRESSION_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EXPRESSION_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "&&");
    if (!result_) result_ = EXPRESSION_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '||' EXPRESSION
  private static boolean EXPRESSION_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EXPRESSION_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "||");
    result_ = result_ && EXPRESSION(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (OBJECT ) '(' [OPERATION [ (',' OPERATION ) *]] ')'
  public static boolean F_CALL(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_CALL")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = F_CALL_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LP);
    result_ = result_ && F_CALL_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RP);
    exit_section_(builder_, marker_, F_CALL, result_);
    return result_;
  }

  // (OBJECT )
  private static boolean F_CALL_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_CALL_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = OBJECT(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [OPERATION [ (',' OPERATION ) *]]
  private static boolean F_CALL_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_CALL_2")) return false;
    F_CALL_2_0(builder_, level_ + 1);
    return true;
  }

  // OPERATION [ (',' OPERATION ) *]
  private static boolean F_CALL_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_CALL_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = OPERATION(builder_, level_ + 1);
    result_ = result_ && F_CALL_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ (',' OPERATION ) *]
  private static boolean F_CALL_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_CALL_2_0_1")) return false;
    F_CALL_2_0_1_0(builder_, level_ + 1);
    return true;
  }

  // (',' OPERATION ) *
  private static boolean F_CALL_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_CALL_2_0_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!F_CALL_2_0_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "F_CALL_2_0_1_0", pos_)) break;
    }
    return true;
  }

  // ',' OPERATION
  private static boolean F_CALL_2_0_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_CALL_2_0_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && OPERATION(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'fail'['(' STRINGS ')']
  public static boolean F_FAIL(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_FAIL")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, F_FAIL, "<f fail>");
    result_ = consumeToken(builder_, "fail");
    result_ = result_ && F_FAIL_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ['(' STRINGS ')']
  private static boolean F_FAIL_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_FAIL_1")) return false;
    F_FAIL_1_0(builder_, level_ + 1);
    return true;
  }

  // '(' STRINGS ')'
  private static boolean F_FAIL_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_FAIL_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LP);
    result_ = result_ && STRINGS(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RP);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'pass(' duration ')'
  public static boolean F_PASS(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_PASS")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, F_PASS, "<f pass>");
    result_ = consumeToken(builder_, "pass(");
    result_ = result_ && consumeTokens(builder_, 0, DURATION, RP);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // 'synth(' number [',' STRINGS] ')'
  public static boolean F_SYNTH(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_SYNTH")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, F_SYNTH, "<f synth>");
    result_ = consumeToken(builder_, "synth(");
    result_ = result_ && consumeToken(builder_, NUMBER);
    result_ = result_ && F_SYNTH_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RP);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [',' STRINGS]
  private static boolean F_SYNTH_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_SYNTH_2")) return false;
    F_SYNTH_2_0(builder_, level_ + 1);
    return true;
  }

  // ',' STRINGS
  private static boolean F_SYNTH_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_SYNTH_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && STRINGS(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'vcl(' identifier ')'
  public static boolean F_VCL(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "F_VCL")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, F_VCL, "<f vcl>");
    result_ = consumeToken(builder_, "vcl(");
    result_ = result_ && consumeTokens(builder_, 0, IDENTIFIER, RP);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // CONDITION COMPOUND
  static boolean IF_INTERAL(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IF_INTERAL")) return false;
    if (!nextTokenIs(builder_, LP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = CONDITION(builder_, level_ + 1);
    result_ = result_ && COMPOUND(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'if' IF_INTERAL [ELSE *]
  public static boolean IF_STATEMENT(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IF_STATEMENT")) return false;
    if (!nextTokenIs(builder_, KEYWORD_IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_IF);
    result_ = result_ && IF_INTERAL(builder_, level_ + 1);
    result_ = result_ && IF_STATEMENT_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, IF_STATEMENT, result_);
    return result_;
  }

  // [ELSE *]
  private static boolean IF_STATEMENT_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IF_STATEMENT_2")) return false;
    IF_STATEMENT_2_0(builder_, level_ + 1);
    return true;
  }

  // ELSE *
  private static boolean IF_STATEMENT_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IF_STATEMENT_2_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ELSE(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "IF_STATEMENT_2_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'import' identifier [ 'from' STRINGS]';'
  public static boolean IMPORT(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IMPORT")) return false;
    if (!nextTokenIs(builder_, KEYWORD_IMPORT)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IMPORT, null);
    result_ = consumeTokens(builder_, 1, KEYWORD_IMPORT, IDENTIFIER);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, IMPORT_2(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ 'from' STRINGS]
  private static boolean IMPORT_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IMPORT_2")) return false;
    IMPORT_2_0(builder_, level_ + 1);
    return true;
  }

  // 'from' STRINGS
  private static boolean IMPORT_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IMPORT_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "from");
    result_ = result_ && STRINGS(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'include' STRINGS ';'
  public static boolean INCLUDE(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "INCLUDE")) return false;
    if (!nextTokenIs(builder_, KEYWORD_INCLUDE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INCLUDE, null);
    result_ = consumeToken(builder_, KEYWORD_INCLUDE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, STRINGS(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // 'C{' C_CONTENT '}C'
  public static boolean INLINE_C(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "INLINE_C")) return false;
    if (!nextTokenIs(builder_, L_CBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, L_CBRACE, C_CONTENT, R_CBRACE);
    exit_section_(builder_, marker_, INLINE_C, result_);
    return result_;
  }

  /* ********************************************************** */
  // NETMASK | STRINGS | number | identifier | OBJECT | duration
  public static boolean LITERAL(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LITERAL")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LITERAL, "<literal>");
    result_ = NETMASK(builder_, level_ + 1);
    if (!result_) result_ = STRINGS(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = OBJECT(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DURATION);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '{"' STRING_CONTENT '"}'
  public static boolean LONG_STRING(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LONG_STRING")) return false;
    if (!nextTokenIs(builder_, L_LSTRING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, L_LSTRING, STRING_CONTENT, R_LSTRING);
    exit_section_(builder_, marker_, LONG_STRING, result_);
    return result_;
  }

  /* ********************************************************** */
  // string '/' number
  public static boolean NETMASK(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NETMASK")) return false;
    if (!nextTokenIs(builder_, STRING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRING);
    result_ = result_ && consumeToken(builder_, "/");
    result_ = result_ && consumeToken(builder_, NUMBER);
    exit_section_(builder_, marker_, NETMASK, result_);
    return result_;
  }

  /* ********************************************************** */
  // keyword_new OBJECT '=' OPERATION ';'
  public static boolean NEW(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NEW")) return false;
    if (!nextTokenIs(builder_, KEYWORD_NEW)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NEW, null);
    result_ = consumeToken(builder_, KEYWORD_NEW);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, OBJECT(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, EQ)) && result_;
    result_ = pinned_ && report_error_(builder_, OPERATION(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // identifier [property *]
  public static boolean OBJECT(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OBJECT")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && OBJECT_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, OBJECT, result_);
    return result_;
  }

  // [property *]
  private static boolean OBJECT_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OBJECT_1")) return false;
    OBJECT_1_0(builder_, level_ + 1);
    return true;
  }

  // property *
  private static boolean OBJECT_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OBJECT_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, PROPERTY)) break;
      if (!empty_element_parsed_guard_(builder_, "OBJECT_1_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // VALUE ';'| ((property|identifier) '=' (VALUE ';'| '{' OBJECT_INTERNAL * '}'))
  public static boolean OBJECT_INTERNAL(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OBJECT_INTERNAL")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OBJECT_INTERNAL, "<object internal>");
    result_ = OBJECT_INTERNAL_0(builder_, level_ + 1);
    if (!result_) result_ = OBJECT_INTERNAL_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // VALUE ';'
  private static boolean OBJECT_INTERNAL_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OBJECT_INTERNAL_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = VALUE(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (property|identifier) '=' (VALUE ';'| '{' OBJECT_INTERNAL * '}')
  private static boolean OBJECT_INTERNAL_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OBJECT_INTERNAL_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = OBJECT_INTERNAL_1_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQ);
    result_ = result_ && OBJECT_INTERNAL_1_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // property|identifier
  private static boolean OBJECT_INTERNAL_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OBJECT_INTERNAL_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PROPERTY);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    return result_;
  }

  // VALUE ';'| '{' OBJECT_INTERNAL * '}'
  private static boolean OBJECT_INTERNAL_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OBJECT_INTERNAL_1_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = OBJECT_INTERNAL_1_2_0(builder_, level_ + 1);
    if (!result_) result_ = OBJECT_INTERNAL_1_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // VALUE ';'
  private static boolean OBJECT_INTERNAL_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OBJECT_INTERNAL_1_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = VALUE(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '{' OBJECT_INTERNAL * '}'
  private static boolean OBJECT_INTERNAL_1_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OBJECT_INTERNAL_1_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LC);
    result_ = result_ && OBJECT_INTERNAL_1_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RC);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OBJECT_INTERNAL *
  private static boolean OBJECT_INTERNAL_1_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OBJECT_INTERNAL_1_2_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OBJECT_INTERNAL(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "OBJECT_INTERNAL_1_2_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OPERATION_INTERNAL [([operator *] OPERATION_INTERNAL) *]
  public static boolean OPERATION(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OPERATION")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPERATION, "<operation>");
    result_ = OPERATION_INTERNAL(builder_, level_ + 1);
    result_ = result_ && OPERATION_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [([operator *] OPERATION_INTERNAL) *]
  private static boolean OPERATION_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OPERATION_1")) return false;
    OPERATION_1_0(builder_, level_ + 1);
    return true;
  }

  // ([operator *] OPERATION_INTERNAL) *
  private static boolean OPERATION_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OPERATION_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!OPERATION_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "OPERATION_1_0", pos_)) break;
    }
    return true;
  }

  // [operator *] OPERATION_INTERNAL
  private static boolean OPERATION_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OPERATION_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = OPERATION_1_0_0_0(builder_, level_ + 1);
    result_ = result_ && OPERATION_INTERNAL(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [operator *]
  private static boolean OPERATION_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OPERATION_1_0_0_0")) return false;
    OPERATION_1_0_0_0_0(builder_, level_ + 1);
    return true;
  }

  // operator *
  private static boolean OPERATION_1_0_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OPERATION_1_0_0_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, OPERATOR)) break;
      if (!empty_element_parsed_guard_(builder_, "OPERATION_1_0_0_0_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' OPERATION ')'| VALUE
  public static boolean OPERATION_INTERNAL(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OPERATION_INTERNAL")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPERATION_INTERNAL, "<operation internal>");
    result_ = OPERATION_INTERNAL_0(builder_, level_ + 1);
    if (!result_) result_ = VALUE(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '(' OPERATION ')'
  private static boolean OPERATION_INTERNAL_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OPERATION_INTERNAL_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LP);
    result_ = result_ && OPERATION(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RP);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // keyword_probe identifier '{' PROBE_INTERNAL '}'
  public static boolean PROBE(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PROBE")) return false;
    if (!nextTokenIs(builder_, KEYWORD_PROBE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PROBE, null);
    result_ = consumeTokens(builder_, 1, KEYWORD_PROBE, IDENTIFIER, LC);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, PROBE_INTERNAL(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RC) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
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
  public static boolean PROBE_INTERNAL(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PROBE_INTERNAL")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PROBE_INTERNAL, "<probe internal>");
    result_ = PROBE_INTERNAL_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!PROBE_INTERNAL_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "PROBE_INTERNAL", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '.url' '=' STRINGS ';'
  //                      | '.timeout' '=' duration ';'
  //                      | '.interval' '=' duration ';'
  //                      | '.window' '=' number ';'
  //                      | '.threshold' '=' number ';'
  //                      | '.request' '=' STRINGS * ';'
  //                      | '.expected_response' '=' number ';'
  //                      | '.initial' '=' number ';'
  private static boolean PROBE_INTERNAL_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PROBE_INTERNAL_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PROBE_INTERNAL_0_0(builder_, level_ + 1);
    if (!result_) result_ = PROBE_INTERNAL_0_1(builder_, level_ + 1);
    if (!result_) result_ = PROBE_INTERNAL_0_2(builder_, level_ + 1);
    if (!result_) result_ = PROBE_INTERNAL_0_3(builder_, level_ + 1);
    if (!result_) result_ = PROBE_INTERNAL_0_4(builder_, level_ + 1);
    if (!result_) result_ = PROBE_INTERNAL_0_5(builder_, level_ + 1);
    if (!result_) result_ = PROBE_INTERNAL_0_6(builder_, level_ + 1);
    if (!result_) result_ = PROBE_INTERNAL_0_7(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '.url' '=' STRINGS ';'
  private static boolean PROBE_INTERNAL_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PROBE_INTERNAL_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ".url");
    result_ = result_ && consumeToken(builder_, EQ);
    result_ = result_ && STRINGS(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '.timeout' '=' duration ';'
  private static boolean PROBE_INTERNAL_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PROBE_INTERNAL_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ".timeout");
    result_ = result_ && consumeTokens(builder_, 0, EQ, DURATION, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '.interval' '=' duration ';'
  private static boolean PROBE_INTERNAL_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PROBE_INTERNAL_0_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ".interval");
    result_ = result_ && consumeTokens(builder_, 0, EQ, DURATION, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '.window' '=' number ';'
  private static boolean PROBE_INTERNAL_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PROBE_INTERNAL_0_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ".window");
    result_ = result_ && consumeTokens(builder_, 0, EQ, NUMBER, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '.threshold' '=' number ';'
  private static boolean PROBE_INTERNAL_0_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PROBE_INTERNAL_0_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ".threshold");
    result_ = result_ && consumeTokens(builder_, 0, EQ, NUMBER, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '.request' '=' STRINGS * ';'
  private static boolean PROBE_INTERNAL_0_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PROBE_INTERNAL_0_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ".request");
    result_ = result_ && consumeToken(builder_, EQ);
    result_ = result_ && PROBE_INTERNAL_0_5_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // STRINGS *
  private static boolean PROBE_INTERNAL_0_5_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PROBE_INTERNAL_0_5_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!STRINGS(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "PROBE_INTERNAL_0_5_2", pos_)) break;
    }
    return true;
  }

  // '.expected_response' '=' number ';'
  private static boolean PROBE_INTERNAL_0_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PROBE_INTERNAL_0_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ".expected_response");
    result_ = result_ && consumeTokens(builder_, 0, EQ, NUMBER, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '.initial' '=' number ';'
  private static boolean PROBE_INTERNAL_0_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PROBE_INTERNAL_0_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ".initial");
    result_ = result_ && consumeTokens(builder_, 0, EQ, NUMBER, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'purge' ';'
  public static boolean PURGE(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PURGE")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PURGE, "<purge>");
    result_ = consumeToken(builder_, "purge");
    pinned_ = result_; // pin = 1
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // 'return' '('( F_SYNTH | F_VCL | F_PASS | F_FAIL | identifier ) ')' ';'
  public static boolean RETURN(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RETURN")) return false;
    if (!nextTokenIs(builder_, KEYWORD_RETURN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RETURN, null);
    result_ = consumeTokens(builder_, 1, KEYWORD_RETURN, LP);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, RETURN_2(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeTokens(builder_, -1, RP, SEMI)) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // F_SYNTH | F_VCL | F_PASS | F_FAIL | identifier
  private static boolean RETURN_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RETURN_2")) return false;
    boolean result_;
    result_ = F_SYNTH(builder_, level_ + 1);
    if (!result_) result_ = F_VCL(builder_, level_ + 1);
    if (!result_) result_ = F_PASS(builder_, level_ + 1);
    if (!result_) result_ = F_FAIL(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    return result_;
  }

  /* ********************************************************** */
  // 'set' OBJECT '=' (OPERATION) ';'
  public static boolean SET(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SET")) return false;
    if (!nextTokenIs(builder_, KEYWORD_SET)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SET, null);
    result_ = consumeToken(builder_, KEYWORD_SET);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, OBJECT(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, EQ)) && result_;
    result_ = pinned_ && report_error_(builder_, SET_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (OPERATION)
  private static boolean SET_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SET_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = OPERATION(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (COMPOUND | IF_STATEMENT | INLINE_C | ACTION  | INCLUDE) *
  public static boolean STATEMENT(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "STATEMENT")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT, "<statement>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!STATEMENT_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "STATEMENT", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // COMPOUND | IF_STATEMENT | INLINE_C | ACTION  | INCLUDE
  private static boolean STATEMENT_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "STATEMENT_0")) return false;
    boolean result_;
    result_ = COMPOUND(builder_, level_ + 1);
    if (!result_) result_ = IF_STATEMENT(builder_, level_ + 1);
    if (!result_) result_ = INLINE_C(builder_, level_ + 1);
    if (!result_) result_ = ACTION(builder_, level_ + 1);
    if (!result_) result_ = INCLUDE(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // STRINGS_INTERNAL [(['+'] STRINGS_INTERNAL) *]
  public static boolean STRINGS(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "STRINGS")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRINGS, "<strings>");
    result_ = STRINGS_INTERNAL(builder_, level_ + 1);
    result_ = result_ && STRINGS_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [(['+'] STRINGS_INTERNAL) *]
  private static boolean STRINGS_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "STRINGS_1")) return false;
    STRINGS_1_0(builder_, level_ + 1);
    return true;
  }

  // (['+'] STRINGS_INTERNAL) *
  private static boolean STRINGS_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "STRINGS_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!STRINGS_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "STRINGS_1_0", pos_)) break;
    }
    return true;
  }

  // ['+'] STRINGS_INTERNAL
  private static boolean STRINGS_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "STRINGS_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = STRINGS_1_0_0_0(builder_, level_ + 1);
    result_ = result_ && STRINGS_INTERNAL(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['+']
  private static boolean STRINGS_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "STRINGS_1_0_0_0")) return false;
    consumeToken(builder_, "+");
    return true;
  }

  /* ********************************************************** */
  // string | LONG_STRING | F_CALL| OBJECT
  public static boolean STRINGS_INTERNAL(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "STRINGS_INTERNAL")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRINGS_INTERNAL, "<strings internal>");
    result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = LONG_STRING(builder_, level_ + 1);
    if (!result_) result_ = F_CALL(builder_, level_ + 1);
    if (!result_) result_ = OBJECT(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // 'sub' identifier COMPOUND
  public static boolean SUB(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SUB")) return false;
    if (!nextTokenIs(builder_, KEYWORD_SUB)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SUB, null);
    result_ = consumeTokens(builder_, 1, KEYWORD_SUB, IDENTIFIER);
    pinned_ = result_; // pin = 1
    result_ = result_ && COMPOUND(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // 'synthetic' (STRINGS | '(' STRINGS')') ';'
  public static boolean SYNTHETIC(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SYNTHETIC")) return false;
    if (!nextTokenIs(builder_, KEYWORD_SYNTHETIC)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SYNTHETIC, null);
    result_ = consumeToken(builder_, KEYWORD_SYNTHETIC);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, SYNTHETIC_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // STRINGS | '(' STRINGS')'
  private static boolean SYNTHETIC_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SYNTHETIC_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = STRINGS(builder_, level_ + 1);
    if (!result_) result_ = SYNTHETIC_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' STRINGS')'
  private static boolean SYNTHETIC_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SYNTHETIC_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LP);
    result_ = result_ && STRINGS(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RP);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ('unset' | 'remove') OBJECT ';'
  public static boolean UNSET(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UNSET")) return false;
    if (!nextTokenIs(builder_, "<unset>", KEYWORD_REMOVE, KEYWORD_UNSET)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, UNSET, "<unset>");
    result_ = UNSET_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, OBJECT(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // 'unset' | 'remove'
  private static boolean UNSET_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UNSET_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD_UNSET);
    if (!result_) result_ = consumeToken(builder_, KEYWORD_REMOVE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ['!'] (F_CALL|LITERAL|OBJECT)
  public static boolean VALUE(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VALUE")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VALUE, "<value>");
    result_ = VALUE_0(builder_, level_ + 1);
    result_ = result_ && VALUE_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ['!']
  private static boolean VALUE_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VALUE_0")) return false;
    consumeToken(builder_, "!");
    return true;
  }

  // F_CALL|LITERAL|OBJECT
  private static boolean VALUE_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VALUE_1")) return false;
    boolean result_;
    result_ = F_CALL(builder_, level_ + 1);
    if (!result_) result_ = LITERAL(builder_, level_ + 1);
    if (!result_) result_ = OBJECT(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // 'vcl' number ';'
  public static boolean VERSION(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VERSION")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VERSION, "<version>");
    result_ = consumeToken(builder_, "vcl");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeTokens(builder_, -1, NUMBER, SEMI));
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // [VERSION] (ACL | SUB | IMPORT | BACKEND | PROBE | INCLUDE | INLINE_C | DIRECTOR)*
  static boolean root(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = root_0(builder_, level_ + 1);
    result_ = result_ && root_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [VERSION]
  private static boolean root_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root_0")) return false;
    VERSION(builder_, level_ + 1);
    return true;
  }

  // (ACL | SUB | IMPORT | BACKEND | PROBE | INCLUDE | INLINE_C | DIRECTOR)*
  private static boolean root_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!root_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "root_1", pos_)) break;
    }
    return true;
  }

  // ACL | SUB | IMPORT | BACKEND | PROBE | INCLUDE | INLINE_C | DIRECTOR
  private static boolean root_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root_1_0")) return false;
    boolean result_;
    result_ = ACL(builder_, level_ + 1);
    if (!result_) result_ = SUB(builder_, level_ + 1);
    if (!result_) result_ = IMPORT(builder_, level_ + 1);
    if (!result_) result_ = BACKEND(builder_, level_ + 1);
    if (!result_) result_ = PROBE(builder_, level_ + 1);
    if (!result_) result_ = INCLUDE(builder_, level_ + 1);
    if (!result_) result_ = INLINE_C(builder_, level_ + 1);
    if (!result_) result_ = DIRECTOR(builder_, level_ + 1);
    return result_;
  }

}

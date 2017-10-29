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
    else if (t == BACKEND_INTERNAL) {
      r = BACKEND_INTERNAL(b, 0);
    }
    else if (t == BEREQ) {
      r = BEREQ(b, 0);
    }
    else if (t == BERESP) {
      r = BERESP(b, 0);
    }
    else if (t == BLANK) {
      r = BLANK(b, 0);
    }
    else if (t == BUITLIN) {
      r = BUITLIN(b, 0);
    }
    else if (t == CLIENT) {
      r = CLIENT(b, 0);
    }
    else if (t == COMPOUND) {
      r = COMPOUND(b, 0);
    }
    else if (t == CONDITION) {
      r = CONDITION(b, 0);
    }
    else if (t == EXPRESSION) {
      r = EXPRESSION(b, 0);
    }
    else if (t == FOO) {
      r = FOO(b, 0);
    }
    else if (t == F_CALL) {
      r = F_CALL(b, 0);
    }
    else if (t == F_SYNTH) {
      r = F_SYNTH(b, 0);
    }
    else if (t == HEADER) {
      r = HEADER(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = IF_STATEMENT(b, 0);
    }
    else if (t == IMPORT) {
      r = IMPORT(b, 0);
    }
    else if (t == INLINE_C) {
      r = INLINE_C(b, 0);
    }
    else if (t == LOCAL) {
      r = LOCAL(b, 0);
    }
    else if (t == NETMASK) {
      r = NETMASK(b, 0);
    }
    else if (t == NOW) {
      r = NOW(b, 0);
    }
    else if (t == OBJ) {
      r = OBJ(b, 0);
    }
    else if (t == OPERATION) {
      r = OPERATION(b, 0);
    }
    else if (t == PROBE) {
      r = PROBE(b, 0);
    }
    else if (t == PROBE_INTERNAL) {
      r = PROBE_INTERNAL(b, 0);
    }
    else if (t == REMOTE) {
      r = REMOTE(b, 0);
    }
    else if (t == REQ) {
      r = REQ(b, 0);
    }
    else if (t == REQ_TOP) {
      r = REQ_TOP(b, 0);
    }
    else if (t == RESP) {
      r = RESP(b, 0);
    }
    else if (t == RETURN) {
      r = RETURN(b, 0);
    }
    else if (t == SERVER) {
      r = SERVER(b, 0);
    }
    else if (t == STAMENT) {
      r = STAMENT(b, 0);
    }
    else if (t == STORAGE) {
      r = STORAGE(b, 0);
    }
    else if (t == SUB) {
      r = SUB(b, 0);
    }
    else if (t == SYNTH) {
      r = SYNTH(b, 0);
    }
    else if (t == VALUE) {
      r = VALUE(b, 0);
    }
    else if (t == VARIABLE) {
      r = VARIABLE(b, 0);
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ACL, "<keyword>");
    r = consumeTokens(b, 1, KEYWORD_ACL, IDENTIFIER, LC);
    p = r; // pin = 1
    r = r && report_error_(b, ACL_ENTRY(b, l + 1));
    r = p && consumeToken(b, RC) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    if (!r) r = BLANK(b, l + 1);
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
  // ['!'] ( string | NETMASK)
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

  // string | NETMASK
  private static boolean ACL_PART_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ACL_PART_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = NETMASK(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BUITLIN | F_CALL
  public static boolean ACTION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ACTION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTION, "<action>");
    r = BUITLIN(b, l + 1);
    if (!r) r = F_CALL(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'backend' identifier '{' BACKEND_INTERNAL * '}'
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

  // BACKEND_INTERNAL *
  private static boolean BACKEND_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BACKEND_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BACKEND_INTERNAL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BACKEND_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '.host' '=' string ';'
  //                         | '.port' '=' string ';'
  //                         |  '.max_connections' '=' number ';'
  //                         |  '.first_byte_timeout' '=' duration ';'
  //                         |  '.connect_timeout' '=' duration ';'
  //                         |  '.between_bytes_timeout'  '=' duration ';'
  //                         | PROBE | BLANK
  public static boolean BACKEND_INTERNAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BACKEND_INTERNAL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BACKEND_INTERNAL, "<backend internal>");
    r = BACKEND_INTERNAL_0(b, l + 1);
    if (!r) r = BACKEND_INTERNAL_1(b, l + 1);
    if (!r) r = BACKEND_INTERNAL_2(b, l + 1);
    if (!r) r = BACKEND_INTERNAL_3(b, l + 1);
    if (!r) r = BACKEND_INTERNAL_4(b, l + 1);
    if (!r) r = BACKEND_INTERNAL_5(b, l + 1);
    if (!r) r = PROBE(b, l + 1);
    if (!r) r = BLANK(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '.host' '=' string ';'
  private static boolean BACKEND_INTERNAL_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BACKEND_INTERNAL_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".host");
    r = r && consumeTokens(b, 0, EQ, STRING, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.port' '=' string ';'
  private static boolean BACKEND_INTERNAL_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BACKEND_INTERNAL_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".port");
    r = r && consumeTokens(b, 0, EQ, STRING, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.max_connections' '=' number ';'
  private static boolean BACKEND_INTERNAL_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BACKEND_INTERNAL_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".max_connections");
    r = r && consumeTokens(b, 0, EQ, NUMBER, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.first_byte_timeout' '=' duration ';'
  private static boolean BACKEND_INTERNAL_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BACKEND_INTERNAL_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".first_byte_timeout");
    r = r && consumeTokens(b, 0, EQ, DURATION, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.connect_timeout' '=' duration ';'
  private static boolean BACKEND_INTERNAL_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BACKEND_INTERNAL_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".connect_timeout");
    r = r && consumeTokens(b, 0, EQ, DURATION, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.between_bytes_timeout'  '=' duration ';'
  private static boolean BACKEND_INTERNAL_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BACKEND_INTERNAL_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".between_bytes_timeout");
    r = r && consumeTokens(b, 0, EQ, DURATION, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'bereq'  ['.'   ('backend' | 'between_bytes_timeout' | 'body' | 'connect_timeout'
  //                             | 'first_byte_timeout' | HEADER | 'method' | 'proto'
  //                             | 'retries' |'uncacheable' | 'url' | 'xid'
  //                             )]
  public static boolean BEREQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BEREQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BEREQ, "<bereq>");
    r = consumeToken(b, "bereq");
    r = r && BEREQ_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['.'   ('backend' | 'between_bytes_timeout' | 'body' | 'connect_timeout'
  //                             | 'first_byte_timeout' | HEADER | 'method' | 'proto'
  //                             | 'retries' |'uncacheable' | 'url' | 'xid'
  //                             )]
  private static boolean BEREQ_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BEREQ_1")) return false;
    BEREQ_1_0(b, l + 1);
    return true;
  }

  // '.'   ('backend' | 'between_bytes_timeout' | 'body' | 'connect_timeout'
  //                             | 'first_byte_timeout' | HEADER | 'method' | 'proto'
  //                             | 'retries' |'uncacheable' | 'url' | 'xid'
  //                             )
  private static boolean BEREQ_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BEREQ_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && BEREQ_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'backend' | 'between_bytes_timeout' | 'body' | 'connect_timeout'
  //                             | 'first_byte_timeout' | HEADER | 'method' | 'proto'
  //                             | 'retries' |'uncacheable' | 'url' | 'xid'
  private static boolean BEREQ_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BEREQ_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_BACKEND);
    if (!r) r = consumeToken(b, "between_bytes_timeout");
    if (!r) r = consumeToken(b, "body");
    if (!r) r = consumeToken(b, "connect_timeout");
    if (!r) r = consumeToken(b, "first_byte_timeout");
    if (!r) r = HEADER(b, l + 1);
    if (!r) r = consumeToken(b, "method");
    if (!r) r = consumeToken(b, "proto");
    if (!r) r = consumeToken(b, "retries");
    if (!r) r = consumeToken(b, "uncacheable");
    if (!r) r = consumeToken(b, "url");
    if (!r) r = consumeToken(b, "xid");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'beresp' ['.' ('age' | 'backend' | 'backend.ip' | 'backend.name' | 'body'
  //                             | 'do_esi' | 'do_gunzip' | 'do_gzip' | 'do_stream'
  //                             | 'grace' | HEADER | 'keep' | 'proto' | 'reason' | 'status'
  //                             | 'storage_hint' | 'ttl' | 'uncacheable' | 'was_304'
  //                        )]
  public static boolean BERESP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BERESP")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BERESP, "<beresp>");
    r = consumeToken(b, "beresp");
    r = r && BERESP_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['.' ('age' | 'backend' | 'backend.ip' | 'backend.name' | 'body'
  //                             | 'do_esi' | 'do_gunzip' | 'do_gzip' | 'do_stream'
  //                             | 'grace' | HEADER | 'keep' | 'proto' | 'reason' | 'status'
  //                             | 'storage_hint' | 'ttl' | 'uncacheable' | 'was_304'
  //                        )]
  private static boolean BERESP_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BERESP_1")) return false;
    BERESP_1_0(b, l + 1);
    return true;
  }

  // '.' ('age' | 'backend' | 'backend.ip' | 'backend.name' | 'body'
  //                             | 'do_esi' | 'do_gunzip' | 'do_gzip' | 'do_stream'
  //                             | 'grace' | HEADER | 'keep' | 'proto' | 'reason' | 'status'
  //                             | 'storage_hint' | 'ttl' | 'uncacheable' | 'was_304'
  //                        )
  private static boolean BERESP_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BERESP_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && BERESP_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'age' | 'backend' | 'backend.ip' | 'backend.name' | 'body'
  //                             | 'do_esi' | 'do_gunzip' | 'do_gzip' | 'do_stream'
  //                             | 'grace' | HEADER | 'keep' | 'proto' | 'reason' | 'status'
  //                             | 'storage_hint' | 'ttl' | 'uncacheable' | 'was_304'
  private static boolean BERESP_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BERESP_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "age");
    if (!r) r = consumeToken(b, KEYWORD_BACKEND);
    if (!r) r = consumeToken(b, "backend.ip");
    if (!r) r = consumeToken(b, "backend.name");
    if (!r) r = consumeToken(b, "body");
    if (!r) r = consumeToken(b, "do_esi");
    if (!r) r = consumeToken(b, "do_gunzip");
    if (!r) r = consumeToken(b, "do_gzip");
    if (!r) r = consumeToken(b, "do_stream");
    if (!r) r = consumeToken(b, "grace");
    if (!r) r = HEADER(b, l + 1);
    if (!r) r = consumeToken(b, "keep");
    if (!r) r = consumeToken(b, "proto");
    if (!r) r = consumeToken(b, "reason");
    if (!r) r = consumeToken(b, "status");
    if (!r) r = consumeToken(b, "storage_hint");
    if (!r) r = consumeToken(b, "ttl");
    if (!r) r = consumeToken(b, "uncacheable");
    if (!r) r = consumeToken(b, "was_304");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // line_comment | block_comment
  public static boolean BLANK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BLANK")) return false;
    if (!nextTokenIs(b, "<blank>", BLOCK_COMMENT, LINE_COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLANK, "<blank>");
    r = consumeToken(b, LINE_COMMENT);
    if (!r) r = consumeToken(b, BLOCK_COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RETURN
  public static boolean BUITLIN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BUITLIN")) return false;
    if (!nextTokenIs(b, KEYWORD_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RETURN(b, l + 1);
    exit_section_(b, m, BUITLIN, r);
    return r;
  }

  /* ********************************************************** */
  // 'client.' ('identity' | 'ip')
  public static boolean CLIENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLIENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLIENT, "<client>");
    r = consumeToken(b, "client.");
    r = r && CLIENT_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'identity' | 'ip'
  private static boolean CLIENT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLIENT_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "identity");
    if (!r) r = consumeToken(b, "ip");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' STAMENT '}'
  public static boolean COMPOUND(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMPOUND")) return false;
    if (!nextTokenIs(b, LC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, COMPOUND, null);
    r = consumeToken(b, LC);
    p = r; // pin = 1
    r = r && report_error_(b, STAMENT(b, l + 1));
    r = p && consumeToken(b, RC) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // (CONDITION | F_CALL | OPERATION | 'true' | 'false' ) [('&&' | '||' EXPRESSION) ]
  public static boolean EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = EXPRESSION_0(b, l + 1);
    r = r && EXPRESSION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CONDITION | F_CALL | OPERATION | 'true' | 'false'
  private static boolean EXPRESSION_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPRESSION_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CONDITION(b, l + 1);
    if (!r) r = F_CALL(b, l + 1);
    if (!r) r = OPERATION(b, l + 1);
    if (!r) r = consumeToken(b, "true");
    if (!r) r = consumeToken(b, "false");
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
  // 'req.url'
  public static boolean FOO(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOO")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOO, "<foo>");
    r = consumeToken(b, "req.url");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYNTH
  public static boolean F_CALL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "F_CALL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, F_CALL, "<f call>");
    r = SYNTH(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'synth(' number ',' string ')'
  public static boolean F_SYNTH(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "F_SYNTH")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, F_SYNTH, "<f synth>");
    r = consumeToken(b, "synth(");
    r = r && consumeTokens(b, 0, NUMBER, COMMA, STRING, RP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'http.' identifier
  public static boolean HEADER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HEADER")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEADER, "<header>");
    r = consumeToken(b, "http.");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'if' CONDITION COMPOUND
  public static boolean IF_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IF_STATEMENT")) return false;
    if (!nextTokenIs(b, KEYWORD_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_IF);
    r = r && CONDITION(b, l + 1);
    r = r && COMPOUND(b, l + 1);
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
  // 'C{' '???' '}C'
  public static boolean INLINE_C(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INLINE_C")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INLINE_C, "<inline c>");
    r = consumeToken(b, "C{");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, "???"));
    r = p && consumeToken(b, "}C") && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'local.ip'
  public static boolean LOCAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LOCAL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL, "<local>");
    r = consumeToken(b, "local.ip");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('"' ip '"'|"'" ip "'") ('/'number)?
  public static boolean NETMASK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NETMASK")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NETMASK, "<netmask>");
    r = NETMASK_0(b, l + 1);
    r = r && NETMASK_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '"' ip '"'|"'" ip "'"
  private static boolean NETMASK_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NETMASK_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NETMASK_0_0(b, l + 1);
    if (!r) r = NETMASK_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '"' ip '"'
  private static boolean NETMASK_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NETMASK_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "\"");
    r = r && consumeToken(b, IP);
    r = r && consumeToken(b, "\"");
    exit_section_(b, m, null, r);
    return r;
  }

  // "'" ip "'"
  private static boolean NETMASK_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NETMASK_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "'");
    r = r && consumeToken(b, IP);
    r = r && consumeToken(b, "'");
    exit_section_(b, m, null, r);
    return r;
  }

  // ('/'number)?
  private static boolean NETMASK_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NETMASK_1")) return false;
    NETMASK_1_0(b, l + 1);
    return true;
  }

  // '/'number
  private static boolean NETMASK_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NETMASK_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'now'
  public static boolean NOW(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NOW")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NOW, "<now>");
    r = consumeToken(b, "now");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'obj.' ('age' | 'grace' | 'hits' | HEADER | 'keep' | 'proto' | 'reason'
  //                     | 'status' | 'ttl' | 'uncacheable')
  public static boolean OBJ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OBJ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJ, "<obj>");
    r = consumeToken(b, "obj.");
    r = r && OBJ_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'age' | 'grace' | 'hits' | HEADER | 'keep' | 'proto' | 'reason'
  //                     | 'status' | 'ttl' | 'uncacheable'
  private static boolean OBJ_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OBJ_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "age");
    if (!r) r = consumeToken(b, "grace");
    if (!r) r = consumeToken(b, "hits");
    if (!r) r = HEADER(b, l + 1);
    if (!r) r = consumeToken(b, "keep");
    if (!r) r = consumeToken(b, "proto");
    if (!r) r = consumeToken(b, "reason");
    if (!r) r = consumeToken(b, "status");
    if (!r) r = consumeToken(b, "ttl");
    if (!r) r = consumeToken(b, "uncacheable");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VALUE operator VALUE
  public static boolean OPERATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPERATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATION, "<operation>");
    r = VALUE(b, l + 1);
    r = r && consumeToken(b, OPERATOR);
    r = r && VALUE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '.probe' '=' '{' PROBE_INTERNAL * '}'
  public static boolean PROBE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROBE, "<probe>");
    r = consumeToken(b, ".probe");
    r = r && consumeTokens(b, 0, EQ, LC);
    r = r && PROBE_3(b, l + 1);
    r = r && consumeToken(b, RC);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PROBE_INTERNAL *
  private static boolean PROBE_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!PROBE_INTERNAL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PROBE_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '.url' '=' string ';'
  //                      | '.timeout' '=' duration ';'
  //                      | '.interval' '=' duration ';'
  //                      | '.window' '=' number ';'
  //                      | '.threshold' '=' number ';'
  //                      | '.request' '=' string * ';'
  //                      | BLANK
  public static boolean PROBE_INTERNAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROBE_INTERNAL, "<probe internal>");
    r = PROBE_INTERNAL_0(b, l + 1);
    if (!r) r = PROBE_INTERNAL_1(b, l + 1);
    if (!r) r = PROBE_INTERNAL_2(b, l + 1);
    if (!r) r = PROBE_INTERNAL_3(b, l + 1);
    if (!r) r = PROBE_INTERNAL_4(b, l + 1);
    if (!r) r = PROBE_INTERNAL_5(b, l + 1);
    if (!r) r = BLANK(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '.url' '=' string ';'
  private static boolean PROBE_INTERNAL_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".url");
    r = r && consumeTokens(b, 0, EQ, STRING, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.timeout' '=' duration ';'
  private static boolean PROBE_INTERNAL_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".timeout");
    r = r && consumeTokens(b, 0, EQ, DURATION, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.interval' '=' duration ';'
  private static boolean PROBE_INTERNAL_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".interval");
    r = r && consumeTokens(b, 0, EQ, DURATION, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.window' '=' number ';'
  private static boolean PROBE_INTERNAL_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".window");
    r = r && consumeTokens(b, 0, EQ, NUMBER, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.threshold' '=' number ';'
  private static boolean PROBE_INTERNAL_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".threshold");
    r = r && consumeTokens(b, 0, EQ, NUMBER, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.request' '=' string * ';'
  private static boolean PROBE_INTERNAL_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".request");
    r = r && consumeToken(b, EQ);
    r = r && PROBE_INTERNAL_5_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // string *
  private static boolean PROBE_INTERNAL_5_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROBE_INTERNAL_5_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, STRING)) break;
      if (!empty_element_parsed_guard_(b, "PROBE_INTERNAL_5_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'remote.ip'
  public static boolean REMOTE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REMOTE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REMOTE, "<remote>");
    r = consumeToken(b, "remote.ip");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'req' ['.' ( 'backend_hint' | 'can_gzip' | 'esi' | 'esi_level'
  //                           | 'hash_always_miss' | 'hash_ignore_busy' | HEADER | 'method'
  //                           | 'proto' | 'restarts' | 'ttl' | 'url' | 'xid'
  //                       )]
  public static boolean REQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REQ, "<req>");
    r = consumeToken(b, "req");
    r = r && REQ_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['.' ( 'backend_hint' | 'can_gzip' | 'esi' | 'esi_level'
  //                           | 'hash_always_miss' | 'hash_ignore_busy' | HEADER | 'method'
  //                           | 'proto' | 'restarts' | 'ttl' | 'url' | 'xid'
  //                       )]
  private static boolean REQ_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REQ_1")) return false;
    REQ_1_0(b, l + 1);
    return true;
  }

  // '.' ( 'backend_hint' | 'can_gzip' | 'esi' | 'esi_level'
  //                           | 'hash_always_miss' | 'hash_ignore_busy' | HEADER | 'method'
  //                           | 'proto' | 'restarts' | 'ttl' | 'url' | 'xid'
  //                       )
  private static boolean REQ_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REQ_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && REQ_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'backend_hint' | 'can_gzip' | 'esi' | 'esi_level'
  //                           | 'hash_always_miss' | 'hash_ignore_busy' | HEADER | 'method'
  //                           | 'proto' | 'restarts' | 'ttl' | 'url' | 'xid'
  private static boolean REQ_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REQ_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "backend_hint");
    if (!r) r = consumeToken(b, "can_gzip");
    if (!r) r = consumeToken(b, "esi");
    if (!r) r = consumeToken(b, "esi_level");
    if (!r) r = consumeToken(b, "hash_always_miss");
    if (!r) r = consumeToken(b, "hash_ignore_busy");
    if (!r) r = HEADER(b, l + 1);
    if (!r) r = consumeToken(b, "method");
    if (!r) r = consumeToken(b, "proto");
    if (!r) r = consumeToken(b, "restarts");
    if (!r) r = consumeToken(b, "ttl");
    if (!r) r = consumeToken(b, "url");
    if (!r) r = consumeToken(b, "xid");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'req_top.' (HEADER | 'method' | 'proto' | 'url')
  public static boolean REQ_TOP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REQ_TOP")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REQ_TOP, "<req top>");
    r = consumeToken(b, "req_top.");
    r = r && REQ_TOP_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // HEADER | 'method' | 'proto' | 'url'
  private static boolean REQ_TOP_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REQ_TOP_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = HEADER(b, l + 1);
    if (!r) r = consumeToken(b, "method");
    if (!r) r = consumeToken(b, "proto");
    if (!r) r = consumeToken(b, "url");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'resp' | 'resp.' ('body' | HEADER | 'is_streaming' | 'reason' | 'status')
  public static boolean RESP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RESP")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RESP, "<resp>");
    r = consumeToken(b, "resp");
    if (!r) r = RESP_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'resp.' ('body' | HEADER | 'is_streaming' | 'reason' | 'status')
  private static boolean RESP_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RESP_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "resp.");
    r = r && RESP_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'body' | HEADER | 'is_streaming' | 'reason' | 'status'
  private static boolean RESP_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RESP_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "body");
    if (!r) r = HEADER(b, l + 1);
    if (!r) r = consumeToken(b, "is_streaming");
    if (!r) r = consumeToken(b, "reason");
    if (!r) r = consumeToken(b, "status");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'return' '('('fail' | 'pipe' | 'restart' | 'pass' | F_SYNTH) ')'
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

  // 'fail' | 'pipe' | 'restart' | 'pass' | F_SYNTH
  private static boolean RETURN_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RETURN_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "fail");
    if (!r) r = consumeToken(b, "pipe");
    if (!r) r = consumeToken(b, "restart");
    if (!r) r = consumeToken(b, "pass");
    if (!r) r = F_SYNTH(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'server.' ('hostname' | 'identity' | 'ip')
  public static boolean SERVER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SERVER")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SERVER, "<server>");
    r = consumeToken(b, "server.");
    r = r && SERVER_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'hostname' | 'identity' | 'ip'
  private static boolean SERVER_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SERVER_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "hostname");
    if (!r) r = consumeToken(b, "identity");
    if (!r) r = consumeToken(b, "ip");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (COMPOUND | IF_STATEMENT | INLINE_C | ACTION ';' | BLANK) *
  public static boolean STAMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STAMENT")) return false;
    Marker m = enter_section_(b, l, _NONE_, STAMENT, "<stament>");
    int c = current_position_(b);
    while (true) {
      if (!STAMENT_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "STAMENT", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // COMPOUND | IF_STATEMENT | INLINE_C | ACTION ';' | BLANK
  private static boolean STAMENT_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STAMENT_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = COMPOUND(b, l + 1);
    if (!r) r = IF_STATEMENT(b, l + 1);
    if (!r) r = INLINE_C(b, l + 1);
    if (!r) r = STAMENT_0_3(b, l + 1);
    if (!r) r = BLANK(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ACTION ';'
  private static boolean STAMENT_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STAMENT_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ACTION(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'storage.' identifier '.' ('free_space' | 'used_space' | 'happy')
  public static boolean STORAGE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STORAGE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STORAGE, "<storage>");
    r = consumeToken(b, "storage.");
    r = r && consumeTokens(b, 0, IDENTIFIER, DOT);
    r = r && STORAGE_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'free_space' | 'used_space' | 'happy'
  private static boolean STORAGE_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STORAGE_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "free_space");
    if (!r) r = consumeToken(b, "used_space");
    if (!r) r = consumeToken(b, "happy");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'sub' identifier COMPOUND
  public static boolean SUB(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SUB")) return false;
    if (!nextTokenIs(b, KEYWORD_SUB)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SUB, null);
    r = consumeTokens(b, 1, KEYWORD_SUB, IDENTIFIER);
    p = r; // pin = 1
    r = r && COMPOUND(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'synth('number','string')'
  public static boolean SYNTH(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SYNTH")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYNTH, "<synth>");
    r = consumeToken(b, "synth(");
    r = r && consumeTokens(b, 0, NUMBER, COMMA, STRING, RP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // string | number | VARIABLE
  public static boolean VALUE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VALUE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = VARIABLE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BEREQ | BERESP | CLIENT | LOCAL | NOW | OBJ | REMOTE | REQ
  //                 | REQ_TOP | RESP | SERVER | STORAGE | FOO
  public static boolean VARIABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE, "<variable>");
    r = BEREQ(b, l + 1);
    if (!r) r = BERESP(b, l + 1);
    if (!r) r = CLIENT(b, l + 1);
    if (!r) r = LOCAL(b, l + 1);
    if (!r) r = NOW(b, l + 1);
    if (!r) r = OBJ(b, l + 1);
    if (!r) r = REMOTE(b, l + 1);
    if (!r) r = REQ(b, l + 1);
    if (!r) r = REQ_TOP(b, l + 1);
    if (!r) r = RESP(b, l + 1);
    if (!r) r = SERVER(b, l + 1);
    if (!r) r = STORAGE(b, l + 1);
    if (!r) r = FOO(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // [VERSION] (ACL | SUB | BLANK | IMPORT | BACKEND)*
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

  // (ACL | SUB | BLANK | IMPORT | BACKEND)*
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

  // ACL | SUB | BLANK | IMPORT | BACKEND
  private static boolean root_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ACL(b, l + 1);
    if (!r) r = SUB(b, l + 1);
    if (!r) r = BLANK(b, l + 1);
    if (!r) r = IMPORT(b, l + 1);
    if (!r) r = BACKEND(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}

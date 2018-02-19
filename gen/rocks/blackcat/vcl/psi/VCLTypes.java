// This is a generated file. Not intended for manual editing.
package rocks.blackcat.vcl.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import rocks.blackcat.vcl.psi.impl.*;

public interface VCLTypes {

  IElementType ACL = new VCLElementType("ACL");
  IElementType ACL_ENTRY = new VCLElementType("ACL_ENTRY");
  IElementType ACL_PART = new VCLElementType("ACL_PART");
  IElementType ACTION = new VCLElementType("ACTION");
  IElementType BACKEND = new VCLElementType("BACKEND");
  IElementType BUITLIN = new VCLElementType("BUITLIN");
  IElementType CALL = new VCLElementType("CALL");
  IElementType COMPOUND = new VCLElementType("COMPOUND");
  IElementType CONDITION = new VCLElementType("CONDITION");
  IElementType DIRECTOR = new VCLElementType("DIRECTOR");
  IElementType ELSE = new VCLElementType("ELSE");
  IElementType ERROR = new VCLElementType("ERROR");
  IElementType EXPRESSION = new VCLElementType("EXPRESSION");
  IElementType F_CALL = new VCLElementType("F_CALL");
  IElementType F_SYNTH = new VCLElementType("F_SYNTH");
  IElementType IF_STATEMENT = new VCLElementType("IF_STATEMENT");
  IElementType IMPORT = new VCLElementType("IMPORT");
  IElementType INCLUDE = new VCLElementType("INCLUDE");
  IElementType INLINE_C = new VCLElementType("INLINE_C");
  IElementType LITERAL = new VCLElementType("LITERAL");
  IElementType LONG_STRING = new VCLElementType("LONG_STRING");
  IElementType NETMASK = new VCLElementType("NETMASK");
  IElementType NEW = new VCLElementType("NEW");
  IElementType OBJECT = new VCLElementType("OBJECT");
  IElementType OBJECT_INTERNAL = new VCLElementType("OBJECT_INTERNAL");
  IElementType OPERATION = new VCLElementType("OPERATION");
  IElementType PROBE = new VCLElementType("PROBE");
  IElementType PURGE = new VCLElementType("PURGE");
  IElementType RETURN = new VCLElementType("RETURN");
  IElementType SET = new VCLElementType("SET");
  IElementType STATEMENT = new VCLElementType("STATEMENT");
  IElementType STRINGS = new VCLElementType("STRINGS");
  IElementType SUB = new VCLElementType("SUB");
  IElementType UNSET = new VCLElementType("UNSET");
  IElementType VALUE = new VCLElementType("VALUE");
  IElementType VERSION = new VCLElementType("VERSION");

  IElementType BLANK = new VCLTokenType("BLANK");
  IElementType BLOCK_COMMENT = new VCLTokenType("block_comment");
  IElementType COMMA = new VCLTokenType(",");
  IElementType C_CONTENT = new VCLTokenType("C_CONTENT");
  IElementType DOT = new VCLTokenType(".");
  IElementType DURATION = new VCLTokenType("duration");
  IElementType EQ = new VCLTokenType("=");
  IElementType IDENTIFIER = new VCLTokenType("identifier");
  IElementType IP = new VCLTokenType("ip");
  IElementType KEYWORD_ACL = new VCLTokenType("acl");
  IElementType KEYWORD_BACKEND = new VCLTokenType("backend");
  IElementType KEYWORD_DIRECTOR = new VCLTokenType("director");
  IElementType KEYWORD_ELIF = new VCLTokenType("elif");
  IElementType KEYWORD_ELSE = new VCLTokenType("else");
  IElementType KEYWORD_ELSEIF = new VCLTokenType("elseif");
  IElementType KEYWORD_ELSIF = new VCLTokenType("elsif");
  IElementType KEYWORD_ERROR = new VCLTokenType("error");
  IElementType KEYWORD_IF = new VCLTokenType("if");
  IElementType KEYWORD_IMPORT = new VCLTokenType("import");
  IElementType KEYWORD_INCLUDE = new VCLTokenType("include");
  IElementType KEYWORD_NEW = new VCLTokenType("new");
  IElementType KEYWORD_PURGE = new VCLTokenType("purge");
  IElementType KEYWORD_REMOVE = new VCLTokenType("remove");
  IElementType KEYWORD_RETURN = new VCLTokenType("return");
  IElementType KEYWORD_SET = new VCLTokenType("set");
  IElementType KEYWORD_SUB = new VCLTokenType("sub");
  IElementType KEYWORD_UNSET = new VCLTokenType("unset");
  IElementType LC = new VCLTokenType("{");
  IElementType LINE_COMMENT = new VCLTokenType("line_comment");
  IElementType LP = new VCLTokenType("(");
  IElementType L_CBRACE = new VCLTokenType("C{");
  IElementType L_LSTRING = new VCLTokenType("{\"");
  IElementType NUMBER = new VCLTokenType("number");
  IElementType OPERATOR = new VCLTokenType("operator");
  IElementType PROBE_INTERNAL = new VCLTokenType("PROBE_INTERNAL");
  IElementType PROPERTY = new VCLTokenType("property");
  IElementType RC = new VCLTokenType("}");
  IElementType RP = new VCLTokenType(")");
  IElementType R_CBRACE = new VCLTokenType("}C");
  IElementType R_LSTRING = new VCLTokenType("\"}");
  IElementType SEMI = new VCLTokenType(";");
  IElementType STRING = new VCLTokenType("string");
  IElementType STRING_CONTENT = new VCLTokenType("STRING_CONTENT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ACL) {
        return new VCLAclImpl(node);
      }
      else if (type == ACL_ENTRY) {
        return new VCLAclEntryImpl(node);
      }
      else if (type == ACL_PART) {
        return new VCLAclPartImpl(node);
      }
      else if (type == ACTION) {
        return new VCLActionImpl(node);
      }
      else if (type == BACKEND) {
        return new VCLBackendImpl(node);
      }
      else if (type == BUITLIN) {
        return new VCLBuitlinImpl(node);
      }
      else if (type == CALL) {
        return new VCLCallImpl(node);
      }
      else if (type == COMPOUND) {
        return new VCLCompoundImpl(node);
      }
      else if (type == CONDITION) {
        return new VCLConditionImpl(node);
      }
      else if (type == DIRECTOR) {
        return new VCLDirectorImpl(node);
      }
      else if (type == ELSE) {
        return new VCLElseImpl(node);
      }
      else if (type == ERROR) {
        return new VCLErrorImpl(node);
      }
      else if (type == EXPRESSION) {
        return new VCLExpressionImpl(node);
      }
      else if (type == F_CALL) {
        return new VCLFCallImpl(node);
      }
      else if (type == F_SYNTH) {
        return new VCLFSynthImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new VCLIfStatementImpl(node);
      }
      else if (type == IMPORT) {
        return new VCLImportImpl(node);
      }
      else if (type == INCLUDE) {
        return new VCLIncludeImpl(node);
      }
      else if (type == INLINE_C) {
        return new VCLInlineCImpl(node);
      }
      else if (type == LITERAL) {
        return new VCLLiteralImpl(node);
      }
      else if (type == LONG_STRING) {
        return new VCLLongStringImpl(node);
      }
      else if (type == NETMASK) {
        return new VCLNetmaskImpl(node);
      }
      else if (type == NEW) {
        return new VCLNewImpl(node);
      }
      else if (type == OBJECT) {
        return new VCLObjectImpl(node);
      }
      else if (type == OBJECT_INTERNAL) {
        return new VCLObjectInternalImpl(node);
      }
      else if (type == OPERATION) {
        return new VCLOperationImpl(node);
      }
      else if (type == PROBE) {
        return new VCLProbeImpl(node);
      }
      else if (type == PURGE) {
        return new VCLPurgeImpl(node);
      }
      else if (type == RETURN) {
        return new VCLReturnImpl(node);
      }
      else if (type == SET) {
        return new VCLSetImpl(node);
      }
      else if (type == STATEMENT) {
        return new VCLStatementImpl(node);
      }
      else if (type == STRINGS) {
        return new VCLStringsImpl(node);
      }
      else if (type == SUB) {
        return new VCLSubImpl(node);
      }
      else if (type == UNSET) {
        return new VCLUnsetImpl(node);
      }
      else if (type == VALUE) {
        return new VCLValueImpl(node);
      }
      else if (type == VERSION) {
        return new VCLVersionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

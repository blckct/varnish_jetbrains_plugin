/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package rocks.blackcat.vcl;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static rocks.blackcat.vcl.psi.VCLTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>VCL.flex</tt>
 */
class VCLLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int INLINE_C = 2;
  public static final int LONG_STRING = 4;
  public static final int LONG_STRING_END = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\10\0\1\17\1\3\1\2\3\1\22\0\1\3\1\25\1\16\1\5\1\0\1\30\1\31\1\20\1\40\1\41"+
    "\1\24\1\35\1\44\1\34\1\7\1\4\12\6\1\0\1\37\1\32\1\26\1\33\2\0\2\22\1\64\27"+
    "\22\1\0\1\21\2\0\1\23\1\0\1\47\1\46\1\50\1\13\1\52\1\62\1\22\1\12\1\56\1\22"+
    "\1\54\1\51\1\10\1\55\1\60\1\57\1\22\1\61\1\11\1\53\1\45\1\63\1\14\1\22\1\15"+
    "\1\22\1\42\1\36\1\43\1\27\6\0\1\1\32\0\1\3\337\0\1\3\177\0\13\3\35\0\2\1\5"+
    "\0\1\3\57\0\1\3\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\3\1\4\1\5\1\6\3\7"+
    "\2\1\2\3\1\10\4\3\1\1\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\10\7\3\17\1\1\1\0\1\5"+
    "\2\20\1\21\4\7\1\0\1\22\2\0\1\23\2\0"+
    "\1\24\1\25\10\7\1\26\1\7\1\27\1\30\1\31"+
    "\1\32\1\0\1\7\1\33\1\34\1\7\1\0\2\7"+
    "\1\35\3\7\1\36\4\7\1\37\2\7\2\0\2\7"+
    "\1\40\1\7\1\41\7\7\2\0\1\42\2\7\1\43"+
    "\1\44\6\7\2\0\1\7\1\45\1\46\1\7\1\47"+
    "\1\50\2\7\2\0\1\51\1\52\1\7\1\53\2\0"+
    "\1\54\5\0\1\55";

  private static int [] zzUnpackAction() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\237\0\324\0\u0109\0\u013e\0\u0173"+
    "\0\u01a8\0\u01dd\0\u0212\0\u0247\0\u027c\0\u02b1\0\u02e6\0\u031b"+
    "\0\u0350\0\u031b\0\324\0\u0385\0\u03ba\0\u03ef\0\u0424\0\324"+
    "\0\324\0\324\0\u0459\0\u048e\0\324\0\u04c3\0\u04f8\0\u052d"+
    "\0\u0562\0\u0597\0\u05cc\0\u0601\0\u0636\0\324\0\u066b\0\u06a0"+
    "\0\u06d5\0\u070a\0\u073f\0\u0774\0\324\0\u07a9\0\u07de\0\u0813"+
    "\0\u0848\0\u087d\0\u08b2\0\324\0\u08e7\0\u091c\0\u08b2\0\u02e6"+
    "\0\u0951\0\324\0\324\0\u0986\0\u09bb\0\u09f0\0\u0a25\0\u0a5a"+
    "\0\u0a8f\0\u0ac4\0\u0af9\0\u0212\0\u0b2e\0\324\0\324\0\324"+
    "\0\324\0\u0b63\0\u0b98\0\u0212\0\u0212\0\u0bcd\0\u0c02\0\u0c37"+
    "\0\u0c6c\0\u0212\0\u0ca1\0\u0cd6\0\u0d0b\0\u0212\0\u0d40\0\u0d75"+
    "\0\u0daa\0\u0ddf\0\324\0\u0e14\0\u0e49\0\u0e7e\0\u0eb3\0\u0ee8"+
    "\0\u0f1d\0\u0f52\0\u0f87\0\u0212\0\u0fbc\0\u0ff1\0\u1026\0\u105b"+
    "\0\u1090\0\u10c5\0\u10fa\0\u112f\0\u1164\0\u0212\0\u1199\0\u11ce"+
    "\0\u0212\0\u0212\0\u1203\0\u1238\0\u126d\0\u12a2\0\u12d7\0\u130c"+
    "\0\u1341\0\u1376\0\u13ab\0\u0212\0\u0212\0\u13e0\0\u0212\0\u0212"+
    "\0\u1415\0\u144a\0\u147f\0\u14b4\0\u0212\0\u0212\0\u14e9\0\u0212"+
    "\0\u151e\0\u1553\0\u0212\0\u1588\0\u15bd\0\u15f2\0\u1627\0\u165c"+
    "\0\324";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\3\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\13\1\15\2\13\1\16\1\5\1\17\1\5\1\13"+
    "\1\5\1\20\1\21\1\22\1\20\1\23\1\24\1\25"+
    "\1\26\2\20\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\2\13\1\41\2\13\1\42"+
    "\1\43\2\13\1\44\2\13\1\45\1\46\1\5\41\46"+
    "\1\47\22\46\1\5\14\46\1\50\46\46\16\5\1\51"+
    "\46\5\66\0\3\6\65\0\1\10\17\0\1\52\1\0"+
    "\1\23\36\0\1\10\2\0\62\10\6\0\1\11\1\53"+
    "\1\54\5\55\57\0\6\56\4\0\1\56\22\0\20\56"+
    "\6\0\10\13\4\0\2\13\10\0\1\13\10\0\20\13"+
    "\6\0\7\13\1\57\4\0\2\13\10\0\1\13\10\0"+
    "\1\60\4\13\1\61\12\13\6\0\10\13\4\0\2\13"+
    "\10\0\1\13\10\0\11\13\1\62\6\13\2\63\1\0"+
    "\13\63\1\64\1\65\1\63\1\66\21\63\1\67\21\63"+
    "\2\70\1\0\15\70\1\64\1\71\43\70\26\0\1\23"+
    "\64\0\2\23\66\0\1\23\61\0\1\23\3\0\1\23"+
    "\60\0\1\23\4\0\1\23\67\0\1\23\44\0\1\72"+
    "\132\0\1\73\6\0\10\13\4\0\2\13\10\0\1\13"+
    "\10\0\10\13\1\74\7\13\6\0\10\13\4\0\2\13"+
    "\10\0\1\13\10\0\2\13\1\75\15\13\6\0\10\13"+
    "\4\0\2\13\10\0\1\13\10\0\3\13\1\76\14\13"+
    "\6\0\10\13\4\0\2\13\10\0\1\13\10\0\4\13"+
    "\1\77\7\13\1\100\3\13\6\0\10\13\4\0\2\13"+
    "\10\0\1\13\10\0\5\13\1\101\12\13\6\0\2\13"+
    "\1\102\5\13\4\0\2\13\10\0\1\13\10\0\10\13"+
    "\1\103\4\13\1\104\2\13\6\0\10\13\4\0\2\13"+
    "\10\0\1\13\10\0\5\13\1\105\12\13\6\0\10\13"+
    "\4\0\2\13\10\0\1\13\5\0\1\106\2\0\20\13"+
    "\64\0\1\107\43\0\1\110\64\0\1\111\21\0\24\52"+
    "\1\112\40\52\6\0\1\53\1\0\1\54\5\55\60\0"+
    "\1\55\61\0\10\56\4\0\2\56\10\0\1\56\10\0"+
    "\20\56\6\0\10\13\4\0\2\13\10\0\1\13\10\0"+
    "\10\13\1\113\7\13\6\0\10\13\4\0\2\13\10\0"+
    "\1\13\10\0\1\13\1\114\16\13\6\0\10\13\4\0"+
    "\2\13\10\0\1\13\10\0\6\13\1\115\11\13\6\0"+
    "\10\13\4\0\2\13\10\0\1\13\10\0\14\13\1\116"+
    "\3\13\2\63\1\0\13\63\1\64\2\63\1\66\45\63"+
    "\1\0\3\63\1\117\7\63\1\64\2\63\1\66\44\63"+
    "\2\0\62\63\1\70\2\0\62\70\6\0\3\13\1\120"+
    "\4\13\4\0\2\13\10\0\1\13\10\0\20\13\6\0"+
    "\10\13\4\0\2\13\10\0\1\13\10\0\3\13\1\121"+
    "\14\13\6\0\10\13\4\0\2\13\10\0\1\13\10\0"+
    "\4\13\1\122\13\13\6\0\3\13\1\123\4\13\4\0"+
    "\2\13\10\0\1\13\10\0\11\13\1\124\6\13\6\0"+
    "\10\13\4\0\2\13\10\0\1\13\10\0\14\13\1\125"+
    "\3\13\6\0\6\13\1\126\1\13\4\0\2\13\10\0"+
    "\1\13\10\0\20\13\6\0\10\13\4\0\2\13\10\0"+
    "\1\13\10\0\12\13\1\127\5\13\6\0\10\13\4\0"+
    "\2\13\10\0\1\13\10\0\3\13\1\130\14\13\6\0"+
    "\2\13\1\131\5\13\4\0\2\13\10\0\1\13\10\0"+
    "\6\13\1\132\11\13\4\52\1\133\17\52\1\112\40\52"+
    "\6\0\10\13\4\0\2\13\10\0\1\13\10\0\6\13"+
    "\1\134\11\13\6\0\10\13\4\0\2\13\10\0\1\13"+
    "\10\0\5\13\1\135\12\13\2\63\1\0\3\63\1\136"+
    "\1\137\6\63\1\64\2\63\1\66\43\63\6\0\10\13"+
    "\4\0\2\13\10\0\1\13\10\0\5\13\1\140\12\13"+
    "\6\0\10\13\4\0\2\13\10\0\1\13\10\0\7\13"+
    "\1\141\10\13\6\0\10\13\4\0\2\13\10\0\1\13"+
    "\10\0\5\13\1\142\3\13\1\143\6\13\6\0\10\13"+
    "\4\0\2\13\10\0\1\13\10\0\15\13\1\144\2\13"+
    "\6\0\10\13\4\0\2\13\10\0\1\13\10\0\13\13"+
    "\1\145\4\13\6\0\10\13\4\0\2\13\10\0\1\13"+
    "\10\0\13\13\1\146\4\13\6\0\10\13\4\0\2\13"+
    "\10\0\1\13\10\0\4\13\1\147\13\13\6\0\10\13"+
    "\4\0\2\13\10\0\1\13\10\0\13\13\1\150\4\13"+
    "\6\0\10\13\4\0\2\13\10\0\1\13\10\0\1\151"+
    "\17\13\6\0\4\13\1\152\3\13\4\0\2\13\10\0"+
    "\1\13\10\0\20\13\6\0\10\13\4\0\2\13\10\0"+
    "\1\13\10\0\3\13\1\153\14\13\2\63\1\0\3\63"+
    "\1\154\1\137\6\63\1\64\2\63\1\66\45\63\1\0"+
    "\3\63\1\155\7\63\1\64\2\63\1\66\43\63\6\0"+
    "\10\13\4\0\2\13\10\0\1\13\10\0\6\13\1\156"+
    "\11\13\6\0\10\13\4\0\2\13\10\0\1\13\10\0"+
    "\5\13\1\157\12\13\6\0\10\13\4\0\2\13\10\0"+
    "\1\13\10\0\11\13\1\160\6\13\6\0\10\13\4\0"+
    "\2\13\10\0\1\13\10\0\15\13\1\161\2\13\6\0"+
    "\10\13\4\0\2\13\10\0\1\13\10\0\14\13\1\162"+
    "\3\13\6\0\10\13\4\0\2\13\10\0\1\13\10\0"+
    "\14\13\1\163\3\13\6\0\10\13\4\0\2\13\10\0"+
    "\1\13\10\0\1\164\17\13\6\0\10\13\4\0\2\13"+
    "\10\0\1\13\10\0\16\13\1\165\1\13\6\0\10\13"+
    "\4\0\2\13\10\0\1\13\10\0\14\13\1\166\3\13"+
    "\6\0\10\13\4\0\2\13\10\0\1\13\10\0\5\13"+
    "\1\167\12\13\6\0\10\13\4\0\2\13\10\0\1\13"+
    "\10\0\6\13\1\170\11\13\2\63\1\0\4\63\1\137"+
    "\6\63\1\64\2\63\1\66\45\63\1\0\3\63\1\171"+
    "\1\172\6\63\1\64\2\63\1\66\43\63\6\0\10\13"+
    "\4\0\2\13\10\0\1\13\10\0\10\13\1\173\7\13"+
    "\6\0\10\13\4\0\2\13\10\0\1\13\10\0\15\13"+
    "\1\174\2\13\6\0\10\13\4\0\2\13\10\0\1\13"+
    "\10\0\6\13\1\175\11\13\6\0\5\13\1\176\2\13"+
    "\4\0\2\13\10\0\1\13\10\0\20\13\6\0\10\13"+
    "\4\0\2\13\10\0\1\13\10\0\5\13\1\177\12\13"+
    "\6\0\10\13\4\0\2\13\10\0\1\13\10\0\10\13"+
    "\1\200\7\13\6\0\10\13\4\0\2\13\10\0\1\13"+
    "\10\0\6\13\1\201\11\13\6\0\10\13\4\0\2\13"+
    "\10\0\1\13\10\0\13\13\1\202\4\13\2\63\1\0"+
    "\3\63\1\203\1\172\6\63\1\64\2\63\1\66\45\63"+
    "\1\0\3\63\1\204\7\63\1\64\2\63\1\66\43\63"+
    "\6\0\5\13\1\205\2\13\4\0\2\13\10\0\1\13"+
    "\10\0\20\13\6\0\10\13\4\0\2\13\10\0\1\13"+
    "\10\0\5\13\1\206\12\13\6\0\10\13\4\0\2\13"+
    "\10\0\1\13\10\0\11\13\1\207\6\13\6\0\10\13"+
    "\4\0\2\13\10\0\1\13\10\0\14\13\1\210\3\13"+
    "\2\63\1\0\4\63\1\172\6\63\1\64\2\63\1\66"+
    "\45\63\1\0\3\63\1\211\1\212\6\63\1\64\2\63"+
    "\1\66\43\63\6\0\10\13\4\0\2\13\10\0\1\13"+
    "\10\0\3\13\1\213\14\13\2\63\1\0\3\63\1\214"+
    "\1\212\6\63\1\64\2\63\1\66\45\63\1\0\3\63"+
    "\1\215\7\63\1\64\2\63\1\66\45\63\1\0\4\63"+
    "\1\212\6\63\1\64\2\63\1\66\45\63\1\0\3\63"+
    "\1\216\7\63\1\64\1\217\1\63\1\66\45\63\1\0"+
    "\3\63\1\220\7\63\1\64\1\217\1\63\1\66\45\63"+
    "\1\0\13\63\1\221\2\63\1\66\45\63\1\0\13\63"+
    "\1\64\1\217\1\63\1\66\43\63";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5777];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\15\1\1\11\4\1\3\11\2\1\1\11"+
    "\10\1\1\11\3\1\1\0\2\1\1\11\5\1\1\0"+
    "\1\11\2\0\1\1\2\0\2\11\12\1\4\11\1\0"+
    "\4\1\1\0\13\1\1\11\2\1\2\0\14\1\2\0"+
    "\13\1\2\0\10\1\2\0\4\1\2\0\1\1\5\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private int c_start;
  private int s_start;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  VCLLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        switch (zzLexicalState) {
            case INLINE_C: {
              yybegin(YYINITIAL); return C_CONTENT;
            }  // fall though
            case 146: break;
            case LONG_STRING: {
              yybegin(YYINITIAL); return STRING_CONTENT;
            }  // fall though
            case 147: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 46: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 47: break;
          case 3: 
            { return OPERATOR;
            } 
            // fall through
          case 48: break;
          case 4: 
            { return LINE_COMMENT;
            } 
            // fall through
          case 49: break;
          case 5: 
            { return NUMBER;
            } 
            // fall through
          case 50: break;
          case 6: 
            { return DOT;
            } 
            // fall through
          case 51: break;
          case 7: 
            { return IDENTIFIER;
            } 
            // fall through
          case 52: break;
          case 8: 
            { return EQ;
            } 
            // fall through
          case 53: break;
          case 9: 
            { return SEMI;
            } 
            // fall through
          case 54: break;
          case 10: 
            { return LP;
            } 
            // fall through
          case 55: break;
          case 11: 
            { return RP;
            } 
            // fall through
          case 56: break;
          case 12: 
            { return LC;
            } 
            // fall through
          case 57: break;
          case 13: 
            { return RC;
            } 
            // fall through
          case 58: break;
          case 14: 
            { return COMMA;
            } 
            // fall through
          case 59: break;
          case 15: 
            { 
            } 
            // fall through
          case 60: break;
          case 16: 
            { return DURATION;
            } 
            // fall through
          case 61: break;
          case 17: 
            { return PROPERTY;
            } 
            // fall through
          case 62: break;
          case 18: 
            { return STRING;
            } 
            // fall through
          case 63: break;
          case 19: 
            { return R_LSTRING;
            } 
            // fall through
          case 64: break;
          case 20: 
            { yybegin(LONG_STRING); s_start = getTokenStart()+2; return L_LSTRING;
            } 
            // fall through
          case 65: break;
          case 21: 
            { return R_CBRACE;
            } 
            // fall through
          case 66: break;
          case 22: 
            { return KEYWORD_IF;
            } 
            // fall through
          case 67: break;
          case 23: 
            { yybegin(INLINE_C); c_start = getTokenStart()+2; return L_CBRACE;
            } 
            // fall through
          case 68: break;
          case 24: 
            { yybegin(YYINITIAL); yypushback(2); zzStartRead = c_start; return C_CONTENT;
            } 
            // fall through
          case 69: break;
          case 25: 
            { yybegin(LONG_STRING_END); yypushback(2); zzStartRead = s_start; return STRING_CONTENT;
            } 
            // fall through
          case 70: break;
          case 26: 
            { yybegin(YYINITIAL); return R_LSTRING;
            } 
            // fall through
          case 71: break;
          case 27: 
            { return KEYWORD_SUB;
            } 
            // fall through
          case 72: break;
          case 28: 
            { return KEYWORD_SET;
            } 
            // fall through
          case 73: break;
          case 29: 
            { return KEYWORD_ACL;
            } 
            // fall through
          case 74: break;
          case 30: 
            { return KEYWORD_NEW;
            } 
            // fall through
          case 75: break;
          case 31: 
            { return BLOCK_COMMENT;
            } 
            // fall through
          case 76: break;
          case 32: 
            { return KEYWORD_ELSE;
            } 
            // fall through
          case 77: break;
          case 33: 
            { return KEYWORD_ELIF;
            } 
            // fall through
          case 78: break;
          case 34: 
            { return KEYWORD_UNSET;
            } 
            // fall through
          case 79: break;
          case 35: 
            { return KEYWORD_ELSIF;
            } 
            // fall through
          case 80: break;
          case 36: 
            { return KEYWORD_ERROR;
            } 
            // fall through
          case 81: break;
          case 37: 
            { return KEYWORD_ELSEIF;
            } 
            // fall through
          case 82: break;
          case 38: 
            { return KEYWORD_IMPORT;
            } 
            // fall through
          case 83: break;
          case 39: 
            { return KEYWORD_REMOVE;
            } 
            // fall through
          case 84: break;
          case 40: 
            { return KEYWORD_RETURN;
            } 
            // fall through
          case 85: break;
          case 41: 
            { return KEYWORD_BACKEND;
            } 
            // fall through
          case 86: break;
          case 42: 
            { return KEYWORD_INCLUDE;
            } 
            // fall through
          case 87: break;
          case 43: 
            { return KEYWORD_DIRECTOR;
            } 
            // fall through
          case 88: break;
          case 44: 
            { return KEYWORD_SYNTHETIC;
            } 
            // fall through
          case 89: break;
          case 45: 
            { return IP;
            } 
            // fall through
          case 90: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

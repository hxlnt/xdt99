/* The following code was generated by JFlex 1.4.3 on 12/5/15 3:00 PM */

package net.endlos.xdt99.xbas99;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import net.endlos.xdt99.xbas99.psi.Xbas99Types;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/5/15 3:00 PM from the specification file
 * <tt>/home/ralph/ti99/xdt99/ide/idea/src/net/endlos/xdt99/xbas99/Xbas99.flex</tt>
 */
class Xbas99Lexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int DATA = 4;
  public static final int STMT = 2;
  public static final int YYINITIAL = 0;
  public static final int REM = 8;
  public static final int IMAGE = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\33\1\34\2\0\1\30\22\0\1\33\1\61\1\27\1\51"+
    "\1\43\1\0\1\54\1\0\1\52\1\53\1\55\1\57\1\35\1\25"+
    "\1\26\1\56\12\32\1\44\1\45\1\47\1\46\1\50\1\0\1\31"+
    "\1\1\1\2\1\4\1\24\1\10\1\11\1\16\1\23\1\14\1\31"+
    "\1\36\1\15\1\17\1\6\1\7\1\13\1\21\1\20\1\3\1\5"+
    "\1\40\1\22\1\42\1\12\1\37\1\41\3\31\1\60\1\31\1\0"+
    "\1\1\1\2\1\4\1\24\1\10\1\11\1\16\1\23\1\14\1\31"+
    "\1\36\1\15\1\17\1\6\1\7\1\13\1\21\1\20\1\3\1\5"+
    "\1\40\1\22\1\42\1\12\1\37\1\41\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\5\23\10\1\11\1\12\1\4\1\13\1\14\2\10"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\3\1\1\1\7"+
    "\1\2\2\7\3\10\1\32\3\10\1\33\15\10\1\34"+
    "\5\10\1\35\1\10\1\36\12\10\1\37\2\10\1\40"+
    "\4\10\1\41\12\10\2\0\1\42\5\10\1\43\1\44"+
    "\1\10\1\45\1\10\1\46\10\10\1\47\4\10\1\50"+
    "\5\10\1\51\3\10\1\52\1\10\1\53\2\10\1\44"+
    "\2\10\1\54\10\10\1\55\1\56\1\44\2\10\1\57"+
    "\3\10\1\60\1\0\1\12\10\10\1\61\1\62\1\10"+
    "\1\63\1\64\1\65\1\10\1\66\1\10\1\67\2\10"+
    "\1\70\1\71\2\10\1\72\1\10\1\73\12\10\1\74"+
    "\1\10\1\75\5\10\1\76\13\10\1\77\3\10\1\100"+
    "\1\101\3\10\1\102\1\103\1\104\1\10\1\105\1\10"+
    "\1\106\1\107\1\10\1\110\10\10\1\111\1\10\1\112"+
    "\4\10\1\113\1\114\1\10\1\115\2\10\1\116\1\117"+
    "\2\10\1\120\2\10\1\121\3\10\1\122\1\10\1\123"+
    "\2\10\1\124\2\10\1\125\1\126\3\10\1\127\3\10"+
    "\1\130\1\131\1\132\1\133\2\10\1\134\1\10\1\135"+
    "\1\136\1\137\1\10\1\140\1\141\1\142";

  private static int [] zzUnpackAction() {
    int [] result = new int[320];
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
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
    "\0\u0190\0\372\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\u02ee\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c"+
    "\0\u047e\0\u04b0\0\u04e2\0\u0514\0\u0546\0\372\0\u0578\0\u05aa"+
    "\0\u05dc\0\372\0\u060e\0\u0640\0\u0672\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\u06a4\0\u06d6\0\u0708\0\u073a\0\u076c\0\u079e\0\u07d0"+
    "\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca\0\u08fc\0\372\0\u092e"+
    "\0\u0960\0\u0992\0\u09c4\0\u09f6\0\u0a28\0\u0866\0\u0a5a\0\u0a8c"+
    "\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u04e2\0\u0b86\0\u0bb8\0\u0bea"+
    "\0\u0c1c\0\u0c4e\0\u04e2\0\u0c80\0\u04e2\0\u0cb2\0\u0ce4\0\u0d16"+
    "\0\u0d48\0\u0d7a\0\u0dac\0\u0dde\0\u0e10\0\u0e42\0\u0e74\0\u04e2"+
    "\0\u0ea6\0\u0ed8\0\u04e2\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2"+
    "\0\u1004\0\u1036\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u1162"+
    "\0\u1194\0\u11c6\0\u11f8\0\u05aa\0\u122a\0\u125c\0\u128e\0\u12c0"+
    "\0\u12f2\0\u1324\0\372\0\u04e2\0\u1356\0\u04e2\0\u1388\0\u04e2"+
    "\0\u13ba\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518"+
    "\0\u154a\0\u157c\0\u15ae\0\u15e0\0\u1612\0\u04e2\0\u1644\0\u1676"+
    "\0\u16a8\0\u16da\0\u170c\0\u04e2\0\u173e\0\u1770\0\u17a2\0\u04e2"+
    "\0\u17d4\0\u04e2\0\u1806\0\u1838\0\u186a\0\u189c\0\u18ce\0\u04e2"+
    "\0\u1900\0\u1932\0\u1964\0\u1996\0\u19c8\0\u19fa\0\u1a2c\0\u1a5e"+
    "\0\u04e2\0\u04e2\0\u1a90\0\u1ac2\0\u1af4\0\u04e2\0\u1b26\0\u1b58"+
    "\0\u1b8a\0\u04e2\0\u1bbc\0\u1bbc\0\u1bee\0\u1c20\0\u1c52\0\u1c84"+
    "\0\u1cb6\0\u1ce8\0\u1d1a\0\u1d4c\0\u04e2\0\u04e2\0\u1d7e\0\u04e2"+
    "\0\u04e2\0\372\0\u1db0\0\u04e2\0\u1de2\0\u04e2\0\u1e14\0\u1e46"+
    "\0\u04e2\0\u04e2\0\u1e78\0\u1eaa\0\u04e2\0\u1edc\0\u04e2\0\u1f0e"+
    "\0\u1f40\0\u1f72\0\u1fa4\0\u1fd6\0\u2008\0\u203a\0\u206c\0\u209e"+
    "\0\u20d0\0\u04e2\0\u2102\0\u04e2\0\u2134\0\u2166\0\u2198\0\u21ca"+
    "\0\u21fc\0\u04e2\0\u222e\0\u2260\0\u2292\0\u22c4\0\u22f6\0\u2328"+
    "\0\u235a\0\u238c\0\u23be\0\u23f0\0\u2422\0\u04e2\0\u2454\0\u2486"+
    "\0\u24b8\0\u04e2\0\u04e2\0\u24ea\0\u251c\0\u254e\0\u04e2\0\u04e2"+
    "\0\u04e2\0\u2580\0\u04e2\0\u25b2\0\u04e2\0\u04e2\0\u25e4\0\u04e2"+
    "\0\u2616\0\u2648\0\u267a\0\u26ac\0\u26de\0\u2710\0\u2742\0\u2774"+
    "\0\u04e2\0\u27a6\0\u04e2\0\u27d8\0\u280a\0\u283c\0\u286e\0\u04e2"+
    "\0\u04e2\0\u28a0\0\u04e2\0\u28d2\0\u2904\0\u04e2\0\u04e2\0\u2936"+
    "\0\u2968\0\u04e2\0\u299a\0\u29cc\0\u04e2\0\u29fe\0\u2a30\0\u2a62"+
    "\0\u04e2\0\u2a94\0\u04e2\0\u2ac6\0\u2af8\0\u04e2\0\u2b2a\0\u2b5c"+
    "\0\u04e2\0\u04e2\0\u2b8e\0\u2bc0\0\u2bf2\0\u04e2\0\u2c24\0\u2c56"+
    "\0\u2c88\0\u04e2\0\u04e2\0\u04e2\0\u04e2\0\u2cba\0\u2cec\0\u04e2"+
    "\0\u2d1e\0\u04e2\0\u04e2\0\u04e2\0\u2d50\0\u04e2\0\u04e2\0\u04e2";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[320];
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
    "\30\6\1\7\1\6\1\10\1\11\1\12\26\6\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\33\1\35\1\36\1\37\1\40\1\7\1\33"+
    "\1\41\1\11\1\12\1\42\2\33\1\43\1\33\1\44"+
    "\1\6\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\30\63"+
    "\1\7\2\63\1\64\1\12\1\42\24\63\30\65\1\7"+
    "\2\65\1\66\1\12\25\65\30\62\1\7\2\62\1\67"+
    "\1\12\25\62\116\0\1\12\57\0\1\10\62\0\1\11"+
    "\27\0\1\33\1\70\1\71\1\72\1\73\1\74\4\33"+
    "\1\75\1\33\1\76\7\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\1\100\6\33\1\101\7\33\1\102\4\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\4\33\1\103"+
    "\2\33\1\104\3\33\1\105\1\33\1\106\2\33\1\107"+
    "\3\33\4\0\2\33\3\0\2\33\1\110\2\33\1\77"+
    "\17\0\1\111\5\33\1\70\5\33\1\112\5\33\1\113"+
    "\1\33\4\0\2\33\3\0\5\33\1\77\17\0\1\114"+
    "\5\33\1\115\10\33\1\116\2\33\1\117\1\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\6\33\1\120\1\121"+
    "\14\33\4\0\2\33\3\0\2\33\1\122\2\33\1\77"+
    "\17\0\5\33\1\123\4\33\1\124\4\33\1\125\4\33"+
    "\4\0\2\33\3\0\2\33\1\126\2\33\1\77\17\0"+
    "\5\33\1\127\1\130\2\33\1\131\2\33\1\132\2\33"+
    "\1\133\4\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\6\33\1\134\4\33\1\135\10\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\6\33\1\136\15\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\6\33\1\70\1\137\3\33"+
    "\1\140\3\33\1\141\4\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\5\33\1\142\2\33\1\143\5\33\1\144"+
    "\5\33\4\0\2\33\3\0\5\33\1\77\17\0\6\33"+
    "\1\145\1\146\3\33\1\147\10\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\6\33\1\150\15\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\1\151\12\33\1\106\10\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\1\152\4\33"+
    "\1\153\1\33\1\154\2\33\1\155\11\33\4\0\2\33"+
    "\3\0\2\33\1\156\2\33\1\77\17\0\24\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\1\157\23\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\1\160\6\33\1\161"+
    "\3\33\1\162\10\33\4\0\2\33\3\0\5\33\1\77"+
    "\26\0\1\163\21\0\1\37\27\0\27\164\1\165\1\0"+
    "\3\164\1\0\25\164\10\0\1\163\15\0\1\37\3\0"+
    "\1\41\30\0\1\166\1\33\1\167\2\33\1\170\4\33"+
    "\1\171\11\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\1\172\23\33\4\0\2\33\3\0\5\33\1\77\62\0"+
    "\1\173\15\0\30\62\1\0\3\62\1\0\25\62\30\63"+
    "\1\0\3\63\2\0\54\63\1\0\2\63\1\64\2\0"+
    "\24\63\30\65\1\0\3\65\1\0\55\65\1\0\2\65"+
    "\1\66\1\0\25\65\30\62\1\0\2\62\1\67\1\0"+
    "\25\62\1\0\2\33\1\174\21\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\3\33\1\174\20\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\3\33\1\175\20\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\5\33\1\174\16\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\23\33\1\176"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\12\33\1\177"+
    "\11\33\4\0\2\33\3\0\5\33\1\77\17\0\14\33"+
    "\1\200\7\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\2\33\1\201\21\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\7\33\1\202\14\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\7\33\1\203\14\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\6\33\1\204\1\205\7\33\1\206"+
    "\4\33\4\0\2\33\3\0\5\33\1\77\17\0\15\33"+
    "\1\206\2\33\1\207\3\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\5\33\1\174\16\33\4\0\2\33\3\0"+
    "\3\33\1\210\1\33\1\77\17\0\17\33\1\174\4\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\1\33\1\211"+
    "\22\33\4\0\2\33\3\0\5\33\1\77\17\0\14\33"+
    "\1\212\7\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\6\33\1\213\15\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\17\33\1\206\4\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\1\33\1\174\3\33\1\174\16\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\1\214\23\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\7\33\1\215\14\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\4\33\1\216"+
    "\17\33\4\0\2\33\3\0\5\33\1\77\17\0\11\33"+
    "\1\217\12\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\16\33\1\220\5\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\4\33\1\221\2\33\1\222\14\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\4\33\1\223\17\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\23\33\1\224\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\10\33\1\174\13\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\12\33\1\174"+
    "\11\33\4\0\2\33\3\0\5\33\1\77\17\0\2\33"+
    "\1\225\21\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\1\226\16\33\1\227\4\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\17\33\1\230\4\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\11\33\1\231\12\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\17\33\1\232\4\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\17\33\1\233\4\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\13\33\1\234"+
    "\10\33\4\0\2\33\3\0\5\33\1\77\17\0\4\33"+
    "\1\235\5\33\1\236\11\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\1\237\23\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\15\33\1\174\6\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\4\33\1\240\1\174\16\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\5\33\1\241\16\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\2\33\1\242"+
    "\1\33\1\243\17\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\11\33\1\174\12\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\5\33\1\244\16\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\23\33\1\140\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\1\245\1\33\1\246\1\174\1\247"+
    "\7\33\1\250\1\33\1\251\5\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\4\33\1\206\17\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\5\33\1\252\16\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\14\33\1\253\2\33"+
    "\1\254\4\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\4\33\1\255\17\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\10\33\1\256\3\33\1\257\7\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\2\33\1\260\12\33\1\261"+
    "\1\262\5\33\4\0\2\33\3\0\5\33\1\77\43\0"+
    "\1\263\4\0\1\264\56\0\1\164\33\0\14\33\1\265"+
    "\7\33\4\0\2\33\3\0\5\33\1\77\17\0\13\33"+
    "\1\266\10\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\1\33\1\267\2\33\1\270\17\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\23\33\1\271\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\17\33\1\272\4\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\7\33\1\273\14\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\7\33\1\274\14\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\7\33\1\275"+
    "\14\33\4\0\2\33\3\0\5\33\1\77\17\0\12\33"+
    "\1\276\11\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\1\277\23\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\12\33\1\300\11\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\12\33\1\301\11\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\24\33\4\0\2\33\3\0\5\33\1\302"+
    "\17\0\24\33\4\0\2\33\3\0\2\33\1\303\2\33"+
    "\1\77\17\0\7\33\1\304\14\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\7\33\1\305\14\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\14\33\1\306\7\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\2\33\1\307\21\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\3\33\1\310"+
    "\20\33\4\0\2\33\3\0\5\33\1\77\17\0\5\33"+
    "\1\311\16\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\4\33\1\312\17\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\7\33\1\313\14\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\13\33\1\314\10\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\5\33\1\315\16\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\12\33\1\316\11\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\7\33\1\317\14\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\2\33\1\320"+
    "\21\33\4\0\2\33\3\0\5\33\1\77\17\0\6\33"+
    "\1\321\15\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\7\33\1\322\14\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\16\33\1\323\5\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\5\33\1\324\16\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\7\33\1\325\14\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\24\33\4\0\2\33\3\0"+
    "\2\33\1\326\2\33\1\77\17\0\15\33\1\327\6\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\12\33\1\330"+
    "\11\33\4\0\2\33\3\0\5\33\1\77\17\0\24\33"+
    "\4\0\2\33\3\0\2\33\1\331\2\33\1\77\17\0"+
    "\6\33\1\332\15\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\23\33\1\333\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\23\33\1\334\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\4\33\1\335\17\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\24\33\4\0\2\33\3\0\2\33\1\336"+
    "\2\33\1\77\17\0\1\337\23\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\13\33\1\340\10\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\13\33\1\341\10\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\1\342\23\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\7\33\1\343\14\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\12\33\1\344"+
    "\11\33\4\0\2\33\3\0\5\33\1\77\17\0\13\33"+
    "\1\345\10\33\4\0\2\33\3\0\5\33\1\77\50\0"+
    "\1\264\30\0\12\33\1\346\11\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\5\33\1\347\16\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\17\33\1\350\4\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\17\33\1\351\4\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\1\352\23\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\5\33\1\353"+
    "\16\33\4\0\2\33\3\0\5\33\1\77\17\0\12\33"+
    "\1\354\11\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\5\33\1\355\16\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\24\33\4\0\2\33\3\0\1\356\4\33\1\77"+
    "\17\0\7\33\1\357\14\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\5\33\1\360\3\33\1\361\12\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\7\33\1\362\14\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\7\33\1\363"+
    "\14\33\4\0\2\33\3\0\5\33\1\77\17\0\17\33"+
    "\1\364\4\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\6\33\1\365\15\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\24\33\4\0\2\33\3\0\2\33\1\366\2\33"+
    "\1\77\17\0\7\33\1\367\14\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\17\33\1\370\4\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\23\33\1\371\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\1\372\23\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\4\33\1\373\17\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\17\33\1\374\4\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\4\33\1\375"+
    "\17\33\4\0\2\33\3\0\5\33\1\77\17\0\7\33"+
    "\1\376\14\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\24\33\4\0\2\33\3\0\2\33\1\377\2\33\1\77"+
    "\17\0\1\33\1\u0100\22\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\6\33\1\u0101\15\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\6\33\1\u0102\15\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\17\33\1\u0103\4\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\4\33\1\u0104\17\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\23\33\1\u0105"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\1\u0106\23\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\4\33\1\u0107"+
    "\17\33\4\0\2\33\3\0\5\33\1\77\17\0\14\33"+
    "\1\u0108\7\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\4\33\1\u0109\17\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\22\33\1\u010a\1\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\15\33\1\u010b\6\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\7\33\1\u010c\14\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\1\u010d\23\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\4\33\1\u010e\17\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\13\33\1\u010f\10\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\4\33\1\u0110"+
    "\17\33\4\0\2\33\3\0\5\33\1\77\17\0\23\33"+
    "\1\u0111\4\0\2\33\3\0\5\33\1\77\17\0\5\33"+
    "\1\u0112\16\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\23\33\1\u0113\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\13\33\1\u0114\10\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\13\33\1\u0115\10\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\5\33\1\u0116\16\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\4\33\1\u0117\17\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\5\33\1\u0118\16\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\5\33\1\u0119\16\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\4\33\1\u011a"+
    "\17\33\4\0\2\33\3\0\5\33\1\77\17\0\16\33"+
    "\1\u011b\5\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\17\33\1\u011c\4\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\5\33\1\u011d\16\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\13\33\1\u011e\10\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\1\u011f\23\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\1\33\1\u0120\22\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\7\33\1\u0121\14\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\1\u0122\23\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\1\u0123\23\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\1\u0124\23\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\3\33\1\u0125\20\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\7\33\1\u0126"+
    "\14\33\4\0\2\33\3\0\5\33\1\77\17\0\5\33"+
    "\1\u0127\16\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\4\33\1\u0128\17\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\4\33\1\u0129\17\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\3\33\1\u012a\20\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\7\33\1\u012b\14\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\1\u012c\23\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\13\33\1\u012d\10\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\7\33\1\u012e\14\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\21\33\1\u012f"+
    "\2\33\4\0\2\33\3\0\5\33\1\77\17\0\4\33"+
    "\1\u0130\17\33\4\0\2\33\3\0\5\33\1\77\17\0"+
    "\14\33\1\u0131\7\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\24\33\4\0\2\33\3\0\1\33\1\u0132\3\33"+
    "\1\77\17\0\24\33\4\0\2\33\3\0\1\u0133\4\33"+
    "\1\77\17\0\7\33\1\u0134\14\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\15\33\1\u0135\6\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\13\33\1\u0136\10\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\5\33\1\u0137\16\33"+
    "\4\0\2\33\3\0\5\33\1\77\17\0\14\33\1\u0138"+
    "\7\33\4\0\2\33\3\0\5\33\1\77\17\0\24\33"+
    "\4\0\2\33\3\0\3\33\1\u0139\1\33\1\77\17\0"+
    "\7\33\1\u013a\14\33\4\0\2\33\3\0\5\33\1\77"+
    "\17\0\7\33\1\u013b\14\33\4\0\2\33\3\0\5\33"+
    "\1\77\17\0\7\33\1\u013c\14\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\1\u013d\23\33\4\0\2\33\3\0"+
    "\5\33\1\77\17\0\4\33\1\u013e\17\33\4\0\2\33"+
    "\3\0\5\33\1\77\17\0\7\33\1\u013f\14\33\4\0"+
    "\2\33\3\0\5\33\1\77\17\0\14\33\1\u0140\7\33"+
    "\4\0\2\33\3\0\5\33\1\77\16\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11650];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\3\1\1\11\3\1\1\11\23\1\1\11\3\1"+
    "\1\11\3\1\14\11\15\1\1\11\63\1\2\0\6\1"+
    "\1\11\67\1\1\0\16\1\1\11\176\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[320];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Xbas99Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 174) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 96: 
          { return Xbas99Types.W_PERMANENT;
          }
        case 99: break;
        case 6: 
          { yybegin(STMT); return Xbas99Types.LNUMBER;
          }
        case 100: break;
        case 34: 
          { return Xbas99Types.QSTRING;
          }
        case 101: break;
        case 72: 
          { return Xbas99Types.W_GOSUB;
          }
        case 102: break;
        case 1: 
          { return Xbas99Types.A_DATA;
          }
        case 103: break;
        case 23: 
          { return Xbas99Types.OP_DIV;
          }
        case 104: break;
        case 44: 
          { return Xbas99Types.W_LET;
          }
        case 105: break;
        case 17: 
          { return Xbas99Types.OP_GT;
          }
        case 106: break;
        case 65: 
          { return Xbas99Types.W_TRACE;
          }
        case 107: break;
        case 37: 
          { return Xbas99Types.W_AND;
          }
        case 108: break;
        case 75: 
          { return Xbas99Types.W_ACCEPT;
          }
        case 109: break;
        case 31: 
          { return Xbas99Types.W_FUN_C;
          }
        case 110: break;
        case 57: 
          { return Xbas99Types.W_NEXT;
          }
        case 111: break;
        case 12: 
          { return Xbas99Types.OP_COMMA;
          }
        case 112: break;
        case 90: 
          { return Xbas99Types.W_UNTRACE;
          }
        case 113: break;
        case 47: 
          { return Xbas99Types.W_DEF;
          }
        case 114: break;
        case 29: 
          { return Xbas99Types.W_ON;
          }
        case 115: break;
        case 71: 
          { yybegin(IMAGE); return Xbas99Types.W_IMAGE;
          }
        case 116: break;
        case 83: 
          { return Xbas99Types.W_UALPHA;
          }
        case 117: break;
        case 10: 
          { return Xbas99Types.FLOAT;
          }
        case 118: break;
        case 41: 
          { return Xbas99Types.W_END;
          }
        case 119: break;
        case 80: 
          { return Xbas99Types.W_LINPUT;
          }
        case 120: break;
        case 11: 
          { return Xbas99Types.NUMBER;
          }
        case 121: break;
        case 66: 
          { return Xbas99Types.W_ERASE;
          }
        case 122: break;
        case 5: 
          { yybegin(YYINITIAL); return Xbas99Types.CRLF;
          }
        case 123: break;
        case 33: 
          { return Xbas99Types.W_GO;
          }
        case 124: break;
        case 7: 
          { return TokenType.WHITE_SPACE;
          }
        case 125: break;
        case 91: 
          { return Xbas99Types.W_WARNING;
          }
        case 126: break;
        case 68: 
          { return Xbas99Types.W_FIXED;
          }
        case 127: break;
        case 95: 
          { return Xbas99Types.W_VARIABLE;
          }
        case 128: break;
        case 36: 
          { return Xbas99Types.W_FUN_N;
          }
        case 129: break;
        case 20: 
          { return Xbas99Types.OP_RPAREN;
          }
        case 130: break;
        case 79: 
          { return Xbas99Types.W_OUTPUT;
          }
        case 131: break;
        case 19: 
          { return Xbas99Types.OP_LPAREN;
          }
        case 132: break;
        case 76: 
          { return Xbas99Types.W_APPEND;
          }
        case 133: break;
        case 43: 
          { return Xbas99Types.W_XOR;
          }
        case 134: break;
        case 93: 
          { return Xbas99Types.W_RELATIVE;
          }
        case 135: break;
        case 64: 
          { return Xbas99Types.W_CLOSE;
          }
        case 136: break;
        case 88: 
          { return Xbas99Types.W_DISPLAY;
          }
        case 137: break;
        case 63: 
          { return Xbas99Types.W_BREAK;
          }
        case 138: break;
        case 97: 
          { return Xbas99Types.W_RANDOMIZE;
          }
        case 139: break;
        case 94: 
          { return Xbas99Types.W_VALIDATE;
          }
        case 140: break;
        case 8: 
          { return Xbas99Types.IDENT;
          }
        case 141: break;
        case 89: 
          { return Xbas99Types.W_UNBREAK;
          }
        case 142: break;
        case 51: 
          { return Xbas99Types.W_STOP;
          }
        case 143: break;
        case 77: 
          { return Xbas99Types.W_SUBEND;
          }
        case 144: break;
        case 70: 
          { return Xbas99Types.W_INPUT;
          }
        case 145: break;
        case 45: 
          { yybegin(REM); return Xbas99Types.W_REM;
          }
        case 146: break;
        case 24: 
          { return Xbas99Types.OP_PLUS;
          }
        case 147: break;
        case 53: 
          { return Xbas99Types.W_FUN_S;
          }
        case 148: break;
        case 81: 
          { return Xbas99Types.W_RETURN;
          }
        case 149: break;
        case 30: 
          { return Xbas99Types.W_OR;
          }
        case 150: break;
        case 82: 
          { return Xbas99Types.W_DELETE;
          }
        case 151: break;
        case 78: 
          { return Xbas99Types.W_OPTION;
          }
        case 152: break;
        case 4: 
          { return TokenType.BAD_CHARACTER;
          }
        case 153: break;
        case 22: 
          { return Xbas99Types.OP_MUL;
          }
        case 154: break;
        case 35: 
          { return Xbas99Types.OP_SEP;
          }
        case 155: break;
        case 86: 
          { return Xbas99Types.W_NUMERIC;
          }
        case 156: break;
        case 18: 
          { return Xbas99Types.OP_HASH;
          }
        case 157: break;
        case 85: 
          { return Xbas99Types.W_SUBEXIT;
          }
        case 158: break;
        case 59: 
          { return Xbas99Types.W_ELSE;
          }
        case 159: break;
        case 74: 
          { return Xbas99Types.W_USING;
          }
        case 160: break;
        case 25: 
          { return Xbas99Types.OP_EXP;
          }
        case 161: break;
        case 27: 
          { return Xbas99Types.SIDENT;
          }
        case 162: break;
        case 50: 
          { return Xbas99Types.W_BEEP;
          }
        case 163: break;
        case 15: 
          { return Xbas99Types.OP_EQ;
          }
        case 164: break;
        case 84: 
          { return Xbas99Types.W_UPDATE;
          }
        case 165: break;
        case 14: 
          { return Xbas99Types.OP_SEMI;
          }
        case 166: break;
        case 60: 
          { return Xbas99Types.W_GOTO;
          }
        case 167: break;
        case 56: 
          { return Xbas99Types.W_THEN;
          }
        case 168: break;
        case 26: 
          { return Xbas99Types.W_AT;
          }
        case 169: break;
        case 92: 
          { return Xbas99Types.W_INTERNAL;
          }
        case 170: break;
        case 54: 
          { return Xbas99Types.W_SIZE;
          }
        case 171: break;
        case 32: 
          { return Xbas99Types.W_IF;
          }
        case 172: break;
        case 62: 
          { yybegin(DATA); return Xbas99Types.W_DATA;
          }
        case 173: break;
        case 39: 
          { return Xbas99Types.W_SUB;
          }
        case 174: break;
        case 98: 
          { return Xbas99Types.W_SEQUENTIAL;
          }
        case 175: break;
        case 87: 
          { return Xbas99Types.W_RESTORE;
          }
        case 176: break;
        case 9: 
          { return Xbas99Types.OP_MINUS;
          }
        case 177: break;
        case 61: 
          { return Xbas99Types.W_READ;
          }
        case 178: break;
        case 67: 
          { return Xbas99Types.W_ERROR;
          }
        case 179: break;
        case 46: 
          { return Xbas99Types.W_RUN;
          }
        case 180: break;
        case 55: 
          { return Xbas99Types.W_CALL;
          }
        case 181: break;
        case 58: 
          { return Xbas99Types.W_OPEN;
          }
        case 182: break;
        case 3: 
          { return Xbas99Types.COMMENT;
          }
        case 183: break;
        case 73: 
          { return Xbas99Types.W_DIGIT;
          }
        case 184: break;
        case 40: 
          { return Xbas99Types.W_NOT;
          }
        case 185: break;
        case 52: 
          { return Xbas99Types.W_STEP;
          }
        case 186: break;
        case 21: 
          { return Xbas99Types.OP_AMP;
          }
        case 187: break;
        case 28: 
          { return Xbas99Types.W_TO;
          }
        case 188: break;
        case 38: 
          { return Xbas99Types.W_ALL;
          }
        case 189: break;
        case 49: 
          { return Xbas99Types.W_BASE;
          }
        case 190: break;
        case 48: 
          { return Xbas99Types.W_DIM;
          }
        case 191: break;
        case 69: 
          { return Xbas99Types.W_PRINT;
          }
        case 192: break;
        case 16: 
          { return Xbas99Types.OP_LT;
          }
        case 193: break;
        case 42: 
          { return Xbas99Types.W_FOR;
          }
        case 194: break;
        case 2: 
          { return Xbas99Types.A_IMAGE;
          }
        case 195: break;
        case 13: 
          { return Xbas99Types.OP_COLON;
          }
        case 196: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

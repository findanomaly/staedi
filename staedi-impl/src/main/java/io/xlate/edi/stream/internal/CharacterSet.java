package io.xlate.edi.stream.internal;

import java.util.Arrays;


public class CharacterSet {

	private static final CharacterClass _SPACE = CharacterClass.SPACE;
	private static final CharacterClass _LATNA = CharacterClass.LATIN_A;
	private static final CharacterClass _LATNB = CharacterClass.LATIN_B;
	private static final CharacterClass _LATNE = CharacterClass.LATIN_E;
	private static final CharacterClass _LATNI = CharacterClass.LATIN_I;
	private static final CharacterClass _LATNN = CharacterClass.LATIN_N;
	private static final CharacterClass _LATNS = CharacterClass.LATIN_S;
	private static final CharacterClass _LATNU = CharacterClass.LATIN_U;
	private static final CharacterClass _LATNZ = CharacterClass.LATIN_Z;
	private static final CharacterClass _ALNUM = CharacterClass.ALPHANUMERIC;
	private static final CharacterClass _OTHER = CharacterClass.OTHER;
	private static final CharacterClass _WHITE = CharacterClass.WHITESPACE;
	private static final CharacterClass _CNTRL = CharacterClass.CONTROL;
	private static final CharacterClass _INVLD = CharacterClass.INVALID;

	/*
	 * This array maps the 128 ASCII characters into character classes. The
	 * remaining Unicode characters should be mapped to _OTHER. Control
	 * characters are errors.
	 */
	private static final CharacterClass[] prototype = {
			_INVLD, /* 00 NUL */
			_CNTRL, /* 01 SOH */
			_CNTRL, /* 02 STX */
			_CNTRL, /* 03 ETX */
			_CNTRL, /* 04 EOT */
			_CNTRL, /* 05 ENQ */
			_CNTRL, /* 06 ACK */
			_CNTRL, /* 07 BEL */
			_INVLD, /* 08 BS */
			_WHITE, /* 09 HT */
			_WHITE, /* 0A LF */
			_WHITE, /* 0B VT */
			_WHITE, /* 0C FF */
			_WHITE, /* 0D CR */
			_INVLD, /* 0E SO */
			_INVLD, /* 0F SI */
			_INVLD, /* 10 DLE */
			_CNTRL, /* 11 DC1 */
			_CNTRL, /* 12 DC2 */
			_CNTRL, /* 13 DC3 */
			_CNTRL, /* 14 DC4 */
			_CNTRL, /* 15 NAK */
			_CNTRL, /* 16 SYN */
			_CNTRL, /* 17 ETB */
			_INVLD, /* 18 CAN */
			_INVLD, /* 19 EM */
			_INVLD, /* 1A SUB */
			_INVLD, /* 1B ESC */
			_CNTRL, /* 1C FS */
			_CNTRL, /* 1D GS */
			_CNTRL, /* 1E RS */
			_CNTRL, /* 1F US */
			_SPACE, /* 20 ␠ */
			_OTHER, /* 21 ! */
			_OTHER, /* 22 " */
			_OTHER, /* 23 # */
			_OTHER, /* 24 $ */
			_OTHER, /* 25 % */
			_OTHER, /* 26 & */
			_OTHER, /* 27 ' */
			_OTHER, /* 28 ( */
			_OTHER, /* 29 ) */
			_OTHER, /* 2A * */
			_OTHER, /* 2B + */
			_OTHER, /* 2C , */
			_OTHER, /* 2D - */
			_OTHER, /* 2E . */
			_OTHER, /* 2F / */
			_ALNUM, /* 30 0 */
			_ALNUM, /* 31 1 */
			_ALNUM, /* 32 2 */
			_ALNUM, /* 33 3 */
			_ALNUM, /* 34 4 */
			_ALNUM, /* 35 5 */
			_ALNUM, /* 36 6 */
			_ALNUM, /* 37 7 */
			_ALNUM, /* 38 8 */
			_ALNUM, /* 39 9 */
			_OTHER, /* 3A : */
			_OTHER, /* 3B ; */
			_OTHER, /* 3C < */
			_OTHER, /* 3D = */
			_OTHER, /* 3E > */
			_OTHER, /* 3F ? */
			_OTHER, /* 40 @ */
			_LATNA, /* 41 A */
			_LATNB, /* 42 B */
			_ALNUM, /* 43 C */
			_ALNUM, /* 44 D */
			_LATNE, /* 45 E */
			_ALNUM, /* 46 F */
			_ALNUM, /* 47 G */
			_ALNUM, /* 48 H */
			_LATNI, /* 49 I */
			_ALNUM, /* 4A J */
			_ALNUM, /* 4B K */
			_ALNUM, /* 4C L */
			_ALNUM, /* 4D M */
			_LATNN, /* 4E N */
			_ALNUM, /* 4F O */
			_ALNUM, /* 50 P */
			_ALNUM, /* 51 Q */
			_ALNUM, /* 52 R */
			_LATNS, /* 53 S */
			_ALNUM, /* 54 T */
			_LATNU, /* 55 U */
			_ALNUM, /* 56 V */
			_ALNUM, /* 57 W */
			_ALNUM, /* 58 X */
			_ALNUM, /* 59 Y */
			_LATNZ, /* 5A Z */
			_OTHER, /* 5B [ */
			_OTHER, /* 5C \ */
			_OTHER, /* 5D ] */
			_OTHER, /* 5E ^ */
			_OTHER, /* 5F _ */
			_OTHER, /* 60 ` */
			_ALNUM, /* 61 a */
			_ALNUM, /* 62 b */
			_ALNUM, /* 63 c */
			_ALNUM, /* 64 d */
			_ALNUM, /* 65 e */
			_ALNUM, /* 66 f */
			_ALNUM, /* 67 g */
			_ALNUM, /* 68 h */
			_ALNUM, /* 69 i */
			_ALNUM, /* 6A j */
			_ALNUM, /* 6B k */
			_ALNUM, /* 6C l */
			_ALNUM, /* 6D m */
			_ALNUM, /* 6E n */
			_ALNUM, /* 6F o */
			_ALNUM, /* 70 p */
			_ALNUM, /* 71 q */
			_ALNUM, /* 72 r */
			_ALNUM, /* 73 s */
			_ALNUM, /* 74 t */
			_ALNUM, /* 75 u */
			_ALNUM, /* 76 v */
			_ALNUM, /* 77 w */
			_ALNUM, /* 78 x */
			_ALNUM, /* 79 y */
			_ALNUM, /* 7A z */
			_OTHER, /* 7B { */
			_OTHER, /* 7C | */
			_OTHER, /* 7D } */
			_OTHER, /* 7E ~ */
			_INVLD /* 7F DEL */
	};

	private final CharacterClass[] list;

	public CharacterSet() {
		list = Arrays.copyOf(prototype, prototype.length);
	}

	public CharacterClass getClass(int character) {
		return (character < 128) ? list[character] : _OTHER;
	}

	public void reset() {
		System.arraycopy(prototype, 0, list, 0, prototype.length);
	}

	public void setClass(int character, CharacterClass clazz) {
		if (character < 128) {
			list[character] = clazz;
		} else {
			throw new ArrayIndexOutOfBoundsException(character);
		}
	}

	public int getDelimiter(CharacterClass clazz) {
		switch (clazz) {
		case ELEMENT_DELIMITER:
		case ELEMENT_REPEATER:
		case SEGMENT_DELIMITER:
		case COMPONENT_DELIMITER:
			break;
		default:
			throw new IllegalArgumentException("Nondelimiter class: " + clazz);
		}

		for (int i = 0, l = list.length; i < l; i++) {
			if (list[i] == clazz) {
				return i;
			}
		}

		return -1;
	}

	public boolean isDelimiter(int character) {
		if (character < 128) {
			switch (list[character]) {
			case ELEMENT_DELIMITER:
			case ELEMENT_REPEATER:
			case SEGMENT_DELIMITER:
			case COMPONENT_DELIMITER:
				return true;
			default:
				return false;
			}
		}

		return false;
	}

	public boolean isRelease(int character) {
		if (character >= 128) {
			return false;
		}
		return list[character] == CharacterClass.RELEASE_CHARACTER;
	}

	public static boolean isValid(int character) {
		return (character < 128) ? prototype[character] != _INVLD : true;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();

		for (int c = 0, m = list.length; c < m; c++) {
			string.append(c);
			string.append(") \t");
			string.append((char) c);
			string.append(": \t'");
			string.append(list[c].toString());
			string.append("'\n");
		}

		return string.toString();
	}
}

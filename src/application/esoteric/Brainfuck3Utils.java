package application.esoteric;

public class Brainfuck3Utils {

	private final static int LENGTH = 65535;
	private final static int COL_LENGTH = 100;
	private static byte[][] mem = new byte[LENGTH][COL_LENGTH];
	private static int dataPointer;
	private static int columnPointer;

	public static String interpret(String code) {
		code = code.replace("\n", "").replace(" ", "");
		mem = new byte[LENGTH][COL_LENGTH];
		dataPointer = 0;
		columnPointer = 0;
		StringBuilder ret = new StringBuilder();
		int l = 0;
		for (int i = 0; i < code.length(); i++) {
			if (code.charAt(i) == '>') {
				dataPointer = (dataPointer == LENGTH - 1) ? 0 : dataPointer + 1;
			} else if (code.charAt(i) == '<') {
				dataPointer = (dataPointer == 0) ? LENGTH - 1 : dataPointer - 1;
			} else if (code.charAt(i) == '+') {
				mem[columnPointer][dataPointer]++;
			} else if (code.charAt(i) == '-') {
				mem[columnPointer][dataPointer]--;
			} else if (code.charAt(i) == '.') {
				ret.append((char) mem[columnPointer][dataPointer]);
			} else if (code.charAt(i) == ',') {
				// mem[dataPointer] = (byte) sc.next().charAt(0); --> todo manage input
			} else if (code.charAt(i) == '[') {
				if (mem[columnPointer][dataPointer] == 0) {
					i++;
					while (l > 0 || code.charAt(i) != ']') {
						if (code.charAt(i) == '[')
							l++;
						if (code.charAt(i) == ']')
							l--;
						i++;
					}
				}
			} else if (code.charAt(i) == ']') {
				if (mem[columnPointer][dataPointer] != 0) {
					i--;
					while (l > 0 || code.charAt(i) != '[') {
						if (code.charAt(i) == ']')
							l++;
						if (code.charAt(i) == '[')
							l--;
						i--;
					}
					i--;
				}
			} else if (code.charAt(i) == '^') {
				columnPointer = (columnPointer == 0) ? COL_LENGTH - 1 : columnPointer - 1;

			} else if (code.charAt(i) == 'v') {
				columnPointer = (columnPointer == COL_LENGTH - 1) ? 0 : columnPointer + 1;

			} else if (code.charAt(i) == 'x') {
				break;
			}
		}
		return ret.toString();
	}

}

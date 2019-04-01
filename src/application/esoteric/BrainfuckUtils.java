package application.esoteric;

public class BrainfuckUtils {

	private final static int LENGTH = 65535;
	private static byte[] mem = new byte[LENGTH];
	private static int dataPointer;

	public static String interpret(String code) {
		code = code.replace("\n", "").replace(" ", "");
		mem = new byte[LENGTH];
		dataPointer = 0;
		StringBuilder ret = new StringBuilder();
		int l = 0;
		for (int i = 0; i < code.length(); i++) {
			if (code.charAt(i) == '>') {
				dataPointer = (dataPointer == LENGTH - 1) ? 0 : dataPointer + 1;
			} else if (code.charAt(i) == '<') {
				dataPointer = (dataPointer == 0) ? LENGTH - 1 : dataPointer - 1;
			} else if (code.charAt(i) == '+') {
				mem[dataPointer]++;
			} else if (code.charAt(i) == '-') {
				mem[dataPointer]--;
			} else if (code.charAt(i) == '.') {
				ret.append((char) mem[dataPointer]);
			} else if (code.charAt(i) == ',') {
				// mem[dataPointer] = (byte) sc.next().charAt(0); --> todo manage input
			} else if (code.charAt(i) == '[') {
				if (mem[dataPointer] == 0) {
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
				if (mem[dataPointer] != 0) {
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
			}
		}
		return ret.toString();
	}

	public static String helloWorld() {
		return "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";
	}

}

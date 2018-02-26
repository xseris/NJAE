package application.conversion;

public class AsciiToUtils {

	public static String toHex(String text) {
		StringBuilder ret = new StringBuilder();
		for (char c : text.toCharArray()) {
			String hexCode = String.format("%H", c);
			ret.append(hexCode);
		}
		return ret.toString();
	}

	public static String toBinary(String text) {
		StringBuilder binary = new StringBuilder();
		for (byte b : text.getBytes()) {
			int val = b;
			for (int i = 0; i < 8; i++) {
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
			binary.append(' ');
		}
		return binary.toString();
	}
}

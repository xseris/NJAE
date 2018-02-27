package application.conversion;

public class BinaryToUtils {

	public static String toAscii(String text) {
		StringBuilder ret = new StringBuilder();
		text = text.replace(" ", "");
		for (int i = 0; i < text.length(); i += 8) {
			char nextChar = (char) Integer.parseInt(text.substring(i, i + 8), 2);
			ret.append(nextChar);
		}
		return ret.toString();
	}

	public static String toHex(String text) {
		text = toAscii(text);
		return AsciiToUtils.toHex(text);
	}

}

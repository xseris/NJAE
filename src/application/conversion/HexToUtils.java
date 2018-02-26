package application.conversion;

public class HexToUtils {

	public static String toAscii(String text) {
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < text.length(); i += 2) {
			String str = text.substring(i, i + 2);
			ret.append((char) Integer.parseInt(str, 16));
		}
		return ret.toString();
	}
}

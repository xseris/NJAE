package application.crypto;

public class CaesarUtils {

	public static String encode(String text) {
		return RotationUtils.rotate(text, 3);
	}

	public static String decode(String text) {
		return RotationUtils.rotate(text, 23);
	}

	public static String bruteForce(String text) {
		StringBuilder ret = new StringBuilder();
		for (int i = 1; i < 27; i++) {
			ret.append("Key = " + i + " --> ").append(RotationUtils.rotate(text, i)).append("\n");
		}
		return ret.toString();
	}
}

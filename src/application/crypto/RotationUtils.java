package application.crypto;

public class RotationUtils {

	public static String rotate(String msg, int shift) {
		String s = "";
		int len = msg.length();
		for (int x = 0; x < len; x++) {
			char o = msg.charAt(x);
			char c = (char) (o + shift);
			if (o >= 'a' && o <= 'z') {
				if (c > 'z') {
					s += (char) (o - (26 - shift));
				} else {
					s += (char) (o + shift);
				}
			} else if (o >= 'A' && o <= 'Z') {
				if (c > 'Z') {
					s += (char) (o - (26 - shift));
				} else {
					s += (char) (o + shift);
				}
			} else {
				s += o;
			}
		}
		return s;
	}
}

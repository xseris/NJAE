package application.crypto;

public class Rot47Utils {

	public static String encodeDecode(String text) {
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c != ' ') {
				c += 47;
				if (c > '~') {
					c -= 94;
				}
			}
			ret.append(c);
		}
		return ret.toString();
	}

}

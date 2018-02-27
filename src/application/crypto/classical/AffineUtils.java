package application.crypto.classical;

import error.CryptoErrors;

public class AffineUtils {

	public static String encode(int a, int b, String text) {
		String errors = checkErrors(a, b);
		if (!errors.isEmpty()) {
			return errors;
		}
		StringBuilder ret = new StringBuilder();
		text = text.toLowerCase();
		for (int i = 0; i < text.length(); i++) {
			char nextChar = text.charAt(i);
			ret.append((char) ('a' + (((nextChar - 'a') * a) + b) % 26));
		}
		return ret.toString();
	}

	public static String decode(int a, int b, String text) {
		String errors = checkErrors(a, b);
		if (!errors.isEmpty()) {
			return errors;
		}
		int c = getInverse(a);
		StringBuilder ret = new StringBuilder();
		text = text.toLowerCase();
		for (int i = 0; i < text.length(); i++) {
			char nextChar = text.charAt(i);
			ret.append((char) ('a' + Math.floorMod((c * ((nextChar - 'a') - b)), 26)));
		}
		return ret.toString();
	}

	public static String bruteforce(String text) {
		StringBuilder ret = new StringBuilder();
		text = text.toLowerCase();
		for (int a = 1; a < 27; a += 2) {
			if (a != 13) {
				for (int b = 1; b < 27; b++) {
					ret.append("a = ").append(a).append(", b = ").append(b).append(" --> ").append(decode(a, b, text))
							.append("\n");
				}
			}
		}
		return ret.toString();
	}

	private static int getInverse(int a) {
		for (int i = 1; i <= 26; i++) {
			if ((a * i) % 26 == 1) {
				return i;
			}
		}
		return 0;
	}

	private static String checkErrors(int a, int b) {
		StringBuilder ret = new StringBuilder();
		if (a > 25) {
			ret.append(CryptoErrors.AFFINE_A_TOO_HIGH).append("\n");
		}
		if (b > 25) {
			ret.append(CryptoErrors.AFFINE_B_TOO_HIGH).append("\n");
		}
		if (a < 1) {
			ret.append(CryptoErrors.AFFINE_A_TOO_LOW).append("\n");
		}
		if (b < 1) {
			ret.append(CryptoErrors.AFFINE_B_TOO_LOW).append("\n");
		}
		if (a % 2 == 0 || a == 13) {
			ret.append(CryptoErrors.AFFINE_NOT_RELATIVELY_PRIME).append("\n");
		}
		return ret.toString();
	}
}

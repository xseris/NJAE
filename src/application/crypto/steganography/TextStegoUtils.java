package application.crypto.steganography;

public class TextStegoUtils {

	public static String firstCharEachWord(String text) {
		String[] words = text.split(" ");
		StringBuilder ret = new StringBuilder();
		for (String word : words) {
			ret.append(word.charAt(0));
		}
		return ret.toString();
	}

	public static String capitals(String text) {
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
				ret.append(text.charAt(i));
			}
		}
		return ret.toString();
	}

	public static String lowers(String text) {
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				ret.append(text.charAt(i));
			}
		}
		return ret.toString();
	}

	public static String firstCharEachPhrase(String text) {
		String[] words = text.split("\\. ");
		StringBuilder ret = new StringBuilder();
		for (String word : words) {
			ret.append(word.charAt(0));
		}
		return ret.toString();
	}

	public static String firstWordEachPhrase(String text) {
		String[] words = text.split("\\. ");
		StringBuilder ret = new StringBuilder();
		for (String word : words) {
			ret.append(word.split(" ")[0]);
		}
		return ret.toString();
	}

	public static String firstCharEachParagraph(String text) {
		String[] words = text.split("\n");
		StringBuilder ret = new StringBuilder();
		for (String word : words) {
			ret.append(word.charAt(0));
		}
		return ret.toString();
	}

	public static String firstWordEachParagraph(String text) {
		String[] words = text.split("\n");
		StringBuilder ret = new StringBuilder();
		for (String word : words) {
			ret.append(word.split(" ")[0]);
		}
		return ret.toString();
	}

}

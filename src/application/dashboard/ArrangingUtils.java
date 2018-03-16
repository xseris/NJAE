package application.dashboard;

public class ArrangingUtils {

	public static String truncateByLength(String text, int length) {
		StringBuilder ret = new StringBuilder();
		String[] lines = text.split("\n");
		for (String line : lines) {
			if (line.length() <= length) {
				ret.append(line).append("\n");
			} else {
				int i = 0;
				for (char c : line.toCharArray()) {
					if (++i > length) {
						break;
					}
					ret.append(String.valueOf(c));
				}
				ret.append("\n");
			}
		}
		return ret.toString();
	}

	public static String truncateByWords(String text, int length) {
		StringBuilder ret = new StringBuilder();
		String[] lines = text.split("\n");
		for (String line : lines) {
			if (line.trim().split(" ").length <= length) {
				ret.append(line.trim()).append("\n");
			} else {
				int i = 0;
				for (String word : line.trim().split(" ")) {
					if (i > 0) {
						ret.append(" ");
					}
					if (++i > length) {
						break;
					}
					ret.append(word);
				}
				ret.append("\n");
			}
		}
		return ret.toString();
	}

	public static String truncateByLines(String text, int length) {
		StringBuilder ret = new StringBuilder();
		int i = 0;
		for (String line : text.split("\n")) {
			if (++i > length) {
				break;
			}
			ret.append(line).append("\n");
		}
		return ret.toString();
	}

	public static String reverseLines(String text) {
		StringBuilder ret = new StringBuilder();
		String[] lines = text.split("\n");
		for (int i = lines.length - 1; i >= 0; i--) {
			ret.append(lines[i]).append("\n");
		}
		return ret.toString();
	}

	public static String reverseText(String text) {
		text = reverseLines(text);
		StringBuilder ret = new StringBuilder();
		for (String line : text.split("\n")) {
			String[] words = line.split(" ");
			for (int i = words.length - 1; i >= 0; i--) {
				ret.append(words[i]).append(" ");
			}
			ret.append("\n");
		}
		return ret.toString();
	}

	public static String reverseWords(String text) {
		StringBuilder ret = new StringBuilder();
		for (String line : text.split("\n")) {
			for (String word : line.split(" ")) {
				char[] chars = word.toCharArray();
				for (int i = chars.length - 1; i >= 0; i--) {
					ret.append(chars[i]);
				}
				ret.append(" ");
			}
			ret.append("\n");
		}
		return ret.toString();
	}

}

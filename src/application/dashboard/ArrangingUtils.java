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
}

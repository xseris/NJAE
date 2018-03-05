package application.dashboard;

public class NotationUtils {

	public static String toLowerCase(String text) {
		return text.toLowerCase();
	}

	public static String toUpperCase(String text) {
		return text.toUpperCase();
	}

	public static String capitalization(String text) {
		text = text.toLowerCase();
		StringBuilder sb = new StringBuilder();
		String[] lines = text.split("\n");
		for (String line : lines) {
			String[] words = line.split(" ");
			for (String word : words) {
				int k = 1;
				for (int i = 0; k <= word.length(); i++) {
					String current = word.substring(i, k);
					if (i == 0) {
						sb.append(current.toUpperCase());
					} else {
						sb.append(current);
					}
					k++;
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static String toCamelCase(String text) {
		text = text.toLowerCase();
		StringBuilder sb = new StringBuilder();
		String[] lines = text.split("\n");
		for (String line : lines) {
			String[] words = line.split(" ");
			for (String word : words) {
				int k = 1;
				for (int i = 0; k <= word.length(); i++) {
					String current = word.substring(i, k);
					if (i == 0) {
						sb.append(current.toUpperCase());
					} else {
						sb.append(current);
					}
					k++;
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static String toSnakeCase(String text) {
		text = text.toLowerCase();
		StringBuilder sb = new StringBuilder();
		String[] lines = text.split("\n");
		for (String line : lines) {
			String[] words = line.split(" ");
			for (int i = 0; i < words.length; i++) {
				if (i > 0) {
					sb.append("_");
				}
				sb.append(words[i]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static String toKebabCase(String text) {
		text = text.toLowerCase();
		StringBuilder sb = new StringBuilder();
		String[] lines = text.split("\n");
		for (String line : lines) {
			String[] words = line.split(" ");
			for (int i = 0; i < words.length; i++) {
				if (i > 0) {
					sb.append("-");
				}
				sb.append(words[i]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}

package application.dashboard;

public class FilteringUtils {

	public static String grep(String text, String filter) {
		StringBuilder ret = new StringBuilder();
		String[] lines = text.split("\n");
		for (String line : lines) {
			if (line.contains(filter)) {
				ret.append(line).append("\n");
			}
		}
		return ret.toString();
	}
	
	public static String replace(String text, String word, String with) {
		return text.replaceAll(word, with);
	}

}

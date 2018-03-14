package application.dashboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

	public static String unique(String text) {
		StringBuilder ret = new StringBuilder();
		List<String> strings = new ArrayList<>();
		for (String line : text.split("\n")) {
			if (!strings.contains(line)) {
				strings.add(line);
				ret.append(line).append("\n");
			}
		}
		return ret.toString();
	}

	public static String sortAsc(String text) {
		StringBuilder ret = new StringBuilder();
		List<String> strings = new ArrayList<>();
		for (String line : text.split("\n")) {
			strings.add(line);
		}
		Collections.sort(strings, String.CASE_INSENSITIVE_ORDER);
		for (String line : strings) {
			ret.append(line).append("\n");
		}
		return ret.toString();
	}

	public static String sortDesc(String text) {
		StringBuilder ret = new StringBuilder();
		List<String> strings = new ArrayList<>();
		for (String line : text.split("\n")) {
			strings.add(line);
		}
		Collections.sort(strings, String.CASE_INSENSITIVE_ORDER);
		Collections.sort(strings, Collections.reverseOrder());
		for (String line : strings) {
			ret.append(line).append("\n");
		}
		return ret.toString();
	}

}

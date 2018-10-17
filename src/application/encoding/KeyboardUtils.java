package application.encoding;

import java.util.HashMap;
import java.util.Map;

public class KeyboardUtils {

	private static Map<Character, Character> qwertyToQuertyMap = new HashMap<Character, Character>() {
		private static final long serialVersionUID = 1L;

		{
			put('w', '�');
		}
	};

	private static Map<Character, Character> qwertyToAwertyMap = new HashMap<Character, Character>() {
		private static final long serialVersionUID = 1L;

		{
			put('w', '�');
			put('x', '�');
			put('c', '�');
			put('v', '�');
		}
	};

	private static Map<Character, Character> quertyToQwertyMap = new HashMap<Character, Character>() {
		private static final long serialVersionUID = 1L;

		{
			put('�', 'w');
		}
	};

	private static Map<Character, Character> awertyToQwertyMap = new HashMap<Character, Character>() {
		private static final long serialVersionUID = 1L;

		{
			put('�', 'w');
			put('�', 'x');
			put('�', 'c');
			put('�', 'v');
		}
	};

	public static String convert(String from, String to, String text) {
		if (from.equals(to)) {
			return text;
		}
		if (from.equals("qwerty")) {
			if (to.equals("q�erty")) {
				return convertTo(text, qwertyToQuertyMap);
			}
			if (to.equals("awerty")) {
				return convertTo(text, qwertyToAwertyMap);
			}
		}
		if (from.equals("q�erty")) {
			if (to.equals("qwerty")) {
				return convertTo(text, quertyToQwertyMap);
			}
			if (to.equals("awerty")) {
				return convertTo(convertTo(text, quertyToQwertyMap), qwertyToAwertyMap);
			}
		}
		if (from.equals("awerty")) {
			if (to.equals("qwerty")) {
				return convertTo(text, awertyToQwertyMap);
			}
			if (to.equals("q�erty")) {
				return convertTo(convertTo(text, awertyToQwertyMap), qwertyToQuertyMap);
			}
		}
		return "Unimplemented yet";
	}

	private static String convertTo(String text, Map<Character, Character> map) {
		StringBuilder ret = new StringBuilder();
		text = text.toLowerCase();
		for (char c : text.toCharArray()) {
			if (map.containsKey(c)) {
				ret.append(map.get(c));
			} else {
				ret.append(c);
			}
		}
		return ret.toString();
	}

}

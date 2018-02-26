package application.crypto.steganography;

import java.util.HashMap;
import java.util.Map;

public class BaconianUtils {

	protected static Map<Character, String> latinEncodeMap;
	static {
		latinEncodeMap = new HashMap<>();
		latinEncodeMap.put('a', "aaaaa");
		latinEncodeMap.put('b', "aaaab");
		latinEncodeMap.put('c', "aaaba");
		latinEncodeMap.put('d', "aaabb");
		latinEncodeMap.put('e', "aabaa");
		latinEncodeMap.put('f', "aabab");
		latinEncodeMap.put('g', "aabba");
		latinEncodeMap.put('h', "aabbb");
		latinEncodeMap.put('i', "abaaa");
		latinEncodeMap.put('j', "abaaa");
		latinEncodeMap.put('k', "abaab");
		latinEncodeMap.put('l', "ababa");
		latinEncodeMap.put('m', "ababb");
		latinEncodeMap.put('n', "abbaa");
		latinEncodeMap.put('o', "abbab");
		latinEncodeMap.put('p', "abbba");
		latinEncodeMap.put('q', "abbbb");
		latinEncodeMap.put('r', "baaaa");
		latinEncodeMap.put('s', "baaab");
		latinEncodeMap.put('t', "baaba");
		latinEncodeMap.put('u', "baabb");
		latinEncodeMap.put('v', "baabb");
		latinEncodeMap.put('w', "babaa");
		latinEncodeMap.put('x', "babab");
		latinEncodeMap.put('y', "babba");
		latinEncodeMap.put('z', "babbb");
	}
	
	protected static Map<Character, String> fullEncodeMap;
	static {
		fullEncodeMap = new HashMap<>();
		fullEncodeMap.put('a', "aaaaa");
		fullEncodeMap.put('b', "aaaab");
		fullEncodeMap.put('c', "aaaba");
		fullEncodeMap.put('d', "aaabb");
		fullEncodeMap.put('e', "aabaa");
		fullEncodeMap.put('f', "aabab");
		fullEncodeMap.put('g', "aabba");
		fullEncodeMap.put('h', "aabbb");
		fullEncodeMap.put('i', "abaaa");
		fullEncodeMap.put('j', "abaab");
		fullEncodeMap.put('k', "ababa");
		fullEncodeMap.put('l', "ababb");
		fullEncodeMap.put('m', "abbaa");
		fullEncodeMap.put('n', "abbab");
		fullEncodeMap.put('o', "abbba");
		fullEncodeMap.put('p', "abbbb");
		fullEncodeMap.put('q', "baaaa");
		fullEncodeMap.put('r', "baaab");
		fullEncodeMap.put('s', "baaba");
		fullEncodeMap.put('t', "baabb");
		fullEncodeMap.put('u', "babaa");
		fullEncodeMap.put('v', "babab");
		fullEncodeMap.put('w', "babba");
		fullEncodeMap.put('x', "babbb");
		fullEncodeMap.put('y', "bbaaa");
		fullEncodeMap.put('z', "bbaab");
	}

	protected static Map<String, String> latinDecodeMap;
	static {
		latinDecodeMap = new HashMap<>();
		latinDecodeMap.put("aaaaa", "a");
		latinDecodeMap.put("aaaab", "b");
		latinDecodeMap.put("aaaba", "c");
		latinDecodeMap.put("aaabb", "d");
		latinDecodeMap.put("aabaa", "e");
		latinDecodeMap.put("aabab", "f");
		latinDecodeMap.put("aabba", "g");
		latinDecodeMap.put("aabbb", "h");
		latinDecodeMap.put("abaaa", "i");
		latinDecodeMap.put("abaaa", "j");
		latinDecodeMap.put("abaab", "k");
		latinDecodeMap.put("ababa", "l");
		latinDecodeMap.put("ababb", "m");
		latinDecodeMap.put("abbaa", "n");
		latinDecodeMap.put("abbab", "o");
		latinDecodeMap.put("abbba", "p");
		latinDecodeMap.put("abbbb", "q");
		latinDecodeMap.put("baaaa", "r");
		latinDecodeMap.put("baaab", "s");
		latinDecodeMap.put("baaba", "t");
		latinDecodeMap.put("baabb", "u");
		latinDecodeMap.put("baabb", "v");
		latinDecodeMap.put("babaa", "w");
		latinDecodeMap.put("babab", "x");
		latinDecodeMap.put("babba", "y");
		latinDecodeMap.put("babbb", "z");
	}
	
	protected static Map<String, String> fullDecodeMap;
	static {
		fullDecodeMap = new HashMap<>();
		fullDecodeMap.put("aaaaa", "a");
		fullDecodeMap.put("aaaab", "b");
		fullDecodeMap.put("aaaba", "c");
		fullDecodeMap.put("aaabb", "d");
		fullDecodeMap.put("aabaa", "e");
		fullDecodeMap.put("aabab", "f");
		fullDecodeMap.put("aabba", "g");
		fullDecodeMap.put("aabbb", "h");
		fullDecodeMap.put("abaaa", "i");
		fullDecodeMap.put("abaab", "j");
		fullDecodeMap.put("ababa", "k");
		fullDecodeMap.put("ababb", "l");
		fullDecodeMap.put("abbaa", "m");
		fullDecodeMap.put("abbab", "n");
		fullDecodeMap.put("abbba", "o");
		fullDecodeMap.put("abbbb", "p");
		fullDecodeMap.put("baaaa", "q");
		fullDecodeMap.put("baaab", "r");
		fullDecodeMap.put("baaba", "s");
		fullDecodeMap.put("baabb", "t");
		fullDecodeMap.put("babaa", "u");
		fullDecodeMap.put("babab", "v");
		fullDecodeMap.put("babba", "w");
		fullDecodeMap.put("babbb", "x");
		fullDecodeMap.put("bbaaa", "y");
		fullDecodeMap.put("bbaab", "z");
	}

	public static String encodeLatin(String text) {
		text = text.toLowerCase();
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char current = text.charAt(i);
			if (latinEncodeMap.containsKey(current)) {
				ret.append(latinEncodeMap.get(current));
			} else {
				ret.append(String.valueOf(current));
			}
		}
		return ret.toString();
	}

	public static String decodeLatin(String text) {
		text = text.toLowerCase().replace(" ", "");
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < text.length(); i += 5) {
			String current = text.substring(i, i + 5);
			if (latinDecodeMap.containsKey(current)) {
				ret.append(latinDecodeMap.get(current));
			}
		}
		return ret.toString();
	}
	
	public static String encodeFull(String text) {
		text = text.toLowerCase();
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char current = text.charAt(i);
			if (fullEncodeMap.containsKey(current)) {
				ret.append(fullEncodeMap.get(current));
			} else {
				ret.append(String.valueOf(current));
			}
		}
		return ret.toString();
	}

	public static String decodeFull(String text) {
		text = text.toLowerCase().replace(" ", "");
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < text.length(); i += 5) {
			String current = text.substring(i, i + 5);
			if (fullDecodeMap.containsKey(current)) {
				ret.append(fullDecodeMap.get(current));
			}
		}
		return ret.toString();
	}

}

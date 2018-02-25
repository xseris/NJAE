package application.crypto;

import java.util.HashMap;
import java.util.Map;

public class Rot13Utils {

	protected static Map<Character, String> codeMap;
	static {
		codeMap = new HashMap<>();
		codeMap.put('a', "n");
		codeMap.put('b', "o");
		codeMap.put('c', "p");
		codeMap.put('d', "q");
		codeMap.put('e', "r");
		codeMap.put('f', "s");
		codeMap.put('g', "t");
		codeMap.put('h', "u");
		codeMap.put('i', "v");
		codeMap.put('j', "w");
		codeMap.put('k', "x");
		codeMap.put('l', "y");
		codeMap.put('m', "z");
		codeMap.put('n', "a");
		codeMap.put('o', "b");
		codeMap.put('p', "c");
		codeMap.put('q', "d");
		codeMap.put('r', "e");
		codeMap.put('s', "f");
		codeMap.put('t', "g");
		codeMap.put('u', "h");
		codeMap.put('v', "i");
		codeMap.put('w', "j");
		codeMap.put('x', "k");
		codeMap.put('y', "l");
		codeMap.put('z', "m");
		codeMap.put('A', "N");
		codeMap.put('B', "O");
		codeMap.put('C', "P");
		codeMap.put('D', "Q");
		codeMap.put('E', "R");
		codeMap.put('F', "S");
		codeMap.put('G', "T");
		codeMap.put('H', "U");
		codeMap.put('I', "V");
		codeMap.put('J', "W");
		codeMap.put('K', "X");
		codeMap.put('L', "Y");
		codeMap.put('M', "Z");
		codeMap.put('N', "A");
		codeMap.put('O', "B");
		codeMap.put('P', "C");
		codeMap.put('Q', "D");
		codeMap.put('R', "E");
		codeMap.put('S', "F");
		codeMap.put('T', "G");
		codeMap.put('U', "H");
		codeMap.put('V', "I");
		codeMap.put('W', "J");
		codeMap.put('X', "K");
		codeMap.put('Y', "L");
		codeMap.put('Z', "M");
	}

	public static String encodeDecode(String text) {
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char current = text.charAt(i);
			if (codeMap.containsKey(current)) {
				ret.append(codeMap.get(current));
			} else {
				ret.append(String.valueOf(current));
			}
		}
		return ret.toString();
	}

}

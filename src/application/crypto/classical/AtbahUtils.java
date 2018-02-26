package application.crypto.classical;

import java.util.HashMap;
import java.util.Map;

public class AtbahUtils {

	protected static Map<Character, String> codeMap;
	static {
		codeMap = new HashMap<>();
		codeMap.put('a', "i");
		codeMap.put('b', "h");
		codeMap.put('c', "g");
		codeMap.put('d', "f");
		codeMap.put('e', "e");
		codeMap.put('f', "d");
		codeMap.put('g', "c");
		codeMap.put('h', "b");
		codeMap.put('i', "a");
		codeMap.put('j', "r");
		codeMap.put('k', "q");
		codeMap.put('l', "p");
		codeMap.put('m', "o");
		codeMap.put('n', "n");
		codeMap.put('o', "m");
		codeMap.put('p', "l");
		codeMap.put('q', "k");
		codeMap.put('r', "j");
		codeMap.put('s', "z");
		codeMap.put('t', "y");
		codeMap.put('u', "x");
		codeMap.put('v', "w");
		codeMap.put('w', "v");
		codeMap.put('x', "u");
		codeMap.put('y', "t");
		codeMap.put('z', "s");
		codeMap.put('A', "I");
		codeMap.put('B', "H");
		codeMap.put('C', "G");
		codeMap.put('D', "F");
		codeMap.put('E', "E");
		codeMap.put('F', "D");
		codeMap.put('G', "C");
		codeMap.put('H', "B");
		codeMap.put('I', "A");
		codeMap.put('J', "R");
		codeMap.put('K', "Q");
		codeMap.put('L', "P");
		codeMap.put('M', "O");
		codeMap.put('N', "N");
		codeMap.put('O', "M");
		codeMap.put('P', "L");
		codeMap.put('Q', "K");
		codeMap.put('R', "J");
		codeMap.put('S', "Z");
		codeMap.put('T', "Y");
		codeMap.put('U', "X");
		codeMap.put('V', "W");
		codeMap.put('W', "V");
		codeMap.put('X', "U");
		codeMap.put('Y', "T");
		codeMap.put('Z', "S");
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

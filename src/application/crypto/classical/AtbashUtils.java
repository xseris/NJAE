package application.crypto.classical;

import java.util.HashMap;
import java.util.Map;

public class AtbashUtils {

	protected static Map<Character, String> codeMap;
	static {
		codeMap = new HashMap<>();
		codeMap.put('a', "z");
		codeMap.put('b', "y");
		codeMap.put('c', "x");
		codeMap.put('d', "w");
		codeMap.put('e', "v");
		codeMap.put('f', "u");
		codeMap.put('g', "t");
		codeMap.put('h', "s");
		codeMap.put('i', "r");
		codeMap.put('j', "q");
		codeMap.put('k', "p");
		codeMap.put('l', "o");
		codeMap.put('m', "n");
		codeMap.put('n', "m");
		codeMap.put('o', "l");
		codeMap.put('p', "k");
		codeMap.put('q', "j");
		codeMap.put('r', "i");
		codeMap.put('s', "h");
		codeMap.put('t', "g");
		codeMap.put('u', "f");
		codeMap.put('v', "e");
		codeMap.put('w', "d");
		codeMap.put('x', "c");
		codeMap.put('y', "b");
		codeMap.put('z', "a");
		codeMap.put('A', "Z");
		codeMap.put('B', "Y");
		codeMap.put('C', "X");
		codeMap.put('D', "W");
		codeMap.put('E', "V");
		codeMap.put('F', "U");
		codeMap.put('G', "T");
		codeMap.put('H', "S");
		codeMap.put('I', "R");
		codeMap.put('J', "Q");
		codeMap.put('K', "P");
		codeMap.put('L', "O");
		codeMap.put('M', "N");
		codeMap.put('N', "M");
		codeMap.put('O', "L");
		codeMap.put('P', "K");
		codeMap.put('Q', "J");
		codeMap.put('R', "I");
		codeMap.put('S', "H");
		codeMap.put('T', "G");
		codeMap.put('U', "F");
		codeMap.put('V', "E");
		codeMap.put('W', "D");
		codeMap.put('X', "C");
		codeMap.put('Y', "B");
		codeMap.put('Z', "A");
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

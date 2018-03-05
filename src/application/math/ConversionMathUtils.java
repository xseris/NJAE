package application.math;

public class ConversionMathUtils {

	public static String base2To10(String text) {
		return baseAtoB(text, "2", "10");
	}

	public static String base2ToN(String text, String n) {
		return baseAtoB(text, "2", n);
	}

	public static String base10To2(String text) {
		return baseAtoB(text, "10", "2");
	}

	public static String base10ToN(String text, String n) {
		return baseAtoB(text, "10", n);
	}

	public static String baseAtoB(String text, String a, String b) {
		int n1 = Integer.parseInt(a);
		int n2 = Integer.parseInt(b);
		char[] textChars = text.toCharArray();

		if (n2 == 10) {
			int base10 = 0;
			int k = 0;
			for (int i = textChars.length - 1; i >= 0; i--) {
				base10 += Integer.parseInt(String.valueOf(textChars[i])) * (Math.pow(n1, k));
				k++;
			}
			return String.valueOf(base10);
		} else {
			int base10 = 0;
			int k = 0;
			for (int i = textChars.length - 1; i >= 0; i--) {
				base10 += Integer.parseInt(String.valueOf(textChars[i])) * (Math.pow(n1, k));
				k++;
			}
			StringBuilder ret = new StringBuilder();
			while (base10 >= n2) {
				ret.append(base10 % n2);
				base10 = base10 / n2;
			}
			ret.append(base10);
			return ret.reverse().toString();
		}
	}
}

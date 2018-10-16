package application.sequences;

import java.math.BigInteger;

public class PadovanUtils {

	public static String getFormula() {
		return "Padovan(x) = Padovan(x-2) + Padovan(x-3)\n\nwith: Padovan(0) = 1, Padovan(1) = 1 and Padovan(2) = 1";
	}

	public static String getX(int n) {
		if (n == 0) {
			return "Padovan(0) = 1";
		}
		if (n == 1) {
			return "Padovan(1) = 1";
		}
		if (n == 2) {
			return "Padovan(2) = 1";
		} else {
			return "Padovan(" + n + ") = " + String.valueOf(padovan(n - 3, new StringBuilder()));
		}
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		padovan(n - 3, sb);
		return sb.toString();
	}

	public static BigInteger padovan(int n, StringBuilder sb) {
		sb.append("Padovan(0) = 1\nPadovan(1) = 1\nPadovan(2) = 1\nPadovan(3) = 2");
		BigInteger one = BigInteger.valueOf(1);
		BigInteger two = BigInteger.valueOf(2);
		BigInteger three = BigInteger.valueOf(2);

		if (n == 0) {
			return three;
		}

		BigInteger four;
		for (int i = 0; i < n; i++) {
			four = one.add(two);
			one = two;
			two = three;
			three = four;
			sb.append("\nPadovan(" + (i + 4) + ") = " + String.valueOf(two));
		}
		return two;
	}

}

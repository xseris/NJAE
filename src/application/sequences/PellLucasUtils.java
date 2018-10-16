package application.sequences;

import java.math.BigInteger;

public class PellLucasUtils {

	public static String getFormula() {
		return "Pell-Lucas(x) = 2 * Pell-Lucas(x-1) + Pell-Lucas(x-2)\n\nwith: Pell(0) = 2 and Pell(1) = 2";
	}

	public static String getX(int n) {
		if (n == 0) {
			return "Pell-Lucas(0) = 2";
		}
		if (n == 1) {
			return "Pell-Lucas(1) = 2";
		} else {
			return "Pell-Lucas(" + n + ") = " + String.valueOf(pellLucas(n - 2, new StringBuilder()));
		}
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		pellLucas(n - 2, sb);
		return sb.toString();
	}

	public static BigInteger pellLucas(int n, StringBuilder sb) {
		sb.append("Pell-Lucas(0) = 2\nPell-Lucas(1) = 2\nPell-Lucas(2) = 6");
		BigInteger one = BigInteger.valueOf(2);
		BigInteger two = BigInteger.valueOf(6);

		if (n == 0) {
			return two;
		}

		BigInteger three;
		for (int i = 0; i < n; i++) {
			three = one.add(two.multiply(BigInteger.valueOf(2)));
			one = two;
			two = three;
			sb.append("\nPell-Lucas(" + (i + 3) + ") = " + String.valueOf(two));
		}
		return two;
	}

}

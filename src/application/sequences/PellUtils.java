package application.sequences;

import java.math.BigInteger;

public class PellUtils {

	public static String getFormula() {
		return "Pell(x) = 2 * Pell(x-1) + Pell(x-2)\n\nwith: Pell(0) = 0 and Pell(1)=1";
	}

	public static String getX(int n) {
		if (n == 0) {
			return "Pell(0) = 0";
		}
		if (n == 1) {
			return "Pell(1) = 1";
		} else {
			return "Pell(" + n + ") = " + String.valueOf(pell(n - 2, new StringBuilder()));
		}
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		pell(n - 2, sb);
		return sb.toString();
	}

	public static BigInteger pell(int n, StringBuilder sb) {
		sb.append("Pell(0) = 0\nPell(1) = 1\nPell(2) = 2");
		BigInteger one = BigInteger.ONE;
		BigInteger two = BigInteger.valueOf(2);

		if (n == 0) {
			return two;
		}

		BigInteger three;
		for (int i = 0; i < n; i++) {
			three = one.add(two.multiply(BigInteger.valueOf(2)));
			one = two;
			two = three;
			sb.append("\nPell(" + (i + 3) + ") = " + String.valueOf(two));
		}
		return two;
	}

}

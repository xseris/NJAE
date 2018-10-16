package application.sequences;

import java.math.BigInteger;

public class PerrinUtils {

	public static String getFormula() {
		return "Perrin(x) = Perrin(x-2) + Perrin(x-3)\n\nwith: Perrin(0) = 3, Perrin(1) = 0 and Perrin(2) = 2";
	}

	public static String getX(int n) {
		if (n == 0) {
			return "Perrin(0) = 3";
		}
		if (n == 1) {
			return "Perrin(1) = 0";
		}
		if (n == 2) {
			return "Perrin(2) = 2";
		} else {
			return "Perrin(" + n + ") = " + String.valueOf(perrin(n - 3, new StringBuilder()));
		}
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		perrin(n - 3, sb);
		return sb.toString();
	}

	public static BigInteger perrin(int n, StringBuilder sb) {
		sb.append("Perrin(0) = 3\nPerrin(1) = 0\nPerrin(2) = 2\nPerrin(3) = 3");
		BigInteger one = BigInteger.valueOf(2);
		BigInteger two = BigInteger.valueOf(3);
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
			sb.append("\nPerrin(" + (i + 4) + ") = " + String.valueOf(two));
		}
		return two;
	}

}

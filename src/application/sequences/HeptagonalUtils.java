package application.sequences;

import java.math.BigInteger;

public class HeptagonalUtils {

	public static String getFormula() {
		return "Heptagonal(x) = (5 * x^2 - 3 * x) / 2";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Heptagonal(" + n + ") = " + String.valueOf(
				(num.multiply(num).multiply(BigInteger.valueOf(5)).subtract(num.multiply(BigInteger.valueOf(3))))
						.divide(BigInteger.valueOf(2)));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

}

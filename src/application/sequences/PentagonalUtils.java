package application.sequences;

import java.math.BigInteger;

public class PentagonalUtils {

	public static String getFormula() {
		return "Pentagonal(x) = (3 * x^2 - x) / 2";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Pentagonal(" + n + ") = " + String.valueOf(
				(num.multiply(num).multiply(BigInteger.valueOf(3)).subtract(num)).divide(BigInteger.valueOf(2)));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

}

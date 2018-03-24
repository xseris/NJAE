package application.sequences;

import java.math.BigInteger;

public class DecagonalUtils {

	public static String getFormula() {
		return "Decagonal(x) = (4 * x^2) - (3 * x)";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Decagonal(" + n + ") = " + String.valueOf(
				num.multiply(num).multiply(BigInteger.valueOf(4)).subtract(num.multiply(BigInteger.valueOf(3))));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

}

package application.sequences;

import java.math.BigInteger;

public class DodecagonalUtils {

	public static String getFormula() {
		return "Dodecagonal(x) = (5 * x^2) - (4 * x)";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Dodecagonal(" + n + ") = " + String.valueOf(
				num.multiply(num).multiply(BigInteger.valueOf(5)).subtract(num.multiply(BigInteger.valueOf(4))));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

}

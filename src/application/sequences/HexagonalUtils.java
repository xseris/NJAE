package application.sequences;

import java.math.BigInteger;

public class HexagonalUtils {

	public static String getFormula() {
		return "Hexagonal(x) = 2 * x^2 - x";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Hexagonal(" + n + ") = "
				+ String.valueOf(num.multiply(num).multiply(BigInteger.valueOf(2)).subtract(num));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

}

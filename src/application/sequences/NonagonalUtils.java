package application.sequences;

import java.math.BigInteger;

public class NonagonalUtils {

	public static String getFormula() {
		return "Nonagonal(x) = x * (7 * x - 5) / 2";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Nonagonal(" + n + ") = "
				+ String.valueOf(((num.multiply(BigInteger.valueOf(7)).subtract(BigInteger.valueOf(5)))).multiply(num)
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

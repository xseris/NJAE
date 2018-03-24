package application.sequences;

import java.math.BigInteger;

public class CenteredHeptagonalUtils {

	public static String getFormula() {
		return "Centered Heptagonal(x) = ((7 * x^2) - (7 * x) + 2) / 2";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Centered Heptagonal(" + n + ") = "
				+ String.valueOf(((num.multiply(num).multiply(BigInteger.valueOf(7)))
						.subtract((num.multiply(BigInteger.valueOf(7)))).add(BigInteger.valueOf(2)))
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

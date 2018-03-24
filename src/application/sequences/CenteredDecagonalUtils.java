package application.sequences;

import java.math.BigInteger;

public class CenteredDecagonalUtils {

	public static String getFormula() {
		return "Centered Octagonal(x) = 5 * x * (x + 1) + 1";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Centered Octagonal(" + n + ") = " + String
				.valueOf((num.multiply(BigInteger.valueOf(5)).multiply(num.add(BigInteger.ONE))).add(BigInteger.ONE));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

}

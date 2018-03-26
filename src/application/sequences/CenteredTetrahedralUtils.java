package application.sequences;

import java.math.BigInteger;

public class CenteredTetrahedralUtils {

	public static String getFormula() {
		return "Centered Tetrahedral(x) = (2x + 1) * (x^2 + x + 3) / 3";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Centered Tetrahedral(" + n + ") = "
				+ String.valueOf(((num.multiply(BigInteger.valueOf(2))).add(BigInteger.ONE))
						.multiply(((((num.multiply(num)).add(num)).add(BigInteger.valueOf(3)))))
						.divide(BigInteger.valueOf(3)));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

}

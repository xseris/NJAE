package application.sequences;

import java.math.BigInteger;

public class TriangularUtils {

	public static String getFormula() {
		return "Triangular(x) = x * (x + 1) / 2";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Triangular(" + n + ") = "
				+ String.valueOf((num.multiply(num.add(BigInteger.ONE)).divide(BigInteger.valueOf(2))));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

}

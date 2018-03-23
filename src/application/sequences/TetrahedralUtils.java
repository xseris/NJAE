package application.sequences;

import java.math.BigInteger;

public class TetrahedralUtils {

	public static String getFormula() {
		return "Tetrahedral(x) = x * (x+1) * (x+2) / 6";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Tetrahedral(" + n + ") = "
				+ String.valueOf((num.multiply(num.add(BigInteger.ONE)).multiply(num.add(BigInteger.valueOf(2))))
						.divide(BigInteger.valueOf(6)));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

}

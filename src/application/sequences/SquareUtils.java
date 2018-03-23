package application.sequences;

import java.math.BigInteger;

public class SquareUtils {

	public static String getFormula() {
		return "Square(x) = x ^ 2";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Square(" + n + ") = " + String.valueOf(num.multiply(num));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

}

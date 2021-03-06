package application.sequences;

import java.math.BigInteger;

public class CenteredSquareUtils {

	public static String getFormula() {
		return "Centered Square(x) = x^2 + (x - 1)^2";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Centered Square(" + n + ") = " + String.valueOf(
				(num.multiply(num).add((num.subtract(BigInteger.ONE)).multiply(num.subtract(BigInteger.ONE)))));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

}

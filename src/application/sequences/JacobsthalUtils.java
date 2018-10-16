package application.sequences;

import java.math.BigInteger;

public class JacobsthalUtils {

	public static String getFormula() {
		return "Jacobsthal(x) = Jacobsthal(x-1) + 2 * Jacobsthal(x-2)\n\nwith: Jacobsthal(0) = 0 and Jacobsthal(1) = 1";
	}

	public static String getX(int n) {
		if (n == 0) {
			return "Jacobsthal(0) = 0";
		}
		if (n == 1) {
			return "Jacobsthal(1) = 1";
		} else {
			return "Jacobsthal(" + n + ") = " + String.valueOf(jacobsthal(n - 2, new StringBuilder()));
		}
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		jacobsthal(n - 2, sb);
		return sb.toString();
	}

	public static BigInteger jacobsthal(int n, StringBuilder sb) {
		sb.append("Jacobsthal(0) = 0\nJacobsthal(1) = 1\nJacobsthal(2) = 1");
		BigInteger one = BigInteger.ONE;
		BigInteger two = BigInteger.ONE;

		if (n == 0) {
			return two;
		}

		BigInteger three;
		for (int i = 0; i < n; i++) {
			three = one.multiply(BigInteger.valueOf(2)).add(two);
			one = two;
			two = three;
			sb.append("\nJacobsthal(" + (i + 3) + ") = " + String.valueOf(two));
		}
		return two;
	}

}

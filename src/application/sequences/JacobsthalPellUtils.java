package application.sequences;

import java.math.BigInteger;

public class JacobsthalPellUtils {

	public static String getFormula() {
		return "Jacobsthal-Pell(x) = Jacobsthal-Pell(x-1) + 2 * Jacobsthal-Pell(x-2)\n\nwith: Jacobsthal-Pell(0) = 2 and Jacobsthal-Pell(1) = 1";
	}

	public static String getX(int n) {
		if (n == 0) {
			return "Jacobsthal-Pell(0) = 2";
		}
		if (n == 1) {
			return "Jacobsthal-Pell(1) = 1";
		} else {
			return "Jacobsthal-Pell(" + n + ") = " + String.valueOf(jacobsthalPell(n - 2, new StringBuilder()));
		}
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		jacobsthalPell(n - 2, sb);
		return sb.toString();
	}

	public static BigInteger jacobsthalPell(int n, StringBuilder sb) {
		sb.append("Jacobsthal-Pell(0) = 2\nJacobsthal-Pell(1) = 1\nJacobsthal-Pell(2) = 5");
		BigInteger one = BigInteger.valueOf(1);
		BigInteger two = BigInteger.valueOf(5);

		if (n == 0) {
			return two;
		}

		BigInteger three;
		for (int i = 0; i < n; i++) {
			three = one.multiply(BigInteger.valueOf(2)).add(two);
			one = two;
			two = three;
			sb.append("\nJacobsthal-Pell(" + (i + 3) + ") = " + String.valueOf(two));
		}
		return two;
	}

}

package application.sequences;

import java.math.BigInteger;

public class LucasUtils {

	public static String getFormula() {
		return "Lucas(x) = Lucas(x-1) + Lucas(x-2)\n\nwith: Lucas(0) = 2 and Lucas(1)=1";
	}

	public static String getX(int n) {
		if (n == 0) {
			return "Lucas(0) = 2";
		}
		if (n == 1) {
			return "Lucas(1) = 1";
		} else {
			return "Lucas(" + n + ") = " + String.valueOf(lucas(n - 2, new StringBuilder()));
		}
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		lucas(n - 2, sb);
		return sb.toString();
	}

	public static BigInteger lucas(int n, StringBuilder sb) {
		sb.append("Lucas(0) = 2\nLucas(1) = 1\nLucas(2) = 3");
		BigInteger one = BigInteger.ONE;
		BigInteger two = BigInteger.valueOf(3);

		if (n == 0) {
			return two;
		}

		BigInteger three;
		for (int i = 0; i < n; i++) {
			three = one.add(two);
			one = two;
			two = three;
			sb.append("\nLucas(" + (i + 3) + ") = " + String.valueOf(two));
		}
		return two;
	}

}

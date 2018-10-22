package application.sequences;

import java.math.BigInteger;

public class LeonardoUtils {

	public static String getFormula() {
		return "Leonardo(x) = Leonardo(x-1) + Leonardo(x-2) + 1\n\nwith: Leonardo(0) = 1 and Leonardo(1) = 1";
	}

	public static String getX(int n) {
		if (n == 0) {
			return "Leonardo(0) = 1";
		}
		if (n == 1) {
			return "Leonardo(1) = 1";
		} else {
			return "Leonardo(" + n + ") = " + String.valueOf(lucas(n - 2, new StringBuilder()));
		}
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		lucas(n - 2, sb);
		return sb.toString();
	}

	public static BigInteger lucas(int n, StringBuilder sb) {
		sb.append("Leonardo(0) = 1\nLeonardo(1) = 1\nLeonardo(2) = 3");
		BigInteger one = BigInteger.ONE;
		BigInteger two = BigInteger.valueOf(3);

		if (n == 0) {
			return two;
		}

		BigInteger three;
		for (int i = 0; i < n; i++) {
			three = one.add(two).add(BigInteger.ONE);
			one = two;
			two = three;
			sb.append("\nLeonardo(" + (i + 3) + ") = " + String.valueOf(two));
		}
		return two;
	}

}

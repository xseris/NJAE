package application.sequences;

import java.math.BigInteger;

public class FibonacciUtils {

	public static String getFormula() {
		return "Fib(x) = Fib(x-1) + Fib(x-2)\n\nwith: Fib(0) = 0 and Fib(1)=1";
	}

	public static String getX(int n) {
		if (n == 0) {
			return "Fib(0) = 0";
		}
		if (n == 1) {
			return "Fib(1) = 1";
		} else {
			return "Fib(" + n + ") = " + String.valueOf(fib(n - 2, new StringBuilder()));
		}
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		fib(n - 2, sb);
		return sb.toString();
	}

	public static BigInteger fib(int n, StringBuilder sb) {
		sb.append("Fib(0) = 0\nFib(1) = 1\nFib(2) = 1");
		BigInteger one = BigInteger.ONE;
		BigInteger two = BigInteger.ONE;

		if (n == 0) {
			return two;
		}

		BigInteger three;
		for (int i = 0; i < n; i++) {
			three = one.add(two);
			one = two;
			two = three;
			sb.append("\nFib(" + (i + 3) + ") = " + String.valueOf(two));
		}
		return two;
	}

}

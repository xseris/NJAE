package application.sequences;

import java.math.BigInteger;

public class OddUtils {

	public static String getFormula() {
		return "Odd(x) = (x * 2) - 1\nor\n Odd(x) = Odd(x-1) + 2\nwith Odd(1) = 1";
	}

	public static String getX(int n) {
		return "Odd(" + n + ") = "
				+ String.valueOf((BigInteger.valueOf(n).multiply(BigInteger.valueOf(2))).subtract(BigInteger.ONE));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

}

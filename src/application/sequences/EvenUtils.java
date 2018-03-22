package application.sequences;

import java.math.BigInteger;

public class EvenUtils {

	public static String getFormula() {
		return "Even(x) = x * 2\nor\n Even(x) = Even(x-1) + 2\nwith Even(1) = 2";
	}

	public static String getX(int n) {
		return "Even(" + n + ") = " + String.valueOf(BigInteger.valueOf(n).multiply(BigInteger.valueOf(2)));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

}

package application.math;

import java.math.BigDecimal;
import java.math.BigInteger;

public class RowMathUtils {

	public static String sumLines(String text) {
		BigInteger ret = BigInteger.ZERO;
		String[] lines = text.split("\n");
		for (String line : lines) {
			BigInteger num = new BigInteger(line);
			ret = ret.add(num);
		}
		return String.valueOf(ret);
	}

	public static String multiplyLines(String text) {
		BigInteger ret = BigInteger.ONE;
		String[] lines = text.split("\n");
		for (String line : lines) {
			BigInteger num = new BigInteger(line);
			ret = ret.multiply(num);
		}
		return String.valueOf(ret);
	}

	public static String averageLines(String text) {
		BigDecimal ret = BigDecimal.ZERO;
		double tot = 0;
		String[] lines = text.split("\n");
		for (String line : lines) {
			tot++;
			BigDecimal num = new BigDecimal(line);
			ret = ret.add(num);
		}
		return String.valueOf(ret.divide(BigDecimal.valueOf(tot)));
	}

	public static String maxOfLines(String text) {
		String[] lines = text.split("\n");
		BigInteger ret = new BigInteger(lines[0]);
		for (String line : lines) {
			BigInteger num = new BigInteger(line);
			if (ret.compareTo(num) < 0) {
				ret = num;
			}
		}
		return String.valueOf(ret);
	}

	public static String minOfLines(String text) {
		String[] lines = text.split("\n");
		BigInteger ret = new BigInteger(lines[0]);
		for (String line : lines) {
			BigInteger num = new BigInteger(line);
			if (ret.compareTo(num) > 0) {
				ret = num;
			}
		}
		return String.valueOf(ret);
	}

}

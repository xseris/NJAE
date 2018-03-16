package application.math;

import java.math.BigInteger;

public class MathUtils {

	public static BigInteger mcd(BigInteger a, BigInteger b) {
		if (b.compareTo(BigInteger.ZERO) == 0)
			return a;
		else
			return mcd(b, a.mod(b));
	}

	public static BigInteger mcm(BigInteger a, BigInteger b) {
		return (a.multiply(b).divide(mcd(a, b)));
	}

}

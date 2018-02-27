package error;

public class CryptoErrors {

	public static final String AFFINE_NOT_RELATIVELY_PRIME = "'a' is not relatively prime to 26. Please choose one of the followings: 1,3,5,7,9,11,15,17,19,21,23,25";
	public static final String AFFINE_A_TOO_HIGH = "'a' is too high. Should be less than 26";
	public static final String AFFINE_B_TOO_HIGH = "'b' is too high. Should be less than 26";
	public static final String AFFINE_A_TOO_LOW = "'a' is too low. Should be greater than 0";
	public static final String AFFINE_B_TOO_LOW = "'b' is too low. Should be greater than 0";

}

package application.hash;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Sha1Utils {

	public static String generate(String text) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		MessageDigest msdDigest = MessageDigest.getInstance("SHA-1");
		msdDigest.update(text.getBytes("UTF-8"), 0, text.length());
		return DatatypeConverter.printHexBinary(msdDigest.digest());
	}

}

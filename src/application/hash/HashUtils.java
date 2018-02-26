package application.hash;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class HashUtils {

	public static String generateSha1(String text) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		MessageDigest msdDigest = MessageDigest.getInstance("SHA-1");
		msdDigest.update(text.getBytes("UTF-8"), 0, text.length());
		return DatatypeConverter.printHexBinary(msdDigest.digest());
	}

	public static String generateSha256(String text) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		MessageDigest msdDigest = MessageDigest.getInstance("SHA-256");
		msdDigest.update(text.getBytes("UTF-8"), 0, text.length());
		return DatatypeConverter.printHexBinary(msdDigest.digest());
	}
	
	public static String generateSha512(String text) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		MessageDigest msdDigest = MessageDigest.getInstance("SHA-512");
		msdDigest.update(text.getBytes("UTF-8"), 0, text.length());
		return DatatypeConverter.printHexBinary(msdDigest.digest());
	}

	public static String generateMd5(String text) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		MessageDigest msdDigest = MessageDigest.getInstance("MD5");
		msdDigest.update(text.getBytes("UTF-8"), 0, text.length());
		return DatatypeConverter.printHexBinary(msdDigest.digest());
	}

}

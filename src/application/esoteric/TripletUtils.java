package application.esoteric;

public class TripletUtils {

	public static String interpret(String text) {
		return BrainfuckUtils.interpret(toBrainfuck(text));
	}

	public static String toBrainfuck(String text) {
		return text.replace("010", ".").replace("101", ",").replace("100", "<").replace("001", ">").replace("110", "[")
				.replace("011", "]").replace("111", "+").replace("000", "-").replaceAll(" ", "");
	}

	public static String helloWorld() {
		return "001 111 111 111 111 111 111 111 111 111 110 100 111 111 111 111 111 111 111 111 001 000 011 100\n"
				+ "010 001 111 111 111 111 111 111 111 110 100 111 111 111 111 001 000 011 100 111 010 111 111 111\n"
				+ "111 111 111 111 010 010 111 111 111 010 001 001 001 111 111 111 111 111 111 111 111 110 100 111\n"
				+ "111 111 111 001 000 011 100 010 001 001 001 111 111 111 111 111 111 111 111 111 111 110 100 111\n"
				+ "111 111 111 111 111 111 111 111 001 000 011 100 000 000 000 010 100 100 100 100 010 111 111 111\n"
				+ "010 000 000 000 000 000 000 010 000 000 000 000 000 000 000 000 010 001 001 111 010";
	}

}

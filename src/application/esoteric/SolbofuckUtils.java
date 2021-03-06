package application.esoteric;

public class SolbofuckUtils {

	public static String interpret(String text) {
		return BrainfuckUtils.interpret(toBrainfuck(text));
	}

	public static String toBrainfuck(String text) {
		return text.replace("ROCK SOLBO", "").replace("BWEEEEEEEEE", "]").replace("BWEEEEEEEE", "[")
				.replace("BWEEEEEEE", ",").replace("BWEEEEEE", ".").replace("BWEEEEE", "-").replace("BWEEEE", "+")
				.replace("BWEEE", "<").replace("BWEE", ">").replaceAll(" ", "");
	}

	public static String helloWorld() {
		return "ROCK SOLBO\n"
				+ "BWEEEE BWEEEE BWEEEE BWEEEE BWEEEE BWEEEE BWEEEE BWEEEE BWEEEEEEEE BWEE BWEEEE BWEEEE BWEEEE BWEEEE  BWEEEEEEEE BWEE BWEEEE BWEEEE BWEE BWEEEE BWEEEE BWEEEE BWEE BWEEEE BWEEEE BWEEEE BWEE BWEEEE BWEEE BWEEE  BWEEE BWEEE BWEEEEE BWEEEEEEEEE BWEE BWEEEE BWEE BWEEEE BWEE BWEEEEE BWEE BWEE BWEEEE BWEEEEEEEE BWEEE  BWEEEEEEEEE BWEEE BWEEEEE BWEEEEEEEEE BWEE BWEE BWEEEEEE BWEE BWEEEEE BWEEEEE BWEEEEE BWEEEEEE BWEEEE BWEEEE  BWEEEE BWEEEE BWEEEE BWEEEE BWEEEE BWEEEEEE BWEEEEEE BWEEEE BWEEEE BWEEEE BWEEEEEE BWEE BWEE  BWEEEEEE BWEEE BWEEEEE BWEEEEEE BWEEE BWEEEEEE BWEEEE BWEEEE BWEEEE BWEEEEEE BWEEEEE BWEEEEE BWEEEEE BWEEEEE  BWEEEEE BWEEEEE BWEEEEEE BWEEEEE BWEEEEE BWEEEEE BWEEEEE BWEEEEE BWEEEEE BWEEEEE BWEEEEE BWEEEEEE  BWEE BWEE BWEEEE BWEEEEEE BWEE BWEEEE BWEEEE BWEEEEEE\n"
				+ "";
	}

}

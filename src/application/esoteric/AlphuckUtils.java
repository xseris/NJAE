package application.esoteric;

public class AlphuckUtils {

	public static String interpret(String text) {
		return BrainfuckUtils.interpret(toBrainfuck(text));
	}

	public static String toBrainfuck(String text) {
		return text.replace("j", ".").replace("o", ",").replace("c", "<").replace("a", ">").replace("p", "[")
				.replace("s", "]").replace("e", "+").replace("i", "-");
	}

	public static String helloWorld() {
		return "iiciccepepceaiiiaiaiaicccsascciijceeeeeejccijjccjcejaajaajcccjeeejaajaaijcccej";
	}

}

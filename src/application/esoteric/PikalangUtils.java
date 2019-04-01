package application.esoteric;

public class PikalangUtils {

	public static String interpret(String text) {
		return BrainfuckUtils.interpret(toBrainfuck(text));
	}

	public static String toBrainfuck(String text) {
		return text.replace("pikachu", ".").replace("pikapi", ",").replace("pichu", "<").replace("pipi", ">")
				.replace("pika", "[").replace("chu", "]").replace("pi", "+").replace("ka", "-");
	}

	public static String helloWorld() {
		return "pi pi pi pi pi pi pi pi pi pi pika pipi pi pi pi pi pi pi pi pipi pi pi\n"
				+ "pi pi pi pi pi pi pi pi pipi pi pi pi pipi pi pichu pichu pichu pichu ka\n"
				+ "chu pipi pi pi pikachu pipi pi pikachu pi pi pi pi pi pi pi pikachu\n"
				+ "pikachu pi pi pi pikachu pipi pi pi pikachu pichu pichu pi pi pi pi pi\n"
				+ "pi pi pi pi pi pi pi pi pi pi pikachu pipi pikachu pi pi pi pikachu ka\n"
				+ "ka ka ka ka ka pikachu ka ka ka ka ka ka ka ka pikachu pipi pi pikachu\n" + "pipi pikachu";
	}

}

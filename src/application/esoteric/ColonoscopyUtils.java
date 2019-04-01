package application.esoteric;

public class ColonoscopyUtils {

	public static String interpret(String text) {
		return BrainfuckUtils.interpret(toBrainfuck(text));
	}

	public static String toBrainfuck(String text) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < text.length() - 1; i++) {
			if (text.charAt(i + 1) == ';' && (text.charAt(i) == '{' || text.charAt(i) == '}')) {
				sb.append(text.charAt(i) + " ");
				i += 1;
			} else {
				sb.append(text.charAt(i));
			}
		}
		text = sb.toString();
		return text.replace(";;;}", ".").replace(";;;{", ",").replace(";;{", "-").replace(";;}", "+").replace(";{", "<")
				.replace(";}", ">").replace("{{", "[").replace("}}", "]");
	}

	public static String helloWorld() {
		return ";;};;;};;;};;;};;;};;;};;;};;;};{{;;};;;};;;};;;};;;};{{;;};;;};;;};;};;;};;;};;;};;};;;};;;};;;};;};;;};;{;;{;;{;;{;;;{;}};;};;;};;};;;};;};;;{;;};;};;;};{{;;{;}};;{;;;{;}};;};;};;;;};;};;;{;;;{;;;{;;;;};;;};;;};;;};;;};;;};;;};;;};;;;};;;;};;;};;;};;;};;;;};;};;};;;;};;{;;;{;;;;};;{;;;;};;;};;;};;;};;;;};;;{;;;{;;;{;;;{;;;{;;;{;;;;};;;{;;;{;;;{;;;{;;;{;;;{;;;{;;;{;;;;};;};;};;;};;;;};;};;;};;;};;;;};";
	}

}

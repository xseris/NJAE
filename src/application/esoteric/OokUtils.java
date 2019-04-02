package application.esoteric;

public class OokUtils {

	public static String interpret(String text) {
		return BrainfuckUtils.interpret(toBrainfuck(text));
	}

	public static String toBrainfuck(String text) {
		StringBuilder sb = new StringBuilder();
		text = text.replaceAll("\n", "").replaceAll(" ", "");
		for (int i = 0; i < text.length(); i += 8) {
			if (text.substring(i, i + 8).equalsIgnoreCase("Ook.Ook?")) {
				sb.append('>');
			} else if (text.substring(i, i + 8).equalsIgnoreCase("Ook?Ook.")) {
				sb.append('<');
			} else if (text.substring(i, i + 8).equalsIgnoreCase("Ook.Ook.")) {
				sb.append('+');
			} else if (text.substring(i, i + 8).equalsIgnoreCase("Ook!Ook!")) {
				sb.append('-');
			} else if (text.substring(i, i + 8).equalsIgnoreCase("Ook!Ook.")) {
				sb.append('.');
			} else if (text.substring(i, i + 8).equalsIgnoreCase("Ook.Ook!")) {
				sb.append(',');
			} else if (text.substring(i, i + 8).equalsIgnoreCase("Ook!Ook?")) {
				sb.append('[');
			} else if (text.substring(i, i + 8).equalsIgnoreCase("Ook?Ook!")) {
				sb.append(']');
			}
		}
		return sb.toString();
	}

	public static String helloWorld() {
		return "Ook. Ook? Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook.\n"
				+ "Ook. Ook. Ook. Ook. Ook! Ook? Ook? Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook.\n"
				+ "Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook? Ook! Ook! Ook? Ook! Ook? Ook.\n"
				+ "Ook! Ook. Ook. Ook? Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook.\n"
				+ "Ook. Ook. Ook! Ook? Ook? Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook?\n"
				+ "Ook! Ook! Ook? Ook! Ook? Ook. Ook. Ook. Ook! Ook. Ook. Ook. Ook. Ook. Ook. Ook.\n"
				+ "Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook! Ook. Ook! Ook. Ook. Ook. Ook. Ook.\n"
				+ "Ook. Ook. Ook! Ook. Ook. Ook? Ook. Ook? Ook. Ook? Ook. Ook. Ook. Ook. Ook. Ook.\n"
				+ "Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook! Ook? Ook? Ook. Ook. Ook.\n"
				+ "Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook? Ook! Ook! Ook? Ook! Ook? Ook. Ook! Ook.\n"
				+ "Ook. Ook? Ook. Ook? Ook. Ook? Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook.\n"
				+ "Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook! Ook? Ook? Ook. Ook. Ook.\n"
				+ "Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook. Ook.\n"
				+ "Ook. Ook? Ook! Ook! Ook? Ook! Ook? Ook. Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook.\n"
				+ "Ook? Ook. Ook? Ook. Ook? Ook. Ook? Ook. Ook! Ook. Ook. Ook. Ook. Ook. Ook. Ook.\n"
				+ "Ook! Ook. Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook.\n"
				+ "Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook! Ook!\n"
				+ "Ook! Ook. Ook. Ook? Ook. Ook? Ook. Ook. Ook! Ook.";
	}

}

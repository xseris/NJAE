package application.esoteric;

public class BlubUtils {

	public static String interpret(String text) {
		return BrainfuckUtils.interpret(toBrainfuck(text));
	}

	public static String toBrainfuck(String text) {
		StringBuilder sb = new StringBuilder();
		text = text.replaceAll("\n", "").replaceAll(" ", "");
		for (int i = 0; i < text.length(); i += 10) {
			if (text.substring(i, i + 10).equalsIgnoreCase("Blub.Blub?")) {
				sb.append('>');
			} else if (text.substring(i, i + 10).equalsIgnoreCase("Blub?Blub.")) {
				sb.append('<');
			} else if (text.substring(i, i + 10).equalsIgnoreCase("Blub.Blub.")) {
				sb.append('+');
			} else if (text.substring(i, i + 10).equalsIgnoreCase("Blub!Blub!")) {
				sb.append('-');
			} else if (text.substring(i, i + 10).equalsIgnoreCase("Blub!Blub.")) {
				sb.append('.');
			} else if (text.substring(i, i + 10).equalsIgnoreCase("Blub.Blub!")) {
				sb.append(',');
			} else if (text.substring(i, i + 10).equalsIgnoreCase("Blub!Blub?")) {
				sb.append('[');
			} else if (text.substring(i, i + 10).equalsIgnoreCase("Blub?Blub!")) {
				sb.append(']');
			}
		}
		return sb.toString();
	}

	public static String helloWorld() {
		return "blub. blub? blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub! blub?\n"
				+ "blub? blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub? blub! blub!\n"
				+ "blub? blub! blub? blub. blub! blub. blub. blub? blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub.\n"
				+ "blub! blub? blub? blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub? blub! blub! blub? blub! blub? blub. blub. blub.\n"
				+ "blub! blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub! blub. blub! blub. blub. blub.\n"
				+ "blub. blub. blub. blub. blub! blub. blub. blub? blub. blub? blub. blub? blub. blub. blub. blub. blub. blub. blub. blub. blub. blub.\n"
				+ "blub. blub. blub. blub. blub. blub. blub! blub? blub? blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub? blub! blub!\n"
				+ "blub? blub! blub? blub. blub! blub. blub. blub? blub. blub? blub. blub? blub. blub. blub. blub. blub. blub. blub. blub. blub. blub.\n"
				+ "blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub! blub? blub? blub. blub. blub. blub. blub. blub. blub. blub. blub.\n"
				+ "blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub. blub? blub! blub! blub? blub! blub? blub. blub! blub! blub! blub!\n"
				+ "blub! blub! blub! blub. blub? blub. blub? blub. blub? blub. blub? blub. blub! blub. blub. blub. blub. blub. blub. blub. blub! blub.\n"
				+ "blub! blub! blub! blub! blub! blub! blub! blub! blub! blub! blub! blub! blub! blub. blub! blub! blub! blub! blub! blub! blub! blub!\n"
				+ "blub! blub! blub! blub! blub! blub! blub! blub! blub! blub. blub. blub? blub. blub? blub. blub. blub! blub.";
	}

}

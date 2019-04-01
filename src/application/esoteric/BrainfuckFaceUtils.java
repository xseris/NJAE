package application.esoteric;

public class BrainfuckFaceUtils {

	public static String interpret(String text) {
		return Brainfuck3Utils.interpret(toBrainfuck3(text));
	}

	public static String toBrainfuck3(String text) {
		return text.replace("(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*", "<").replace("ᕦ( ͡°ヮ ͡°)ᕥ", ">").replace("ᕦ( ͡° ͜ʖ ͡°)ᕥ", "^")
				.replace("( ͡°╭͜ʖ╮ ͡°) ", "v").replace("ᕙ( ͡° ͜ʖ ͡°)ᕗ", ",").replace("(♥ ͜ʖ♥)", ".")
				.replace("( ͡° ͜ʖ ͡°)", "+").replace("(> ͜ʖ<)", "-").replace("ಠ_ಠ", "x").replace("( ͡°(", "[")
				.replace(") ͡°)", "]");
	}

	public static String helloWorld() {
		return "( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡°( ᕦ( ͡°ヮ ͡°)ᕥ( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡°( ᕦ( ͡°ヮ ͡°)ᕥ( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)ᕦ( ͡°ヮ ͡°)ᕥ( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)ᕦ( ͡°ヮ ͡°)ᕥ( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)ᕦ( ͡°ヮ ͡°)ᕥ( ͡° ͜ʖ ͡°)(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*(> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) ) ͡°) ᕦ( ͡°ヮ ͡°)ᕥ( ͡° ͜ʖ ͡°)ᕦ( ͡°ヮ ͡°)ᕥ( ͡° ͜ʖ ͡°)ᕦ( ͡°ヮ ͡°)ᕥ(> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) ᕦ( ͡°ヮ ͡°)ᕥᕦ( ͡°ヮ ͡°)ᕥ( ͡° ͜ʖ ͡°)( ͡°( (∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) ͡°) (∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*(> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) ) ͡°) ᕦ( ͡°ヮ ͡°)ᕥᕦ( ͡°ヮ ͡°)ᕥ(♥ ͜ʖ♥) ᕦ( ͡°ヮ ͡°)ᕥ(> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (♥ ͜ʖ♥) ( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)(♥ ͜ʖ♥) (♥ ͜ʖ♥) ( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)(♥ ͜ʖ♥) ᕦ( ͡°ヮ ͡°)ᕥᕦ( ͡°ヮ ͡°)ᕥ(♥ ͜ʖ♥) (∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*(> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (♥ ͜ʖ♥) (∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*(♥ ͜ʖ♥) ( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)(♥ ͜ʖ♥) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (♥ ͜ʖ♥) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (> ͜ʖ(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ.*) (♥ ͜ʖ♥) ᕦ( ͡°ヮ ͡°)ᕥᕦ( ͡°ヮ ͡°)ᕥ( ͡° ͜ʖ ͡°)(♥ ͜ʖ♥) ᕦ( ͡°ヮ ͡°)ᕥ( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)(♥ ͜ʖ♥) ";
	}

}

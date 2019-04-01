package application.builder.toolbars;

import application.builder.buttons.EncodingButtons;
import application.builder.choiceboxes.EncodingChoices;
import application.builder.fields.EncodingFields;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;

public class EncodingToolbars {
	public static ToolBar encodingToolBar = new ToolBar(EncodingButtons.encBase32, EncodingButtons.decBase32,
			EncodingButtons.encBase64, EncodingButtons.decBase64, EncodingButtons.encBase91, EncodingButtons.decBase91);
	public static ToolBar morseToolBar = new ToolBar(EncodingButtons.encMorse, EncodingButtons.decMorse,
			new Label("Dot char:"), EncodingFields.dot, new Label("Line char:"), EncodingFields.line);
	public static ToolBar asciiToToolBar = new ToolBar(new Label("Ascii to:"), EncodingButtons.asciiToBinary,
			EncodingButtons.asciiToHex);
	public static ToolBar hexToToolBar = new ToolBar(new Label("Hex to:"), EncodingButtons.hexToAscii,
			EncodingButtons.hexToBinary);
	public static ToolBar binaryToToolBar = new ToolBar(new Label("Binary to:"), EncodingButtons.binaryToAscii,
			EncodingButtons.binaryToHex);

	public static ToolBar keyboardToolBar = new ToolBar(new Label("From:"), EncodingChoices.leftQwerty,
			new Label("To:"), EncodingChoices.rightQwerty, EncodingButtons.convertKeyboard);

	public static void init() {
		encodingToolBar.setId("encoding");
		morseToolBar.setId("morse");
		asciiToToolBar.setId("ascii");
		hexToToolBar.setId("hex");
		binaryToToolBar.setId("binary");
	}

}

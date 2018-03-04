package application.builder.toolbars;

import application.builder.buttons.EncodingButtons;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;

public class EncodingToolbars {
	public static ToolBar encodingToolBar = new ToolBar(EncodingButtons.encBase64, EncodingButtons.decBase64);
	public static ToolBar asciiToToolBar = new ToolBar(new Label("Ascii to:"), EncodingButtons.asciiToBinary,
			EncodingButtons.asciiToHex);
	public static ToolBar hexToToolBar = new ToolBar(new Label("Hex to:"), EncodingButtons.hexToAscii,
			EncodingButtons.hexToBinary);
	public static ToolBar binaryToToolBar = new ToolBar(new Label("Binary to:"), EncodingButtons.binaryToAscii,
			EncodingButtons.binaryToHex);

}

package application.builder.buttons;

import java.util.Base64;

import application.builder.texareas.TextAreas;
import application.conversion.AsciiToUtils;
import application.conversion.BinaryToUtils;
import application.conversion.HexToUtils;
import application.history.DashboardHistoryUtils;
import javafx.scene.control.Button;

public class EncodingButtons {

	public static Button encBase64 = new Button("Encode Base 64");
	public static Button decBase64 = new Button("Decode Base 64");

	public static Button asciiToBinary = new Button("Binary");
	public static Button asciiToHex = new Button("Hex");

	public static Button hexToAscii = new Button("Ascii");
	public static Button hexToBinary = new Button("Binary");

	public static Button binaryToAscii = new Button("Ascii");
	public static Button binaryToHex = new Button("Hex");

	public static void init() {
		encBase64.setOnAction(action -> {
			TextAreas.textArea.setText(Base64.getEncoder().encodeToString(TextAreas.textArea.getText().getBytes()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		decBase64.setOnAction(action -> {
			TextAreas.textArea.setText(new String(Base64.getDecoder().decode(TextAreas.textArea.getText().getBytes())));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		asciiToBinary.setOnAction(action -> {
			TextAreas.textArea.setText(AsciiToUtils.toBinary(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		asciiToHex.setOnAction(action -> {
			TextAreas.textArea.setText(AsciiToUtils.toHex(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		hexToAscii.setOnAction(action -> {
			TextAreas.textArea.setText(HexToUtils.toAscii(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		hexToBinary.setOnAction(action -> {
			TextAreas.textArea.setText(HexToUtils.toBinary(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		binaryToAscii.setOnAction(action -> {
			TextAreas.textArea.setText(BinaryToUtils.toAscii(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		binaryToHex.setOnAction(action -> {
			TextAreas.textArea.setText(BinaryToUtils.toHex(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
	}

}

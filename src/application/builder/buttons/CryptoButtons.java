package application.builder.buttons;

import application.builder.texareas.TextAreas;
import application.crypto.Rot135Utils;
import application.crypto.Rot13Utils;
import application.crypto.Rot47Utils;
import application.crypto.Rot5Utils;
import application.crypto.classical.AlbamUtils;
import application.crypto.classical.AtbahUtils;
import application.crypto.classical.AtbashUtils;
import application.crypto.classical.CaesarUtils;
import application.history.DashboardHistoryUtils;
import javafx.scene.control.Button;

public class CryptoButtons {

	public static Button encodeCaesar = new Button("Encode");
	public static Button decodeCaesar = new Button("Decode");
	public static Button bruteForceCaesar = new Button("Brute force");
	public static Button encodeAlbam = new Button("Encode");
	public static Button decodeAlbam = new Button("Decode");
	public static Button encodeAtbah = new Button("Encode");
	public static Button decodeAtbah = new Button("Decode");
	public static Button encodeAtbash = new Button("Encode");
	public static Button decodeAtbash = new Button("Decode");
	public static Button encodeRot5 = new Button("Encode");
	public static Button decodeRot5 = new Button("Decode");
	public static Button encodeRot13 = new Button("Encode");
	public static Button decodeRot13 = new Button("Decode");
	public static Button encodeRot135 = new Button("Encode");
	public static Button decodeRot135 = new Button("Decode");
	public static Button encodeRot47 = new Button("Encode");
	public static Button decodeRot47 = new Button("Decode");
	public static Button encodeAffine = new Button("Encode");
	public static Button decodeAffine = new Button("Decode");
	public static Button bruteForceAffine = new Button("Brute force");

	public static void init() {
		encodeCaesar.setOnAction(action -> {
			TextAreas.textArea.setText(CaesarUtils.encode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		decodeCaesar.setOnAction(action -> {
			TextAreas.textArea.setText(CaesarUtils.decode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		bruteForceCaesar.setOnAction(action -> {
			TextAreas.textArea.setText(CaesarUtils.bruteForce(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		encodeAtbash.setOnAction(action -> {
			TextAreas.textArea.setText(AtbashUtils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		decodeAtbash.setOnAction(action -> {
			TextAreas.textArea.setText(AtbashUtils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		encodeAlbam.setOnAction(action -> {
			TextAreas.textArea.setText(AlbamUtils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		decodeAlbam.setOnAction(action -> {
			TextAreas.textArea.setText(AlbamUtils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		encodeAtbah.setOnAction(action -> {
			TextAreas.textArea.setText(AtbahUtils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		decodeAtbah.setOnAction(action -> {
			TextAreas.textArea.setText(AtbahUtils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		encodeRot13.setOnAction(action -> {
			TextAreas.textArea.setText(Rot13Utils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		decodeRot13.setOnAction(action -> {
			TextAreas.textArea.setText(Rot13Utils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		encodeRot5.setOnAction(action -> {
			TextAreas.textArea.setText(Rot5Utils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		decodeRot5.setOnAction(action -> {
			TextAreas.textArea.setText(Rot5Utils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		encodeRot135.setOnAction(action -> {
			TextAreas.textArea.setText(Rot135Utils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		decodeRot135.setOnAction(action -> {
			TextAreas.textArea.setText(Rot135Utils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		encodeRot47.setOnAction(action -> {
			TextAreas.textArea.setText(Rot47Utils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		decodeRot47.setOnAction(action -> {
			TextAreas.textArea.setText(Rot47Utils.encodeDecode(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

	}

}

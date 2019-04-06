package application.builder.buttons;

import application.builder.texareas.TextAreas;
import application.crypto.steganography.BaconianUtils;
import application.crypto.steganography.TextStegoUtils;
import application.history.DashboardHistoryUtils;
import javafx.scene.control.Button;

public class StegoButtons {
	public static Button encodeLatinBaconian = new Button("Encode");
	public static Button decodeLatinBaconian = new Button("Decode");
	public static Button encodeFullBaconian = new Button("Encode");
	public static Button decodeFullBaconian = new Button("Decode");
	
	public static Button firstCharEachWord = new Button("First of words");
	public static Button firstCharEachParagraph = new Button("First of paragraphs");
	public static Button firstCharEachPhrase = new Button("First of phrases");
	
	public static Button firstWordEachParagraph = new Button("First of paragraphs");
	public static Button firstWordEachPhrase = new Button("First of phrases");
	
	public static Button capitals = new Button("Capitals");
	public static Button lowers = new Button("Lowers");

	public static void init() {
		encodeFullBaconian.setOnAction(action -> {
			TextAreas.textArea.setText(BaconianUtils.encodeFull(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		decodeFullBaconian.setOnAction(action -> {
			TextAreas.textArea.setText(BaconianUtils.decodeFull(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		encodeLatinBaconian.setOnAction(action -> {
			TextAreas.textArea.setText(BaconianUtils.encodeLatin(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		decodeLatinBaconian.setOnAction(action -> {
			TextAreas.textArea.setText(BaconianUtils.decodeLatin(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		
		firstCharEachWord.setOnAction(action -> {
			TextAreas.textArea.setText(TextStegoUtils.firstCharEachWord(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		
		firstCharEachParagraph.setOnAction(action -> {
			TextAreas.textArea.setText(TextStegoUtils.firstCharEachParagraph(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		
		firstCharEachPhrase.setOnAction(action -> {
			TextAreas.textArea.setText(TextStegoUtils.firstCharEachPhrase(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		
		firstWordEachParagraph.setOnAction(action -> {
			TextAreas.textArea.setText(TextStegoUtils.firstWordEachParagraph(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		
		firstWordEachPhrase.setOnAction(action -> {
			TextAreas.textArea.setText(TextStegoUtils.firstWordEachPhrase(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		
		capitals.setOnAction(action -> {
			TextAreas.textArea.setText(TextStegoUtils.capitals(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		
		lowers.setOnAction(action -> {
			TextAreas.textArea.setText(TextStegoUtils.lowers(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
	}
}

package application.builder.buttons;

import application.builder.texareas.TextAreas;
import application.history.DashboardHistoryUtils;
import application.math.RowMathUtils;
import javafx.scene.control.Button;

public class MathButtons {
	public static Button sumLines = new Button("Sum Lines");
	public static Button multiplyLines = new Button("Multiply Lines");
	public static Button averageLines = new Button("Average Lines");
	public static Button maxOfLines = new Button("Max of Lines");
	public static Button minOfLines = new Button("Min of Lines");
	public static Button mcdOfLines = new Button("Mcd of Lines");
	public static Button mcmOfLines = new Button("Mcm of Lines");

	public static Button base2To10 = new Button("To 10");
	public static Button base2ToN = new Button("To n");
	public static Button base10To2 = new Button("To 2");
	public static Button base10ToN = new Button("To n");
	public static Button baseAToB = new Button("Convert");

	public static void init() {
		sumLines.setOnAction(action -> {
			TextAreas.textArea.setText(RowMathUtils.sumLines(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		multiplyLines.setOnAction(action -> {
			TextAreas.textArea.setText(RowMathUtils.multiplyLines(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		averageLines.setOnAction(action -> {
			TextAreas.textArea.setText(RowMathUtils.averageLines(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		maxOfLines.setOnAction(action -> {
			TextAreas.textArea.setText(RowMathUtils.maxOfLines(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		minOfLines.setOnAction(action -> {
			TextAreas.textArea.setText(RowMathUtils.minOfLines(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		mcdOfLines.setOnAction(action -> {
			TextAreas.textArea.setText(RowMathUtils.mcdOfLines(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		mcmOfLines.setOnAction(action -> {
			TextAreas.textArea.setText(RowMathUtils.mcmOfLines(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
	}
}

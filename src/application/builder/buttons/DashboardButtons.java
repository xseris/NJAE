package application.builder.buttons;

import application.builder.fields.DashboardFields;
import application.builder.texareas.TextAreas;
import application.dashboard.ArrangingUtils;
import application.dashboard.FilteringUtils;
import application.dashboard.NotationUtils;
import application.history.DashboardHistoryUtils;
import javafx.scene.control.Button;

public class DashboardButtons {
	public static Button clean = new Button("Clean Dashboard");
	public static Button removeSpaces = new Button("Remove Spaces");

	public static Button toLowerCase = new Button("Lower Case");
	public static Button toUpperCase = new Button("Upper Case");
	public static Button capitalization = new Button("Capitalization");
	public static Button camelCase = new Button("Camel Case");
	public static Button snakeCase = new Button("Snake Case");
	public static Button kebabCase = new Button("Kebab Case");

	public static Button grep = new Button("Filter");
	public static Button replace = new Button("Replace");
	public static Button unique = new Button("Unique lines");
	public static Button sortAsc = new Button("Ascending");
	public static Button sortDesc = new Button("Descending");

	public static Button truncateLength = new Button("By Lenght");
	public static Button truncateWords = new Button("By Words");
	public static Button truncateLines = new Button("By Lines");

	public static Button reverseText = new Button("Text");
	public static Button reverseWords = new Button("Words");
	public static Button reverseLines = new Button("Lines");

	public static Button dashboardUndo = new Button("Undo");
	public static Button dashboardRedo = new Button("Redo");

	public static void init() {
		clean.setOnAction(action -> {
			TextAreas.textArea.setText("");
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		removeSpaces.setOnAction(action -> {
			TextAreas.textArea.setText(TextAreas.textArea.getText().replaceAll("\n", "").replaceAll(" ", ""));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		toLowerCase.setOnAction(action -> {
			TextAreas.textArea.setText(NotationUtils.toLowerCase(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		toUpperCase.setOnAction(action -> {
			TextAreas.textArea.setText(NotationUtils.toUpperCase(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		capitalization.setOnAction(action -> {
			TextAreas.textArea.setText(NotationUtils.capitalization(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		camelCase.setOnAction(action -> {
			TextAreas.textArea.setText(NotationUtils.toCamelCase(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		snakeCase.setOnAction(action -> {
			TextAreas.textArea.setText(NotationUtils.toSnakeCase(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		kebabCase.setOnAction(action -> {
			TextAreas.textArea.setText(NotationUtils.toKebabCase(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		grep.setOnAction(action -> {
			TextAreas.textArea
					.setText(FilteringUtils.grep(TextAreas.textArea.getText(), DashboardFields.searchField.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		replace.setOnAction(action -> {
			TextAreas.textArea.setText(FilteringUtils.replace(TextAreas.textArea.getText(),
					DashboardFields.replaceField1.getText(), DashboardFields.replaceField2.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		unique.setOnAction(action -> {
			TextAreas.textArea.setText(FilteringUtils.unique(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		sortAsc.setOnAction(action -> {
			TextAreas.textArea.setText(FilteringUtils.sortAsc(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		sortDesc.setOnAction(action -> {
			TextAreas.textArea.setText(FilteringUtils.sortDesc(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		truncateLength.setOnAction(action -> {
			TextAreas.textArea.setText(ArrangingUtils.truncateByLength(TextAreas.textArea.getText(),
					Integer.parseInt(DashboardFields.truncateField.getText())));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		truncateWords.setOnAction(action -> {
			TextAreas.textArea.setText(ArrangingUtils.truncateByWords(TextAreas.textArea.getText(),
					Integer.parseInt(DashboardFields.truncateField.getText())));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		truncateLines.setOnAction(action -> {
			TextAreas.textArea.setText(ArrangingUtils.truncateByLines(TextAreas.textArea.getText(),
					Integer.parseInt(DashboardFields.truncateField.getText())));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		reverseText.setOnAction(action -> {
			TextAreas.textArea.setText(ArrangingUtils.reverseText(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		reverseWords.setOnAction(action -> {
			TextAreas.textArea.setText(ArrangingUtils.reverseWords(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		reverseLines.setOnAction(action -> {
			TextAreas.textArea.setText(ArrangingUtils.reverseLines(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		dashboardUndo.setOnAction(action -> DashboardHistoryUtils.undoDashboardHistroy());
		dashboardRedo.setOnAction(action -> DashboardHistoryUtils.redoDashboardHistroy());
	}
}

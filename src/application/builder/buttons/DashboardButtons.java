package application.builder.buttons;

import application.builder.fields.DashboardFields;
import application.builder.texareas.TextAreas;
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

		dashboardUndo.setOnAction(action -> DashboardHistoryUtils.undoDashboardHistroy());
		dashboardRedo.setOnAction(action -> DashboardHistoryUtils.redoDashboardHistroy());
	}
}

package application.builder.toolbars;

import application.builder.buttons.DashboardButtons;
import application.builder.fields.DashboardFields;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;

public class DashboardToolbars {

	public static ToolBar dashboardToolBar = new ToolBar(new Label("Dashboard:"), DashboardButtons.clean,
			DashboardButtons.removeSpaces, new Separator(), new Label("History:"), DashboardButtons.dashboardUndo,
			DashboardButtons.dashboardRedo);

	public static ToolBar notationsToolBar = new ToolBar(new Label("Notations:"), DashboardButtons.toLowerCase,
			DashboardButtons.toUpperCase, DashboardButtons.capitalization, DashboardButtons.camelCase,
			DashboardButtons.snakeCase, DashboardButtons.kebabCase);

	public static ToolBar filteringToolBar = new ToolBar(new Label("Text filtering: "), DashboardFields.searchField,
			DashboardButtons.grep, new Separator(), new Label("Replace: "), DashboardFields.replaceField1,
			new Label("with: "), DashboardFields.replaceField2, DashboardButtons.replace, new Separator(),
			DashboardButtons.unique, new Separator(), new Label("Sort:"), DashboardButtons.sortAsc,
			DashboardButtons.sortDesc);

	public static ToolBar arrangingToolBar = new ToolBar(new Label("Truncate: "), DashboardFields.truncateField,
			DashboardButtons.truncateLength, DashboardButtons.truncateWords, DashboardButtons.truncateLines,
			new Separator(), new Label("Reverse: "), DashboardButtons.reverseWords, DashboardButtons.reverseText,
			DashboardButtons.reverseLines);

	public static void init() {
		dashboardToolBar.setId("dashboard");
		notationsToolBar.setId("notations");
		filteringToolBar.setId("filtering");
		arrangingToolBar.setId("arranging");
	}

}

package application.builder.toolbars;

import application.builder.buttons.DashboardButtons;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;

public class DashboardToolbars {

	public static ToolBar dashboardToolBar = new ToolBar(new Label("Dashboard:"), DashboardButtons.clean);

	public static ToolBar notationsToolBar = new ToolBar(new Label("Notations:"), DashboardButtons.toLowerCase,
			DashboardButtons.toUpperCase, DashboardButtons.capitalization, DashboardButtons.camelCase,
			DashboardButtons.snakeCase, DashboardButtons.kebabCase);

}

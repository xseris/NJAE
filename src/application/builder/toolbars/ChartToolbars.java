package application.builder.toolbars;

import application.builder.buttons.ChartButtons;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;

public class ChartToolbars {
	public static ToolBar frequenciesToolBar = new ToolBar(new Label("Frequency Charts:"), ChartButtons.unigramChart,
			ChartButtons.bigramChart, ChartButtons.wordChart);

	public static ToolBar imageHistogramsToolBar = new ToolBar(new Label("Histograms:"), ChartButtons.redHistogram,
			ChartButtons.greenHistogram, ChartButtons.blueHistogram, ChartButtons.fullHistogram);
}

package application.builder.buttons;

import application.builder.tabs.Tabs;
import application.builder.texareas.TextAreas;
import application.frequency.FrequencyUtils;
import application.graph.ImageChartUtils;
import javafx.scene.control.Button;

public class ChartButtons {

	public static Button unigramChart = new Button("Show unigram chart");
	public static Button bigramChart = new Button("Show bigram chart");
	public static Button wordChart = new Button("Show word chart");

	public static Button redHistogram = new Button("Red");
	public static Button greenHistogram = new Button("Green");
	public static Button blueHistogram = new Button("Blue");
	public static Button fullHistogram = new Button("Full");

	public static void init() {
		unigramChart.setOnAction(action -> {
			Tabs.chartTab.setContent(FrequencyUtils.unigrams(TextAreas.textArea.getText()));
		});
		bigramChart.setOnAction(action -> {
			Tabs.chartTab.setContent(FrequencyUtils.bigrams(TextAreas.textArea.getText()));
		});
		wordChart.setOnAction(action -> {
			Tabs.chartTab.setContent(FrequencyUtils.words(TextAreas.textArea.getText()));
		});
		redHistogram.setOnAction(action -> {
			Tabs.chartTab.setContent(ImageChartUtils.redHistogram(Tabs.imageTab.getContent()));
		});
		greenHistogram.setOnAction(action -> {
			Tabs.chartTab.setContent(ImageChartUtils.greenHistogram(Tabs.imageTab.getContent()));
		});
		blueHistogram.setOnAction(action -> {
			Tabs.chartTab.setContent(ImageChartUtils.blueHistogram(Tabs.imageTab.getContent()));
		});
		fullHistogram.setOnAction(action -> {
			Tabs.chartTab.setContent(ImageChartUtils.fullHistogram(Tabs.imageTab.getContent()));
		});
	}

}

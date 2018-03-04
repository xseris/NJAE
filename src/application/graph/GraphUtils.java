package application.graph;

import java.util.Map;
import java.util.Map.Entry;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class GraphUtils {

	public static BarChart generateUnigramBarChart(Map<Character, Integer> data) {
		CategoryAxis xAxis = new CategoryAxis();
		NumberAxis yAxis = new NumberAxis();
		BarChart bc = new BarChart(xAxis, yAxis);
		bc.setTitle("Unigram frequency analysis");
		xAxis.setLabel("Unigram");
		yAxis.setLabel("Count");

		XYChart.Series<String, Integer> series1 = new XYChart.Series<>();
		series1.setName("Count");
		for (Entry<Character, Integer> entry : data.entrySet()) {
			series1.getData().add(new XYChart.Data(String.valueOf(entry.getKey()), entry.getValue()));
		}

		bc.getData().add(series1);
		bc.autosize();
		return bc;
	}

	public static BarChart generateBigramBarChart(Map<String, Integer> data) {
		CategoryAxis xAxis = new CategoryAxis();
		NumberAxis yAxis = new NumberAxis();
		BarChart bc = new BarChart(xAxis, yAxis);
		bc.setTitle("Bigram frequency analysis");
		xAxis.setLabel("Bigram");
		yAxis.setLabel("Count");

		XYChart.Series<String, Integer> series1 = new XYChart.Series<>();
		series1.setName("Count");
		for (Entry<String, Integer> entry : data.entrySet()) {
			series1.getData().add(new XYChart.Data(String.valueOf(entry.getKey()), entry.getValue()));
		}

		bc.getData().add(series1);
		return bc;
	}
	
	public static BarChart generateWordBarChart(Map<String, Integer> data) {
		CategoryAxis xAxis = new CategoryAxis();
		NumberAxis yAxis = new NumberAxis();
		BarChart bc = new BarChart(xAxis, yAxis);
		bc.setTitle("Words frequency analysis");
		xAxis.setLabel("Words");
		yAxis.setLabel("Count");

		XYChart.Series<String, Integer> series1 = new XYChart.Series<>();
		series1.setName("Count");
		for (Entry<String, Integer> entry : data.entrySet()) {
			series1.getData().add(new XYChart.Data(String.valueOf(entry.getKey()), entry.getValue()));
		}

		bc.getData().add(series1);
		return bc;
	}
}

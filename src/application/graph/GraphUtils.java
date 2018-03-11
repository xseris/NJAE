package application.graph;

import java.util.Map;
import java.util.Map.Entry;

import javafx.collections.ObservableList;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.paint.Color;

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

	public static BarChart generateHistogramBarChart(Map<Integer, Integer> data, String name) {
		CategoryAxis xAxis = new CategoryAxis();
		NumberAxis yAxis = new NumberAxis();
		BarChart bc = new BarChart(xAxis, yAxis);
		bc.setTitle(name + " Histohram");
		xAxis.setLabel("Value");
		yAxis.setLabel("Count");

		XYChart.Series<String, Integer> series1 = new XYChart.Series<>();
		series1.setName("Count");
		for (Entry<Integer, Integer> entry : data.entrySet()) {
			series1.getData().add(new XYChart.Data(String.valueOf(entry.getKey()), entry.getValue()));
		}

		bc.getData().add(series1);
		bc.autosize();
		if (name.equals("Green")) {
			bc.lookupAll(".default-color0.chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: green;"));
		} else if (name.equals("Blue")) {
			bc.lookupAll(".default-color0.chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: blue;"));
		}
		return bc;
	}

	public static BarChart generateFullHistogramBarChart(Map<Integer, Integer> redData, Map<Integer, Integer> greenData,
			Map<Integer, Integer> blueData) {
		CategoryAxis xAxis = new CategoryAxis();
		NumberAxis yAxis = new NumberAxis();
		BarChart bc = new BarChart(xAxis, yAxis);
		bc.setTitle("Full Histohram");
		xAxis.setLabel("Value");
		yAxis.setLabel("Count");

		XYChart.Series<String, Integer> reds = new XYChart.Series<>();
		reds.setName("Red");
		for (Entry<Integer, Integer> entry : redData.entrySet()) {
			reds.getData().add(new XYChart.Data(String.valueOf(entry.getKey()), entry.getValue()));
		}

		XYChart.Series<String, Integer> greens = new XYChart.Series<>();
		reds.setName("Green");
		for (Entry<Integer, Integer> entry : redData.entrySet()) {
			greens.getData().add(new XYChart.Data(String.valueOf(entry.getKey()), entry.getValue()));
		}

		XYChart.Series<String, Integer> blues = new XYChart.Series<>();
		reds.setName("Blue");
		for (Entry<Integer, Integer> entry : blueData.entrySet()) {
			blues.getData().add(new XYChart.Data(String.valueOf(entry.getKey()), entry.getValue()));
		}

		bc.getData().addAll(reds, greens, blues);
		bc.autosize();
		bc.lookupAll(".default-color1.chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: green;"));
		bc.lookupAll(".default-color2.chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: blue;"));
		return bc;
	}
}

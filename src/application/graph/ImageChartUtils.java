package application.graph;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ImageChartUtils {

	public static BarChart redHistogram(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image sourceImage = imageView.getImage();

		Map<Integer, Integer> data = new HashMap<>();

		PixelReader pr = sourceImage.getPixelReader();
		int width = (int) sourceImage.getWidth();
		int height = (int) sourceImage.getHeight();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Color col = pr.getColor(x, y);
				int red = (int) (col.getRed() * 256);
				if (red > 0 && red < 255) {
					if (!data.containsKey(red)) {
						data.put(red, 0);
					}
					data.put(red, data.get(red) + 1);
				}
			}
		}

		return GraphUtils.generateHistogramBarChart(data, "Red");

	}

	public static BarChart greenHistogram(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image sourceImage = imageView.getImage();

		Map<Integer, Integer> data = new HashMap<>();

		PixelReader pr = sourceImage.getPixelReader();
		int width = (int) sourceImage.getWidth();
		int height = (int) sourceImage.getHeight();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Color col = pr.getColor(x, y);
				int green = (int) (col.getGreen() * 256);
				if (green > 0 && green < 255) {
					if (!data.containsKey(green)) {
						data.put(green, 0);
					}
					data.put(green, data.get(green) + 1);
				}
			}
		}

		return GraphUtils.generateHistogramBarChart(data, "Green");

	}

	public static BarChart blueHistogram(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image sourceImage = imageView.getImage();

		Map<Integer, Integer> data = new HashMap<>();

		PixelReader pr = sourceImage.getPixelReader();
		int width = (int) sourceImage.getWidth();
		int height = (int) sourceImage.getHeight();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Color col = pr.getColor(x, y);
				int blue = (int) (col.getBlue() * 256);
				if (blue > 0 && blue < 255) {
					if (!data.containsKey(blue)) {
						data.put(blue, 0);
					}
					data.put(blue, data.get(blue) + 1);
				}
			}
		}

		return GraphUtils.generateHistogramBarChart(data, "Blue");

	}

	public static BarChart fullHistogram(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image sourceImage = imageView.getImage();

		Map<Integer, Integer> redData = new HashMap<>();
		Map<Integer, Integer> greenData = new HashMap<>();
		Map<Integer, Integer> blueData = new HashMap<>();

		PixelReader pr = sourceImage.getPixelReader();
		int width = (int) sourceImage.getWidth();
		int height = (int) sourceImage.getHeight();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Color col = pr.getColor(x, y);
				int red = (int) (col.getRed() * 256);
				int green = (int) (col.getGreen() * 256);
				int blue = (int) (col.getBlue() * 256);
				if (red > 0 && red < 255) {
					if (!redData.containsKey(red)) {
						redData.put(red, 0);
					}
					redData.put(red, redData.get(red) + 1);
				}
				if (green > 0 && green < 255) {
					if (!greenData.containsKey(green)) {
						greenData.put(green, 0);
					}
					greenData.put(green, greenData.get(green) + 1);
				}
				if (blue > 0 && blue < 255) {
					if (!blueData.containsKey(blue)) {
						blueData.put(blue, 0);
					}
					blueData.put(blue, blueData.get(blue) + 1);
				}
			}
		}

		return GraphUtils.generateFullHistogramBarChart(redData, greenData, blueData);
	}

}

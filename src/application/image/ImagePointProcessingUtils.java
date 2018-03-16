package application.image;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ImagePointProcessingUtils {

	public static void emphatize(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image sourceImage = imageView.getImage();

		PixelReader pr = sourceImage.getPixelReader();
		int width = (int) sourceImage.getWidth();
		int height = (int) sourceImage.getHeight();
		WritableImage result = new WritableImage(width, height);
		PixelWriter pw = result.getPixelWriter();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Color col = pr.getColor(x, y);
				double red = col.getRed();
				double green = col.getGreen();
				double blue = col.getBlue();
				if (red != 0) {
					red = 1;
				}
				if (green != 0) {
					green = 1;
				}
				if (blue != 0) {
					blue = 1;
				}
				pw.setColor(x, y, new Color(red, green, blue, 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void negative(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image sourceImage = imageView.getImage();

		PixelReader pr = sourceImage.getPixelReader();
		int width = (int) sourceImage.getWidth();
		int height = (int) sourceImage.getHeight();
		WritableImage result = new WritableImage(width, height);
		PixelWriter pw = result.getPixelWriter();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Color col = pr.getColor(x, y);
				pw.setColor(x, y, new Color(1 - col.getRed(), 1 - col.getGreen(), 1 - col.getBlue(), 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void thresholding(Node container, double threshold) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image sourceImage = imageView.getImage();

		PixelReader pr = sourceImage.getPixelReader();
		int width = (int) sourceImage.getWidth();
		int height = (int) sourceImage.getHeight();
		WritableImage result = new WritableImage(width, height);
		PixelWriter pw = result.getPixelWriter();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Color col = pr.getColor(x, y);
				double r = col.getRed() >= threshold ? 1 : 0;
				double g = col.getGreen() >= threshold ? 1 : 0;
				double b = col.getBlue() >= threshold ? 1 : 0;
				pw.setColor(x, y, new Color(r, g, b, 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void logTransformation(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image sourceImage = imageView.getImage();

		PixelReader pr = sourceImage.getPixelReader();
		int width = (int) sourceImage.getWidth();
		int height = (int) sourceImage.getHeight();
		WritableImage result = new WritableImage(width, height);
		PixelWriter pw = result.getPixelWriter();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Color col = pr.getColor(x, y);
				double r = Math.log(1 + col.getRed());
				double g = Math.log(1 + col.getGreen());
				double b = Math.log(1 + col.getBlue());
				pw.setColor(x, y, new Color(r, g, b, 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void powTransformation(Node container, double pow) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image sourceImage = imageView.getImage();

		PixelReader pr = sourceImage.getPixelReader();
		int width = (int) sourceImage.getWidth();
		int height = (int) sourceImage.getHeight();
		WritableImage result = new WritableImage(width, height);
		PixelWriter pw = result.getPixelWriter();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Color col = pr.getColor(x, y);
				double r = Math.pow(col.getRed(), pow);
				double g = Math.pow(col.getGreen(), pow);
				double b = Math.pow(col.getBlue(), pow);
				pw.setColor(x, y, new Color(r, g, b, 1.0));
			}
		}
		imageView.setImage(result);
	}

}

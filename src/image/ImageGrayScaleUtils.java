package image;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ImageGrayScaleUtils {

	public static void toAverage(Node container) {
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
				double newColor = (col.getGreen() + col.getGreen() + col.getGreen()) / 3;
				pw.setColor(x, y, new Color(newColor, newColor, newColor, 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void toLuminescence(Node container) {
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
				double newColor = (col.getGreen() * 0.3 + col.getGreen() * 0.59 + col.getGreen() * 0.11);
				pw.setColor(x, y, new Color(newColor, newColor, newColor, 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void toDesaturation(Node container) {
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
				double newColor = (Math.max(Math.max(col.getBlue(), col.getRed()), col.getGreen())
						+ Math.min(Math.min(col.getBlue(), col.getRed()), col.getGreen())) / 2;
				pw.setColor(x, y, new Color(newColor, newColor, newColor, 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void toDecompositionMin(Node container) {
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
				double newColor = Math.min(Math.min(col.getBlue(), col.getRed()), col.getGreen());
				pw.setColor(x, y, new Color(newColor, newColor, newColor, 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void toDecompositionMax(Node container) {
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
				double newColor = Math.max(Math.max(col.getBlue(), col.getRed()), col.getGreen());
				pw.setColor(x, y, new Color(newColor, newColor, newColor, 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void toSingleRed(Node container) {
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
				double newColor = col.getRed();
				pw.setColor(x, y, new Color(newColor, newColor, newColor, 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void toSingleGreen(Node container) {
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
				double newColor = col.getGreen();
				pw.setColor(x, y, new Color(newColor, newColor, newColor, 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void toSingleBlue(Node container) {
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
				double newColor = col.getBlue();
				pw.setColor(x, y, new Color(newColor, newColor, newColor, 1.0));
			}
		}
		imageView.setImage(result);
	}

}

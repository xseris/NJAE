package application.image;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ImageChannelsUtils {

	public static void getRedChannel(Node container) {
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
				pw.setColor(x, y, new Color(col.getRed(), 0, 0, 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void getGreenChannel(Node container) {
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
				pw.setColor(x, y, new Color(0, col.getGreen(), 0, 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void getBlueChannel(Node container) {
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
				pw.setColor(x, y, new Color(0, 0, col.getBlue(), 1.0));
			}
		}
		imageView.setImage(result);
	}

}

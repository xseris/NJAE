package application.image;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ImageLinearFilterUtils {

	public static void rectangular(Node container, int size) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image sourceImage = imageView.getImage();

		int div = size * size;

		PixelReader pr = sourceImage.getPixelReader();
		int width = (int) sourceImage.getWidth();
		int height = (int) sourceImage.getHeight();
		WritableImage result = new WritableImage(width, height);
		PixelWriter pw = result.getPixelWriter();
		for (int x = size / 2; x < width - size / 2; x++) {
			for (int y = size / 2; y < height - size / 2; y++) {
				double r = 0;
				double g = 0;
				double b = 0;
				for (int j = x - size / 2; j < x + size / 2; j++) {
					for (int k = y - size / 2; k < y + size / 2; k++) {
						Color col = pr.getColor(j, k);
						r += col.getRed() / div;
						g += col.getGreen() / div;
						b += col.getBlue() / div;
					}
				}
				pw.setColor(x, y, new Color(r, g, b, 1.0));
			}
		}
		imageView.setImage(result);
	}

	public static void circular(Node container, int radius) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image sourceImage = imageView.getImage();

		int div = (radius * radius) - 4;

		PixelReader pr = sourceImage.getPixelReader();
		int width = (int) sourceImage.getWidth();
		int height = (int) sourceImage.getHeight();
		WritableImage result = new WritableImage(width, height);
		PixelWriter pw = result.getPixelWriter();
		for (int x = radius / 2; x < width - radius / 2; x++) {
			for (int y = radius / 2; y < height - radius / 2; y++) {
				double r = 0;
				double g = 0;
				double b = 0;
				for (int j = x - radius / 2; j < x + radius / 2; j++) {
					for (int k = y - radius / 2; k < y + radius / 2; k++) {
						if ((j != x - radius / 2 && k != y - radius / 2)
								&& (j != x - radius / 2 && k != y + radius / 2 - 1)
								&& (j != x + radius / 2 - 1 && k != y - radius / 2)
								&& (j != x + radius / 2 - 1 && k != y + radius / 2 - 1)) {
							Color col = pr.getColor(j, k);
							r += col.getRed() / div;
							g += col.getGreen() / div;
							b += col.getBlue() / div;
						}
					}
				}
				pw.setColor(x, y, new Color(r, g, b, 1.0));
			}
		}
		imageView.setImage(result);
	}

}

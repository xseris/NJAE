package application.image;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ImageYCbCrBT601Utils {

	private static final double wr = 0.299;
	private static final double wg = 0.587;
	private static final double wb = 0.114;

	public static void getYBT601(Node container) {
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
				double yy = wr * col.getRed() + wg * col.getGreen() + wb * col.getBlue();
				double r = yy;
				double g = yy;
				double b = yy;
				pw.setColor(x, y, new Color(r, g, b, 1.0));
			}
		}

		imageView.setImage(result);
	}

	public static void getCbBT601(Node container) {
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
				double uu = -0.169 * col.getRed() - 0.331 * col.getGreen() + 0.500 * col.getBlue();

				double r = 0;
				double g = -0.344 * uu;
				double b = 1.773 * uu;
				if (b < 0) {
					b = 0;
				}
				if (b > 1) {
					b = 1;
				}
				if (g < 0) {
					g = 0;
				}
				if (g > 1) {
					g = 1;
				}
				pw.setColor(x, y, new Color(r, g, b, 0.5));
			}
		}

		imageView.setImage(result);
	}

	public static void getCrBT601(Node container) {
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
				double vv = 0.500 * col.getRed() - 0.419 * col.getGreen() - 0.081 * col.getBlue();
				double r = 1.403 * vv;
				double g = -0.714 * vv;
				double b = 0;
				if (g < 0) {
					g = 0;
				}
				if (g > 1) {
					g = 1;
				}
				if (r < 0) {
					r = 0;
				}
				if (r > 1) {
					r = 1;
				}
				pw.setColor(x, y, new Color(r, g, b, 0.5));
			}
		}

		imageView.setImage(result);
	}

}

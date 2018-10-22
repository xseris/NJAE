package application.image;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ImageAsciiArtUtils {

	public static String toAsciiArt(Node container) {

		StringBuilder sb = new StringBuilder();
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image sourceImage = imageView.getImage();

		PixelReader pr = sourceImage.getPixelReader();
		int width = (int) sourceImage.getWidth();
		int height = (int) sourceImage.getHeight();
		for (int y = 0; y < height; y += 4) {
			for (int x = 0; x < width; x += 3) {
				Color col = pr.getColor(x, y);
				double gray = (col.getGreen() * 0.3 + col.getGreen() * 0.59 + col.getGreen() * 0.11);
				if (gray < 0.1) {
					sb.append("   ");
				} else if (gray < 0.3) {
					sb.append("...");
				} else if (gray < 0.4) {
					sb.append(",,,");
				} else if (gray < 0.5) {
					sb.append("///");
				} else if (gray < 0.7) {
					sb.append(":::");
				} else if (gray < 0.85) {
					sb.append("|||");
				} else {
					sb.append("***");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}

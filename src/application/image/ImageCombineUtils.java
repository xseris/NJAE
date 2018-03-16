package application.image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class ImageCombineUtils {

	public static void subtract(Node container) throws FileNotFoundException {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image originalImage = imageView.getImage();

		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Image to subtract");
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"));
		File selectedFile = fileChooser.showOpenDialog(null);

		FileInputStream toSubtract = new FileInputStream(selectedFile.getPath());
		Image toSub = new Image(toSubtract);

		PixelReader prOriginal = originalImage.getPixelReader();
		PixelReader prToSub = toSub.getPixelReader();

		int width = (int) originalImage.getWidth();
		int height = (int) originalImage.getHeight();
		WritableImage result = new WritableImage(width, height);
		PixelWriter pw = result.getPixelWriter();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Color col1 = prOriginal.getColor(x, y);
				Color col2 = prToSub.getColor(x, y);
				pw.setColor(x, y, new Color(Math.abs(col1.getRed() - col2.getRed()),
						Math.abs(col1.getGreen() - col2.getGreen()), Math.abs(col1.getBlue() - col2.getBlue()), 1.0));
			}
		}
		imageView.setImage(result);
	}

}

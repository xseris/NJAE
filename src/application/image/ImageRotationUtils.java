package application.image;

import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class ImageRotationUtils {

	public static void rotate90Left(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		imageView.setRotate(imageView.getRotate() - 90);
	}

	public static void rotate90Right(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		imageView.setRotate(imageView.getRotate() + 90);
	}

	public static void rotate180(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		imageView.setRotate(imageView.getRotate() + 180);
	}

	public static void rotateCustom(Node container, String rotation) {
		int degrees = Integer.parseInt(rotation);
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		imageView.setRotate(imageView.getRotate() + degrees);
	}

}

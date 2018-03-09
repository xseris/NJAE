package application.image;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class ImageInfoUtils {

	public static HBox generateInfo(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image sourceImage = imageView.getImage();

		HBox ret = new HBox();
		VBox sizeInfo = generateFileInfo(sourceImage);
		ret.getChildren().add(sizeInfo);

		return ret;
	}

	private static VBox generateFileInfo(Image img) {
		VBox ret = new VBox();
		ret.setPadding(new Insets(10, 0, 0, 10));
		ret.setSpacing(10);
		ret.getChildren().add(new Label("Size info"));
		ret.getChildren().add(new Separator());
		ret.getChildren().add(new Label("Size:\t\t" + (int) img.getWidth() + "x" + (int) img.getHeight()));
		ret.getChildren().add(new Label("Width:\t\t" + (int) img.getWidth()));
		ret.getChildren().add(new Label("Height:\t\t" + (int) img.getHeight()));
		return ret;
	}

}

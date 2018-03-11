package application.image;

import java.io.File;

import application.current.CurrentFiles;
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
		ret.setSpacing(20);
		VBox sizeInfo = generateImageInfo(sourceImage);
		VBox fileInfo = generateFileInfo();
		ret.getChildren().addAll(fileInfo, sizeInfo);

		return ret;
	}

	private static VBox generateFileInfo() {
		File file = CurrentFiles.currentImage;
		VBox ret = new VBox();
		ret.setPadding(new Insets(10, 0, 0, 10));
		ret.setSpacing(10);
		ret.getChildren().add(new Label("File info"));
		ret.getChildren().add(new Separator());
		ret.getChildren().add(new Label("Name:\t\t" + file.getName()));
		ret.getChildren().add(new Label("Path:\t\t" + file.getPath()));
		ret.getChildren().add(new Label("Size:\t\t\t" + file.length() + " bytes"));
		ret.getChildren().add(new Label("\t\t\t" + file.length() / 1024 + " Kbytes"));
		ret.getChildren().add(new Label("\t\t\t" + file.length() / 1024 / 1024 + " Mbytes"));
		return ret;
	}

	private static VBox generateImageInfo(Image img) {
		VBox ret = new VBox();
		ret.setPadding(new Insets(10, 0, 0, 10));
		ret.setSpacing(10);
		ret.getChildren().add(new Label("Size info"));
		ret.getChildren().add(new Separator());
		ret.getChildren().add(new Label("Size:\t\t\t" + (int) img.getWidth() + "x" + (int) img.getHeight()));
		ret.getChildren().add(new Label("Width:\t\t" + (int) img.getWidth()));
		ret.getChildren().add(new Label("Height:\t\t" + (int) img.getHeight()));
		ret.getChildren().add(new Label("Pixels:\t\t" + (int) img.getHeight() * img.getWidth()));
		return ret;
	}

}

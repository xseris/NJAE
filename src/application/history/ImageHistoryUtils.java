package application.history;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class ImageHistoryUtils {

	static ImageHistory imageHistory = new ImageHistory();

	public static void updateImageHistroy(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		Image im = imageView.getImage();
		ImageHistory newHistory = new ImageHistory();
		newHistory.setPrev(imageHistory);
		newHistory.setCurrent(im);
		imageHistory = newHistory;
	}

	public static void undoImageHistroy(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);
		imageView.setImage(imageHistory.getPrev().getCurrent());
		imageHistory.getPrev().setNext(imageHistory);
		imageHistory = imageHistory.getPrev();
	}

	public static void redoImageHistroy(Node container) {
		Pane contentPane = (Pane) container;
		ImageView imageView = (ImageView) contentPane.getChildren().get(0);

		imageView.setImage(imageHistory.getNext().getCurrent());
		imageHistory = imageHistory.getNext();
	}

}

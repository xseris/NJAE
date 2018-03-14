package application.builder.buttons;

import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;

public class FileToolbars {

	public static ToolBar filesToolBar = new ToolBar(new Label("File:"), FileButtons.openFile, FileButtons.preloadFile,
			FileButtons.saveToFile);

	public static void init() {
		filesToolBar.setId("files");
	}
}

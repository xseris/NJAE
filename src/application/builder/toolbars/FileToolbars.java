package application.builder.toolbars;

import application.builder.buttons.FileButtons;
import application.builder.fields.FileFields;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;

public class FileToolbars {

	public static ToolBar filesToolBar = new ToolBar(new Label("File:"), FileButtons.openFile, FileButtons.preloadFile,
			FileButtons.saveToFile);

	public static ToolBar samplingToolBar = new ToolBar(new Label("Sampling: "), FileFields.samplingSize,
			new Label(" lines"), FileButtons.head, FileButtons.tail, FileButtons.random);

	public static void init() {
		filesToolBar.setId("files");
		samplingToolBar.setId("sampling");
	}
}

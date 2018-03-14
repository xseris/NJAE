package application.builder.buttons;

import application.builder.texareas.TextAreas;
import application.files.FileUtils;
import application.history.DashboardHistoryUtils;
import javafx.scene.control.Button;

public class FileButtons {
	public static Button openFile = new Button("Open file");
	public static Button preloadFile = new Button("Preload file");
	public static Button saveToFile = new Button("Save to file");

	public static void init() {

		openFile.setOnAction(action -> {
			TextAreas.textArea.setText(FileUtils.readFile());
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		preloadFile.setOnAction(action -> FileUtils.preload());

		saveToFile.setOnAction(action -> FileUtils.save(TextAreas.textArea.getText()));
	}
}

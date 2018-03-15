package application.builder.buttons;

import application.builder.fields.FileFields;
import application.builder.texareas.TextAreas;
import application.files.FileUtils;
import application.files.SamplingUtils;
import application.history.DashboardHistoryUtils;
import javafx.scene.control.Button;

public class FileButtons {
	public static Button openFile = new Button("Open file");
	public static Button preloadFile = new Button("Preload file");
	public static Button saveToFile = new Button("Save to file");

	public static Button head = new Button("From Head");
	public static Button tail = new Button("From Tail");
	public static Button random = new Button("Random");

	public static void init() {

		openFile.setOnAction(action -> {
			TextAreas.textArea.setText(FileUtils.readFile());
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		preloadFile.setOnAction(action -> FileUtils.preload());

		saveToFile.setOnAction(action -> FileUtils.save(TextAreas.textArea.getText()));

		head.setOnAction(action -> {
			TextAreas.textArea.setText(SamplingUtils.head(Integer.parseInt(FileFields.samplingSize.getText())));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		tail.setOnAction(action -> {
			TextAreas.textArea.setText(SamplingUtils.tail(Integer.parseInt(FileFields.samplingSize.getText())));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		random.setOnAction(action -> {
			TextAreas.textArea.setText(SamplingUtils.random(Integer.parseInt(FileFields.samplingSize.getText())));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
	}
}

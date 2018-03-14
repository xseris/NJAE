package application.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import application.builder.labels.CurrentLabels;
import application.current.CurrentFiles;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class FileUtils {

	public static String readFile() {

		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"));
		File selectedFile = fileChooser.showOpenDialog(null);

		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(selectedFile.getPath()))) {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line).append("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		CurrentFiles.currentFile = selectedFile;
		CurrentLabels.currFile.setText(selectedFile.getPath());

		return sb.toString();
	}

	public static void save(String text) {

		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Save File");

		File file = fileChooser.showSaveDialog(null);
		if (file != null) {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(file.getPath()));
				writer.write(text);
				writer.close();
			} catch (IOException ex) {
			}
		}
	}

	public static void preload() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"));
		File selectedFile = fileChooser.showOpenDialog(null);
		CurrentFiles.currentFile = selectedFile;
		CurrentLabels.currFile.setText(selectedFile.getPath());
	}

}

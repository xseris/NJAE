package application;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import application.crypto.CaesarUtils;
import application.files.FileUtils;
import application.frequency.FrequencyUtils;
import application.hash.Sha1Utils;
import application.math.RowMathUtils;
import application.pojo.Password;
import application.table.TableUtils;
import application.web.PageUtils;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Not Just An Editor");

		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

		// TextAreas
		TextArea textArea = new TextArea();

		// Buttons
		Button clean = new Button("Clean Dashboard");

		Button encBase64 = new Button("Encode Base 64");
		Button decBase64 = new Button("Decode Base 64");

		Button stringToBinary = new Button("String to Binary");

		Button sumLines = new Button("Sum Lines");
		Button multiplyLines = new Button("Multiply Lines");
		Button maxOfLines = new Button("Max of Lines");
		Button minOfLines = new Button("Min of Lines");

		Button generateSha1 = new Button("Generate SHA-1");

		Button unigramChart = new Button("Show unigram chart");
		Button bigramChart = new Button("Show bigram chart");
		Button wordChart = new Button("Show word chart");

		Button openFile = new Button("Open file");

		Button passwordStrength = new Button("Password strength");

		Button generateTable = new Button("Generate Table");

		Button encodeCaesar = new Button("Encode");
		Button decodeCaesar = new Button("Decode");
		Button bruteForceCaesar = new Button("Brute force");
		Button encodeAlbam = new Button("Encode");
		Button decodeAlbam = new Button("Decode");
		Button encodeAtbah = new Button("Encode");
		Button decodeAtbah = new Button("Decode");
		Button encodeAtbash = new Button("Encode");
		Button decodeAtbash = new Button("Decode");
		Button encodeRot5 = new Button("Encode");
		Button decodeRot5 = new Button("Decode");
		Button encodeRot13 = new Button("Encode");
		Button decodeRot13 = new Button("Decode");
		Button encodeRot135 = new Button("Encode");
		Button decodeRot135 = new Button("Decode");
		Button encodeRot47 = new Button("Encode");
		Button decodeRot47 = new Button("Decode");

		Button getSource = new Button("Get page source");
		Button extractComments = new Button("Extract comments");

		// Menu
		final Menu general = new Menu("General");
		final MenuItem menu11 = new MenuItem("Dashboard");

		final Menu conversions = new Menu("Conversions");
		final MenuItem encodings = new MenuItem("Encodings");
		final MenuItem stringTo = new MenuItem("StringTo");

		final Menu math = new Menu("Math");
		final MenuItem rowMath = new MenuItem("RowMath");

		final Menu hash = new Menu("Hash");
		final MenuItem generate = new MenuItem("Generate");

		final Menu chart = new Menu("Charts");
		final MenuItem frequencies = new MenuItem("Frequencies");

		final Menu file = new Menu("Files");
		final MenuItem files = new MenuItem("Open");

		final Menu security = new Menu("Security");
		final MenuItem passwords = new MenuItem("Passwords");

		final Menu table = new Menu("Tables");
		final MenuItem importTable = new MenuItem("Importing");

		final Menu crypto = new Menu("Cryptography");
		final Menu classical = new Menu("Classical");
		final MenuItem caesar = new MenuItem("Caesar");
		final MenuItem albam = new MenuItem("Albam");
		final MenuItem atbah = new MenuItem("Atbah");
		final MenuItem atbash = new MenuItem("Atbash");
		final Menu rotN = new Menu("Rot-N");
		final MenuItem rot5 = new MenuItem("Rot-5");
		final MenuItem rot13 = new MenuItem("Rot-13");
		final MenuItem rot135 = new MenuItem("Rot-13.5");
		final MenuItem rot47 = new MenuItem("Rot-47");

		final Menu web = new Menu("Web");
		final MenuItem page = new MenuItem("Page");

		general.getItems().add(menu11);

		conversions.getItems().add(encodings);
		conversions.getItems().add(stringTo);

		math.getItems().add(rowMath);

		hash.getItems().add(generate);

		chart.getItems().add(frequencies);

		file.getItems().add(files);

		security.getItems().add(passwords);

		table.getItems().add(importTable);

		crypto.getItems().add(classical);
		classical.getItems().add(caesar);
		classical.getItems().add(albam);
		classical.getItems().add(atbah);
		classical.getItems().add(atbash);
		classical.getItems().add(rotN);
		rotN.getItems().add(rot5);
		rotN.getItems().add(rot13);
		rotN.getItems().add(rot135);
		rotN.getItems().add(rot47);

		web.getItems().add(page);

		MenuBar menuBar = new MenuBar();

		menuBar.getMenus().addAll(general, conversions, math, hash, chart, file, security, table, crypto, web);

		// Toolbars
		ToolBar dashboardToolBar = new ToolBar(new Label("Dashboard:"), clean);
		ToolBar encodingToolBar = new ToolBar(encBase64, decBase64);
		ToolBar stringToToolBar = new ToolBar(stringToBinary);
		ToolBar rowMathToolBar = new ToolBar(new Label("Row Math:"), sumLines, multiplyLines, maxOfLines, minOfLines);
		ToolBar sha1HashToolBar = new ToolBar(new Label("Generate hash:"), generateSha1);
		ToolBar frequenciesToolBar = new ToolBar(new Label("Frequency Charts:"), unigramChart, bigramChart, wordChart);
		ToolBar filesToolBar = new ToolBar(new Label("File:"), openFile);
		ToolBar passwordToolBar = new ToolBar(passwordStrength);
		ToolBar tableToolBar = new ToolBar(generateTable);
		ToolBar caesarToolBar = new ToolBar(new Label("Caesar:"), encodeCaesar, decodeCaesar, bruteForceCaesar);
		ToolBar albamToolBar = new ToolBar(new Label("Albam:"), encodeAlbam, decodeAlbam);
		ToolBar atbahToolBar = new ToolBar(new Label("Atbah:"), encodeAtbah, decodeAtbah);
		ToolBar atbashToolBar = new ToolBar(new Label("Atbash:"), encodeAtbash, decodeAtbash);
		ToolBar rot5ToolBar = new ToolBar(new Label("Rot-5:"), encodeRot5, decodeRot5);
		ToolBar rot13ToolBar = new ToolBar(new Label("Rot-13:"), encodeRot13, decodeRot13);
		ToolBar rot135ToolBar = new ToolBar(new Label("Rot-13.5:"), encodeRot135, decodeRot135);
		ToolBar rot47ToolBar = new ToolBar(new Label("Rot47:"), encodeRot47, decodeRot47);
		ToolBar pageToolBar = new ToolBar(new Label("Page:"), getSource, extractComments);

		dashboardToolBar.setId("dashboard");
		encodingToolBar.setId("encoding");
		stringToToolBar.setId("string");
		rowMathToolBar.setId("rowMath");
		sha1HashToolBar.setId("sha1");
		frequenciesToolBar.setId("frequencies");
		filesToolBar.setId("files");
		passwordToolBar.setId("password");
		tableToolBar.setId("table");
		caesarToolBar.setId("caesar");
		albamToolBar.setId("albam");
		atbahToolBar.setId("atbah");
		atbashToolBar.setId("atbash");
		rot5ToolBar.setId("rot5");
		rot13ToolBar.setId("rot13");
		rot135ToolBar.setId("rot135");
		rot47ToolBar.setId("rot47");
		pageToolBar.setId("page");

		VBox toolBox = new VBox();
		toolBox.autosize();
		VBox vboxInfo = new VBox();
		vboxInfo.setMinSize(600, 600);

		HBox hbox = new HBox(textArea, vboxInfo);
		hbox.autosize();

		VBox vbox = new VBox(menuBar, toolBox, hbox);
		vbox.autosize();

		// Menu Actions
		menu11.setOnAction(action -> putRemove(toolBox, dashboardToolBar));
		encodings.setOnAction(action -> putRemove(toolBox, encodingToolBar));
		stringTo.setOnAction(action -> putRemove(toolBox, stringToToolBar));
		rowMath.setOnAction(action -> putRemove(toolBox, rowMathToolBar));
		generate.setOnAction(action -> putRemove(toolBox, sha1HashToolBar));
		frequencies.setOnAction(action -> putRemove(toolBox, frequenciesToolBar));
		file.setOnAction(action -> putRemove(toolBox, filesToolBar));
		passwords.setOnAction(action -> putRemove(toolBox, passwordToolBar));
		importTable.setOnAction(action -> putRemove(toolBox, tableToolBar));
		caesar.setOnAction(action -> putRemove(toolBox, caesarToolBar));
		albam.setOnAction(action -> putRemove(toolBox, albamToolBar));
		atbah.setOnAction(action -> putRemove(toolBox, atbahToolBar));
		atbash.setOnAction(action -> putRemove(toolBox, atbashToolBar));
		rot5.setOnAction(action -> putRemove(toolBox, rot5ToolBar));
		rot13.setOnAction(action -> putRemove(toolBox, rot13ToolBar));
		rot135.setOnAction(action -> putRemove(toolBox, rot135ToolBar));
		rot47.setOnAction(action -> putRemove(toolBox, rot47ToolBar));
		page.setOnAction(action -> putRemove(toolBox, pageToolBar));

		// Buttons Actions
		clean.setOnAction(action -> textArea.setText(""));
		encBase64.setOnAction(
				action -> textArea.setText(Base64.getEncoder().encodeToString(textArea.getText().getBytes())));
		decBase64.setOnAction(
				action -> textArea.setText(new String(Base64.getDecoder().decode(textArea.getText().getBytes()))));
		stringToBinary.setOnAction(action -> textArea.setText(stringTobinary(textArea.getText())));
		sumLines.setOnAction(action -> textArea.setText(RowMathUtils.sumLines(textArea.getText())));
		multiplyLines.setOnAction(action -> textArea.setText(RowMathUtils.multiplyLines(textArea.getText())));
		maxOfLines.setOnAction(action -> textArea.setText(RowMathUtils.maxOfLines(textArea.getText())));
		minOfLines.setOnAction(action -> textArea.setText(RowMathUtils.minOfLines(textArea.getText())));
		generateSha1.setOnAction(action -> {
			try {
				textArea.setText(Sha1Utils.generate(textArea.getText()));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		unigramChart.setOnAction(action -> {
			if (!vboxInfo.getChildren().isEmpty()) {
				vboxInfo.getChildren().clear();
			}
			vboxInfo.getChildren().add(FrequencyUtils.unigrams(textArea.getText()));
		});
		bigramChart.setOnAction(action -> {
			if (!vboxInfo.getChildren().isEmpty()) {
				vboxInfo.getChildren().clear();
			}
			vboxInfo.getChildren().add(FrequencyUtils.bigrams(textArea.getText()));
		});
		wordChart.setOnAction(action -> {
			if (!vboxInfo.getChildren().isEmpty()) {
				vboxInfo.getChildren().clear();
			}
			vboxInfo.getChildren().add(FrequencyUtils.words(textArea.getText()));
		});

		generateTable.setOnAction(action -> {
			if (!hbox.getChildren().isEmpty()) {
				hbox.getChildren().clear();
			}
			hbox.getChildren().add(TableUtils.generateCsvTable("test", 100, true, textArea.getText()));
			hbox.getChildren().add(vboxInfo);
		});

		encodeCaesar.setOnAction(action -> textArea.setText(CaesarUtils.encode(textArea.getText())));
		decodeCaesar.setOnAction(action -> textArea.setText(CaesarUtils.decode(textArea.getText())));
		bruteForceCaesar.setOnAction(action -> textArea.setText(CaesarUtils.bruteForce(textArea.getText())));

		getSource.setOnAction(action -> {
			try {
				textArea.setText(PageUtils.getHTML(textArea.getText()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		extractComments.setOnAction(action -> textArea.setText(PageUtils.extractComments(textArea.getText())));

		passwordStrength.setOnAction(action -> {
			if (!vboxInfo.getChildren().isEmpty()) {
				vboxInfo.getChildren().clear();
			}
			Password password = new Password(textArea.getText());
			ProgressIndicator pi = new ProgressIndicator(password.getStrength());

			HBox barBox = new HBox(new Label("Strength: "), pi);
			HBox upperBox = new HBox(new Label("Upper Case chars: "), new Label(String.valueOf(password.getLower())));
			HBox lowerBox = new HBox(new Label("Lower Case chars: "), new Label(String.valueOf(password.getUpper())));
			HBox digitBox = new HBox(new Label("Digits: "), new Label(String.valueOf(password.getDigits())));
			HBox specialBox = new HBox(new Label("Special chars: "), new Label(String.valueOf(password.getSpecials())));
			HBox lengthBox = new HBox(new Label("length: "), new Label(String.valueOf(password.getLength())));

			vboxInfo.getChildren().addAll(barBox, upperBox, lowerBox, digitBox, specialBox, lengthBox);
		});

		openFile.setOnAction(action -> textArea.setText(FileUtils.readFile()));

		Scene scene = new Scene(vbox, primaryScreenBounds.getWidth(), primaryScreenBounds.getHeight());
		primaryStage.setScene(scene);
		textArea.setPrefSize(scene.getWidth(), scene.getHeight());
		primaryStage.show();
	}

	private void putRemove(VBox toolbox, ToolBar toolBar) {
		int index = -1;
		int i = 0;
		for (Node s : toolbox.getChildren()) {
			if (s.getId().equals(toolBar.getId())) {
				index = i;
				break;
			}
			i++;
		}
		if (index != -1) {
			toolbox.getChildren().remove(index);
		} else {
			toolbox.getChildren().add(toolBar);
		}
	}

	private String stringTobinary(String text) {
		byte[] bytes = text.getBytes();
		StringBuilder binary = new StringBuilder();
		for (byte b : bytes) {
			int val = b;
			for (int i = 0; i < 8; i++) {
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
			binary.append(' ');
		}
		return binary.toString();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

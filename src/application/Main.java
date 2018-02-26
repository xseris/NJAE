package application;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import application.conversion.AsciiToUtils;
import application.conversion.HexToUtils;
import application.crypto.Rot135Utils;
import application.crypto.Rot13Utils;
import application.crypto.Rot47Utils;
import application.crypto.Rot5Utils;
import application.crypto.classical.AlbamUtils;
import application.crypto.classical.AtbahUtils;
import application.crypto.classical.AtbashUtils;
import application.crypto.classical.CaesarUtils;
import application.crypto.steganography.BaconianUtils;
import application.files.FileUtils;
import application.frequency.FrequencyUtils;
import application.hash.HashUtils;
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
import javafx.scene.control.Separator;
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

		Button asciiToBinary = new Button("Binary");
		Button asciiToHex = new Button("Hex");

		Button hexToAscii = new Button("Ascii");

		Button sumLines = new Button("Sum Lines");
		Button multiplyLines = new Button("Multiply Lines");
		Button maxOfLines = new Button("Max of Lines");
		Button minOfLines = new Button("Min of Lines");

		Button generateMd5 = new Button("MD5 (1992 A.D.)");
		Button generateSha1 = new Button("SHA-1 (1995 A.D.)");
		Button generateSha256 = new Button("SHA-256 (2001 A.D.)");
		Button generateSha512 = new Button("SHA-512 (2001 A.D.)");

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

		Button encodeLatinBaconian = new Button("Encode");
		Button decodeLatinBaconian = new Button("Decode");
		Button encodeFullBaconian = new Button("Encode");
		Button decodeFullBaconian = new Button("Decode");

		Button getSource = new Button("Get page source");
		Button extractComments = new Button("Extract comments");

		// Menu
		final Menu general = new Menu("General");
		final MenuItem menu11 = new MenuItem("Dashboard");

		final Menu conversions = new Menu("Conversions");
		final MenuItem encodings = new MenuItem("Encodings");
		final MenuItem asciiTo = new MenuItem("Ascii to");
		final MenuItem hexTo = new MenuItem("Hex to");

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
		final MenuItem caesar = new MenuItem("Caesar (100 B.C. – 44 B.C.)");
		final MenuItem albam = new MenuItem("Albam (Biblic cipher)");
		final MenuItem atbah = new MenuItem("Atbah (Biblic cipher)");
		final MenuItem atbash = new MenuItem("Atbash (Biblic cipher)");
		final Menu rotN = new Menu("Rot-N");
		final MenuItem rot5 = new MenuItem("Rot-5");
		final MenuItem rot13 = new MenuItem("Rot-13");
		final MenuItem rot135 = new MenuItem("Rot-13.5");
		final MenuItem rot47 = new MenuItem("Rot-47");
		final Menu steganography = new Menu("Steganography");
		final MenuItem baconian = new MenuItem("Baconian cipher (1605 A.D.)");

		final Menu web = new Menu("Web");
		final MenuItem page = new MenuItem("Page");

		general.getItems().add(menu11);

		conversions.getItems().add(encodings);
		conversions.getItems().add(asciiTo);
		conversions.getItems().add(hexTo);

		math.getItems().add(rowMath);

		hash.getItems().add(generate);

		chart.getItems().add(frequencies);

		file.getItems().add(files);

		security.getItems().add(passwords);

		table.getItems().add(importTable);

		crypto.getItems().add(classical);
		classical.getItems().add(albam);
		classical.getItems().add(atbah);
		classical.getItems().add(atbash);
		classical.getItems().add(caesar);
		classical.getItems().add(rotN);
		rotN.getItems().add(rot5);
		rotN.getItems().add(rot13);
		rotN.getItems().add(rot135);
		rotN.getItems().add(rot47);

		crypto.getItems().add(steganography);
		steganography.getItems().add(baconian);

		web.getItems().add(page);

		MenuBar menuBar = new MenuBar();

		menuBar.getMenus().addAll(general, conversions, math, hash, chart, file, security, table, crypto, web);

		// Toolbars
		ToolBar dashboardToolBar = new ToolBar(new Label("Dashboard:"), clean);
		ToolBar encodingToolBar = new ToolBar(encBase64, decBase64);
		ToolBar asciiToToolBar = new ToolBar(new Label("Ascii to:"), asciiToBinary, asciiToHex);
		ToolBar hexToToolBar = new ToolBar(new Label("Hex to:"), hexToAscii);
		ToolBar rowMathToolBar = new ToolBar(new Label("Row Math:"), sumLines, multiplyLines, maxOfLines, minOfLines);
		ToolBar hashToolBar = new ToolBar(new Label("Generate hash:"), generateMd5, generateSha1, generateSha256,
				generateSha512);
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
		ToolBar baconianToolBar = new ToolBar(new Label("Latin Baconian:"), encodeLatinBaconian, decodeLatinBaconian,
				new Separator(), new Label("Full Baconian:"), encodeFullBaconian, decodeFullBaconian);
		ToolBar pageToolBar = new ToolBar(new Label("Page:"), getSource, extractComments);

		dashboardToolBar.setId("dashboard");
		encodingToolBar.setId("encoding");
		asciiToToolBar.setId("ascii");
		hexToToolBar.setId("hex");
		rowMathToolBar.setId("rowMath");
		hashToolBar.setId("sha1");
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
		baconianToolBar.setId("baconian");
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
		asciiTo.setOnAction(action -> putRemove(toolBox, asciiToToolBar));
		hexTo.setOnAction(action -> putRemove(toolBox, hexToToolBar));
		rowMath.setOnAction(action -> putRemove(toolBox, rowMathToolBar));
		generate.setOnAction(action -> putRemove(toolBox, hashToolBar));
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
		baconian.setOnAction(action -> putRemove(toolBox, baconianToolBar));
		page.setOnAction(action -> putRemove(toolBox, pageToolBar));

		// Buttons Actions
		clean.setOnAction(action -> textArea.setText(""));
		encBase64.setOnAction(
				action -> textArea.setText(Base64.getEncoder().encodeToString(textArea.getText().getBytes())));
		decBase64.setOnAction(
				action -> textArea.setText(new String(Base64.getDecoder().decode(textArea.getText().getBytes()))));
		asciiToBinary.setOnAction(action -> textArea.setText(AsciiToUtils.toBinary(textArea.getText())));
		asciiToHex.setOnAction(action -> textArea.setText(AsciiToUtils.toHex(textArea.getText())));
		hexToAscii.setOnAction(action -> textArea.setText(HexToUtils.toAscii(textArea.getText())));
		sumLines.setOnAction(action -> textArea.setText(RowMathUtils.sumLines(textArea.getText())));
		multiplyLines.setOnAction(action -> textArea.setText(RowMathUtils.multiplyLines(textArea.getText())));
		maxOfLines.setOnAction(action -> textArea.setText(RowMathUtils.maxOfLines(textArea.getText())));
		minOfLines.setOnAction(action -> textArea.setText(RowMathUtils.minOfLines(textArea.getText())));
		generateSha1.setOnAction(action -> {
			try {
				textArea.setText(HashUtils.generateSha1(textArea.getText()));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		generateSha256.setOnAction(action -> {
			try {
				textArea.setText(HashUtils.generateSha256(textArea.getText()));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		generateSha512.setOnAction(action -> {
			try {
				textArea.setText(HashUtils.generateSha512(textArea.getText()));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		generateMd5.setOnAction(action -> {
			try {
				textArea.setText(HashUtils.generateMd5(textArea.getText()));
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

		encodeAtbash.setOnAction(action -> textArea.setText(AtbashUtils.encodeDecode(textArea.getText())));
		decodeAtbash.setOnAction(action -> textArea.setText(AtbashUtils.encodeDecode(textArea.getText())));

		encodeAlbam.setOnAction(action -> textArea.setText(AlbamUtils.encodeDecode(textArea.getText())));
		decodeAlbam.setOnAction(action -> textArea.setText(AlbamUtils.encodeDecode(textArea.getText())));

		encodeAtbah.setOnAction(action -> textArea.setText(AtbahUtils.encodeDecode(textArea.getText())));
		decodeAtbah.setOnAction(action -> textArea.setText(AtbahUtils.encodeDecode(textArea.getText())));

		encodeRot13.setOnAction(action -> textArea.setText(Rot13Utils.encodeDecode(textArea.getText())));
		decodeRot13.setOnAction(action -> textArea.setText(Rot13Utils.encodeDecode(textArea.getText())));

		encodeRot5.setOnAction(action -> textArea.setText(Rot5Utils.encodeDecode(textArea.getText())));
		decodeRot5.setOnAction(action -> textArea.setText(Rot5Utils.encodeDecode(textArea.getText())));

		encodeRot135.setOnAction(action -> textArea.setText(Rot135Utils.encodeDecode(textArea.getText())));
		decodeRot135.setOnAction(action -> textArea.setText(Rot135Utils.encodeDecode(textArea.getText())));

		encodeRot47.setOnAction(action -> textArea.setText(Rot47Utils.encodeDecode(textArea.getText())));
		decodeRot47.setOnAction(action -> textArea.setText(Rot47Utils.encodeDecode(textArea.getText())));

		encodeLatinBaconian.setOnAction(action -> textArea.setText(BaconianUtils.encodeLatin(textArea.getText())));
		decodeLatinBaconian.setOnAction(action -> textArea.setText(BaconianUtils.decodeLatin(textArea.getText())));

		encodeFullBaconian.setOnAction(action -> textArea.setText(BaconianUtils.encodeFull(textArea.getText())));
		decodeFullBaconian.setOnAction(action -> textArea.setText(BaconianUtils.decodeFull(textArea.getText())));

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

	public static void main(String[] args) {
		Application.launch(args);
	}
}

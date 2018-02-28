package application;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import application.conversion.AsciiToUtils;
import application.conversion.BinaryToUtils;
import application.conversion.HexToUtils;
import application.crypto.Rot135Utils;
import application.crypto.Rot13Utils;
import application.crypto.Rot47Utils;
import application.crypto.Rot5Utils;
import application.crypto.classical.AffineUtils;
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
import image.ImageRotationUtils;
import image.ImageUtils;
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
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
		Button hexToBinary = new Button("Binary");

		Button binaryToAscii = new Button("Ascii");
		Button binaryToHex = new Button("Hex");

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
		Button encodeAffine = new Button("Encode");
		Button decodeAffine = new Button("Decode");
		Button bruteForceAffine = new Button("Brute force");

		Button encodeLatinBaconian = new Button("Encode");
		Button decodeLatinBaconian = new Button("Decode");
		Button encodeFullBaconian = new Button("Encode");
		Button decodeFullBaconian = new Button("Decode");

		Button getSource = new Button("Get page source");
		Button extractComments = new Button("Extract comments");

		Button openImage = new Button("Open");
		Button rotate90Left = new Button("Left 90°");
		Button rotate90Right = new Button("Right 90°");
		Button rotate180 = new Button("180°");
		Button rotateCustom = new Button("Rotate");

		// Menu
		final Menu general = new Menu("General");
		final MenuItem menu11 = new MenuItem("Dashboard");

		final Menu conversions = new Menu("Conversions");
		final MenuItem encodings = new MenuItem("Encodings");
		final MenuItem asciiTo = new MenuItem("Ascii to");
		final MenuItem hexTo = new MenuItem("Hex to");
		final MenuItem binaryTo = new MenuItem("Binary to");

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
		final MenuItem affine = new MenuItem("Affine");
		final Menu rotN = new Menu("Rot-N");
		final MenuItem rot5 = new MenuItem("Rot-5");
		final MenuItem rot13 = new MenuItem("Rot-13");
		final MenuItem rot135 = new MenuItem("Rot-13.5");
		final MenuItem rot47 = new MenuItem("Rot-47");
		final Menu steganography = new Menu("Steganography");
		final MenuItem baconian = new MenuItem("Baconian cipher (1605 A.D.)");

		final Menu web = new Menu("Web");
		final MenuItem page = new MenuItem("Page");

		final Menu image = new Menu("Image");
		final MenuItem manage = new MenuItem("Manage");
		final MenuItem rotate = new MenuItem("Rotate");

		general.getItems().add(menu11);

		conversions.getItems().addAll(encodings, asciiTo, hexTo, binaryTo);

		math.getItems().add(rowMath);

		hash.getItems().add(generate);

		chart.getItems().add(frequencies);

		file.getItems().add(files);

		security.getItems().add(passwords);

		table.getItems().add(importTable);

		crypto.getItems().add(classical);
		classical.getItems().addAll(albam, atbah, atbash, caesar, affine, rotN);
		rotN.getItems().addAll(rot5, rot13, rot135, rot47);

		crypto.getItems().add(steganography);
		steganography.getItems().add(baconian);

		web.getItems().add(page);

		image.getItems().addAll(manage, rotate);

		MenuBar menuBar = new MenuBar();

		menuBar.getMenus().addAll(general, conversions, math, hash, chart, file, security, table, crypto, web, image);

		// Text Fields
		TextField affineA = new TextField("3");
		TextField affineB = new TextField("5");
		TextField rotateField = new TextField("45");

		// Toolbars
		ToolBar dashboardToolBar = new ToolBar(new Label("Dashboard:"), clean);
		ToolBar encodingToolBar = new ToolBar(encBase64, decBase64);
		ToolBar asciiToToolBar = new ToolBar(new Label("Ascii to:"), asciiToBinary, asciiToHex);
		ToolBar hexToToolBar = new ToolBar(new Label("Hex to:"), hexToAscii, hexToBinary);
		ToolBar binaryToToolBar = new ToolBar(new Label("Binary to:"), binaryToAscii, binaryToHex);
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
		ToolBar affineToolBar = new ToolBar(new Label("Affine:"), encodeAffine, decodeAffine, bruteForceAffine,
				new Separator(), new Label("a = "), affineA, new Label("b = "), affineB);
		ToolBar baconianToolBar = new ToolBar(new Label("Latin Baconian:"), encodeLatinBaconian, decodeLatinBaconian,
				new Separator(), new Label("Full Baconian:"), encodeFullBaconian, decodeFullBaconian);
		ToolBar pageToolBar = new ToolBar(new Label("Page:"), getSource, extractComments);
		ToolBar manageImageToolBar = new ToolBar(new Label("Image:"), openImage);
		ToolBar rotateImageToolBar = new ToolBar(new Label("Rotate:"), rotate90Left, rotate90Right, rotate180,
				new Separator(), new Label("Custom : "), rotateField, rotateCustom);

		dashboardToolBar.setId("dashboard");
		encodingToolBar.setId("encoding");
		asciiToToolBar.setId("ascii");
		hexToToolBar.setId("hex");
		binaryToToolBar.setId("binary");
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
		affineToolBar.setId("affine");
		baconianToolBar.setId("baconian");
		pageToolBar.setId("page");
		manageImageToolBar.setId("manageImage");
		rotateImageToolBar.setId("rotateImage");

		VBox toolBox = new VBox();
		toolBox.autosize();
		VBox textboxInfo = new VBox();
		textboxInfo.setMinSize(600, 600);

		HBox graphBox = new HBox();
		graphBox.setMinSize(600, 600);

		VBox tableBox = new VBox();
		graphBox.setMinSize(600, 600);

		// Tabs
		TabPane tabPane = new TabPane();
		Tab textTab = new Tab("Text Editor", new HBox(textArea, new Separator(), textboxInfo));
		Tab chartTab = new Tab("Chart");
		Tab tableTab = new Tab("Table", tableBox);
		Tab imageTab = new Tab("Images");

		textTab.setClosable(false);
		tableTab.setClosable(false);
		imageTab.setClosable(false);
		chartTab.setClosable(false);

		tabPane.getTabs().addAll(textTab, chartTab, tableTab, imageTab);

		VBox vbox = new VBox(menuBar, toolBox, tabPane);

		// Menu Actions
		menu11.setOnAction(action -> putRemove(toolBox, dashboardToolBar));
		encodings.setOnAction(action -> putRemove(toolBox, encodingToolBar));
		asciiTo.setOnAction(action -> putRemove(toolBox, asciiToToolBar));
		hexTo.setOnAction(action -> putRemove(toolBox, hexToToolBar));
		binaryTo.setOnAction(action -> putRemove(toolBox, binaryToToolBar));
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
		affine.setOnAction(action -> putRemove(toolBox, affineToolBar));
		page.setOnAction(action -> putRemove(toolBox, pageToolBar));
		image.setOnAction(action -> putRemove(toolBox, manageImageToolBar));
		rotate.setOnAction(action -> putRemove(toolBox, rotateImageToolBar));

		// Buttons Actions
		clean.setOnAction(action -> textArea.setText(""));
		encBase64.setOnAction(
				action -> textArea.setText(Base64.getEncoder().encodeToString(textArea.getText().getBytes())));
		decBase64.setOnAction(
				action -> textArea.setText(new String(Base64.getDecoder().decode(textArea.getText().getBytes()))));
		asciiToBinary.setOnAction(action -> textArea.setText(AsciiToUtils.toBinary(textArea.getText())));
		asciiToHex.setOnAction(action -> textArea.setText(AsciiToUtils.toHex(textArea.getText())));
		hexToAscii.setOnAction(action -> textArea.setText(HexToUtils.toAscii(textArea.getText())));
		hexToBinary.setOnAction(action -> textArea.setText(HexToUtils.toBinary(textArea.getText())));
		binaryToAscii.setOnAction(action -> textArea.setText(BinaryToUtils.toAscii(textArea.getText())));
		binaryToHex.setOnAction(action -> textArea.setText(BinaryToUtils.toHex(textArea.getText())));
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
			chartTab.setContent(FrequencyUtils.unigrams(textArea.getText()));
		});
		bigramChart.setOnAction(action -> {
			chartTab.setContent(FrequencyUtils.bigrams(textArea.getText()));
		});
		wordChart.setOnAction(action -> {
			chartTab.setContent(FrequencyUtils.words(textArea.getText()));
		});

		generateTable.setOnAction(action -> {
			if (!tableBox.getChildren().isEmpty()) {
				tableBox.getChildren().clear();
			}
			tableBox.getChildren().add(TableUtils.generateCsvTable("test", 100, true, textArea.getText()));
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

		encodeAffine.setOnAction(action -> textArea.setText(AffineUtils.encode(Integer.parseInt(affineA.getText()),
				Integer.parseInt(affineB.getText()), textArea.getText())));
		decodeAffine.setOnAction(action -> textArea.setText(AffineUtils.decode(Integer.parseInt(affineA.getText()),
				Integer.parseInt(affineB.getText()), textArea.getText())));
		bruteForceAffine.setOnAction(action -> textArea.setText(AffineUtils.bruteforce(textArea.getText())));

		encodeFullBaconian.setOnAction(action -> textArea.setText(BaconianUtils.encodeFull(textArea.getText())));
		decodeFullBaconian.setOnAction(action -> textArea.setText(BaconianUtils.decodeFull(textArea.getText())));

		getSource.setOnAction(action -> {
			try {
				textArea.setText(PageUtils.getHTML(textArea.getText()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		extractComments.setOnAction(action -> textArea.setText(PageUtils.extractComments(textArea.getText())));

		passwordStrength.setOnAction(action -> {
			if (!textboxInfo.getChildren().isEmpty()) {
				textboxInfo.getChildren().clear();
			}
			Password password = new Password(textArea.getText());
			ProgressIndicator pi = new ProgressIndicator(password.getStrength());

			HBox barBox = new HBox(new Label("Strength: "), pi);
			HBox upperBox = new HBox(new Label("Upper Case chars: "), new Label(String.valueOf(password.getLower())));
			HBox lowerBox = new HBox(new Label("Lower Case chars: "), new Label(String.valueOf(password.getUpper())));
			HBox digitBox = new HBox(new Label("Digits: "), new Label(String.valueOf(password.getDigits())));
			HBox specialBox = new HBox(new Label("Special chars: "), new Label(String.valueOf(password.getSpecials())));
			HBox lengthBox = new HBox(new Label("length: "), new Label(String.valueOf(password.getLength())));

			textboxInfo.getChildren().addAll(barBox, upperBox, lowerBox, digitBox, specialBox, lengthBox);
		});

		openFile.setOnAction(action -> textArea.setText(FileUtils.readFile()));

		openImage.setOnAction(action -> {
			try {
				imageTab.setContent(ImageUtils.openImage());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		});

		rotate90Left.setOnAction(action -> ImageRotationUtils.rotate90Left(imageTab.getContent()));
		rotate90Right.setOnAction(action -> ImageRotationUtils.rotate90Right(imageTab.getContent()));
		rotate180.setOnAction(action -> ImageRotationUtils.rotate180(imageTab.getContent()));
		rotateCustom
				.setOnAction(action -> ImageRotationUtils.rotateCustom(imageTab.getContent(), rotateField.getText()));

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

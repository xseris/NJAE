package application;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import application.builder.buttons.CryptoButtons;
import application.builder.buttons.EncodingButtons;
import application.builder.buttons.HashButtons;
import application.builder.buttons.ImageButtons;
import application.builder.buttons.MathButtons;
import application.builder.buttons.StegoButtons;
import application.builder.fields.ImageFields;
import application.builder.toolbars.CryptoToolbars;
import application.builder.toolbars.EncodingToolbars;
import application.builder.toolbars.ImageToolbars;
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
import application.history.ImageHistory;
import application.math.RowMathUtils;
import application.pojo.Password;
import application.table.TableUtils;
import application.web.PageUtils;
import image.ImageChannelsUtils;
import image.ImageGrayScaleUtils;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Main extends Application {

	static ImageHistory imageHistory = new ImageHistory();

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Not Just An Editor");

		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

		// TextAreas
		TextArea textArea = new TextArea();

		// Buttons
		Button clean = new Button("Clean Dashboard");

		Button unigramChart = new Button("Show unigram chart");
		Button bigramChart = new Button("Show bigram chart");
		Button wordChart = new Button("Show word chart");

		Button openFile = new Button("Open file");

		Button passwordStrength = new Button("Password strength");

		Button generateTable = new Button("Generate Table");

		Button getSource = new Button("Get page source");
		Button extractComments = new Button("Extract comments");

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
		final MenuItem caesar = new MenuItem("Caesar (100 B.C. - 44 B.C.)");
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
		final MenuItem channel = new MenuItem("Channels");
		final MenuItem grayscale = new MenuItem("Grayscale");
		final MenuItem imgHistory = new MenuItem("History");

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

		image.getItems().addAll(manage, rotate, channel, grayscale, imgHistory);

		MenuBar menuBar = new MenuBar();

		menuBar.getMenus().addAll(general, conversions, math, hash, chart, file, security, table, crypto, web, image);

		// Text Fields
		TextField affineA = new TextField("3");
		TextField affineB = new TextField("5");

		// Toolbars
		ToolBar dashboardToolBar = new ToolBar(new Label("Dashboard:"), clean);
		ToolBar rowMathToolBar = new ToolBar(new Label("Row Math:"), MathButtons.sumLines, MathButtons.multiplyLines,
				MathButtons.maxOfLines, MathButtons.minOfLines);
		ToolBar hashToolBar = new ToolBar(new Label("Generate hash:"), HashButtons.generateMd5,
				HashButtons.generateSha1, HashButtons.generateSha256, HashButtons.generateSha512);
		ToolBar frequenciesToolBar = new ToolBar(new Label("Frequency Charts:"), unigramChart, bigramChart, wordChart);
		ToolBar filesToolBar = new ToolBar(new Label("File:"), openFile);
		ToolBar passwordToolBar = new ToolBar(passwordStrength);
		ToolBar tableToolBar = new ToolBar(generateTable);

		ToolBar affineToolBar = new ToolBar(new Label("Affine:"), CryptoButtons.encodeAffine,
				CryptoButtons.decodeAffine, CryptoButtons.bruteForceAffine, new Separator(), new Label("a = "), affineA,
				new Label("b = "), affineB);

		ToolBar baconianToolBar = new ToolBar(new Label("Latin Baconian:"), StegoButtons.encodeLatinBaconian,
				StegoButtons.decodeLatinBaconian, new Separator(), new Label("Full Baconian:"),
				StegoButtons.encodeFullBaconian, StegoButtons.decodeFullBaconian);
		ToolBar pageToolBar = new ToolBar(new Label("Page:"), getSource, extractComments);

		dashboardToolBar.setId("dashboard");
		EncodingToolbars.encodingToolBar.setId("encoding");
		EncodingToolbars.asciiToToolBar.setId("ascii");
		EncodingToolbars.hexToToolBar.setId("hex");
		EncodingToolbars.binaryToToolBar.setId("binary");
		rowMathToolBar.setId("rowMath");
		hashToolBar.setId("sha1");
		frequenciesToolBar.setId("frequencies");
		filesToolBar.setId("files");
		passwordToolBar.setId("password");
		tableToolBar.setId("table");
		CryptoToolbars.caesarToolBar.setId("caesar");
		CryptoToolbars.albamToolBar.setId("albam");
		CryptoToolbars.atbahToolBar.setId("atbah");
		CryptoToolbars.atbashToolBar.setId("atbash");
		CryptoToolbars.rot5ToolBar.setId("rot5");
		CryptoToolbars.rot13ToolBar.setId("rot13");
		CryptoToolbars.rot135ToolBar.setId("rot135");
		CryptoToolbars.rot47ToolBar.setId("rot47");
		affineToolBar.setId("affine");
		baconianToolBar.setId("baconian");
		pageToolBar.setId("page");
		ImageToolbars.manageImageToolBar.setId("manageImage");
		ImageToolbars.rotateImageToolBar.setId("rotateImage");
		ImageToolbars.channelImageToolBar.setId("channelImage");
		ImageToolbars.grayScaleImageToolBar.setId("grayScaleImage");
		ImageToolbars.historyImageToolBar.setId("historyImage");

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
		encodings.setOnAction(action -> putRemove(toolBox, EncodingToolbars.encodingToolBar));
		asciiTo.setOnAction(action -> putRemove(toolBox, EncodingToolbars.asciiToToolBar));
		hexTo.setOnAction(action -> putRemove(toolBox, EncodingToolbars.hexToToolBar));
		binaryTo.setOnAction(action -> putRemove(toolBox, EncodingToolbars.binaryToToolBar));
		rowMath.setOnAction(action -> putRemove(toolBox, rowMathToolBar));
		generate.setOnAction(action -> putRemove(toolBox, hashToolBar));
		frequencies.setOnAction(action -> putRemove(toolBox, frequenciesToolBar));
		file.setOnAction(action -> putRemove(toolBox, filesToolBar));
		passwords.setOnAction(action -> putRemove(toolBox, passwordToolBar));
		importTable.setOnAction(action -> putRemove(toolBox, tableToolBar));
		caesar.setOnAction(action -> putRemove(toolBox, CryptoToolbars.caesarToolBar));
		albam.setOnAction(action -> putRemove(toolBox, CryptoToolbars.albamToolBar));
		atbah.setOnAction(action -> putRemove(toolBox, CryptoToolbars.atbahToolBar));
		atbash.setOnAction(action -> putRemove(toolBox, CryptoToolbars.atbashToolBar));
		rot5.setOnAction(action -> putRemove(toolBox, CryptoToolbars.rot5ToolBar));
		rot13.setOnAction(action -> putRemove(toolBox, CryptoToolbars.rot13ToolBar));
		rot135.setOnAction(action -> putRemove(toolBox, CryptoToolbars.rot135ToolBar));
		rot47.setOnAction(action -> putRemove(toolBox, CryptoToolbars.rot47ToolBar));
		baconian.setOnAction(action -> putRemove(toolBox, baconianToolBar));
		affine.setOnAction(action -> putRemove(toolBox, affineToolBar));
		page.setOnAction(action -> putRemove(toolBox, pageToolBar));
		manage.setOnAction(action -> putRemove(toolBox, ImageToolbars.manageImageToolBar));
		rotate.setOnAction(action -> putRemove(toolBox, ImageToolbars.rotateImageToolBar));
		channel.setOnAction(action -> putRemove(toolBox, ImageToolbars.channelImageToolBar));
		grayscale.setOnAction(action -> putRemove(toolBox, ImageToolbars.grayScaleImageToolBar));
		imgHistory.setOnAction(action -> putRemove(toolBox, ImageToolbars.historyImageToolBar));

		// Buttons Actions
		clean.setOnAction(action -> textArea.setText(""));
		EncodingButtons.encBase64.setOnAction(
				action -> textArea.setText(Base64.getEncoder().encodeToString(textArea.getText().getBytes())));
		EncodingButtons.decBase64.setOnAction(
				action -> textArea.setText(new String(Base64.getDecoder().decode(textArea.getText().getBytes()))));
		EncodingButtons.asciiToBinary
				.setOnAction(action -> textArea.setText(AsciiToUtils.toBinary(textArea.getText())));
		EncodingButtons.asciiToHex.setOnAction(action -> textArea.setText(AsciiToUtils.toHex(textArea.getText())));
		EncodingButtons.hexToAscii.setOnAction(action -> textArea.setText(HexToUtils.toAscii(textArea.getText())));
		EncodingButtons.hexToBinary.setOnAction(action -> textArea.setText(HexToUtils.toBinary(textArea.getText())));
		EncodingButtons.binaryToAscii
				.setOnAction(action -> textArea.setText(BinaryToUtils.toAscii(textArea.getText())));
		EncodingButtons.binaryToHex.setOnAction(action -> textArea.setText(BinaryToUtils.toHex(textArea.getText())));
		MathButtons.sumLines.setOnAction(action -> textArea.setText(RowMathUtils.sumLines(textArea.getText())));
		MathButtons.multiplyLines
				.setOnAction(action -> textArea.setText(RowMathUtils.multiplyLines(textArea.getText())));
		MathButtons.maxOfLines.setOnAction(action -> textArea.setText(RowMathUtils.maxOfLines(textArea.getText())));
		MathButtons.minOfLines.setOnAction(action -> textArea.setText(RowMathUtils.minOfLines(textArea.getText())));
		HashButtons.generateSha1.setOnAction(action -> {
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

		HashButtons.generateSha256.setOnAction(action -> {
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

		HashButtons.generateSha512.setOnAction(action -> {
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

		HashButtons.generateMd5.setOnAction(action -> {
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

		CryptoButtons.encodeCaesar.setOnAction(action -> textArea.setText(CaesarUtils.encode(textArea.getText())));
		CryptoButtons.decodeCaesar.setOnAction(action -> textArea.setText(CaesarUtils.decode(textArea.getText())));
		CryptoButtons.bruteForceCaesar
				.setOnAction(action -> textArea.setText(CaesarUtils.bruteForce(textArea.getText())));

		CryptoButtons.encodeAtbash
				.setOnAction(action -> textArea.setText(AtbashUtils.encodeDecode(textArea.getText())));
		CryptoButtons.decodeAtbash
				.setOnAction(action -> textArea.setText(AtbashUtils.encodeDecode(textArea.getText())));

		CryptoButtons.encodeAlbam.setOnAction(action -> textArea.setText(AlbamUtils.encodeDecode(textArea.getText())));
		CryptoButtons.decodeAlbam.setOnAction(action -> textArea.setText(AlbamUtils.encodeDecode(textArea.getText())));

		CryptoButtons.encodeAtbah.setOnAction(action -> textArea.setText(AtbahUtils.encodeDecode(textArea.getText())));
		CryptoButtons.decodeAtbah.setOnAction(action -> textArea.setText(AtbahUtils.encodeDecode(textArea.getText())));

		CryptoButtons.encodeRot13.setOnAction(action -> textArea.setText(Rot13Utils.encodeDecode(textArea.getText())));
		CryptoButtons.decodeRot13.setOnAction(action -> textArea.setText(Rot13Utils.encodeDecode(textArea.getText())));

		CryptoButtons.encodeRot5.setOnAction(action -> textArea.setText(Rot5Utils.encodeDecode(textArea.getText())));
		CryptoButtons.decodeRot5.setOnAction(action -> textArea.setText(Rot5Utils.encodeDecode(textArea.getText())));

		CryptoButtons.encodeRot135
				.setOnAction(action -> textArea.setText(Rot135Utils.encodeDecode(textArea.getText())));
		CryptoButtons.decodeRot135
				.setOnAction(action -> textArea.setText(Rot135Utils.encodeDecode(textArea.getText())));

		CryptoButtons.encodeRot47.setOnAction(action -> textArea.setText(Rot47Utils.encodeDecode(textArea.getText())));
		CryptoButtons.decodeRot47.setOnAction(action -> textArea.setText(Rot47Utils.encodeDecode(textArea.getText())));

		StegoButtons.encodeLatinBaconian
				.setOnAction(action -> textArea.setText(BaconianUtils.encodeLatin(textArea.getText())));
		StegoButtons.decodeLatinBaconian
				.setOnAction(action -> textArea.setText(BaconianUtils.decodeLatin(textArea.getText())));

		CryptoButtons.encodeAffine.setOnAction(action -> textArea.setText(AffineUtils
				.encode(Integer.parseInt(affineA.getText()), Integer.parseInt(affineB.getText()), textArea.getText())));
		CryptoButtons.decodeAffine.setOnAction(action -> textArea.setText(AffineUtils
				.decode(Integer.parseInt(affineA.getText()), Integer.parseInt(affineB.getText()), textArea.getText())));
		CryptoButtons.bruteForceAffine
				.setOnAction(action -> textArea.setText(AffineUtils.bruteforce(textArea.getText())));

		StegoButtons.encodeFullBaconian
				.setOnAction(action -> textArea.setText(BaconianUtils.encodeFull(textArea.getText())));
		StegoButtons.decodeFullBaconian
				.setOnAction(action -> textArea.setText(BaconianUtils.decodeFull(textArea.getText())));

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

		ImageButtons.openImage.setOnAction(action -> {
			try {
				imageTab.setContent(ImageUtils.openImage());
				updateImageHistroy(imageTab.getContent());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		});

		ImageButtons.rotate90Left.setOnAction(action -> {
			ImageRotationUtils.rotate90Left(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.rotate90Right.setOnAction(action -> {
			ImageRotationUtils.rotate90Right(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.rotate180.setOnAction(action -> {
			ImageRotationUtils.rotate180(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.rotateCustom.setOnAction(action -> {
			ImageRotationUtils.rotateCustom(imageTab.getContent(), ImageFields.rotateField.getText());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.redChannel.setOnAction(action -> {
			ImageChannelsUtils.getRedChannel(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.greenChannel.setOnAction(action -> {
			ImageChannelsUtils.getGreenChannel(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.blueChannel.setOnAction(action -> {
			ImageChannelsUtils.getBlueChannel(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.grayAvg.setOnAction(action -> {
			ImageGrayScaleUtils.toAverage(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.grayLumin.setOnAction(action -> {
			ImageGrayScaleUtils.toLuminescence(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.grayDesat.setOnAction(action -> {
			ImageGrayScaleUtils.toDesaturation(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.grayDecompMin.setOnAction(action -> {
			ImageGrayScaleUtils.toDecompositionMin(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.grayDecompMax.setOnAction(action -> {
			ImageGrayScaleUtils.toDecompositionMax(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.singleColorRed.setOnAction(action -> {
			ImageGrayScaleUtils.toSingleRed(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.singleColorGreen.setOnAction(action -> {
			ImageGrayScaleUtils.toSingleGreen(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.singleColorBlue.setOnAction(action -> {
			ImageGrayScaleUtils.toSingleBlue(imageTab.getContent());
			updateImageHistroy(imageTab.getContent());
		});
		ImageButtons.imageUndo.setOnAction(action -> undoImageHistroy(imageTab.getContent()));
		ImageButtons.imageRedo.setOnAction(action -> redoImageHistroy(imageTab.getContent()));

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

package application;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import application.builder.buttons.ChartButtons;
import application.builder.buttons.CryptoButtons;
import application.builder.buttons.DashboardButtons;
import application.builder.buttons.EncodingButtons;
import application.builder.buttons.EsotericButtons;
import application.builder.buttons.FileButtons;
import application.builder.buttons.HashButtons;
import application.builder.buttons.ImageButtons;
import application.builder.buttons.MathButtons;
import application.builder.buttons.StegoButtons;
import application.builder.buttons.sequences.FigurativeSequenceButtons;
import application.builder.buttons.sequences.SequenceButtons;
import application.builder.fields.MathFields;
import application.builder.labels.CurrentLabels;
import application.builder.sliders.ImageSliders;
import application.builder.tabs.Tabs;
import application.builder.texareas.TextAreas;
import application.builder.toolbars.ChartToolbars;
import application.builder.toolbars.CryptoToolbars;
import application.builder.toolbars.DashboardToolbars;
import application.builder.toolbars.EncodingToolbars;
import application.builder.toolbars.EsotericToolbars;
import application.builder.toolbars.FileToolbars;
import application.builder.toolbars.ImageToolbars;
import application.builder.toolbars.MathToolbars;
import application.builder.toolbars.SequenceToolbars;
import application.builder.toolbars.StegoToolbars;
import application.crypto.classical.AffineUtils;
import application.hash.HashUtils;
import application.history.DashboardHistoryUtils;
import application.image.ImageInfoUtils;
import application.math.ConversionMathUtils;
import application.pojo.Password;
import application.table.TableUtils;
import application.web.PageUtils;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
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
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		ImageSliders.init();
		ChartButtons.init();
		CryptoButtons.init();
		DashboardButtons.init();
		EncodingButtons.init();
		FigurativeSequenceButtons.init();
		FileButtons.init();
		ImageButtons.init();
		MathButtons.init();
		StegoButtons.init();
		SequenceButtons.init();
		CryptoToolbars.init();
		StegoToolbars.init();
		DashboardToolbars.init();
		EncodingToolbars.init();
		FileToolbars.init();
		ImageToolbars.init();
		SequenceToolbars.init();
		EsotericToolbars.init();
		EsotericButtons.init();
		Tabs.init();

		primaryStage.setTitle("Not Just An Editor");

		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

		// Buttons

		Button passwordStrength = new Button("Password strength");

		Button generateTable = new Button("Generate Table");

		Button getSource = new Button("Get page source");
		Button extractComments = new Button("Extract comments");

		// Menu
		final Menu general = new Menu("General");
		final MenuItem menu11 = new MenuItem("Dashboard");
		final MenuItem notations = new MenuItem("Notations");
		final MenuItem textFilters = new MenuItem("Filters");
		final MenuItem textArrangemets = new MenuItem("Arrangements");

		final Menu encodings = new Menu("Encodigs");
		final MenuItem base = new MenuItem("BaseN");
		final MenuItem morse = new MenuItem("Morse");
		final MenuItem asciiTo = new MenuItem("Ascii to");
		final MenuItem hexTo = new MenuItem("Hex to");
		final MenuItem binaryTo = new MenuItem("Binary to");
		final MenuItem keyboardLayouts = new MenuItem("Keyboard Layouts");

		final Menu math = new Menu("Math");
		final MenuItem rowMath = new MenuItem("Row Math");
		final MenuItem conversionMath = new MenuItem("Base conversion");

		final Menu hash = new Menu("Hash");
		final MenuItem generate = new MenuItem("Generate");

		final Menu chart = new Menu("Charts");
		final MenuItem frequencies = new MenuItem("Frequencies");
		final MenuItem histograms = new MenuItem("Image Histograms");

		final Menu file = new Menu("Files");
		final MenuItem manageFiles = new MenuItem("Manage");
		final MenuItem samplingFiles = new MenuItem("Sampling");

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
		final MenuItem rotN = new MenuItem("Rot-N");
		final Menu steganography = new Menu("Steganography");
		final MenuItem baconian = new MenuItem("Baconian cipher (1605 A.D.)");
		final MenuItem textStego = new MenuItem("Text Steganography");

		final Menu web = new Menu("Web");
		final MenuItem page = new MenuItem("Page");

		final Menu image = new Menu("Image");
		final MenuItem manage = new MenuItem("Manage");
		final MenuItem rotate = new MenuItem("Rotate");
		final MenuItem imgHistory = new MenuItem("History");
		final Menu extraction = new Menu("Extract");
		final MenuItem channel = new MenuItem("Channels");
		final MenuItem grayscale = new MenuItem("Grayscale");
		final MenuItem yuv = new MenuItem("YUV");
		final MenuItem ycbcr = new MenuItem("Y'CbCr");
		final Menu processing = new Menu("Processing");
		final MenuItem pointProcessing = new MenuItem("Point");
		final MenuItem linearFilters = new MenuItem("Linear Filters");
		final MenuItem qrCode = new MenuItem("QR Codes");
		final MenuItem combine = new MenuItem("Combine");

		final Menu sequences = new Menu("Sequences");
		final MenuItem cullen = new MenuItem("Cullen");
		final MenuItem fibonacci = new MenuItem("Fibonacci");
		final MenuItem jacobsthal = new MenuItem("Jacobsthal");
		final MenuItem jacobsthalPell = new MenuItem("Jacobsthal-Pell");
		final MenuItem leonardo = new MenuItem("Leonardo");
		final MenuItem lucas = new MenuItem("Lucas");
		final MenuItem padovan = new MenuItem("Padovan");
		final MenuItem pell = new MenuItem("Pell");
		final MenuItem pellLucas = new MenuItem("Pell-Lucas");
		final MenuItem perrin = new MenuItem("Perrin");
		final MenuItem even = new MenuItem("Even Numbers");
		final MenuItem odd = new MenuItem("Odd Numbers");
		final Menu figurate = new Menu("Figurate Numbers");
		final Menu twoD = new Menu("2-Dimensional");
		final Menu threeD = new Menu("3-Dimensional");
		final Menu twoDNotCentered = new Menu("Not Centered");
		final Menu twoDCentered = new Menu("Centered");
		final Menu threeDNotCentered = new Menu("Not Centered");
		final Menu threeDCentered = new Menu("Centered");
		final MenuItem square = new MenuItem("Square Numbers");
		final MenuItem triangular = new MenuItem("Triangular Numbers");
		final MenuItem hexagonal = new MenuItem("Hexagonal Numbers");
		final MenuItem heptagonal = new MenuItem("Heptagonal Numbers");
		final MenuItem tetrahedral = new MenuItem("Tetrahedral Numbers");
		final MenuItem pentagonal = new MenuItem("Pentagonal Numbers");
		final MenuItem octagonal = new MenuItem("Octagonal Numbers");
		final MenuItem nonagonal = new MenuItem("Nonagonal Numbers");
		final MenuItem decagonal = new MenuItem("Decagonal Numbers");
		final MenuItem dodecagonal = new MenuItem("Dodecagonal Numbers");
		final MenuItem centeredSquare = new MenuItem("Centered Square Numbers");
		final MenuItem centeredTriangular = new MenuItem("Centered Triangular Numbers");
		final MenuItem centeredHexagonal = new MenuItem("Centered Hexagonal Numbers");
		final MenuItem centeredHeptagonal = new MenuItem("Centered Heptagonal Numbers");
		final MenuItem centeredTetrahedral = new MenuItem("Centered Tetrahedral Numbers");
		final MenuItem centeredPentagonal = new MenuItem("Centered Pentagonal Numbers");
		final MenuItem centeredOctagonal = new MenuItem("Centered Octagonal Numbers");
		final MenuItem centeredNonagonal = new MenuItem("Centered Nonagonal Numbers");
		final MenuItem centeredDecagonal = new MenuItem("Centered Decagonal Numbers");
		final MenuItem star = new MenuItem("Star Numbers");

		final Menu esoteric = new Menu("Esoteric");
		final Menu brainFamily = new Menu("BrainF*ck Family");
		final MenuItem alphuck = new MenuItem("Alphuck");
		final MenuItem blub = new MenuItem("Blub");
		final MenuItem brainfuck = new MenuItem("BrainF**k");
		final MenuItem colonoscopy = new MenuItem("Colonoscopy");
		final MenuItem ook = new MenuItem("Ook!");
		final MenuItem pikalang = new MenuItem("Pikalang");
		final MenuItem solbofuck = new MenuItem("Solbofuck");
		final MenuItem triplet = new MenuItem("Triplet");
		final Menu brainExtensions = new Menu("BrainF*ck Extensions");
		final MenuItem brainfuckFace = new MenuItem("( ͡° ͜ʖ ͡°)fuck");
		final MenuItem brainfuck3 = new MenuItem("Brainfuck3+");

		esoteric.getItems().addAll(brainFamily);
		brainFamily.getItems().addAll(alphuck, blub, brainfuck, colonoscopy, ook, pikalang, solbofuck, triplet,
				brainExtensions);
		brainExtensions.getItems().addAll(brainfuck3, brainfuckFace);
		general.getItems().addAll(menu11, notations, textFilters, textArrangemets);
		encodings.getItems().addAll(base, morse, asciiTo, hexTo, binaryTo, keyboardLayouts);
		math.getItems().addAll(rowMath, conversionMath);
		hash.getItems().add(generate);
		chart.getItems().addAll(frequencies, histograms);
		file.getItems().addAll(manageFiles, samplingFiles);
		security.getItems().add(passwords);
		table.getItems().add(importTable);
		crypto.getItems().add(classical);
		classical.getItems().addAll(albam, atbah, atbash, caesar, affine, rotN);
		crypto.getItems().add(steganography);
		steganography.getItems().addAll(baconian, textStego);
		web.getItems().add(page);
		image.getItems().addAll(manage, rotate, extraction, imgHistory, processing, qrCode, combine);
		extraction.getItems().addAll(channel, grayscale, yuv, ycbcr);
		processing.getItems().addAll(pointProcessing, linearFilters);

		sequences.getItems().addAll(cullen, fibonacci, jacobsthal, jacobsthalPell, leonardo, lucas, padovan, pell,
				pellLucas, perrin, even, odd, figurate);
		figurate.getItems().addAll(twoD, threeD);
		twoD.getItems().addAll(twoDCentered, twoDNotCentered);
		twoDCentered.getItems().addAll(centeredTriangular, centeredSquare, centeredPentagonal, centeredHexagonal,
				centeredHeptagonal, centeredOctagonal, centeredNonagonal, centeredDecagonal, star);
		twoDNotCentered.getItems().addAll(triangular, square, pentagonal, hexagonal, heptagonal, octagonal, nonagonal,
				decagonal, dodecagonal);
		threeD.getItems().addAll(threeDCentered, threeDNotCentered);
		threeDNotCentered.getItems().add(tetrahedral);
		threeDCentered.getItems().add(centeredTetrahedral);

		MenuBar menuBar = new MenuBar();

		menuBar.getMenus().addAll(general, encodings, math, hash, chart, file, security, table, crypto, web, image,
				sequences, esoteric);

		// Text Fields
		TextField affineA = new TextField("3");
		TextField affineB = new TextField("5");

		// Toolbars
		ToolBar hashToolBar = new ToolBar(new Label("Generate hash:"), HashButtons.generateMd5,
				HashButtons.generateSha1, HashButtons.generateSha256, HashButtons.generateSha512);
		ToolBar passwordToolBar = new ToolBar(passwordStrength);
		ToolBar tableToolBar = new ToolBar(generateTable);

		ToolBar affineToolBar = new ToolBar(new Label("Affine:"), CryptoButtons.encodeAffine,
				CryptoButtons.decodeAffine, CryptoButtons.bruteForceAffine, new Separator(), new Label("a = "), affineA,
				new Label("b = "), affineB);

		ToolBar pageToolBar = new ToolBar(new Label("Page:"), getSource, extractComments);

		MathToolbars.rowMathToolBar.setId("rowMath");
		MathToolbars.conversionMathToolBar.setId("conversionMath");
		hashToolBar.setId("sha1");
		ChartToolbars.frequenciesToolBar.setId("frequencies");
		ChartToolbars.imageHistogramsToolBar.setId("histograms");
		passwordToolBar.setId("password");
		tableToolBar.setId("table");

		affineToolBar.setId("affine");
		pageToolBar.setId("page");

		VBox toolBox = new VBox();
		toolBox.autosize();
		VBox textboxInfo = new VBox();
		textboxInfo.setMinSize(600, 600);

		VBox tableBox = new VBox();
		tableBox.setMinSize(600, 600);

		// Tabs
		TabPane tabPane = new TabPane();
		Tab textTab = new Tab("Text Editor", new HBox(TextAreas.textArea, new Separator(), textboxInfo));
		Tab tableTab = new Tab("Table", tableBox);

		Tab imageInfoTab = new Tab("ImageInfo");

		textTab.setClosable(false);
		tableTab.setClosable(false);
		imageInfoTab.setClosable(false);

		tabPane.getTabs().addAll(textTab, Tabs.chartTab, tableTab, Tabs.imageTab, imageInfoTab);

		HBox fileInfo = new HBox();
		fileInfo.setMinHeight(25);
		fileInfo.getChildren().addAll(new Label("Current file:"), CurrentLabels.currFile,
				new Label("\t\tCurrent image:"), CurrentLabels.currImage);

		VBox vbox = new VBox(menuBar, toolBox, tabPane, fileInfo);

		// Menu Actions
		menu11.setOnAction(action -> putRemove(toolBox, DashboardToolbars.dashboardToolBar));
		notations.setOnAction(action -> putRemove(toolBox, DashboardToolbars.notationsToolBar));
		textFilters.setOnAction(action -> putRemove(toolBox, DashboardToolbars.filteringToolBar));
		textArrangemets.setOnAction(action -> putRemove(toolBox, DashboardToolbars.arrangingToolBar));
		base.setOnAction(action -> putRemove(toolBox, EncodingToolbars.encodingToolBar));
		morse.setOnAction(action -> putRemove(toolBox, EncodingToolbars.morseToolBar));
		asciiTo.setOnAction(action -> putRemove(toolBox, EncodingToolbars.asciiToToolBar));
		hexTo.setOnAction(action -> putRemove(toolBox, EncodingToolbars.hexToToolBar));
		binaryTo.setOnAction(action -> putRemove(toolBox, EncodingToolbars.binaryToToolBar));
		keyboardLayouts.setOnAction(action -> putRemove(toolBox, EncodingToolbars.keyboardToolBar));
		rowMath.setOnAction(action -> putRemove(toolBox, MathToolbars.rowMathToolBar));
		conversionMath.setOnAction(action -> putRemove(toolBox, MathToolbars.conversionMathToolBar));
		generate.setOnAction(action -> putRemove(toolBox, hashToolBar));
		frequencies.setOnAction(action -> putRemove(toolBox, ChartToolbars.frequenciesToolBar));
		histograms.setOnAction(action -> putRemove(toolBox, ChartToolbars.imageHistogramsToolBar));
		manageFiles.setOnAction(action -> putRemove(toolBox, FileToolbars.filesToolBar));
		samplingFiles.setOnAction(action -> putRemove(toolBox, FileToolbars.samplingToolBar));
		passwords.setOnAction(action -> putRemove(toolBox, passwordToolBar));
		importTable.setOnAction(action -> putRemove(toolBox, tableToolBar));
		caesar.setOnAction(action -> putRemove(toolBox, CryptoToolbars.caesarToolBar));
		albam.setOnAction(action -> putRemove(toolBox, CryptoToolbars.albamToolBar));
		atbah.setOnAction(action -> putRemove(toolBox, CryptoToolbars.atbahToolBar));
		atbash.setOnAction(action -> putRemove(toolBox, CryptoToolbars.atbashToolBar));
		rotN.setOnAction(action -> putRemove(toolBox, CryptoToolbars.rotNToolBar));
		baconian.setOnAction(action -> putRemove(toolBox, StegoToolbars.baconianToolBar));
		affine.setOnAction(action -> putRemove(toolBox, affineToolBar));
		page.setOnAction(action -> putRemove(toolBox, pageToolBar));
		manage.setOnAction(action -> putRemove(toolBox, ImageToolbars.manageImageToolBar));
		rotate.setOnAction(action -> putRemove(toolBox, ImageToolbars.rotateImageToolBar));
		channel.setOnAction(action -> putRemove(toolBox, ImageToolbars.channelImageToolBar));
		grayscale.setOnAction(action -> putRemove(toolBox, ImageToolbars.grayScaleImageToolBar));
		imgHistory.setOnAction(action -> putRemove(toolBox, ImageToolbars.historyImageToolBar));
		yuv.setOnAction(action -> putRemove(toolBox, ImageToolbars.yuvImageToolBar));
		ycbcr.setOnAction(action -> putRemove(toolBox, ImageToolbars.yCbCrImageToolBar));
		pointProcessing.setOnAction(action -> putRemove(toolBox, ImageToolbars.pointPocessingImageToolBar));
		linearFilters.setOnAction(action -> putRemove(toolBox, ImageToolbars.linearFilterImageToolBar));
		qrCode.setOnAction(action -> putRemove(toolBox, ImageToolbars.qrImageToolBar));
		combine.setOnAction(action -> putRemove(toolBox, ImageToolbars.combineImageToolBar));
		cullen.setOnAction(action -> putRemove(toolBox, SequenceToolbars.cullenToolbar));
		fibonacci.setOnAction(action -> putRemove(toolBox, SequenceToolbars.fibonacciToolbar));
		jacobsthal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.jacobsthalToolbar));
		jacobsthalPell.setOnAction(action -> putRemove(toolBox, SequenceToolbars.jacobsthalPellToolbar));
		leonardo.setOnAction(action -> putRemove(toolBox, SequenceToolbars.leonardoToolbar));
		lucas.setOnAction(action -> putRemove(toolBox, SequenceToolbars.lucasToolbar));
		padovan.setOnAction(action -> putRemove(toolBox, SequenceToolbars.padovanToolbar));
		pell.setOnAction(action -> putRemove(toolBox, SequenceToolbars.pellToolbar));
		pellLucas.setOnAction(action -> putRemove(toolBox, SequenceToolbars.pellLucasToolbar));
		perrin.setOnAction(action -> putRemove(toolBox, SequenceToolbars.perrinToolbar));
		even.setOnAction(action -> putRemove(toolBox, SequenceToolbars.evenToolbar));
		odd.setOnAction(action -> putRemove(toolBox, SequenceToolbars.oddToolbar));
		square.setOnAction(action -> putRemove(toolBox, SequenceToolbars.squareToolbar));
		triangular.setOnAction(action -> putRemove(toolBox, SequenceToolbars.triangularToolbar));
		hexagonal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.hexagonalToolbar));
		heptagonal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.heptagonalToolbar));
		tetrahedral.setOnAction(action -> putRemove(toolBox, SequenceToolbars.tetrahedralToolbar));
		pentagonal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.pentagonalToolbar));
		octagonal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.octagonalToolbar));
		nonagonal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.nonagonalToolbar));
		decagonal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.decagonalToolbar));
		dodecagonal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.dodecagonalToolbar));
		centeredTriangular.setOnAction(action -> putRemove(toolBox, SequenceToolbars.centeredTriangularToolbar));
		centeredSquare.setOnAction(action -> putRemove(toolBox, SequenceToolbars.centeredSquareToolbar));
		centeredPentagonal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.centeredPentagonalToolbar));
		centeredHexagonal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.centeredHexagonalToolbar));
		centeredHeptagonal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.centeredHeptagonalToolbar));
		centeredOctagonal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.centeredOctagonalToolbar));
		centeredNonagonal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.centeredNonagonalToolbar));
		centeredDecagonal.setOnAction(action -> putRemove(toolBox, SequenceToolbars.centeredDecagonalToolbar));
		star.setOnAction(action -> putRemove(toolBox, SequenceToolbars.starToolbar));
		centeredTetrahedral.setOnAction(action -> putRemove(toolBox, SequenceToolbars.centeredTetrahedralToolbar));
		brainfuck.setOnAction(action -> putRemove(toolBox, EsotericToolbars.brainfuckToolbar));
		pikalang.setOnAction(action -> putRemove(toolBox, EsotericToolbars.pikalangToolbar));
		solbofuck.setOnAction(action -> putRemove(toolBox, EsotericToolbars.solbofuckToolbar));
		alphuck.setOnAction(action -> putRemove(toolBox, EsotericToolbars.alphuckToolbar));
		triplet.setOnAction(action -> putRemove(toolBox, EsotericToolbars.tripletToolbar));
		brainfuck3.setOnAction(action -> putRemove(toolBox, EsotericToolbars.brainfuck3Toolbar));
		brainfuckFace.setOnAction(action -> putRemove(toolBox, EsotericToolbars.brainfuckFaceToolbar));
		colonoscopy.setOnAction(action -> putRemove(toolBox, EsotericToolbars.colonoscopyToolbar));
		ook.setOnAction(action -> putRemove(toolBox, EsotericToolbars.ookToolbar));
		blub.setOnAction(action -> putRemove(toolBox, EsotericToolbars.blubToolbar));
		textStego.setOnAction(action -> putRemove(toolBox, StegoToolbars.textStegoToolBar));

		// Buttons Actions

		MathButtons.base2To10.setOnAction(action -> {
			TextAreas.textArea.setText(ConversionMathUtils.base2To10(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		MathButtons.base2ToN.setOnAction(action -> {
			TextAreas.textArea
					.setText(ConversionMathUtils.base2ToN(TextAreas.textArea.getText(), MathFields.base2To.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		MathButtons.base10To2.setOnAction(action -> {
			TextAreas.textArea.setText(ConversionMathUtils.base10To2(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		MathButtons.base10ToN.setOnAction(action -> {
			TextAreas.textArea.setText(
					ConversionMathUtils.base10ToN(TextAreas.textArea.getText(), MathFields.base10To.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		MathButtons.baseAToB.setOnAction(action -> {
			TextAreas.textArea.setText(ConversionMathUtils.baseAtoB(TextAreas.textArea.getText(),
					MathFields.baseATo.getText(), MathFields.baseBTo.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		HashButtons.generateSha1.setOnAction(action -> {
			try {
				TextAreas.textArea.setText(HashUtils.generateSha1(TextAreas.textArea.getText()));
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
				TextAreas.textArea.setText(HashUtils.generateSha256(TextAreas.textArea.getText()));
				DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
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
				TextAreas.textArea.setText(HashUtils.generateSha512(TextAreas.textArea.getText()));
				DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
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
				TextAreas.textArea.setText(HashUtils.generateMd5(TextAreas.textArea.getText()));
				DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		generateTable.setOnAction(action -> {
			if (!tableBox.getChildren().isEmpty()) {
				tableBox.getChildren().clear();
			}
			tableBox.getChildren().add(TableUtils.generateCsvTable("test", 100, true, TextAreas.textArea.getText()));
		});

		ImageButtons.info.setOnAction(action -> {
			imageInfoTab.setContent(ImageInfoUtils.generateInfo(Tabs.imageTab.getContent()));
		});

		CryptoButtons.encodeAffine.setOnAction(action -> {
			TextAreas.textArea.setText(AffineUtils.encode(Integer.parseInt(affineA.getText()),
					Integer.parseInt(affineB.getText()), TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		CryptoButtons.decodeAffine.setOnAction(action -> {
			TextAreas.textArea.setText(AffineUtils.decode(Integer.parseInt(affineA.getText()),
					Integer.parseInt(affineB.getText()), TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		CryptoButtons.bruteForceAffine.setOnAction(action -> {
			TextAreas.textArea.setText(AffineUtils.bruteforce(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		getSource.setOnAction(action -> {
			try {
				TextAreas.textArea.setText(PageUtils.getHTML(TextAreas.textArea.getText()));
				DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		extractComments.setOnAction(action -> {
			TextAreas.textArea.setText(PageUtils.extractComments(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});

		passwordStrength.setOnAction(action -> {
			if (!textboxInfo.getChildren().isEmpty()) {
				textboxInfo.getChildren().clear();
			}
			Password password = new Password(TextAreas.textArea.getText());
			ProgressIndicator pi = new ProgressIndicator(password.getStrength());

			HBox barBox = new HBox(new Label("Strength: "), pi);
			HBox upperBox = new HBox(new Label("Upper Case chars: "), new Label(String.valueOf(password.getLower())));
			HBox lowerBox = new HBox(new Label("Lower Case chars: "), new Label(String.valueOf(password.getUpper())));
			HBox digitBox = new HBox(new Label("Digits: "), new Label(String.valueOf(password.getDigits())));
			HBox specialBox = new HBox(new Label("Special chars: "), new Label(String.valueOf(password.getSpecials())));
			HBox lengthBox = new HBox(new Label("length: "), new Label(String.valueOf(password.getLength())));

			textboxInfo.getChildren().addAll(barBox, upperBox, lowerBox, digitBox, specialBox, lengthBox);
		});

		Scene scene = new Scene(vbox, primaryScreenBounds.getWidth(), primaryScreenBounds.getHeight());
		primaryStage.setScene(scene);
		TextAreas.textArea.setPrefSize(scene.getWidth(), scene.getHeight());
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

package application.builder.buttons;

import java.io.FileNotFoundException;

import application.builder.fields.ImageFields;
import application.builder.sliders.ImageSliders;
import application.builder.tabs.Tabs;
import application.builder.texareas.TextAreas;
import application.history.ImageHistoryUtils;
import application.image.ImageChannelsUtils;
import application.image.ImageGrayScaleUtils;
import application.image.ImageLinearFilterUtils;
import application.image.ImagePointProcessingUtils;
import application.image.ImageRotationUtils;
import application.image.ImageUtils;
import application.image.ImageYCbCrBT601Utils;
import application.image.ImageYUVBT601Utils;
import javafx.scene.control.Button;

public class ImageButtons {
	public static Button openImage = new Button("From Fs");
	public static Button openFromUrl = new Button("From Url");
	public static Button save = new Button("Save");
	public static Button info = new Button("Info");
	public static Button rotate90Left = new Button("Left 90");
	public static Button rotate90Right = new Button("Right 90");
	public static Button rotate180 = new Button("180");
	public static Button rotateCustom = new Button("Rotate");
	public static Button redChannel = new Button("Red");
	public static Button greenChannel = new Button("Green");
	public static Button blueChannel = new Button("Blue");
	public static Button grayAvg = new Button("Average");
	public static Button grayLumin = new Button("Luminescence");
	public static Button grayDesat = new Button("Desaturation");
	public static Button grayDecompMin = new Button("Min");
	public static Button grayDecompMax = new Button("Max");
	public static Button singleColorRed = new Button("Red");
	public static Button singleColorGreen = new Button("Green");
	public static Button singleColorBlue = new Button("Blue");
	public static Button imageUndo = new Button("Undo");
	public static Button imageRedo = new Button("Redo");

	public static Button yuvbt601y = new Button("Extract Y");
	public static Button yuvbt601u = new Button("Extract U");
	public static Button yuvbt601v = new Button("Extract V");
	public static Button yCbCrbt601y = new Button("Extract Y");
	public static Button yCbCrbt601cb = new Button("Extract Cb");
	public static Button yCbCrbt601cr = new Button("Extract Cr");

	public static Button negative = new Button("Negative");
	public static Button thresholding = new Button("Apply");
	public static Button power = new Button("Power");
	public static Button logarithmic = new Button("Logarithmic");

	public static Button linearRectangularFilter = new Button("Rectangular");
	public static Button linearCircularFilter = new Button("Circular");
	public static Button linearPyramidalFilter = new Button("Pyramidal");
	public static Button linearConeFilter = new Button("Cone");

	public static void init() {

		rotate90Left.setOnAction(action -> {
			ImageRotationUtils.rotate90Left(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		rotate90Right.setOnAction(action -> {
			ImageRotationUtils.rotate90Right(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		rotate180.setOnAction(action -> {
			ImageRotationUtils.rotate180(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		rotateCustom.setOnAction(action -> {
			ImageRotationUtils.rotateCustom(Tabs.imageTab.getContent(), ImageFields.rotateField.getText());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		redChannel.setOnAction(action -> {
			ImageChannelsUtils.getRedChannel(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		greenChannel.setOnAction(action -> {
			ImageChannelsUtils.getGreenChannel(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		blueChannel.setOnAction(action -> {
			ImageChannelsUtils.getBlueChannel(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		grayAvg.setOnAction(action -> {
			ImageGrayScaleUtils.toAverage(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		grayLumin.setOnAction(action -> {
			ImageGrayScaleUtils.toLuminescence(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		grayDesat.setOnAction(action -> {
			ImageGrayScaleUtils.toDesaturation(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		grayDecompMin.setOnAction(action -> {
			ImageGrayScaleUtils.toDecompositionMin(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		grayDecompMax.setOnAction(action -> {
			ImageGrayScaleUtils.toDecompositionMax(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		singleColorRed.setOnAction(action -> {
			ImageGrayScaleUtils.toSingleRed(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		singleColorGreen.setOnAction(action -> {
			ImageGrayScaleUtils.toSingleGreen(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		singleColorBlue.setOnAction(action -> {
			ImageGrayScaleUtils.toSingleBlue(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		yuvbt601y.setOnAction(action -> {
			ImageYUVBT601Utils.getYBT601(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		yuvbt601u.setOnAction(action -> {
			ImageYUVBT601Utils.getUBT601(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		yuvbt601v.setOnAction(action -> {
			ImageYUVBT601Utils.getVBT601(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		yCbCrbt601y.setOnAction(action -> {
			ImageYCbCrBT601Utils.getYBT601(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		yCbCrbt601cb.setOnAction(action -> {
			ImageYCbCrBT601Utils.getCbBT601(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		yCbCrbt601cr.setOnAction(action -> {
			ImageYCbCrBT601Utils.getCrBT601(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		negative.setOnAction(action -> {
			ImagePointProcessingUtils.negative(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		thresholding.setOnAction(action -> {
			ImagePointProcessingUtils.thresholding(Tabs.imageTab.getContent(), ImageSliders.slider.getValue());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		logarithmic.setOnAction(action -> {
			ImagePointProcessingUtils.logTransformation(Tabs.imageTab.getContent());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		power.setOnAction(action -> {
			ImagePointProcessingUtils.powTransformation(Tabs.imageTab.getContent(), ImageSliders.power.getValue());
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		linearRectangularFilter.setOnAction(action -> {
			ImageLinearFilterUtils.rectangular(Tabs.imageTab.getContent(),
					Integer.parseInt(ImageFields.filterSize.getText()));
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});
		linearCircularFilter.setOnAction(action -> {
			ImageLinearFilterUtils.circular(Tabs.imageTab.getContent(),
					Integer.parseInt(ImageFields.filterRadius.getText()));
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});

		openImage.setOnAction(action -> {
			try {
				Tabs.imageTab.setContent(ImageUtils.openImage());
				ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		});

		openFromUrl.setOnAction(action -> {
			Tabs.imageTab.setContent(ImageUtils.fromUrl(TextAreas.textArea.getText()));
			ImageHistoryUtils.updateImageHistroy(Tabs.imageTab.getContent());
		});

		save.setOnAction(action -> ImageUtils.save(Tabs.imageTab.getContent()));

		imageUndo.setOnAction(action -> ImageHistoryUtils.undoImageHistroy(Tabs.imageTab.getContent()));
		imageRedo.setOnAction(action -> ImageHistoryUtils.redoImageHistroy(Tabs.imageTab.getContent()));
	}
}

package application.builder.toolbars;

import application.builder.buttons.ImageButtons;
import application.builder.fields.ImageFields;
import application.builder.sliders.ImageSliders;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;

public class ImageToolbars {
	public static ToolBar manageImageToolBar = new ToolBar(new Label("Open:"), ImageButtons.openImage,
			ImageButtons.openFromUrl, new Separator(), ImageButtons.save, new Separator(), ImageButtons.info);
	public static ToolBar rotateImageToolBar = new ToolBar(new Label("Rotate:"), ImageButtons.rotate90Left,
			ImageButtons.rotate90Right, ImageButtons.rotate180, new Separator(), new Label("Custom : "),
			ImageFields.rotateField, ImageButtons.rotateCustom);
	public static ToolBar channelImageToolBar = new ToolBar(new Label("Extract channel:"), ImageButtons.redChannel,
			ImageButtons.greenChannel, ImageButtons.blueChannel);
	public static ToolBar grayScaleImageToolBar = new ToolBar(new Label("To gray scale:"), ImageButtons.grayAvg,
			ImageButtons.grayLumin, ImageButtons.grayDesat, new Separator(), new Label("Decomposition: "),
			ImageButtons.grayDecompMin, ImageButtons.grayDecompMax, new Separator(), new Label("Single Color: "),
			ImageButtons.singleColorRed, ImageButtons.singleColorGreen, ImageButtons.singleColorBlue);
	public static ToolBar historyImageToolBar = new ToolBar(new Label("Image History:"), ImageButtons.imageUndo,
			ImageButtons.imageRedo);
	public static ToolBar yuvImageToolBar = new ToolBar(new Label("YUV BT.106:"), ImageButtons.yuvbt601y,
			ImageButtons.yuvbt601u, ImageButtons.yuvbt601v);
	public static ToolBar yCbCrImageToolBar = new ToolBar(new Label("Y'CbCr BT.106:"), ImageButtons.yCbCrbt601y,
			ImageButtons.yCbCrbt601cb, ImageButtons.yCbCrbt601cr);
	public static ToolBar pointPocessingImageToolBar = new ToolBar(new Label("Point processing"), ImageButtons.negative,
			new Separator(), new Label("Thresholding"), ImageSliders.slider, ImageButtons.thresholding, new Separator(),
			new Label("Tranfsormations"), ImageButtons.logarithmic, ImageSliders.power, ImageButtons.power,
			new Separator(), ImageButtons.emphatize);

	public static ToolBar linearFilterImageToolBar = new ToolBar(new Label("Linear filters"), new Separator(),
			new Label("Size:"), ImageFields.filterSize, new Label("Radius:"), ImageFields.filterRadius, new Separator(),
			new Label("Apply"), ImageButtons.linearRectangularFilter, ImageButtons.linearCircularFilter,
			ImageButtons.linearPyramidalFilter, ImageButtons.linearConeFilter);

	public static ToolBar qrImageToolBar = new ToolBar(new Label("QR Code:"), ImageButtons.readQr);

	public static ToolBar combineImageToolBar = new ToolBar(new Label("Combine: "), ImageButtons.subtract,
			ImageButtons.and, ImageButtons.or, ImageButtons.xor);

	public static void init() {
		manageImageToolBar.setId("manageImage");
		rotateImageToolBar.setId("rotateImage");
		channelImageToolBar.setId("channelImage");
		grayScaleImageToolBar.setId("grayScaleImage");
		historyImageToolBar.setId("historyImage");
		yuvImageToolBar.setId("yuvImage");
		yCbCrImageToolBar.setId("yCbCrImage");
		pointPocessingImageToolBar.setId("pointProcessingImage");
		linearFilterImageToolBar.setId("linearFilterImage");
		qrImageToolBar.setId("qrCodeImage");
		combineImageToolBar.setId("subtractImage");
	}

}

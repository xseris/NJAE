package application.builder.toolbars;

import application.builder.buttons.ImageButtons;
import application.builder.fields.ImageFields;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;

public class ImageToolbars {
	public static ToolBar manageImageToolBar = new ToolBar(new Label("Image:"), ImageButtons.openImage);
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

}

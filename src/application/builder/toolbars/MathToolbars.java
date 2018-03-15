package application.builder.toolbars;

import application.builder.buttons.MathButtons;
import application.builder.fields.MathFields;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;

public class MathToolbars {

	public static ToolBar rowMathToolBar = new ToolBar(new Label("Row Math:"), MathButtons.sumLines,
			MathButtons.multiplyLines, MathButtons.averageLines, MathButtons.maxOfLines, MathButtons.minOfLines);
	public static ToolBar conversionMathToolBar = new ToolBar(new Label("Base 2: "), MathButtons.base2To10,
			MathFields.base2To, MathButtons.base2ToN, new Separator(), new Label("Base 10:"), MathButtons.base10To2,
			MathFields.base10To, MathButtons.base10ToN, new Separator(), new Label("Base "), MathFields.baseATo,
			new Label(" to base "), MathFields.baseBTo, MathButtons.baseAToB);

}

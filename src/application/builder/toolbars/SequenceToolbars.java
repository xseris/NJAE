package application.builder.toolbars;

import application.builder.buttons.SequenceButtons;
import application.builder.fields.SequenceFields;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;

public class SequenceToolbars {
	public static ToolBar fibonacciToolbar = new ToolBar(new Label("Fibonacci:"), SequenceButtons.showFibonacci,
			new Separator(), new Label("Fib (x):"), SequenceFields.fibX, SequenceButtons.getFibX,
			SequenceButtons.getFibTillX);
	public static ToolBar evenToolbar = new ToolBar(new Label("Even:"), SequenceButtons.showEven, new Separator(),
			new Label("Even (x):"), SequenceFields.evenX, SequenceButtons.getEvenX, SequenceButtons.getEvenTillX);
	public static ToolBar oddToolbar = new ToolBar(new Label("Odd:"), SequenceButtons.showOdd, new Separator(),
			new Label("Odd (x):"), SequenceFields.oddX, SequenceButtons.getOddX, SequenceButtons.getOddTillX);

	public static void init() {
		fibonacciToolbar.setId("fibonacciToolbar");
		evenToolbar.setId("evenToolbar");
		oddToolbar.setId("oddToolbar");
	}
}

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

	public static void init() {
		fibonacciToolbar.setId("fibonacciToolbar");
	}
}

package application.builder.buttons;

import application.builder.fields.SequenceFields;
import application.builder.texareas.TextAreas;
import application.sequences.FibonacciUtils;
import javafx.scene.control.Button;

public class SequenceButtons {

	public static Button showFibonacci = new Button("Show Formula");
	public static Button getFibX = new Button("Get nth element");
	public static Button getFibTillX = new Button("Get first n elements");

	public static void init() {
		showFibonacci.setOnAction(action -> TextAreas.textArea.setText(FibonacciUtils.getFormula()));

		getFibX.setOnAction(action -> TextAreas.textArea
				.setText(FibonacciUtils.getX(Integer.parseInt(SequenceFields.fibX.getText()))));

		getFibTillX.setOnAction(action -> TextAreas.textArea
				.setText(FibonacciUtils.getTillX(Integer.parseInt(SequenceFields.fibX.getText()))));
	}

}

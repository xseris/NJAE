package application.builder.buttons;

import application.builder.fields.SequenceFields;
import application.builder.texareas.TextAreas;
import application.sequences.EvenUtils;
import application.sequences.FibonacciUtils;
import application.sequences.OddUtils;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class SequenceButtons {

	public static Button showFibonacci = new Button("Show Formula");
	public static Button getFibX = new Button("Get nth element");
	public static Button getFibTillX = new Button("Get first n elements");

	public static Button showEven = new Button("Show Formula");
	public static Button getEvenX = new Button("Get nth element");
	public static Button getEvenTillX = new Button("Get first n elements");

	public static Button showOdd = new Button("Show Formula");
	public static Button getOddX = new Button("Get nth element");
	public static Button getOddTillX = new Button("Get first n elements");

	public static void init() {
		showFibonacci.setOnAction(action -> TextAreas.textArea.setText(FibonacciUtils.getFormula()));
		getFibX.setOnAction(action -> TextAreas.textArea
				.setText(FibonacciUtils.getX(Integer.parseInt(SequenceFields.fibX.getText()))));
		getFibTillX.setOnAction(action -> TextAreas.textArea
				.setText(FibonacciUtils.getTillX(Integer.parseInt(SequenceFields.fibX.getText()))));

		showEven.setOnAction(action -> TextAreas.textArea.setText(EvenUtils.getFormula()));
		getEvenX.setOnAction(
				action -> TextAreas.textArea.setText(EvenUtils.getX(Integer.parseInt(SequenceFields.evenX.getText()))));
		getEvenTillX.setOnAction(action -> TextAreas.textArea
				.setText(EvenUtils.getTillX(Integer.parseInt(SequenceFields.evenX.getText()))));

		showOdd.setOnAction(action -> TextAreas.textArea.setText(OddUtils.getFormula()));
		getOddX.setOnAction(
				action -> TextAreas.textArea.setText(OddUtils.getX(Integer.parseInt(SequenceFields.oddX.getText()))));
		getOddTillX.setOnAction(action -> TextAreas.textArea
				.setText(OddUtils.getTillX(Integer.parseInt(SequenceFields.oddX.getText()))));
	}

}

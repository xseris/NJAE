package application.builder.buttons;

import application.builder.fields.SequenceFields;
import application.builder.texareas.TextAreas;
import application.sequences.EvenUtils;
import application.sequences.FibonacciUtils;
import application.sequences.HeptagonalUtils;
import application.sequences.HexagonalUtils;
import application.sequences.OctagonalUtils;
import application.sequences.OddUtils;
import application.sequences.PentagonalUtils;
import application.sequences.SquareUtils;
import application.sequences.TetrahedralUtils;
import application.sequences.TriangularUtils;
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

	public static Button showTriangular = new Button("Show Formula");
	public static Button getTriangularX = new Button("Get nth element");
	public static Button getTriangularTillX = new Button("Get first n elements");

	public static Button showSquare = new Button("Show Formula");
	public static Button getSquareX = new Button("Get nth element");
	public static Button getSquareTillX = new Button("Get first n elements");

	public static Button showHexagonal = new Button("Show Formula");
	public static Button getHexagonalX = new Button("Get nth element");
	public static Button getHexagonalTillX = new Button("Get first n elements");

	public static Button showHeptagonal = new Button("Show Formula");
	public static Button getHeptagonalX = new Button("Get nth element");
	public static Button getHeptagonalTillX = new Button("Get first n elements");

	public static Button showTetrahedral = new Button("Show Formula");
	public static Button getTetrahedralX = new Button("Get nth element");
	public static Button getTetrahedralTillX = new Button("Get first n elements");

	public static Button showPentagonal = new Button("Show Formula");
	public static Button getPentagonalX = new Button("Get nth element");
	public static Button getPentagonalTillX = new Button("Get first n elements");

	public static Button showOctagonal = new Button("Show Formula");
	public static Button getOctagonalX = new Button("Get nth element");
	public static Button getOctagonalTillX = new Button("Get first n elements");

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

		showTriangular.setOnAction(action -> TextAreas.textArea.setText(TriangularUtils.getFormula()));
		getTriangularX.setOnAction(action -> TextAreas.textArea
				.setText(TriangularUtils.getX(Integer.parseInt(SequenceFields.triangularX.getText()))));
		getTriangularTillX.setOnAction(action -> TextAreas.textArea
				.setText(TriangularUtils.getTillX(Integer.parseInt(SequenceFields.triangularX.getText()))));

		showSquare.setOnAction(action -> TextAreas.textArea.setText(SquareUtils.getFormula()));
		getSquareX.setOnAction(action -> TextAreas.textArea
				.setText(SquareUtils.getX(Integer.parseInt(SequenceFields.squareX.getText()))));
		getSquareTillX.setOnAction(action -> TextAreas.textArea
				.setText(SquareUtils.getTillX(Integer.parseInt(SequenceFields.squareX.getText()))));

		showHexagonal.setOnAction(action -> TextAreas.textArea.setText(HexagonalUtils.getFormula()));
		getHexagonalX.setOnAction(action -> TextAreas.textArea
				.setText(HexagonalUtils.getX(Integer.parseInt(SequenceFields.hexagonalX.getText()))));
		getHexagonalTillX.setOnAction(action -> TextAreas.textArea
				.setText(HexagonalUtils.getTillX(Integer.parseInt(SequenceFields.hexagonalX.getText()))));

		showHeptagonal.setOnAction(action -> TextAreas.textArea.setText(HeptagonalUtils.getFormula()));
		getHeptagonalX.setOnAction(action -> TextAreas.textArea
				.setText(HeptagonalUtils.getX(Integer.parseInt(SequenceFields.heptagonalX.getText()))));
		getHeptagonalTillX.setOnAction(action -> TextAreas.textArea
				.setText(HeptagonalUtils.getTillX(Integer.parseInt(SequenceFields.heptagonalX.getText()))));

		showTetrahedral.setOnAction(action -> TextAreas.textArea.setText(TetrahedralUtils.getFormula()));
		getTetrahedralX.setOnAction(action -> TextAreas.textArea
				.setText(TetrahedralUtils.getX(Integer.parseInt(SequenceFields.tetrahedralX.getText()))));
		getTetrahedralTillX.setOnAction(action -> TextAreas.textArea
				.setText(TetrahedralUtils.getTillX(Integer.parseInt(SequenceFields.tetrahedralX.getText()))));

		showPentagonal.setOnAction(action -> TextAreas.textArea.setText(PentagonalUtils.getFormula()));
		getPentagonalX.setOnAction(action -> TextAreas.textArea
				.setText(PentagonalUtils.getX(Integer.parseInt(SequenceFields.pentagonalX.getText()))));
		getPentagonalTillX.setOnAction(action -> TextAreas.textArea
				.setText(PentagonalUtils.getTillX(Integer.parseInt(SequenceFields.pentagonalX.getText()))));

		showOctagonal.setOnAction(action -> TextAreas.textArea.setText(OctagonalUtils.getFormula()));
		getOctagonalX.setOnAction(action -> TextAreas.textArea
				.setText(OctagonalUtils.getX(Integer.parseInt(SequenceFields.octagonalX.getText()))));
		getOctagonalTillX.setOnAction(action -> TextAreas.textArea
				.setText(OctagonalUtils.getTillX(Integer.parseInt(SequenceFields.octagonalX.getText()))));
	}

}

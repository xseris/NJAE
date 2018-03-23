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
	public static ToolBar squareToolbar = new ToolBar(new Label("Square:"), SequenceButtons.showSquare, new Separator(),
			new Label("Square (x):"), SequenceFields.squareX, SequenceButtons.getSquareX,
			SequenceButtons.getSquareTillX);
	public static ToolBar triangularToolbar = new ToolBar(new Label("Triangular:"), SequenceButtons.showTriangular,
			new Separator(), new Label("Triangular (x):"), SequenceFields.triangularX, SequenceButtons.getTriangularX,
			SequenceButtons.getTriangularTillX);
	public static ToolBar hexagonalToolbar = new ToolBar(new Label("Hexagonal:"), SequenceButtons.showHexagonal,
			new Separator(), new Label("Hexagonal (x):"), SequenceFields.hexagonalX, SequenceButtons.getHexagonalX,
			SequenceButtons.getHexagonalTillX);
	public static ToolBar heptagonalToolbar = new ToolBar(new Label("Heptagonal:"), SequenceButtons.showHeptagonal,
			new Separator(), new Label("Heptagonal (x):"), SequenceFields.heptagonalX, SequenceButtons.getHeptagonalX,
			SequenceButtons.getHeptagonalTillX);
	public static ToolBar tetrahedralToolbar = new ToolBar(new Label("Tetrahedral:"), SequenceButtons.showTetrahedral,
			new Separator(), new Label("Tetrahedral (x):"), SequenceFields.tetrahedralX,
			SequenceButtons.getTetrahedralX, SequenceButtons.getTetrahedralTillX);
	public static ToolBar pentagonalToolbar = new ToolBar(new Label("Pentagonal:"), SequenceButtons.showPentagonal,
			new Separator(), new Label("Pentagonal (x):"), SequenceFields.pentagonalX, SequenceButtons.getPentagonalX,
			SequenceButtons.getPentagonalTillX);
	public static ToolBar octagonalToolbar = new ToolBar(new Label("Octagonal:"), SequenceButtons.showOctagonal,
			new Separator(), new Label("Octagonal (x):"), SequenceFields.octagonalX, SequenceButtons.getOctagonalX,
			SequenceButtons.getOctagonalTillX);

	public static void init() {
		fibonacciToolbar.setId("fibonacciToolbar");
		evenToolbar.setId("evenToolbar");
		oddToolbar.setId("oddToolbar");
		squareToolbar.setId("squareToolbar");
		triangularToolbar.setId("triangularToolbar");
		hexagonalToolbar.setId("hexagonalToolbar");
		heptagonalToolbar.setId("heptagonalToolbar");
		tetrahedralToolbar.setId("tetrahedralToolbar");
		pentagonalToolbar.setId("pentagonalToolbar");
		octagonalToolbar.setId("octagonalToolbar");
	}
}

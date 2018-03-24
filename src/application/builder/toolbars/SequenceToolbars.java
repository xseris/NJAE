package application.builder.toolbars;

import application.builder.buttons.sequences.FigurativeSequenceButtons;
import application.builder.buttons.sequences.SequenceButtons;
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

	public static ToolBar squareToolbar = new ToolBar(new Label("Square:"), FigurativeSequenceButtons.showSquare,
			new Separator(), new Label("Square (x):"), SequenceFields.squareX, FigurativeSequenceButtons.getSquareX,
			FigurativeSequenceButtons.getSquareTillX);
	public static ToolBar triangularToolbar = new ToolBar(new Label("Triangular:"),
			FigurativeSequenceButtons.showTriangular, new Separator(), new Label("Triangular (x):"),
			SequenceFields.triangularX, FigurativeSequenceButtons.getTriangularX,
			FigurativeSequenceButtons.getTriangularTillX);
	public static ToolBar hexagonalToolbar = new ToolBar(new Label("Hexagonal:"),
			FigurativeSequenceButtons.showHexagonal, new Separator(), new Label("Hexagonal (x):"),
			SequenceFields.hexagonalX, FigurativeSequenceButtons.getHexagonalX,
			FigurativeSequenceButtons.getHexagonalTillX);
	public static ToolBar heptagonalToolbar = new ToolBar(new Label("Heptagonal:"),
			FigurativeSequenceButtons.showHeptagonal, new Separator(), new Label("Heptagonal (x):"),
			SequenceFields.heptagonalX, FigurativeSequenceButtons.getHeptagonalX,
			FigurativeSequenceButtons.getHeptagonalTillX);
	public static ToolBar tetrahedralToolbar = new ToolBar(new Label("Tetrahedral:"),
			FigurativeSequenceButtons.showTetrahedral, new Separator(), new Label("Tetrahedral (x):"),
			SequenceFields.tetrahedralX, FigurativeSequenceButtons.getTetrahedralX,
			FigurativeSequenceButtons.getTetrahedralTillX);
	public static ToolBar pentagonalToolbar = new ToolBar(new Label("Pentagonal:"),
			FigurativeSequenceButtons.showPentagonal, new Separator(), new Label("Pentagonal (x):"),
			SequenceFields.pentagonalX, FigurativeSequenceButtons.getPentagonalX,
			FigurativeSequenceButtons.getPentagonalTillX);
	public static ToolBar octagonalToolbar = new ToolBar(new Label("Octagonal:"),
			FigurativeSequenceButtons.showOctagonal, new Separator(), new Label("Octagonal (x):"),
			SequenceFields.octagonalX, FigurativeSequenceButtons.getOctagonalX,
			FigurativeSequenceButtons.getOctagonalTillX);
	public static ToolBar nonagonalToolbar = new ToolBar(new Label("Nonagonal:"),
			FigurativeSequenceButtons.showNonagonal, new Separator(), new Label("Nonagonal (x):"),
			SequenceFields.nonagonalX, FigurativeSequenceButtons.getNonagonalX,
			FigurativeSequenceButtons.getNonagonalTillX);
	public static ToolBar decagonalToolbar = new ToolBar(new Label("Decagonal:"),
			FigurativeSequenceButtons.showDecagonal, new Separator(), new Label("Decagonal (x):"),
			SequenceFields.decagonalX, FigurativeSequenceButtons.getDecagonalX,
			FigurativeSequenceButtons.getDecagonalTillX);
	public static ToolBar dodecagonalToolbar = new ToolBar(new Label("Dodecagonal:"),
			FigurativeSequenceButtons.showDodecagonal, new Separator(), new Label("Dodecagonal (x):"),
			SequenceFields.dodecagonalX, FigurativeSequenceButtons.getDodecagonalX,
			FigurativeSequenceButtons.getDodecagonalTillX);

	public static ToolBar centeredSquareToolbar = new ToolBar(new Label("Centered Square:"),
			FigurativeSequenceButtons.showCenteredSquare, new Separator(), new Label("Square (x):"),
			SequenceFields.centeredSquareX, FigurativeSequenceButtons.getCenteredSquareX,
			FigurativeSequenceButtons.getCenteredSquareTillX);
	public static ToolBar centeredTriangularToolbar = new ToolBar(new Label("Centered Triangular:"),
			FigurativeSequenceButtons.showCenteredTriangular, new Separator(), new Label("Centered Triangular (x):"),
			SequenceFields.centeredTriangularX, FigurativeSequenceButtons.getCenteredTriangularX,
			FigurativeSequenceButtons.getCenteredTriangularTillX);
	public static ToolBar centeredHexagonalToolbar = new ToolBar(new Label("Centered Hexagonal:"),
			FigurativeSequenceButtons.showCenteredHexagonal, new Separator(), new Label("Centered Hexagonal (x):"),
			SequenceFields.centeredHexagonalX, FigurativeSequenceButtons.getCenteredHexagonalX,
			FigurativeSequenceButtons.getCenteredHexagonalTillX);
	public static ToolBar centeredHeptagonalToolbar = new ToolBar(new Label("Centered Heptagonal:"),
			FigurativeSequenceButtons.showCenteredHeptagonal, new Separator(), new Label("Centered Heptagonal (x):"),
			SequenceFields.centeredHeptagonalX, FigurativeSequenceButtons.getCenteredHeptagonalX,
			FigurativeSequenceButtons.getCenteredHeptagonalTillX);
	public static ToolBar centeredTetrahedralToolbar = new ToolBar(new Label("Centered Tetrahedral:"),
			FigurativeSequenceButtons.showCenteredTetrahedral, new Separator(), new Label("Centered Tetrahedral (x):"),
			SequenceFields.centeredTetrahedralX, FigurativeSequenceButtons.getCenteredTetrahedralX,
			FigurativeSequenceButtons.getCenteredTetrahedralTillX);
	public static ToolBar centeredPentagonalToolbar = new ToolBar(new Label("Centered Pentagonal:"),
			FigurativeSequenceButtons.showCenteredPentagonal, new Separator(), new Label("Centered Pentagonal (x):"),
			SequenceFields.centeredPentagonalX, FigurativeSequenceButtons.getCenteredPentagonalX,
			FigurativeSequenceButtons.getCenteredPentagonalTillX);
	public static ToolBar centeredOctagonalToolbar = new ToolBar(new Label("Centered Octagonal:"),
			FigurativeSequenceButtons.showCenteredOctagonal, new Separator(), new Label("Centered Octagonal (x):"),
			SequenceFields.centeredOctagonalX, FigurativeSequenceButtons.getCenteredOctagonalX,
			FigurativeSequenceButtons.getCenteredOctagonalTillX);
	public static ToolBar centeredNonagonalToolbar = new ToolBar(new Label("Centered Nonagonal:"),
			FigurativeSequenceButtons.showCenteredNonagonal, new Separator(), new Label("Centered Nonagonal (x):"),
			SequenceFields.centeredNonagonalX, FigurativeSequenceButtons.getCenteredNonagonalX,
			FigurativeSequenceButtons.getCenteredNonagonalTillX);
	public static ToolBar centeredDecagonalToolbar = new ToolBar(new Label("Centered Decagonal:"),
			FigurativeSequenceButtons.showCenteredDecagonal, new Separator(), new Label("Centered Decagonal (x):"),
			SequenceFields.centeredDecagonalX, FigurativeSequenceButtons.getCenteredDecagonalX,
			FigurativeSequenceButtons.getCenteredDecagonalTillX);

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
		nonagonalToolbar.setId("nonagonalToolbar");
		decagonalToolbar.setId("decagonalToolbar");
		dodecagonalToolbar.setId("dodecagonalToolbar");

		centeredSquareToolbar.setId("squareToolbar");
		centeredTriangularToolbar.setId("triangularToolbar");
		centeredHexagonalToolbar.setId("hexagonalToolbar");
		centeredHeptagonalToolbar.setId("heptagonalToolbar");
		centeredTetrahedralToolbar.setId("tetrahedralToolbar");
		centeredPentagonalToolbar.setId("pentagonalToolbar");
		centeredOctagonalToolbar.setId("octagonalToolbar");
		centeredNonagonalToolbar.setId("nonagonalToolbar");
		centeredDecagonalToolbar.setId("decagonalToolbar");

	}
}

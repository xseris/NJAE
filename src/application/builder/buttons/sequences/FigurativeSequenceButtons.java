package application.builder.buttons.sequences;

import application.builder.fields.SequenceFields;
import application.builder.tabs.Tabs;
import application.builder.texareas.TextAreas;
import application.sequences.CenteredDecagonalUtils;
import application.sequences.CenteredHeptagonalUtils;
import application.sequences.CenteredHexagonalUtils;
import application.sequences.CenteredNonagonalUtils;
import application.sequences.CenteredOctagonalUtils;
import application.sequences.CenteredPentagonalUtils;
import application.sequences.CenteredSquareUtils;
import application.sequences.CenteredTetrahedralUtils;
import application.sequences.CenteredTriangularUtils;
import application.sequences.DecagonalUtils;
import application.sequences.DodecagonalUtils;
import application.sequences.HeptagonalUtils;
import application.sequences.HexagonalUtils;
import application.sequences.NonagonalUtils;
import application.sequences.OctagonalUtils;
import application.sequences.PentagonalUtils;
import application.sequences.SquareUtils;
import application.sequences.StarUtils;
import application.sequences.TetrahedralUtils;
import application.sequences.TriangularUtils;
import javafx.scene.control.Button;

public class FigurativeSequenceButtons {

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

	public static Button showNonagonal = new Button("Show Formula");
	public static Button getNonagonalX = new Button("Get nth element");
	public static Button getNonagonalTillX = new Button("Get first n elements");

	public static Button showDecagonal = new Button("Show Formula");
	public static Button getDecagonalX = new Button("Get nth element");
	public static Button getDecagonalTillX = new Button("Get first n elements");

	public static Button showDodecagonal = new Button("Show Formula");
	public static Button getDodecagonalX = new Button("Get nth element");
	public static Button getDodecagonalTillX = new Button("Get first n elements");

	public static Button showCenteredTriangular = new Button("Show Formula");
	public static Button getCenteredTriangularX = new Button("Get nth element");
	public static Button getCenteredTriangularTillX = new Button("Get first n elements");

	public static Button showCenteredSquare = new Button("Show Formula");
	public static Button getCenteredSquareX = new Button("Get nth element");
	public static Button getCenteredSquareTillX = new Button("Get first n elements");

	public static Button showCenteredHexagonal = new Button("Show Formula");
	public static Button getCenteredHexagonalX = new Button("Get nth element");
	public static Button getCenteredHexagonalTillX = new Button("Get first n elements");

	public static Button showCenteredHeptagonal = new Button("Show Formula");
	public static Button getCenteredHeptagonalX = new Button("Get nth element");
	public static Button getCenteredHeptagonalTillX = new Button("Get first n elements");
	public static Button plotCenteredHeptagonal = new Button("Plot till");
	public static Button appendCenteredHeptagonal = new Button("Append till");

	public static Button showCenteredTetrahedral = new Button("Show Formula");
	public static Button getCenteredTetrahedralX = new Button("Get nth element");
	public static Button getCenteredTetrahedralTillX = new Button("Get first n elements");

	public static Button showCenteredPentagonal = new Button("Show Formula");
	public static Button getCenteredPentagonalX = new Button("Get nth element");
	public static Button getCenteredPentagonalTillX = new Button("Get first n elements");

	public static Button showCenteredOctagonal = new Button("Show Formula");
	public static Button getCenteredOctagonalX = new Button("Get nth element");
	public static Button getCenteredOctagonalTillX = new Button("Get first n elements");

	public static Button showCenteredNonagonal = new Button("Show Formula");
	public static Button getCenteredNonagonalX = new Button("Get nth element");
	public static Button getCenteredNonagonalTillX = new Button("Get first n elements");

	public static Button showCenteredDecagonal = new Button("Show Formula");
	public static Button getCenteredDecagonalX = new Button("Get nth element");
	public static Button getCenteredDecagonalTillX = new Button("Get first n elements");
	public static Button plotCenteredDecagonal = new Button("Plot till");
	public static Button appendCenteredDecagonal = new Button("Append till");

	public static Button showStar = new Button("Show Formula");
	public static Button getStarX = new Button("Get nth element");
	public static Button getStarTillX = new Button("Get first n elements");

	public static void init() {

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

		showNonagonal.setOnAction(action -> TextAreas.textArea.setText(NonagonalUtils.getFormula()));
		getNonagonalX.setOnAction(action -> TextAreas.textArea
				.setText(NonagonalUtils.getX(Integer.parseInt(SequenceFields.nonagonalX.getText()))));
		getNonagonalTillX.setOnAction(action -> TextAreas.textArea
				.setText(NonagonalUtils.getTillX(Integer.parseInt(SequenceFields.nonagonalX.getText()))));

		showDecagonal.setOnAction(action -> TextAreas.textArea.setText(DecagonalUtils.getFormula()));
		getDecagonalX.setOnAction(action -> TextAreas.textArea
				.setText(DecagonalUtils.getX(Integer.parseInt(SequenceFields.decagonalX.getText()))));
		getDecagonalTillX.setOnAction(action -> TextAreas.textArea
				.setText(DecagonalUtils.getTillX(Integer.parseInt(SequenceFields.decagonalX.getText()))));

		showDodecagonal.setOnAction(action -> TextAreas.textArea.setText(DodecagonalUtils.getFormula()));
		getDodecagonalX.setOnAction(action -> TextAreas.textArea
				.setText(DodecagonalUtils.getX(Integer.parseInt(SequenceFields.dodecagonalX.getText()))));
		getDodecagonalTillX.setOnAction(action -> TextAreas.textArea
				.setText(DodecagonalUtils.getTillX(Integer.parseInt(SequenceFields.dodecagonalX.getText()))));

		showCenteredTriangular.setOnAction(action -> TextAreas.textArea.setText(CenteredTriangularUtils.getFormula()));
		getCenteredTriangularX.setOnAction(action -> TextAreas.textArea
				.setText(CenteredTriangularUtils.getX(Integer.parseInt(SequenceFields.centeredTriangularX.getText()))));
		getCenteredTriangularTillX.setOnAction(action -> TextAreas.textArea.setText(
				CenteredTriangularUtils.getTillX(Integer.parseInt(SequenceFields.centeredTriangularX.getText()))));

		showCenteredSquare.setOnAction(action -> TextAreas.textArea.setText(CenteredSquareUtils.getFormula()));
		getCenteredSquareX.setOnAction(action -> TextAreas.textArea
				.setText(CenteredSquareUtils.getX(Integer.parseInt(SequenceFields.centeredSquareX.getText()))));
		getCenteredSquareTillX.setOnAction(action -> TextAreas.textArea
				.setText(CenteredSquareUtils.getTillX(Integer.parseInt(SequenceFields.centeredSquareX.getText()))));

		showCenteredHexagonal.setOnAction(action -> TextAreas.textArea.setText(CenteredHexagonalUtils.getFormula()));
		getCenteredHexagonalX.setOnAction(action -> TextAreas.textArea
				.setText(CenteredHexagonalUtils.getX(Integer.parseInt(SequenceFields.centeredHexagonalX.getText()))));
		getCenteredHexagonalTillX.setOnAction(action -> TextAreas.textArea.setText(
				CenteredHexagonalUtils.getTillX(Integer.parseInt(SequenceFields.centeredHexagonalX.getText()))));

		showCenteredHeptagonal.setOnAction(action -> TextAreas.textArea.setText(CenteredHeptagonalUtils.getFormula()));
		getCenteredHeptagonalX.setOnAction(action -> TextAreas.textArea
				.setText(CenteredHeptagonalUtils.getX(Integer.parseInt(SequenceFields.centeredHeptagonalX.getText()))));
		getCenteredHeptagonalTillX.setOnAction(action -> TextAreas.textArea.setText(
				CenteredHeptagonalUtils.getTillX(Integer.parseInt(SequenceFields.centeredHeptagonalX.getText()))));
		plotCenteredHeptagonal.setOnAction(action -> {
			Tabs.chartTab.setContent(
					CenteredHeptagonalUtils.plot(Integer.parseInt(SequenceFields.centeredHeptagonalX.getText())));
		});
		appendCenteredHeptagonal.setOnAction(action -> {
			Tabs.chartTab.setContent(
					CenteredHeptagonalUtils.append(Integer.parseInt(SequenceFields.centeredHeptagonalX.getText())));
		});

		showCenteredTetrahedral
				.setOnAction(action -> TextAreas.textArea.setText(CenteredTetrahedralUtils.getFormula()));
		getCenteredTetrahedralX.setOnAction(action -> TextAreas.textArea.setText(
				CenteredTetrahedralUtils.getX(Integer.parseInt(SequenceFields.centeredTetrahedralX.getText()))));
		getCenteredTetrahedralTillX.setOnAction(action -> TextAreas.textArea.setText(
				CenteredTetrahedralUtils.getTillX(Integer.parseInt(SequenceFields.centeredTetrahedralX.getText()))));

		showCenteredPentagonal.setOnAction(action -> TextAreas.textArea.setText(CenteredPentagonalUtils.getFormula()));
		getCenteredPentagonalX.setOnAction(action -> TextAreas.textArea
				.setText(CenteredPentagonalUtils.getX(Integer.parseInt(SequenceFields.centeredPentagonalX.getText()))));
		getCenteredPentagonalTillX.setOnAction(action -> TextAreas.textArea.setText(
				CenteredPentagonalUtils.getTillX(Integer.parseInt(SequenceFields.centeredPentagonalX.getText()))));

		showCenteredOctagonal.setOnAction(action -> TextAreas.textArea.setText(CenteredOctagonalUtils.getFormula()));
		getCenteredOctagonalX.setOnAction(action -> TextAreas.textArea
				.setText(CenteredOctagonalUtils.getX(Integer.parseInt(SequenceFields.centeredOctagonalX.getText()))));
		getCenteredOctagonalTillX.setOnAction(action -> TextAreas.textArea.setText(
				CenteredOctagonalUtils.getTillX(Integer.parseInt(SequenceFields.centeredOctagonalX.getText()))));

		showCenteredNonagonal.setOnAction(action -> TextAreas.textArea.setText(CenteredNonagonalUtils.getFormula()));
		getCenteredNonagonalX.setOnAction(action -> TextAreas.textArea
				.setText(CenteredNonagonalUtils.getX(Integer.parseInt(SequenceFields.centeredNonagonalX.getText()))));
		getCenteredNonagonalTillX.setOnAction(action -> TextAreas.textArea.setText(
				CenteredNonagonalUtils.getTillX(Integer.parseInt(SequenceFields.centeredNonagonalX.getText()))));

		showCenteredDecagonal.setOnAction(action -> TextAreas.textArea.setText(CenteredDecagonalUtils.getFormula()));
		getCenteredDecagonalX.setOnAction(action -> TextAreas.textArea
				.setText(CenteredDecagonalUtils.getX(Integer.parseInt(SequenceFields.centeredDecagonalX.getText()))));
		getCenteredDecagonalTillX.setOnAction(action -> TextAreas.textArea.setText(
				CenteredDecagonalUtils.getTillX(Integer.parseInt(SequenceFields.centeredDecagonalX.getText()))));
		plotCenteredDecagonal.setOnAction(action -> {
			Tabs.chartTab.setContent(
					CenteredDecagonalUtils.plot(Integer.parseInt(SequenceFields.centeredDecagonalX.getText())));
		});
		appendCenteredDecagonal.setOnAction(action -> {
			Tabs.chartTab.setContent(
					CenteredDecagonalUtils.append(Integer.parseInt(SequenceFields.centeredDecagonalX.getText())));
		});

		showStar.setOnAction(action -> TextAreas.textArea.setText(StarUtils.getFormula()));
		getStarX.setOnAction(
				action -> TextAreas.textArea.setText(StarUtils.getX(Integer.parseInt(SequenceFields.starX.getText()))));
		getStarTillX.setOnAction(action -> TextAreas.textArea
				.setText(StarUtils.getTillX(Integer.parseInt(SequenceFields.starX.getText()))));
	}

}

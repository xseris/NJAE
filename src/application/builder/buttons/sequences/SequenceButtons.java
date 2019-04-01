package application.builder.buttons.sequences;

import application.builder.fields.SequenceFields;
import application.builder.tabs.Tabs;
import application.builder.texareas.TextAreas;
import application.sequences.CullenUtils;
import application.sequences.EvenUtils;
import application.sequences.FibonacciUtils;
import application.sequences.JacobsthalPellUtils;
import application.sequences.JacobsthalUtils;
import application.sequences.LeonardoUtils;
import application.sequences.LucasUtils;
import application.sequences.OddUtils;
import application.sequences.PadovanUtils;
import application.sequences.PellLucasUtils;
import application.sequences.PellUtils;
import application.sequences.PerrinUtils;
import javafx.scene.control.Button;

public class SequenceButtons {

	public static Button showCullen = new Button("Show Formula");
	public static Button getCullenX = new Button("Get nth element");
	public static Button getCullenTillX = new Button("Get first n elements");
	public static Button plotCullenTillX = new Button("Plot till n");
	public static Button appendCullenTillX = new Button("Append till n");

	public static Button showFibonacci = new Button("Show Formula");
	public static Button getFibX = new Button("Get nth element");
	public static Button getFibTillX = new Button("Get first n elements");

	public static Button showEven = new Button("Show Formula");
	public static Button getEvenX = new Button("Get nth element");
	public static Button getEvenTillX = new Button("Get first n elements");

	public static Button showOdd = new Button("Show Formula");
	public static Button getOddX = new Button("Get nth element");
	public static Button getOddTillX = new Button("Get first n elements");

	public static Button showJacobsthal = new Button("Show Formula");
	public static Button getJacobsthalX = new Button("Get nth element");
	public static Button getJacobsthalTillX = new Button("Get first n elements");

	public static Button showJacobsthalPell = new Button("Show Formula");
	public static Button getJacobsthalPellX = new Button("Get nth element");
	public static Button getJacobsthalPellTillX = new Button("Get first n elements");

	public static Button showLeonardo = new Button("Show Formula");
	public static Button getLeonardoX = new Button("Get nth element");
	public static Button getLeonardoTillX = new Button("Get first n elements");

	public static Button showLucas = new Button("Show Formula");
	public static Button getLucasX = new Button("Get nth element");
	public static Button getLucasTillX = new Button("Get first n elements");

	public static Button showPadovan = new Button("Show Formula");
	public static Button getPadovanX = new Button("Get nth element");
	public static Button getPadovanTillX = new Button("Get first n elements");

	public static Button showPell = new Button("Show Formula");
	public static Button getPellX = new Button("Get nth element");
	public static Button getPellTillX = new Button("Get first n elements");

	public static Button showPellLucas = new Button("Show Formula");
	public static Button getPellLucasX = new Button("Get nth element");
	public static Button getPellLucasTillX = new Button("Get first n elements");

	public static Button showPerrin = new Button("Show Formula");
	public static Button getPerrinX = new Button("Get nth element");
	public static Button getPerrinTillX = new Button("Get first n elements");

	public static void init() {
		showCullen.setOnAction(action -> TextAreas.textArea.setText(CullenUtils.getFormula()));
		getCullenX.setOnAction(action -> TextAreas.textArea
				.setText(CullenUtils.getX(Integer.parseInt(SequenceFields.cullenX.getText()))));
		getCullenTillX.setOnAction(action -> TextAreas.textArea
				.setText(CullenUtils.getTillX(Integer.parseInt(SequenceFields.cullenX.getText()))));
		plotCullenTillX.setOnAction(action -> {
			Tabs.chartTab.setContent(CullenUtils.plot(Integer.parseInt(SequenceFields.cullenX.getText())));
		});
		appendCullenTillX.setOnAction(action -> {
			Tabs.chartTab.setContent(CullenUtils.append(Integer.parseInt(SequenceFields.cullenX.getText())));
		});

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

		showJacobsthal.setOnAction(action -> TextAreas.textArea.setText(JacobsthalUtils.getFormula()));
		getJacobsthalX.setOnAction(action -> TextAreas.textArea
				.setText(JacobsthalUtils.getX(Integer.parseInt(SequenceFields.jacobsthalX.getText()))));
		getJacobsthalTillX.setOnAction(action -> TextAreas.textArea
				.setText(JacobsthalUtils.getTillX(Integer.parseInt(SequenceFields.jacobsthalX.getText()))));

		showJacobsthalPell.setOnAction(action -> TextAreas.textArea.setText(JacobsthalPellUtils.getFormula()));
		getJacobsthalPellX.setOnAction(action -> TextAreas.textArea
				.setText(JacobsthalPellUtils.getX(Integer.parseInt(SequenceFields.jacobsthalPellX.getText()))));
		getJacobsthalPellTillX.setOnAction(action -> TextAreas.textArea
				.setText(JacobsthalPellUtils.getTillX(Integer.parseInt(SequenceFields.jacobsthalPellX.getText()))));

		showLeonardo.setOnAction(action -> TextAreas.textArea.setText(LeonardoUtils.getFormula()));
		getLeonardoX.setOnAction(action -> TextAreas.textArea
				.setText(LeonardoUtils.getX(Integer.parseInt(SequenceFields.leonardoX.getText()))));
		getLeonardoTillX.setOnAction(action -> TextAreas.textArea
				.setText(LeonardoUtils.getTillX(Integer.parseInt(SequenceFields.leonardoX.getText()))));

		showLucas.setOnAction(action -> TextAreas.textArea.setText(LucasUtils.getFormula()));
		getLucasX.setOnAction(action -> TextAreas.textArea
				.setText(LucasUtils.getX(Integer.parseInt(SequenceFields.lucasX.getText()))));
		getLucasTillX.setOnAction(action -> TextAreas.textArea
				.setText(LucasUtils.getTillX(Integer.parseInt(SequenceFields.lucasX.getText()))));

		showPadovan.setOnAction(action -> TextAreas.textArea.setText(PadovanUtils.getFormula()));
		getPadovanX.setOnAction(action -> TextAreas.textArea
				.setText(PadovanUtils.getX(Integer.parseInt(SequenceFields.padovanX.getText()))));
		getPadovanTillX.setOnAction(action -> TextAreas.textArea
				.setText(PadovanUtils.getTillX(Integer.parseInt(SequenceFields.padovanX.getText()))));

		showPell.setOnAction(action -> TextAreas.textArea.setText(PellUtils.getFormula()));
		getPellX.setOnAction(
				action -> TextAreas.textArea.setText(PellUtils.getX(Integer.parseInt(SequenceFields.pellX.getText()))));
		getPellTillX.setOnAction(action -> TextAreas.textArea
				.setText(PellUtils.getTillX(Integer.parseInt(SequenceFields.pellX.getText()))));

		showPellLucas.setOnAction(action -> TextAreas.textArea.setText(PellLucasUtils.getFormula()));
		getPellLucasX.setOnAction(action -> TextAreas.textArea
				.setText(PellLucasUtils.getX(Integer.parseInt(SequenceFields.pellLucasX.getText()))));
		getPellLucasTillX.setOnAction(action -> TextAreas.textArea
				.setText(PellLucasUtils.getTillX(Integer.parseInt(SequenceFields.pellLucasX.getText()))));

		showPerrin.setOnAction(action -> TextAreas.textArea.setText(PerrinUtils.getFormula()));
		getPerrinX.setOnAction(action -> TextAreas.textArea
				.setText(PerrinUtils.getX(Integer.parseInt(SequenceFields.perrinX.getText()))));
		getPerrinTillX.setOnAction(action -> TextAreas.textArea
				.setText(PerrinUtils.getTillX(Integer.parseInt(SequenceFields.perrinX.getText()))));

	}

}

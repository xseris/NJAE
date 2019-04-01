package application.builder.buttons;

import application.builder.texareas.TextAreas;
import application.esoteric.AlphuckUtils;
import application.esoteric.Brainfuck3Utils;
import application.esoteric.BrainfuckFaceUtils;
import application.esoteric.BrainfuckUtils;
import application.esoteric.ColonoscopyUtils;
import application.esoteric.PikalangUtils;
import application.esoteric.SolbofuckUtils;
import application.esoteric.TripletUtils;
import application.history.DashboardHistoryUtils;
import javafx.scene.control.Button;

public class EsotericButtons {

	public static Button interpretBrainFuck = new Button("Interpret");

	public static Button interpretPikalang = new Button("Interpret");
	public static Button helloPikalang = new Button("Hello World!");

	public static Button interpretTriplet = new Button("Interpret");
	public static Button helloTriplet = new Button("Hello World!");

	public static Button interpretAlphuck = new Button("Interpret");
	public static Button helloAlphuck = new Button("Hello World!");

	public static Button interpretSolbofuck = new Button("Interpret");
	public static Button helloSolbofuck = new Button("Hello World!");

	public static Button interpretBrainfuck3 = new Button("Interpret");

	public static Button interpretColonoscopy = new Button("Interpret");
	public static Button helloColonoscopy = new Button("Hello World!");

	public static Button interpretBrainfuckFace = new Button("Interpret");
	public static Button helloBrainfuckFace = new Button("Hello World!");

	public static void init() {
		interpretBrainFuck.setOnAction(action -> {
			TextAreas.textArea.setText(BrainfuckUtils.interpret(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		interpretPikalang.setOnAction(action -> {
			TextAreas.textArea.setText(PikalangUtils.interpret(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		helloPikalang.setOnAction(action -> {
			TextAreas.textArea.setText(PikalangUtils.helloWorld());
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		interpretTriplet.setOnAction(action -> {
			TextAreas.textArea.setText(TripletUtils.interpret(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		helloTriplet.setOnAction(action -> {
			TextAreas.textArea.setText(TripletUtils.helloWorld());
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		interpretAlphuck.setOnAction(action -> {
			TextAreas.textArea.setText(AlphuckUtils.interpret(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		helloAlphuck.setOnAction(action -> {
			TextAreas.textArea.setText(AlphuckUtils.helloWorld());
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		interpretSolbofuck.setOnAction(action -> {
			TextAreas.textArea.setText(SolbofuckUtils.interpret(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		helloSolbofuck.setOnAction(action -> {
			TextAreas.textArea.setText(SolbofuckUtils.helloWorld());
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		interpretBrainfuck3.setOnAction(action -> {
			TextAreas.textArea.setText(Brainfuck3Utils.interpret(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		interpretBrainfuckFace.setOnAction(action -> {
			TextAreas.textArea.setText(BrainfuckFaceUtils.interpret(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		helloBrainfuckFace.setOnAction(action -> {
			TextAreas.textArea.setText(BrainfuckFaceUtils.helloWorld());
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		interpretColonoscopy.setOnAction(action -> {
			TextAreas.textArea.setText(ColonoscopyUtils.interpret(TextAreas.textArea.getText()));
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
		helloColonoscopy.setOnAction(action -> {
			TextAreas.textArea.setText(ColonoscopyUtils.helloWorld());
			DashboardHistoryUtils.updateDashboardHistroy(TextAreas.textArea.getText());
		});
	}

}

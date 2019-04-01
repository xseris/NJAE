package application.builder.toolbars;

import application.builder.buttons.EsotericButtons;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;

public class EsotericToolbars {

	public static ToolBar brainfuckToolbar = new ToolBar(new Label("BrainF*ck:"), EsotericButtons.interpretBrainFuck,
			EsotericButtons.helloBrainfuck);
	public static ToolBar pikalangToolbar = new ToolBar(new Label("Pikalang:"), EsotericButtons.interpretPikalang,
			EsotericButtons.helloPikalang);
	public static ToolBar solbofuckToolbar = new ToolBar(new Label("Solbofuck:"), EsotericButtons.interpretSolbofuck,
			EsotericButtons.helloSolbofuck);
	public static ToolBar colonoscopyToolbar = new ToolBar(new Label("Colonoscopy:"),
			EsotericButtons.interpretColonoscopy, EsotericButtons.helloColonoscopy);
	public static ToolBar alphuckToolbar = new ToolBar(new Label("Alphuck:"), EsotericButtons.interpretAlphuck,
			EsotericButtons.helloAlphuck);
	public static ToolBar tripletToolbar = new ToolBar(new Label("Triplet:"), EsotericButtons.interpretTriplet,
			EsotericButtons.helloTriplet);
	public static ToolBar brainfuck3Toolbar = new ToolBar(new Label("Brainfuck+3:"),
			EsotericButtons.interpretBrainfuck3);
	public static ToolBar brainfuckFaceToolbar = new ToolBar(new Label("( ͡° ͜ʖ ͡°)fuck:"),
			EsotericButtons.interpretBrainfuckFace, EsotericButtons.helloBrainfuckFace);

	public static void init() {
		brainfuckToolbar.setId("brainfuckToolbar");
		pikalangToolbar.setId("pikalangToolbar");
		solbofuckToolbar.setId("solbofuckToolbar");
		alphuckToolbar.setId("alphuckToolbar");
		tripletToolbar.setId("tripletToolbar");
		brainfuck3Toolbar.setId("brainfuck3Toolbar");
		brainfuckFaceToolbar.setId("brainfuckFaceToolbar");
		colonoscopyToolbar.setId("colonoscopyToolbar");
	}

}

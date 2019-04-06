package application.builder.toolbars;

import application.builder.buttons.StegoButtons;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;

public class StegoToolbars {

	public static ToolBar baconianToolBar = new ToolBar(new Label("Latin Baconian:"), StegoButtons.encodeLatinBaconian,
			StegoButtons.decodeLatinBaconian, new Separator(), new Label("Full Baconian:"),
			StegoButtons.encodeFullBaconian, StegoButtons.decodeFullBaconian);

	public static ToolBar textStegoToolBar = new ToolBar(new Label("Char Stego:"), StegoButtons.firstCharEachWord,
			StegoButtons.firstCharEachPhrase, StegoButtons.firstCharEachParagraph, StegoButtons.capitals,
			StegoButtons.lowers, new Separator(), new Label("Word Stego:"), StegoButtons.firstWordEachPhrase,
			StegoButtons.firstWordEachParagraph);

	public static void init() {
		baconianToolBar.setId("bacon");
		textStegoToolBar.setId("textStego");
	}

}

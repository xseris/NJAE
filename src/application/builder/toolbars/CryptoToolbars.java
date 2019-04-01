package application.builder.toolbars;

import application.builder.buttons.CryptoButtons;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;

public class CryptoToolbars {

	public static ToolBar caesarToolBar = new ToolBar(new Label("Caesar:"), CryptoButtons.encodeCaesar,
			CryptoButtons.decodeCaesar, CryptoButtons.bruteForceCaesar);
	public static ToolBar albamToolBar = new ToolBar(new Label("Albam:"), CryptoButtons.encodeAlbam,
			CryptoButtons.decodeAlbam);
	public static ToolBar atbahToolBar = new ToolBar(new Label("Atbah:"), CryptoButtons.encodeAtbah,
			CryptoButtons.decodeAtbah);
	public static ToolBar atbashToolBar = new ToolBar(new Label("Atbash:"), CryptoButtons.encodeAtbash,
			CryptoButtons.decodeAtbash);
	public static ToolBar rotNToolBar = new ToolBar(new Label("Rot-5:"), CryptoButtons.encodeRot5,
			CryptoButtons.decodeRot5, new Separator(), new Label("Rot-13:"), CryptoButtons.encodeRot13,
			CryptoButtons.decodeRot13, new Separator(), new Label("Rot-13.5:"), CryptoButtons.encodeRot135,
			CryptoButtons.decodeRot135, new Separator(), new Label("Rot47:"), CryptoButtons.encodeRot47,
			CryptoButtons.decodeRot47);

	public static void init() {
		caesarToolBar.setId("caesar");
		albamToolBar.setId("albam");
		atbahToolBar.setId("atbah");
		atbashToolBar.setId("atbash");
		rotNToolBar.setId("rotN");
	}

}

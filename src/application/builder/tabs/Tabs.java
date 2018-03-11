package application.builder.tabs;

import javafx.scene.control.Tab;

public class Tabs {

	public static Tab imageTab = new Tab("Images");
	public static Tab chartTab = new Tab("Chart");

	public static void init() {
		imageTab.setClosable(false);
		chartTab.setClosable(false);
	}

}

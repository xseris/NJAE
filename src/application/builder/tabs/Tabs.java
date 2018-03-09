package application.builder.tabs;

import javafx.scene.control.Tab;

public class Tabs {

	public static Tab imageTab = new Tab("Images");

	public static void init() {
		imageTab.setClosable(false);
	}

}

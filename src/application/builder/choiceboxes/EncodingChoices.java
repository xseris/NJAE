package application.builder.choiceboxes;

import javafx.collections.FXCollections;
import javafx.scene.control.ChoiceBox;

public class EncodingChoices {
	public static ChoiceBox leftQwerty = new ChoiceBox(FXCollections.observableArrayList("qwerty", "qüerty", "awerty"));
	public static ChoiceBox rightQwerty = new ChoiceBox(
			FXCollections.observableArrayList("qwerty", "qüerty", "awerty"));

}

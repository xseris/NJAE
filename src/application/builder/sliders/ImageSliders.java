package application.builder.sliders;

import javafx.scene.control.Slider;

public class ImageSliders {

	public static Slider slider = new Slider();
	public static Slider power = new Slider();

	public static void init() {
		slider.setMin(0);
		slider.setMax(1);
		slider.setValue(0.5);
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);
		slider.setBlockIncrement(0.01);

		power.setMin(0);
		power.setMax(5);
		power.setValue(2);
		power.setShowTickLabels(true);
		power.setShowTickMarks(true);
		power.setBlockIncrement(0.05);
	}

}

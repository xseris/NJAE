package application.history;

import javafx.scene.image.Image;

public class ImageHistory {

	private Image current;
	private ImageHistory prev;
	private ImageHistory next;
	
	public Image getCurrent() {
		return current;
	}

	public void setCurrent(Image current) {
		this.current = current;
	}

	public ImageHistory getPrev() {
		return prev;
	}

	public void setPrev(ImageHistory prev) {
		this.prev = prev;
	}

	public ImageHistory getNext() {
		return next;
	}

	public void setNext(ImageHistory next) {
		this.next = next;
	}

}

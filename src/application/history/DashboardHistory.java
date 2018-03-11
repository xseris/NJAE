package application.history;

public class DashboardHistory {

	private String current;
	private DashboardHistory prev;
	private DashboardHistory next;

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public DashboardHistory getPrev() {
		return prev;
	}

	public void setPrev(DashboardHistory prev) {
		this.prev = prev;
	}

	public DashboardHistory getNext() {
		return next;
	}

	public void setNext(DashboardHistory next) {
		this.next = next;
	}

}

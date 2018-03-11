package application.history;

import application.builder.texareas.TextAreas;

public class DashboardHistoryUtils {

	static DashboardHistory dashboardHistory = new DashboardHistory();

	public static void updateDashboardHistroy(String text) {
		DashboardHistory newHistory = new DashboardHistory();
		newHistory.setPrev(dashboardHistory);
		newHistory.setCurrent(text);
		dashboardHistory = newHistory;
	}

	public static void undoDashboardHistroy() {
		TextAreas.textArea.setText(dashboardHistory.getPrev().getCurrent());
		dashboardHistory.getPrev().setNext(dashboardHistory);
		dashboardHistory = dashboardHistory.getPrev();
	}

	public static void redoDashboardHistroy() {
		TextAreas.textArea.setText(dashboardHistory.getNext().getCurrent());
		dashboardHistory = dashboardHistory.getNext();
	}

}

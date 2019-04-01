package application.sequences;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import application.builder.tabs.Tabs;
import application.graph.GraphUtils;
import javafx.scene.chart.LineChart;

public class CullenUtils {

	public static String getFormula() {
		return "Cullen(x) = x * 2^x + 1";
	}

	public static String getX(int n) {
		return "Cullen(" + n + ") = " + String.valueOf(cullen(n));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append("Cullen(" + i + ") = " + String.valueOf(cullen(i)) + "\n");
		}
		return sb.toString();
	}

	public static BigInteger cullen(int n) {
		return BigInteger.valueOf(n).multiply(BigInteger.valueOf(2).pow(n)).add(BigInteger.ONE);
	}

	public static LineChart plot(int n) {
		List<Long> data = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			data.add((long) (i * Math.pow(2, i) + 1));
		}
		return GraphUtils.generateSequenceChart(data, "Cullen Numbers");
	}

	public static LineChart append(int n) {
		List<Long> data = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			data.add((long) (i * Math.pow(2, i) + 1));
		}
		LineChart content = (LineChart) Tabs.chartTab.getContent();
		return GraphUtils.addSerie(content, data, "Cullen Numbers");
	}

}

package application.sequences;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import application.builder.tabs.Tabs;
import application.graph.GraphUtils;
import javafx.scene.chart.LineChart;

public class CenteredDecagonalUtils {

	public static String getFormula() {
		return "Centered Octagonal(x) = 5 * x * (x + 1) + 1";
	}

	public static String getX(int n) {
		BigInteger num = BigInteger.valueOf(n);
		return "Centered Octagonal(" + n + ") = " + String
				.valueOf((num.multiply(BigInteger.valueOf(5)).multiply(num.add(BigInteger.ONE))).add(BigInteger.ONE));
	}

	public static String getTillX(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append(getX(i)).append("\n");
		}
		return sb.toString();
	}

	public static LineChart plot(int n) {
		List<Long> data = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			data.add(5L * i * (i + 1) + 1);
		}

		return GraphUtils.generateSequenceChart(data, "Centered Decagonal Numbers");
	}

	public static LineChart append(int n) {
		List<Long> data = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			data.add(5L * i * (i + 1) + 1);
		}
		LineChart content = (LineChart) Tabs.chartTab.getContent();
		return GraphUtils.addSerie(content, data, "Centered Decagonal Numbers");

	}

}

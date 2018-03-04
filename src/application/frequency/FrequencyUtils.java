package application.frequency;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import application.graph.GraphUtils;
import javafx.scene.chart.BarChart;

public class FrequencyUtils {

	static Map<Character, Integer> unigramCount;
	static Map<String, Integer> bigramCount;
	static Map<String, Integer> wordCount;

	public static BarChart unigrams(String text) {
		unigramCount = new HashMap<>();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ' ') {
				if (unigramCount.get(text.charAt(i)) == null) {
					unigramCount.put(text.charAt(i), 1);
				} else {
					unigramCount.put(text.charAt(i), unigramCount.get(text.charAt(i)) + 1);
				}
			}
		}
		return GraphUtils.generateUnigramBarChart(unigramCount);
	}

	public static BarChart bigrams(String text) {
		bigramCount = new HashMap<>();
		for (int i = 0; i < text.length() - 1; i++) {
			String current = String.valueOf(text.charAt(i)) + String.valueOf(text.charAt(i + 1));
			if (!current.contains(" ")) {
				if (bigramCount.get(current) == null) {
					bigramCount.put(current, 1);
				} else {
					bigramCount.put(current, bigramCount.get(current) + 1);
				}
			}
		}
		return GraphUtils.generateBigramBarChart(bigramCount);
	}

	public static BarChart words(String text) {
		String[] words = text.replace("\n", " ").split(" ");
		wordCount = new HashMap<>();
		for (String word : words) {
			if (wordCount.get(word) == null) {
				wordCount.put(word, 1);
			} else {
				wordCount.put(word, wordCount.get(word) + 1);
			}
		}
		return GraphUtils.generateWordBarChart(wordCount);
	}

	public static BarChart sort(String text) {
		if (text.equals("unigrams")) {
			List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(
					unigramCount.entrySet());

			Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
				public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
					return (o1.getValue()).compareTo(o2.getValue());
				}
			});

			Map<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
			for (Map.Entry<Character, Integer> entry : list) {
				sortedMap.put(entry.getKey(), entry.getValue());
			}
			return GraphUtils.generateUnigramBarChart(sortedMap);
		} else if (text.equals("bigrams")) {
			List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(bigramCount.entrySet());

			Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
				public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
					return (o1.getValue()).compareTo(o2.getValue());
				}
			});

			Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
			for (Map.Entry<String, Integer> entry : list) {
				sortedMap.put(entry.getKey(), entry.getValue());
			}
			return GraphUtils.generateBigramBarChart(sortedMap);
		} else if (text.equals("words")) {
			List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(wordCount.entrySet());

			Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
				public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
					return (o1.getValue()).compareTo(o2.getValue());
				}
			});

			Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
			for (Map.Entry<String, Integer> entry : list) {
				sortedMap.put(entry.getKey(), entry.getValue());
			}
			return GraphUtils.generateWordBarChart(sortedMap);

		}
		return null;
	}

	public static BarChart top10(String text) {
		if (text.equals("unigrams")) {
			List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(
					unigramCount.entrySet());

			Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
				public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
					return (o1.getValue()).compareTo(o2.getValue());
				}
			});

			Map<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
			int i = 0;
			while (i < 10) {
				for (Map.Entry<Character, Integer> entry : list) {
					sortedMap.put(entry.getKey(), entry.getValue());
					i++;
				}
			}
			return GraphUtils.generateUnigramBarChart(sortedMap);
		} else if (text.equals("bigrams")) {
			List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(bigramCount.entrySet());

			Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
				public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
					return (o1.getValue()).compareTo(o2.getValue());
				}
			});
			Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
			int i = 0;
			while (i < 10) {
				for (Map.Entry<String, Integer> entry : list) {
					sortedMap.put(entry.getKey(), entry.getValue());
					i++;
				}
			}
			return GraphUtils.generateBigramBarChart(sortedMap);
		} else if (text.equals("words")) {
			List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(wordCount.entrySet());

			Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
				public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
					return (o1.getValue()).compareTo(o2.getValue());
				}
			});

			Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
			int i = 0;
			while (i < 10) {
				for (Map.Entry<String, Integer> entry : list) {
					sortedMap.put(entry.getKey(), entry.getValue());
					i++;
				}
			}
			return GraphUtils.generateWordBarChart(sortedMap);

		}
		return null;
	}

}

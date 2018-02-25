package application.web;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PageUtils {

	public static String getHTML(String urlToRead) throws Exception {
		if (!urlToRead.startsWith("http://") && !urlToRead.startsWith("https://")) {
			urlToRead = "http://".concat(urlToRead);
		}
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlToRead);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line;
		while ((line = rd.readLine()) != null) {
			result.append(line).append("\n");
		}
		rd.close();
		return result.toString();
	}

	public static String extractComments(String text) {
		StringBuilder ret = new StringBuilder();
		int current = text.indexOf("<!--", 0);
		while (current != -1) {
			int currentEnd = text.indexOf("-->", current);
			ret.append(text.substring(current, currentEnd + 3)).append("\n");
			current = text.indexOf("<!--", current + 2);
		}
		return ret.toString();
	}

}

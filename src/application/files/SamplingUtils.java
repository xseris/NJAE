package application.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import application.current.CurrentFiles;

public class SamplingUtils {

	public static String head(int n) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(CurrentFiles.currentFile.getPath()))) {
			String line;
			int i = 0;
			while ((line = br.readLine()) != null) {
				if (i >= n) {
					break;
				}
				sb.append(line).append("\n");
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static String tail(int n) {
		Map<Integer, String> linesMap = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(CurrentFiles.currentFile.getPath()))) {
			String line;
			int i = 0;
			while ((line = br.readLine()) != null) {
				linesMap.put(i++, line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		int i = Math.max(linesMap.size() - n, 0);
		for (int j = i; j < linesMap.size(); j++) {
			sb.append(linesMap.get(j)).append("\n");
		}

		return sb.toString();
	}

	public static String random(int n) {
		Map<Integer, String> linesMap = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(CurrentFiles.currentFile.getPath()))) {
			String line;
			int i = 0;
			while ((line = br.readLine()) != null) {
				linesMap.put(i++, line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		int pos = 0;
		while (n > 0) {
			pos = (int) (Math.random() * (linesMap.size() - (n--) - pos - 1)) + pos + 1;
			if (linesMap.get(pos) != null) {
				sb.append(linesMap.get(pos)).append("\n");
			}
		}

		return sb.toString();
	}

}

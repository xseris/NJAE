package application.table;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.util.Callback;

public class TableUtils {

	public static VBox generateCsvTable(String title, int limit, boolean header, String data) {

		String[] rows = data.split("\n");

		TableView<List<String>> table = new TableView<>();

		final Label label = new Label(title);
		label.setFont(new Font("Arial", 20));

		table.setEditable(true);

		if (!header) {
			for (int i = 0; i < rows[0].length(); i++) {
				final int curr = i;
				TableColumn<List<String>, String> col = new TableColumn<>("Column " + (i + 1));
				col.setCellValueFactory(
						new Callback<CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
							@Override
							public ObservableValue<String> call(CellDataFeatures<List<String>, String> data) {
								return new ReadOnlyStringWrapper(data.getValue().get(curr));
							}
						});
				table.getColumns().add(col);
			}
		} else {
			int k = 0;
			for (String field : rows[0].split(",")) {
				final int curr = k;
				TableColumn<List<String>, String> col = new TableColumn<>(field);
				col.setCellValueFactory(
						new Callback<CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
							@Override
							public ObservableValue<String> call(CellDataFeatures<List<String>, String> data) {
								return new ReadOnlyStringWrapper(data.getValue().get(curr));
							}
						});
				table.getColumns().add(col);
				k++;
			}
		}

		ObservableList<List<String>> rowList = FXCollections.observableArrayList();

		int index = -1;
		for (String row : rows) {
			index++;
			if (index == 0 && header) {
				continue;
			} else {
				List<String> currentRow = new ArrayList<>();
				for (String field : row.split(",")) {
					currentRow.add(field);
				}
				rowList.add(currentRow);
			}
		}

		table.setItems(rowList);

		VBox tableBox = new VBox();
		tableBox.setSpacing(5);
		tableBox.setPadding(new Insets(10, 0, 0, 10));
		tableBox.getChildren().addAll(label, table);

		return tableBox;
	}

}

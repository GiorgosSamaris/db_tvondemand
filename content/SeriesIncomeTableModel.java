package content;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class SeriesIncomeTableModel extends AbstractTableModel{
	private String[] columnNames= { "Total Income", "Month", "Year"};
	private List<SeriesIncome> seriesIncome;
	
	public SeriesIncomeTableModel(List<SeriesIncome> f) {
		seriesIncome = f;
	}
	@Override
	public int getRowCount() {
		return  seriesIncome.size();
	}
	@Override
	public String getColumnName(int index) {
		return columnNames[index];
	}
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		SeriesIncome tempSeriesIncome = seriesIncome.get(rowIndex);
		switch(columnIndex) {
		case 0:
			return tempSeriesIncome.getSum();
		case 1:
			return tempSeriesIncome.getMonth();
		case 2:
			return tempSeriesIncome.getYear();
		}
		
		return tempSeriesIncome.getSum();
	}
}

package content;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class FilmIncomeTableModel extends AbstractTableModel{
	private String[] columnNames= { "Total Income", "Month", "Year"};
	private List<FilmIncome> filmIncome;
	
	public FilmIncomeTableModel(List<FilmIncome> f) {
		filmIncome = f;
	}
	@Override
	public int getRowCount() {
		return  filmIncome.size();
	}
	@Override
	public String getColumnName(int index) {
		return columnNames[index];
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		FilmIncome tempFilmIncome = filmIncome.get(rowIndex);
		switch(columnIndex) {
		case 0:
			return tempFilmIncome.getSum();
		case 1:
			return tempFilmIncome.getMonth();
		case 2:
			return tempFilmIncome.getYear();
		}
		
		return tempFilmIncome.getSum();
	}

}

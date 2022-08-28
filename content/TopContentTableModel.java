package content;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TopContentTableModel extends AbstractTableModel{

	private String[] columnNames= { "Content ID", "Content Title", "Total Rents" };
	private List<TopContent> topContent;
	
	public TopContentTableModel(List<TopContent> tc) {
		topContent = tc;
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return  topContent.size();
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
		TopContent tempTC = topContent.get(rowIndex);
		switch(columnIndex) {
		case 0:
			return tempTC.getId();
		case 1:
			return tempTC.getTitle();
		case 2:
			return tempTC.getRents();
		}
		return tempTC.getId();
	}

}

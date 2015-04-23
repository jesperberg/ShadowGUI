package GUI;

import javax.swing.table.AbstractTableModel;

public class CronusDbTableModel extends AbstractTableModel{

	
	private String[][] data;
	private String[] colNames;
	
	public CronusDbTableModel()
	{
		
	}
	
	
	@Override
	public int getColumnCount() {
		if(data == null)
		{
			return 0;
		}
		return data[0].length;
	}

	@Override
	public int getRowCount() {
		if (data == null)
		{
			return 0;
		}
		return data.length;
	}
	
	@Override
	public String getColumnName(int col)
	{
		return colNames[col];
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		
		return data[arg0][arg1];
	}

	public String[][] getData() {
		return data;
	}

	public void setData(String[][] data) {
		this.data = data;
		fireTableStructureChanged();
		fireTableDataChanged();
		
	}

	public String[] getColNames() {
		return colNames;
	}

	public void setColNames(String[] colNames) {
		this.colNames = colNames;
	}
	
	@Override
	public boolean isCellEditable(int Row, int Column)
	{
		return false;
	}
	
	

}

package GUI;


import javax.swing.table.AbstractTableModel;

import localhost.Account;
import localhost.ForestServiceSoapProxy;
public class AccountTableModel extends AbstractTableModel {

	/**
	 *TableModel designed for handling an ArrayList of Student objects
	 * @author CweetSixteen
	 *
	 */
		
		private ForestServiceSoapProxy access = new ForestServiceSoapProxy();
		private Account[] list;
		private String[] columnNames = {"Name", "Password" };
		
		/**
		 * Takes a ArrayList of Student objects
		 * @param list
		 */
		public AccountTableModel(Account[] list){
			super();
			this.list = list;
		}
		
		/**
		 * Creates an instance of the StudentTableModel
		 */
		
		/**
		 * Set the models current list 
		 * @param list
		 */
		public void setList(Account[] list){
			this.list = list;
			fireTableDataChanged();
		}
		
		/**
		 * Get the current model list
		 * @return ArrayList<Student>
		 */
		public Account[] getList(){
			return list;
		}
		
		/**
		 * Get column name for a specific column
		 * @return String
		 */
		public String getColumnName(int col){
			return columnNames[col];
		}
		
		/**
		 * Returns a boolean if a specific cell in the tabl model is editable
		 * @return boolean
		 */
		@Override
	    public boolean isCellEditable(int row, int col) {
	        return col != 0;
	    }

		/**
		 * Returns number of current rows in table model
		 * @return int
		 */
		@Override
		public int getRowCount() {
			return list.length;
		}

		/**
		 * Returns the number of columns
		 * @return int
		 */
		@Override
		public int getColumnCount() {
			return 2;
		}
		
		/**
		 * Sets a specific cell value
		 * @return void
		 */

		/**
		 * Returns the value of a specific cell in the form of an Object object
		 * @return Object
		 */
		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			
			if(columnIndex == 0)
				return list[rowIndex].getAccountName();
					
			if(columnIndex == 1)
				return list[rowIndex].getAccountPassword();
			
			return null;
		}
}

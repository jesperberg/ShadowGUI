package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JList;

import java.awt.Choice;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.RemoteException;
import java.util.Arrays;

import javax.swing.JComboBox;

import com.sun.javafx.binding.SelectBinding.AsString;

import java.awt.ScrollPane;

public class ShadowERPForm {

	private JFrame frame;
	private JTextField txtEmployeeNo;
	private JTextField txtFirstNameInsert;
	private JTextField txtFirstNameUpdate;
	private static Controller controller;
	private static JComboBox<String> comboBoxSelect;
	private static JComboBox<String> comboBoxUpdate;
	private static JComboBox<String> comboBoxDelete;
	private static JLabel lblUpdated;
	private static JLabel lblEmployeeInserted;
	private static JLabel lblErrorInsert;
	
	private static CronusDbTableModel tableModel;
	private JTable table;
	
	private static void getSickLeave()
	{
	try {
		String [][] data = Controller.sickLeave();
		String[] cols = {"No_", "First Name", "Last Name", "Job Title", "Cause of Absence Code", "From Date"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getReadAllStatistics()
	{
	try {
		String [][] data = Controller.readAllStatistics();
		String[] cols = {"Timestamp", "Code", "Description"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getReadAllRelative()
	{
	try {
		String [][] data = Controller.readAllRelative();
		String[] cols = {"Timestamp", "Employee No_", "Line No_", "Relative Code", "First Name"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getReadAllQualifications()
	{
	try {
		String [][] data = Controller.readAllQualifications();
		String[] cols = {"Timestamp", "Employee No_", "Line No_", "Qualification Code", "Type"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getReadAllPortals()
	{
	try {
		String [][] data = Controller.readAllPortals();
		String[] cols = {"Timestamp", "Primary Key", "Search Limit", "Search Config Table ID", "Config TP Group Caption"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getReadAllContracts()
	{
	try {
		String [][] data = Controller.readAllContracts();
		String[] cols = {"Timestamp", "Code", "Description"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getReadAllAbsences()
	{
	try {
		String [][] data = Controller.readAllAbsences();
		String[] cols = {"Timestamp", "Entry No_", "Employee No_", "From Date", "To Date"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getPersonalAndRelatives()
	{
	try {
		String [][] data = Controller.personalAndRelatives();
		String[] cols = {"No_", "First Name", "Last Name", "Job Title", "Relative Code", "First Name", "Last Name"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getMetaReadAllStatistics()
	{
	try {
		String [][] data = Controller.metaReadAllStatistics();
		String[] cols = {"Column Name", "Data Type"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getMetaReadAllRelatives()
	{
	try {
		String [][] data = Controller.metaReadAllRelatives();
		String[] cols = {"Column Name", "Data Type"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getMetaReadAllQualifications()
	{
	try {
		String [][] data = Controller.metaReadAllQualifications();
		String[] cols = {"Column Name", "Data Type"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getMetaReadAllPortals()
	{
	try {
		String [][] data = Controller.metaReadAllPortals();
		String[] cols = {"Column Name", "Data Type"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getMetaReadAllContracts()
	{
	try {
		String [][] data = Controller.metaReadAllContracts();
		String[] cols = {"Column Name", "Data Type"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getMetaReadAllAbsence()
	{
	try {
		String [][] data = Controller.metaReadAllAbsences();
		String[] cols = {"Column Name", "Data Type"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	
	private static void getMetaDataForAllEmployees()
	{
	try {
		String [][] data = Controller.metaAllEmployees();
		String[] cols = {"Column Name", "Data Type"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getAllFirstNameOfSickPeople()
	{
	try {
		String [][] data = Controller.firstNameOfSickPeople();
		String[] cols = {"No_", "Amount of Times"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getAllTablesOne()
	{
	try {
		String [][] data = Controller.allTablesOne();
		String[] cols = {"Table Name"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getAllTableTwo()
	{
	try {
		String [][] data = Controller.allTablesTwo();
		String[] cols = {"Table Name"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getAllKeys()
	{
	try {
		String [][] data = Controller.allKeys();
		String[] cols = {"Name", "XType"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getAllIndexes()
	{
	try {
		String [][] data = Controller.allIndexes();
		String[] cols = {"Object ID", "Name", "Index ID"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getAllEmployees()
	{
	try {
		String [][] data = Controller.allEmployees();
		String[] cols = {"No_", "First Name"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	
	private static void getAllConstraints()
	{
	try {
		String [][] data = Controller.allConstraints();
		String[] cols = {"Constraint Name", "Table Name", "Constraint Type"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
		
	private static void getAllColumnsEmployeeTwo()
	{
	try {
		String [][] data = Controller.allColumnsEmployeesTwo();
		String[] cols = {"Column Names"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e){
			e.printStackTrace();
		}
	};
	public static void getAllColumnsEmployeeOne()
	{
	try {
		String[][] data = Controller.allColumnsEmployeesOne();
		String[] cols = {"Column Names"};
		tableModel.setColNames(cols);
		tableModel.setData(data);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	}
	
	private void clearUpdateField()
	{
		txtFirstNameUpdate.setText("");
	}
	private void clearInsertFields()
	{
		txtEmployeeNo.setText("");
		txtFirstNameInsert.setText("");
	}
	
	private void fillComboBoxSelect()
	{
		comboBoxSelect.removeAllItems();
		String[] queryNameList = {"0: Column names for Employee (1)", "1: Column names for Employee (2)", "2: All constraints", "3: All Employees", "4: All indexes", "5: All keys", "6: All tables (1)", "7: All tables (2)", "8: Most sick leave", "9: Employee Metadata", "10: Employee Absence Metadata", "11: Employee Contracts Metadata", "12: Employee Portals Metadata", "13: Employee Qualifications Metadata", "14: Employee Relatives Metadata", "15: Employee Statistics Metadata", "16: Employee and Relatives", "17: Employee Absence", "18: Employee Contracts", "19: Employee Portals", "20: Employee Qualifications", "21: Employee Relatives", "22: Employee Statistics", "23: Employee Absence"};
		
		for (int i = 0; i < queryNameList.length; i++)
		{
			comboBoxSelect.addItem(queryNameList[i]);
		}
		comboBoxSelect.setSelectedIndex(-1);
	}
	
	private void fillComboBoxes()
	{
		
		String[][] list;
		try {
			comboBoxUpdate.removeAllItems();
			comboBoxDelete.removeAllItems();
			list = Controller.allEmployees();
			for (int i = 0; i < list.length; i++)
			{
				comboBoxUpdate.addItem(list[i][0]);
				comboBoxDelete.addItem(list[i][0]);
				comboBoxUpdate.setSelectedIndex(-1);
				comboBoxDelete.setSelectedIndex(-1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShadowERPForm frame = new ShadowERPForm();
					frame.frame.setVisible(true);
					controller = new Controller();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws RemoteException 
	 */
	
	
	
	public ShadowERPForm() throws RemoteException {
		initialize();
		fillComboBoxes();
		fillComboBoxSelect();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		tableModel = new CronusDbTableModel();
		lblEmployeeInserted = new JLabel();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 508, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 492, 321);
		frame.getContentPane().add(tabbedPane);
		
		
		JPanel panelSelect = new JPanel();
		tabbedPane.addTab("Select", null, panelSelect, null);
		panelSelect.setLayout(null);
		
		
		JButton btnSearchQuery = new JButton("Search");
		btnSearchQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				switch(comboBoxSelect.getSelectedIndex())
				{
				case 0:
					getAllColumnsEmployeeOne();
					break;
				case 1: 
					getAllColumnsEmployeeTwo();
					break;
				case 2:
					getAllConstraints();
					break;
				case 3:
					getAllEmployees();
					break;
				case 4: 
					getAllIndexes();
					break;
				case 5:
					getAllKeys();
					break;
				case 6:
					getAllTableTwo();
					break;
				case 7:
					getAllTablesOne();
					break;
				case 8:
					getAllFirstNameOfSickPeople();
					break;
				case 9:
					getMetaDataForAllEmployees();
					break;
				case 10:
					getMetaReadAllAbsence();
					break;
				case 11:
					getMetaReadAllContracts();
					break;
				case 12:
					getMetaReadAllPortals();
					break;
				case 13:
					getMetaReadAllQualifications();
					break;
				case 14:
					getMetaReadAllRelatives();
					break;
				case 15:
					getMetaReadAllStatistics();
					break;
				case 16:
					getPersonalAndRelatives();
					break;
				case 17:
					getReadAllAbsences();
					break;
				case 18:
					getReadAllContracts();
					break;
				case 19:
					getReadAllPortals();
					break;
				case 20:
					getReadAllQualifications();
					break;
				case 21:
					getReadAllRelative();
					break;
				case 22:
					getReadAllStatistics();
					break;
				case 23:
					getSickLeave();
					break;
				default:
				
					
					break;
				}
				
			}
		});
	
		btnSearchQuery.setBounds(298, 76, 148, 23);
		panelSelect.add(btnSearchQuery);
		
		JLabel lblSelectQuery = new JLabel("Select query:");
		lblSelectQuery.setBounds(92, 45, 93, 20);
		panelSelect.add(lblSelectQuery);
		
		comboBoxSelect = new JComboBox();
		comboBoxSelect.setBounds(191, 45, 255, 20);
		panelSelect.add(comboBoxSelect);

		table = new JTable(tableModel);
		table.setBounds(29, 111, 448, 172);
		panelSelect.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(29, 111, 448, 172);
		panelSelect.add(scrollPane);
		
		
		JPanel panelInsert = new JPanel();
		tabbedPane.addTab("Insert", null, panelInsert, null);
		panelInsert.setLayout(null);
		
		txtEmployeeNo = new JTextField();
		txtEmployeeNo.setBounds(197, 70, 137, 20);
		panelInsert.add(txtEmployeeNo);
		txtEmployeeNo.setColumns(10);
		
		txtFirstNameInsert = new JTextField();
		txtFirstNameInsert.setColumns(10);
		txtFirstNameInsert.setBounds(197, 101, 137, 20);
		panelInsert.add(txtFirstNameInsert);
		
		JLabel lblNewLabel = new JLabel("Employee No:");
		lblNewLabel.setBounds(105, 73, 105, 14);
		panelInsert.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(115, 104, 92, 14);
		panelInsert.add(lblFirstName);

		JLabel lblEmployeeInserted = new JLabel("");
		lblEmployeeInserted.setBounds(38, 190, 296, 23);
		panelInsert.add(lblEmployeeInserted);
		
		JLabel lblErrorInsert = new JLabel("");
		lblErrorInsert.setBounds(10, 190, 467, 23);
		panelInsert.add(lblErrorInsert);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
							
				
				try {
					String no_ = txtEmployeeNo.getText();
					String firstName = txtFirstNameInsert.getText();
					Controller.addEmployee(no_, firstName);
					lblErrorInsert.setText("");
					lblEmployeeInserted.setText("Employee: " + txtFirstNameInsert.getText() + " has been inserted.");

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					lblEmployeeInserted.setText("");
					lblErrorInsert.setText("Employee No_:  " + txtEmployeeNo.getText() + " already exists, choose a different Employee No_.");
					
				}

				clearInsertFields();
				comboBoxSelect.setSelectedIndex(-1);
				fillComboBoxes();			
			}
		});
		btnInsert.setBounds(197, 132, 137, 23);
		panelInsert.add(btnInsert);
		
		JPanel panelUpdate = new JPanel();
		tabbedPane.addTab("Update", null, panelUpdate, null);
		panelUpdate.setLayout(null);
		
		JLabel lblSelectEmployee = new JLabel("Select Employee:");
		lblSelectEmployee.setBounds(101, 57, 107, 20);
		panelUpdate.add(lblSelectEmployee);
		
		txtFirstNameUpdate = new JTextField();
		txtFirstNameUpdate.setBounds(214, 97, 157, 20);
		panelUpdate.add(txtFirstNameUpdate);
		txtFirstNameUpdate.setColumns(10);
		
		JLabel lblFirstName_1 = new JLabel("First Name:");
		lblFirstName_1.setBounds(128, 100, 77, 14);
		panelUpdate.add(lblFirstName_1);
		
		JLabel lblUpdated = new JLabel("");
		lblUpdated.setBounds(24, 211, 422, 23);
		panelUpdate.add(lblUpdated);
		
		JButton btnUpdate = new JButton("Update");				
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String selectedValue = comboBoxUpdate.getSelectedItem().toString();
					Controller.updateEmployee(selectedValue, txtFirstNameUpdate.getText());
					lblUpdated.setText("Employee: " + selectedValue + " has been updated.");
					
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				clearUpdateField();
				comboBoxUpdate.setSelectedIndex(-1);
			}
		
		});
		btnUpdate.setBounds(238, 146, 107, 23);
		panelUpdate.add(btnUpdate);
		
		comboBoxUpdate = new JComboBox();
		comboBoxUpdate.setBounds(214, 57, 157, 20);
		panelUpdate.add(comboBoxUpdate);
		
		JPanel panelDelete = new JPanel();
		tabbedPane.addTab("Delete", null, panelDelete, null);
		panelDelete.setLayout(null);
		
		JLabel lblSelectEmployee_1 = new JLabel("Select Employee:");
		lblSelectEmployee_1.setBounds(90, 69, 110, 20);
		panelDelete.add(lblSelectEmployee_1);
		
		JLabel lblEmployeeDeleted = new JLabel("");
		lblEmployeeDeleted.setBounds(114, 176, 289, 20);
		panelDelete.add(lblEmployeeDeleted);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String selectedValue = comboBoxDelete.getSelectedItem().toString();
				try {
					Controller.deleteEmployee(selectedValue);
					lblEmployeeDeleted.setText("Employee: " + selectedValue + " has successfully been deleted.");
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				comboBoxDelete.setSelectedIndex(-1);
				fillComboBoxes();
		}
	});
		btnNewButton_1.setBounds(206, 108, 145, 23);
		panelDelete.add(btnNewButton_1);
		
		comboBoxDelete = new JComboBox();
		comboBoxDelete.setBounds(206, 69, 145, 20);
		panelDelete.add(comboBoxDelete);
	
	}
}


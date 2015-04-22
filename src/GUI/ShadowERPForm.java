package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
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

public class ShadowERPForm {

	private JFrame frame;
	private JTable table;
	private JTextField txtEmployeeNo;
	private JTextField txtFirstNameInsert;
	private JTextField txtFirstNameUpdate;
	private static Controller controller;
	private static JComboBox<String> comboBoxSelect;
	private static JComboBox<String> comboBoxUpdate;
	private static JComboBox<String> comboBoxDelete;
	private static JLabel lblUpdated;
	
	private void clearUpdateField()
	{
		txtFirstNameUpdate.setText("");
	}
	private void clearInsertFields()
	{
		txtEmployeeNo.setText("");
		txtFirstNameInsert.setText("");
	}
	private void fillComboBoxes()
	{
		
		String[][] list;
		try {
			comboBoxUpdate.removeAllItems();
			comboBoxDelete.removeAllItems();
			list = Controller.allEmployees();
			System.out.println(Arrays.toString(list));
			for (int i = 0; i < list.length; i++)
			{
				comboBoxUpdate.addItem(list[i][0]);
				comboBoxDelete.addItem(list[i][0]);
				comboBoxUpdate.setSelectedIndex(-1);
				comboBoxDelete.setSelectedIndex(-1);
			}
		} catch (RemoteException e) {
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
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
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
		btnSearchQuery.setBounds(149, 68, 148, 23);
		panelSelect.add(btnSearchQuery);
		
		table = new JTable();
		table.setBounds(454, 286, -424, -162);
		panelSelect.add(table);
		
		JLabel lblSelectQuery = new JLabel("Select query:");
		lblSelectQuery.setBounds(50, 42, 93, 20);
		panelSelect.add(lblSelectQuery);
		
		comboBoxSelect = new JComboBox();
		comboBoxSelect.setBounds(149, 42, 148, 20);
		panelSelect.add(comboBoxSelect);
		
		JPanel panelInsert = new JPanel();
		tabbedPane.addTab("Insert", null, panelInsert, null);
		panelInsert.setLayout(null);
		
		txtEmployeeNo = new JTextField();
		txtEmployeeNo.setBounds(135, 38, 137, 20);
		panelInsert.add(txtEmployeeNo);
		txtEmployeeNo.setColumns(10);
		
		txtFirstNameInsert = new JTextField();
		txtFirstNameInsert.setColumns(10);
		txtFirstNameInsert.setBounds(135, 69, 137, 20);
		panelInsert.add(txtFirstNameInsert);
		
		JLabel lblNewLabel = new JLabel("Employee No:");
		lblNewLabel.setBounds(43, 41, 105, 14);
		panelInsert.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(53, 72, 92, 14);
		panelInsert.add(lblFirstName);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				try {
					String no_ = txtEmployeeNo.getText();
					String firstName = txtFirstNameInsert.getText();
					Controller.addEmployee(no_, firstName);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				clearInsertFields();
				comboBoxSelect.setSelectedIndex(-1);
				fillComboBoxes();			
			}
		});
		btnInsert.setBounds(135, 100, 137, 23);
		panelInsert.add(btnInsert);
		
		JPanel panelUpdate = new JPanel();
		tabbedPane.addTab("Update", null, panelUpdate, null);
		panelUpdate.setLayout(null);
		
		JLabel lblSelectEmployee = new JLabel("Select Employee:");
		lblSelectEmployee.setBounds(26, 40, 107, 20);
		panelUpdate.add(lblSelectEmployee);
		
		txtFirstNameUpdate = new JTextField();
		txtFirstNameUpdate.setBounds(139, 80, 157, 20);
		panelUpdate.add(txtFirstNameUpdate);
		txtFirstNameUpdate.setColumns(10);
		
		JLabel lblFirstName_1 = new JLabel("First Name:");
		lblFirstName_1.setBounds(53, 83, 77, 14);
		panelUpdate.add(lblFirstName_1);
		
		JButton btnUpdate = new JButton("Update");				
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String selectedValue = comboBoxUpdate.getSelectedItem().toString();
					Controller.updateEmployee(selectedValue, txtFirstNameUpdate.getText());
					//lblUpdated.setText("Employee " + selectedValue + " has been updated.");
					
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				clearUpdateField();
				comboBoxUpdate.setSelectedIndex(-1);
			}
		
		});
		btnUpdate.setBounds(163, 129, 107, 23);
		panelUpdate.add(btnUpdate);
		
		comboBoxUpdate = new JComboBox();
		comboBoxUpdate.setBounds(139, 40, 157, 20);
		panelUpdate.add(comboBoxUpdate);
		
		JLabel lblUpdated = new JLabel("");
		lblUpdated.setBounds(163, 178, 107, 23);
		panelUpdate.add(lblUpdated);
		
		JPanel panelDelete = new JPanel();
		tabbedPane.addTab("Delete", null, panelDelete, null);
		panelDelete.setLayout(null);
		
		JLabel lblSelectEmployee_1 = new JLabel("Select Employee:");
		lblSelectEmployee_1.setBounds(35, 47, 110, 20);
		panelDelete.add(lblSelectEmployee_1);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String selectedValue = comboBoxDelete.getSelectedItem().toString();
				try {
					Controller.deleteEmployee(selectedValue);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				comboBoxDelete.setSelectedIndex(-1);
				fillComboBoxes();
		}
	});
		btnNewButton_1.setBounds(151, 86, 145, 23);
		panelDelete.add(btnNewButton_1);
		
		comboBoxDelete = new JComboBox();
		comboBoxDelete.setBounds(151, 47, 145, 20);
		panelDelete.add(comboBoxDelete);
	}
}

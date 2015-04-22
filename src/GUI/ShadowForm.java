package GUI;

import host.Account;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import java.rmi.RemoteException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ShadowForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtTextInput;
	private JTextField txtResult;
	private static Controller controller;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShadowForm frame = new ShadowForm();
					frame.setVisible(true);
					controller = new Controller();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShadowForm() 
	{
		intitialize();
	}
		
	private void intitialize()
		{		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("File Search", null, panel, null);
		panel.setLayout(null);
		
		JButton btnSearchFile = new JButton("Search file");
		btnSearchFile.setBounds(82, 5, 83, 23);
		panel.add(btnSearchFile);
		
		btnSearchFile.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String input = txtTextInput.getText();
				
				String result;
				try {
					result = controller.getFile(input);
					txtResult.setText(result);
					System.out.println(result.getClass());
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
			}
		});
		
		txtResult = new JTextField();
		txtResult.setBounds(10, 39, 409, 183);
		panel.add(txtResult);
		txtResult.setColumns(10);
		
		
		txtTextInput = new JTextField();
		txtTextInput.setBounds(175, 6, 197, 20);
		panel.add(txtTextInput);
		txtTextInput.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Find Accounts", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnAccount = new JButton("Retrieve Accounts.");
		btnAccount.setBounds(330, 199, 89, 23);
		panel_1.add(btnAccount);
		
		Account[] temp = new Account[0];
		AccountTableModel accountModel = new AccountTableModel(temp);
		table = new JTable(accountModel);
		table.setBounds(0, 0, 320, 222);
		panel_1.add(table);
		
		btnAccount.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)  {
				Account[] accounts;
				try {
					accounts = DbAccess.readAccount();
					AccountTableModel model = new AccountTableModel(accounts);
					table.setModel(model);
					
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
	}
}
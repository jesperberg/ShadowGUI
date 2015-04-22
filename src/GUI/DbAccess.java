package GUI;

import host.Account;
import host.ForestServiceSoapProxy;

import java.rmi.RemoteException;

import com.sun.javafx.binding.SelectBinding.AsString;

public class DbAccess {

	private static ForestServiceSoapProxy access = new ForestServiceSoapProxy();
	
	
	public static String getFile(String fileName) throws java.rmi.RemoteException
	{
		return access.readFile(fileName);	
	}

	public static Account[] readAccount() throws java.rmi.RemoteException
	{
		return access.readAccounts();
	}
	
	 public static String[][] firstNameOfSickPeople() throws java.rmi.RemoteException
     {
         return access.firstNameOfSickPeople();
     }

     public static String[][] allColumnsEmployeesOne() throws java.rmi.RemoteException
     {
         return access.allColumnsEmployeeOne();
     }

     public static String[][] allColumnsEmployeeTwo() throws java.rmi.RemoteException
     {
         return access.allColumnsEmployeeTwo();
     }

     public static String[][] personalAndRelatives() throws java.rmi.RemoteException
     {
         return access.personalAndRelatives();
     }

     public static String[][] allConstraints() throws java.rmi.RemoteException
     {
         return access.allConstraints();
     }

     public static String[][] allIndexs() throws java.rmi.RemoteException
     {
         return access.allIndexs();
     }

     public static String[][] allKeys() throws java.rmi.RemoteException
     {
         return access.allKeys();
     }

     public static String[][] allTablesOne()throws java.rmi.RemoteException
     {
         return access.allTablesOne();
     }

     public static String[][] allTablesTwo()throws java.rmi.RemoteException
     {
         return access.allTablesTwo();
     }

     public static String[][] sickLeave()throws java.rmi.RemoteException
     {
         return access.sickLeave();
     }

     public static void addEmployee(String no_, String firstName)throws java.rmi.RemoteException
     {
         access.addEmployee(no_, firstName);
     }

     public static void updateEmployee(String no_, String firstName)throws java.rmi.RemoteException
     {
         access.updateEmployee(no_, firstName);
     }

     public static void deleteEmployee(String no_)throws java.rmi.RemoteException
     {
         access.deleteEmployee(no_);
     }

     public static String[][] allEmployees() throws java.rmi.RemoteException
     {
         return access.allEmployees();
     }
	
}

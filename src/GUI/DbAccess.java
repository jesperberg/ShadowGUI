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
         return access.allTabelTwo();
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
     
     public static String[][] metaAllEmployees() throws java.rmi.RemoteException
     {
    	 return access.metaAllEmployees();
     }
     
     public static String[][] metaReadAllAbsences() throws java.rmi.RemoteException
     {
    	 return access.metaReadAllAbsences();
     }
     
     public static String[][] metaReadAllPortals() throws java.rmi.RemoteException
     {
    	 return access.metaReadAllPortals();
     }
     public static String[][] metaReadAllQualifications() throws java.rmi.RemoteException
     {
    	 return access.metaReadAllQualifications();
     }
     public static String[][] metaReadAllRelatives() throws java.rmi.RemoteException
     {
    	 return access.metaReadAllRelatives();
     }
     public static String[][] metaReadAllStatistics() throws java.rmi.RemoteException
     {
    	 return access.metaReadAllStatistics();
     }
     public static String[][] metaReadAllContracts() throws java.rmi.RemoteException
     {
    	 return access.metaReadAllContracts();
     }
     public static String[][] readAllContracts() throws java.rmi.RemoteException
     {
    	 return access.readAllContracts();
     }
     public static String[][] readAllStatistics() throws java.rmi.RemoteException
     {
    	 return access.readAllStatistics();
     }
     public static String[][] readAllRelative() throws java.rmi.RemoteException
     {
    	 return access.readAllRelative();
     }
     public static String[][] readAllQualifications() throws java.rmi.RemoteException
     {
    	 return access.readAllQualifications();
     }
     public static String[][] readAllPortals() throws java.rmi.RemoteException
     {
    	 return access.readAllPortals();
     }
     public static String[][] readAllAbsences() throws java.rmi.RemoteException
     {
    	 return access.readAllAbsences();
     }
	
}

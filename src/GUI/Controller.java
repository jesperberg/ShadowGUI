package GUI;

import host.Account;
import host.ForestServiceSoapProxy;

import java.rmi.RemoteException;

import com.sun.javafx.binding.SelectBinding.AsString;

import GUI.DbAccess;


public class Controller {
	

public Controller()
{
	ForestServiceSoapProxy access = new ForestServiceSoapProxy();
}
	

public String getFile(String fileName) throws RemoteException
{
	return DbAccess.getFile(fileName);
}

public Account[] readAccount() throws RemoteException{
	return DbAccess.readAccount();
}

public static String[][] firstNameOfSickPeople() throws java.rmi.RemoteException
{
    return DbAccess.firstNameOfSickPeople();
}

public static String[][] allColumnsEmployeesOne()throws java.rmi.RemoteException
{
    return DbAccess.allColumnsEmployeesOne();
}

public static String[][] allColumnsEmployeesTwo()throws java.rmi.RemoteException
{
    return DbAccess.allColumnsEmployeeTwo();
}

public static String[][] personalAndRelatives()throws java.rmi.RemoteException
{
    return DbAccess.personalAndRelatives();
}

public static String[][] allConstraints()throws java.rmi.RemoteException
{
    return DbAccess.allConstraints();
}

public static String[][] allIndexes()throws java.rmi.RemoteException
{
    return DbAccess.allIndexs();
}

public static String[][] allKeys()throws java.rmi.RemoteException
{
    return DbAccess.allKeys();
}

public static String[][] allTablesOne()throws java.rmi.RemoteException
{
    return DbAccess.allTablesOne();
}

public static String[][] allTablesTwo()throws java.rmi.RemoteException
{
    return DbAccess.allTablesTwo();
}

public static String[][] sickLeave()throws java.rmi.RemoteException
{
    return DbAccess.sickLeave();
}

public static void addEmployee(String no_, String firstName)throws java.rmi.RemoteException
{
    DbAccess.addEmployee(no_, firstName);
}

public static void updateEmployee(String no_, String firstName)throws java.rmi.RemoteException
{
    DbAccess.updateEmployee(no_, firstName);
}

public static void deleteEmployee(String no_)throws java.rmi.RemoteException
{
    DbAccess.deleteEmployee(no_);
}

public static String[][] allEmployees()throws java.rmi.RemoteException
{
    return DbAccess.allEmployees();
}

}
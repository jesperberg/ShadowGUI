package GUI;

import java.rmi.RemoteException;

import localhost.Account;
import localhost.ForestServiceSoapProxy;


public class Controller {
	
	private ForestServiceSoapProxy access;
	
public Controller()
{
	access = new ForestServiceSoapProxy();
}

public String getFile(String fileName) throws RemoteException
{
	
	String test = fileName;
	System.out.println(test);
	return access.readFile(test);	
}

public Account[] readAccount(){
	try {
		return access.readAccounts();
	} catch (RemoteException e) {
		e.printStackTrace();
		return new Account[0];
	}
}

}
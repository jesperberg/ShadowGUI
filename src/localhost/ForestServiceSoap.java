/**
 * ForestServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost;

public interface ForestServiceSoap extends java.rmi.Remote {
    public java.lang.String readFile(java.lang.String fileName) throws java.rmi.RemoteException;
    public java.lang.String allFileNames() throws java.rmi.RemoteException;
    public localhost.Account[] readAccounts() throws java.rmi.RemoteException;
}

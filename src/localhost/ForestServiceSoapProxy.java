package localhost;

public class ForestServiceSoapProxy implements localhost.ForestServiceSoap {
  private String _endpoint = null;
  private localhost.ForestServiceSoap forestServiceSoap = null;
  
  public ForestServiceSoapProxy() {
    _initForestServiceSoapProxy();
  }
  
  public ForestServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initForestServiceSoapProxy();
  }
  
  private void _initForestServiceSoapProxy() {
    try {
      forestServiceSoap = (new localhost.ForestServiceLocator()).getForestServiceSoap();
      if (forestServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)forestServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)forestServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (forestServiceSoap != null)
      ((javax.xml.rpc.Stub)forestServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.ForestServiceSoap getForestServiceSoap() {
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap;
  }
  
  public java.lang.String readFile(java.lang.String fileName) throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.readFile(fileName);
  }
  
  public java.lang.String allFileNames() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.allFileNames();
  }
  
  public localhost.Account[] readAccounts() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.readAccounts();
  }
  
  
}
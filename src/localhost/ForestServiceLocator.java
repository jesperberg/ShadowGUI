/**
 * ForestServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost;

public class ForestServiceLocator extends org.apache.axis.client.Service implements localhost.ForestService {

    public ForestServiceLocator() {
    }


    public ForestServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ForestServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ForestServiceSoap
    private java.lang.String ForestServiceSoap_address = "http://localhost:1709/ForestService.asmx";

    public java.lang.String getForestServiceSoapAddress() {
        return ForestServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ForestServiceSoapWSDDServiceName = "ForestServiceSoap";

    public java.lang.String getForestServiceSoapWSDDServiceName() {
        return ForestServiceSoapWSDDServiceName;
    }

    public void setForestServiceSoapWSDDServiceName(java.lang.String name) {
        ForestServiceSoapWSDDServiceName = name;
    }

    public localhost.ForestServiceSoap getForestServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ForestServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getForestServiceSoap(endpoint);
    }

    public localhost.ForestServiceSoap getForestServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.ForestServiceSoapStub _stub = new localhost.ForestServiceSoapStub(portAddress, this);
            _stub.setPortName(getForestServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setForestServiceSoapEndpointAddress(java.lang.String address) {
        ForestServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.ForestServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.ForestServiceSoapStub _stub = new localhost.ForestServiceSoapStub(new java.net.URL(ForestServiceSoap_address), this);
                _stub.setPortName(getForestServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ForestServiceSoap".equals(inputPortName)) {
            return getForestServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:1709", "ForestService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:1709", "ForestServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ForestServiceSoap".equals(portName)) {
            setForestServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

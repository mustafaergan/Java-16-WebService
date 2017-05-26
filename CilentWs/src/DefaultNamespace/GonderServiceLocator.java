/**
 * GonderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class GonderServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.GonderService {

    public GonderServiceLocator() {
    }


    public GonderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GonderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Gonder
    private java.lang.String Gonder_address = "http://localhost:8083/SunucuWS/services/Gonder";

    public java.lang.String getGonderAddress() {
        return Gonder_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GonderWSDDServiceName = "Gonder";

    public java.lang.String getGonderWSDDServiceName() {
        return GonderWSDDServiceName;
    }

    public void setGonderWSDDServiceName(java.lang.String name) {
        GonderWSDDServiceName = name;
    }

    public DefaultNamespace.Gonder getGonder() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Gonder_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGonder(endpoint);
    }

    public DefaultNamespace.Gonder getGonder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.GonderSoapBindingStub _stub = new DefaultNamespace.GonderSoapBindingStub(portAddress, this);
            _stub.setPortName(getGonderWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGonderEndpointAddress(java.lang.String address) {
        Gonder_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.Gonder.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.GonderSoapBindingStub _stub = new DefaultNamespace.GonderSoapBindingStub(new java.net.URL(Gonder_address), this);
                _stub.setPortName(getGonderWSDDServiceName());
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
        if ("Gonder".equals(inputPortName)) {
            return getGonder();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "GonderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "Gonder"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Gonder".equals(portName)) {
            setGonderEndpointAddress(address);
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

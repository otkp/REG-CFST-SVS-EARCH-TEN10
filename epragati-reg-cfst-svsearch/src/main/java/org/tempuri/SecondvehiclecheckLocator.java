/**
 * SecondvehiclecheckLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SecondvehiclecheckLocator extends org.apache.axis.client.Service implements org.tempuri.Secondvehiclecheck {

    public SecondvehiclecheckLocator() {
    }


    public SecondvehiclecheckLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SecondvehiclecheckLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SecondvehiclecheckSoap
    private java.lang.String SecondvehiclecheckSoap_address = "http://202.65.142.140/OTSI2VEHCHK/Secondvehiclecheck.asmx";

    public java.lang.String getSecondvehiclecheckSoapAddress() {
        return SecondvehiclecheckSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SecondvehiclecheckSoapWSDDServiceName = "SecondvehiclecheckSoap";

    public java.lang.String getSecondvehiclecheckSoapWSDDServiceName() {
        return SecondvehiclecheckSoapWSDDServiceName;
    }

    public void setSecondvehiclecheckSoapWSDDServiceName(java.lang.String name) {
        SecondvehiclecheckSoapWSDDServiceName = name;
    }

    public org.tempuri.SecondvehiclecheckSoap getSecondvehiclecheckSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SecondvehiclecheckSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSecondvehiclecheckSoap(endpoint);
    }

    public org.tempuri.SecondvehiclecheckSoap getSecondvehiclecheckSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.SecondvehiclecheckSoapStub _stub = new org.tempuri.SecondvehiclecheckSoapStub(portAddress, this);
            _stub.setPortName(getSecondvehiclecheckSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSecondvehiclecheckSoapEndpointAddress(java.lang.String address) {
        SecondvehiclecheckSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.SecondvehiclecheckSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.SecondvehiclecheckSoapStub _stub = new org.tempuri.SecondvehiclecheckSoapStub(new java.net.URL(SecondvehiclecheckSoap_address), this);
                _stub.setPortName(getSecondvehiclecheckSoapWSDDServiceName());
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
        if ("SecondvehiclecheckSoap".equals(inputPortName)) {
            return getSecondvehiclecheckSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "Secondvehiclecheck");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "SecondvehiclecheckSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SecondvehiclecheckSoap".equals(portName)) {
            setSecondvehiclecheckSoapEndpointAddress(address);
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

/**
 * KPSPublicLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub;
package tr.gov.nvi.tckimlik.WS;

public class KPSPublicLocator extends org.apache.axis.client.Service implements KPSPublic {

    public KPSPublicLocator() {
    }


    public KPSPublicLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public KPSPublicLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for KPSPublicSoap
    private String KPSPublicSoap_address = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";

    public String getKPSPublicSoapAddress() {
        return KPSPublicSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String KPSPublicSoapWSDDServiceName = "KPSPublicSoap";

    public String getKPSPublicSoapWSDDServiceName() {
        return KPSPublicSoapWSDDServiceName;
    }

    public void setKPSPublicSoapWSDDServiceName(String name) {
        KPSPublicSoapWSDDServiceName = name;
    }

    public KPSPublicSoap getKPSPublicSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(KPSPublicSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getKPSPublicSoap(endpoint);
    }

    public KPSPublicSoap getKPSPublicSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            KPSPublicSoapStub _stub = new KPSPublicSoapStub(portAddress, this);
            _stub.setPortName(getKPSPublicSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setKPSPublicSoapEndpointAddress(String address) {
        KPSPublicSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (KPSPublicSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                KPSPublicSoapStub _stub = new KPSPublicSoapStub(new java.net.URL(KPSPublicSoap_address), this);
                _stub.setPortName(getKPSPublicSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
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
        String inputPortName = portName.getLocalPart();
        if ("KPSPublicSoap".equals(inputPortName)) {
            return getKPSPublicSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublic");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublicSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("KPSPublicSoap".equals(portName)) {
            setKPSPublicSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

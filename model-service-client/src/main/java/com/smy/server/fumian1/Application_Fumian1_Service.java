package com.smy.server.fumian1;

import java.net.URL;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

import com.smy.common.HttpUrlConfig;
import com.smy.server.Application_PortType;
import com.smy.server.Application_Service;


public class Application_Fumian1_Service extends Service implements Application_Service {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Application_Fumian1_Service() {
    }


    public Application_Fumian1_Service(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Application_Fumian1_Service(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Application
    HttpUrlConfig huc = HttpUrlConfig.getInstance();
    private String Application_address = huc.getAlphaSUrlUrl();

    public String getApplicationAddress() {
        return Application_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ApplicationWSDDServiceName = "Application";

    public java.lang.String getApplicationWSDDServiceName() {
        return ApplicationWSDDServiceName;
    }

    public void setApplicationWSDDServiceName(java.lang.String name) {
        ApplicationWSDDServiceName = name;
    }

    public Application_PortType getApplication() throws ServiceException {
       URL endpoint;
        try {
            endpoint = new URL(Application_address);
        }catch (java.net.MalformedURLException e) {
            throw new ServiceException(e);
        }
        return getApplication(endpoint);
    }

    public Application_PortType getApplication(URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Application_Fumian1_PortType _stub = new Application_Fumian1_PortType(portAddress, this);
            _stub.setPortName(getApplicationWSDDServiceName());
            return _stub;
        }catch (AxisFault e) {
            return null;
        }
    }

    public void setApplicationEndpointAddress(java.lang.String address) {
        Application_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (Application_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                Application_Fumian1_PortType _stub = new Application_Fumian1_PortType(new URL(Application_address), this);
                _stub.setPortName(getApplicationWSDDServiceName());
                return _stub;
            }
        }catch (Throwable t) {
            throw new ServiceException(t);
        }
        throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("Application".equals(inputPortName)) {
            return getApplication();
        }
        else  {
            Remote _stub = getPort(serviceEndpointInterface);
            ((Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public QName getServiceName() {
        return new QName("tns", "Application");
    }

    private HashSet<QName> ports = null;

    public Iterator<QName> getPorts() {
        if (ports == null) {
            ports = new HashSet<QName>();
            ports.add(new QName("tns", "Application"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws ServiceException {
        
    	if ("Application".equals(portName)) {
            setApplicationEndpointAddress(address);
        }else{ 
        	// Unknown Port Name
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

package com.smy.server.shilian;

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


public class Application_Shilian_Service extends Service implements Application_Service {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String application_address;
	public Application_Shilian_Service(String modelUrl) {
		this.application_address = modelUrl;
    }


    public Application_Shilian_Service(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Application_Shilian_Service(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }   

    public String getApplicationAddress() {
        return application_address;
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
            endpoint = new URL(application_address);
        }catch (java.net.MalformedURLException e) {
            throw new ServiceException(e);
        }
        return getApplication(endpoint);
    }

    public Application_PortType getApplication(URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Application_Shilian_PortType _stub = new Application_Shilian_PortType(portAddress, this);
            _stub.setPortName(getApplicationWSDDServiceName());
            return _stub;
        }catch (AxisFault e) {
            return null;
        }
    }

    public void setApplicationEndpointAddress(java.lang.String address) {
    	application_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (Application_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                Application_Shilian_PortType _stub = new Application_Shilian_PortType(new URL(application_address), this);
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

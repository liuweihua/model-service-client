package com.smy.server.glren;

import java.util.Map;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;

import com.smy.server.Application_PortType;

public class Application_Glren_Proxy implements Application_PortType {
  private String _endpoint = null;
  private Application_PortType application_PortType = null;
  
  public Application_Glren_Proxy() {
    _initApplicationProxy();
  }
  
  public Application_Glren_Proxy(String endpoint) {
    _endpoint = endpoint;
    _initApplicationProxy();
  }
  
  private void _initApplicationProxy() {
    try {
      application_PortType = (new Application_Glren_Service()).getApplication();
      if (application_PortType != null) {
        if (_endpoint != null){
          ((Stub)application_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        }else{
          _endpoint = (String)((Stub)application_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
        }
      }
      
    }catch (ServiceException e) {
    	e.printStackTrace();
    }
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (application_PortType != null){
      ((Stub)application_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    }
    
  }
  
  public Application_PortType getApplication_PortType() {
    if (application_PortType == null)
      _initApplicationProxy();
    return application_PortType;
  }
  
  
  
  @Override
  public Object modelScore(String cell, Object inputObj,Map<String, Object> params) throws Exception {
	  if (application_PortType == null)
	      _initApplicationProxy();
	    return application_PortType.modelScore(cell, inputObj,params);
	  
  }
  
  
  
}
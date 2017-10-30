/**
 * Application_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.smy.server;
import java.net.URL;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface Application_Service extends Service {
	
	/**
	 * 
	 * <b>方法说明：得到应用的访问地址</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14上午11:16:02
	 * @return
	 */
    public String getApplicationAddress();

    
    /**
     * 
     * <b>方法说明：获得一个对应的应用</b>
     * 
     * @作者：lwh
     * @时间：2017-2-14上午11:15:32
     * @return
     * @throws ServiceException
     */
    public Application_PortType getApplication() throws ServiceException;

    /**
     * 
     * <b>方法说明：根据端口地址获得一个对应的应用</b>
     * 
     * @作者：lwh
     * @时间：2017-2-14上午11:15:07
     * @param portAddress
     * @return
     * @throws ServiceException
     */
    public Application_PortType getApplication(URL portAddress) throws ServiceException;
}

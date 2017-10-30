/**
 * Application_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.smy.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface Application_PortType extends Remote {
	
	/**
	 * 
	 * <b>方法说明：获得模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午2:07:44
	 * @param cell
	 * @param inputX
	 * @return
	 * @throws RemoteException
	 */
	public Object modelScore(String cell, Object inputObj,Map<String, Object> params) throws Exception;
	
}

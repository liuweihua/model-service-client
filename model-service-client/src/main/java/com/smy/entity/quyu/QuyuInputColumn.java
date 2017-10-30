package com.smy.entity.quyu;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class QuyuInputColumn {
	private static Map<String,String> quyuInputs = new HashMap<String,String>();
	
	
	static{
		setQuyuInputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置工作所有的输入项和默认值</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void setQuyuInputsAndDefaultVal(){
		quyuInputs.put("cust_lbs_adress","0");
		quyuInputs.put("cd_comp_add1","0");
		quyuInputs.put("cd_comp_add2","0");
		quyuInputs.put("cd_comp_add3","0");
		quyuInputs.put("cd_comp_add4","0");
		quyuInputs.put("cd_comp_add5","0");
		quyuInputs.put("detail_address","0");
		quyuInputs.put("top1_place","0");
		quyuInputs.put("top2_place","0");
		
		 	
		
	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S 工作所有的输入项</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:39:17
	 * @return
	 */
	public static Map<String,String> getAllQuyuInputs(){
		
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent :  QuyuInputColumn.quyuInputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
	}
}

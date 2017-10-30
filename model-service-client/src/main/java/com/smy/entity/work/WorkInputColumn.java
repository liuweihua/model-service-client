package com.smy.entity.work;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.smy.framework.core.util.DateUtil;


public class WorkInputColumn {
	
	
	private static Map<String,String> workInputs = new HashMap<String,String>();
	
	
	static{
		setWorkInputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置工作所有的输入项和默认值</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void setWorkInputsAndDefaultVal(){
		workInputs.put("arti_date",DateUtil.getCurStringDate());
		workInputs.put("cd_comp_name1","0");
		workInputs.put("cd_comp_name2","0");
		workInputs.put("cd_comp_name3","0");
		workInputs.put("cd_comp_name4","0");
		workInputs.put("cd_comp_name5","0");
		workInputs.put("cd_comp_info_updt_time1","0");
		workInputs.put("cd_comp_info_updt_time2","0");
		workInputs.put("cd_comp_info_updt_time3","0");
		workInputs.put("cd_comp_info_updt_time4","0");
		workInputs.put("cd_comp_info_updt_time5","0");
		
	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S 工作所有的输入项</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:39:17
	 * @return
	 */
	public static Map<String,String> getAllWorkInputs(){
		
		
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent :  WorkInputColumn.workInputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
	}

}

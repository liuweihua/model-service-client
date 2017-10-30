package com.smy.entity.srfuzhai;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class SrfuzhaiInputColumn {
	
	
	private static Map<String,String> srfuzhaiInputs = new HashMap<String,String>();
	
	
	static{
		setSrfuzhaiInputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置收入负债所有的输入项和默认值</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void setSrfuzhaiInputsAndDefaultVal(){
		srfuzhaiInputs.put("xueli_score","None");
		srfuzhaiInputs.put("cd_month_income","0");
		srfuzhaiInputs.put("month_income_amout","0");
		srfuzhaiInputs.put("credit_month_debt","0");
		srfuzhaiInputs.put("credit_total_debt","0");
		srfuzhaiInputs.put("loan_month_debt","0");
		srfuzhaiInputs.put("loan_total_debt","0");
		
	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S 收入负债所有的输入项</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:38:08
	 * @return
	 */
	public static Map<String,String> getAllSrfuzhaiInputs(){
		
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent :  SrfuzhaiInputColumn.srfuzhaiInputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
	}

}

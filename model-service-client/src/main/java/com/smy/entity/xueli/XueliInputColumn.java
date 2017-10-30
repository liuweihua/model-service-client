package com.smy.entity.xueli;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class XueliInputColumn {
	
	
	private static Map<String,String> xueliInputs = new HashMap<String,String>();
	private static Map<String,String> noXueliInputs = new HashMap<String,String>();
	
	
	static{
		setXueliInputsAndDefaultVal();
		setNoXueliInputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置学历所有的输入项和默认值</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void setXueliInputsAndDefaultVal(){
		
		xueliInputs.put("college_is_211","0");
		xueliInputs.put("py_degree","1");
		xueliInputs.put("py_studystyle","0");
		xueliInputs.put("age_big","0");
		
	}
	
	/**
	 * 
	 * <b>方法说明：设置无学历所有的输入项和默认值</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void setNoXueliInputsAndDefaultVal(){
		
		noXueliInputs.put("gongzuo_score","None");
		noXueliInputs.put("cd_month_income","0");
		noXueliInputs.put("cd_final_income","0");
		noXueliInputs.put("month_income_amout","0");
		noXueliInputs.put("cdshareanddebtsum_loancard_maxcreditlimitperorg","0");
		noXueliInputs.put("cd_accumulation_edu_info","0");
		noXueliInputs.put("age_big","0");
	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S 学历所有的输入项</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:38:08
	 * @return
	 */
	public static Map<String,String> getAllXueliInputs(){
		
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent :  XueliInputColumn.xueliInputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S 无学历所有的输入项</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:38:08
	 * @return
	 */
	public static Map<String,String> getAllNoXueliInputs(){
		
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent :  XueliInputColumn.noXueliInputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
	}

}

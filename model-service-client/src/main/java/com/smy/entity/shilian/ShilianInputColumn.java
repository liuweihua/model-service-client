package com.smy.entity.shilian;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class ShilianInputColumn {

	private static Map<String,String> shilianInputs = new HashMap<String,String>();
	
	
	static{
		setShilianInputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置失联所有的输入项和默认值</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void setShilianInputsAndDefaultVal(){
		shilianInputs.put("contact_normal_cnt", "0");
		shilianInputs.put("CALLOUTTIME", "79767");
		shilianInputs.put("call_contact_intersect_cnt", "0");
		shilianInputs.put("CALLTIMES6MONTH", "1716");
		shilianInputs.put("CALL_DISTINCT", "286");
		shilianInputs.put("jxl_phoneinuse", "88");
		shilianInputs.put("ratio_contact_calls", "0");
		shilianInputs.put("CALLINTIME", "77964");
		shilianInputs.put("CALLMIN6MONTH", "158135");
		shilianInputs.put("ratio_contact_cnt", "0");
		shilianInputs.put("zj_contact_intersect_cnt", "0");
		shilianInputs.put("bj_contact_intersect_cnt", "0");
		shilianInputs.put("EARLIEST_CALL_DELTA_MONTHS", "5");
		shilianInputs.put("id_match", "0");
		shilianInputs.put("xiaohao", "0");
		
	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S 失联所有的输入项</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:38:08
	 * @return
	 */
	public static Map<String,String> getAllShilianInputs(){
		
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent :  ShilianInputColumn.shilianInputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
	}
	
	public static void main(String[] args) {
		Map<String, String> aa = new HashMap<String, String>();
		aa.put("aa", "1");
		aa.put("bb", "2");
		aa.put("dd", "3");
		
		Map<String, String> bb = new HashMap<String, String>();
		bb.put("aa", "4");
		bb.put("bb", "5");
		bb.put("cc", "7");
		
		aa.putAll(bb);
		System.out.println(aa);
		
	}
}

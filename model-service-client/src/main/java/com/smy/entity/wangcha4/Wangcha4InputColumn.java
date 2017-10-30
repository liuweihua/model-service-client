package com.smy.entity.wangcha4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Wangcha4InputColumn {
	private static Map<String,String> wangcha4Inputs = new HashMap<String,String>();
	
	
	static{
		setWangcha4InputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置网查4.0所有的输入项和默认值</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void setWangcha4InputsAndDefaultVal(){
		wangcha4Inputs.put("dianhuan", "0");
		wangcha4Inputs.put("level1_black_device", "0");
		wangcha4Inputs.put("YH_BJ_1M_COUNT_4", "0");
		wangcha4Inputs.put("diandang", "0");
		wangcha4Inputs.put("ZFGS_ZJ_1M_COUNT_4", "0");
		wangcha4Inputs.put("level2_gray_phone", "0");
		wangcha4Inputs.put("cust_age", "");
		wangcha4Inputs.put("yangka", "0");
		wangcha4Inputs.put("zhongjie", "0");
		wangcha4Inputs.put("jiuba", "0");
		wangcha4Inputs.put("daili", "0");
		wangcha4Inputs.put("ZFGS_ZJ_1M_USETIME_4", "0");
		wangcha4Inputs.put("level2_black_device", "0");
		wangcha4Inputs.put("banka", "0");

	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S 网查4.0所有的输入项</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:39:17
	 * @return
	 */
	public static Map<String,String> getAllWangcha4Inputs(){
		
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent :  Wangcha4InputColumn.wangcha4Inputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
	}
}

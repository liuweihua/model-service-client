package com.smy.entity.fumian1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Fumian1InputColumn {
	private static Map<String,String> fumian1Inputs = new HashMap<String,String>();
	
	
	static{
		setFumian1InputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置负面所有的输入项和默认值</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void setFumian1InputsAndDefaultVal(){
		
		fumian1Inputs.put("fumian1_key_count", "0");
		

		
	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S 负面所有的输入项</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:38:08
	 * @return
	 */
	public static Map<String,String> getAllFumian1Inputs(){
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent :  Fumian1InputColumn.fumian1Inputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
	}
}

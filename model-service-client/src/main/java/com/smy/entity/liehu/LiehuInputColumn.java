package com.smy.entity.liehu;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class LiehuInputColumn {
	
	private static Map<String,String> liehuInputs = new HashMap<String,String>();
	
	
	static{
		setLiehuInputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置猎户所有的输入项和默认值</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void setLiehuInputsAndDefaultVal(){
		
		liehuInputs.put("orion_cluster_degree", "2");
		liehuInputs.put("level2_all_phone", "0");
		liehuInputs.put("level2_black_phone", "0");
		liehuInputs.put("first_max_deg", "0");
		liehuInputs.put("level2_yellow_phone", "0");
		liehuInputs.put("level1_yellow_phone", "0");
		liehuInputs.put("level2_all_device", "0");
		liehuInputs.put("level1_all_phone", "0");
		liehuInputs.put("level1_black_phone", "0");
		liehuInputs.put("level2_gray_phone", "0");
		liehuInputs.put("level2_black_device", "0");
		liehuInputs.put("level1_gray_phone", "0");
		liehuInputs.put("level2_gray_device", "0");
		liehuInputs.put("level1_all_device", "1");
		liehuInputs.put("same_device_level1_yellow_phone", "0");
		liehuInputs.put("same_device_level2_yellow_phone", "0");
		liehuInputs.put("level2_purple_phone", "0");
		liehuInputs.put("orion_equ_2_mob_cnt", "0");
		liehuInputs.put("level1_purple_phone", "0");
		liehuInputs.put("level2_purple_device", "0");
		liehuInputs.put("same_device_level2_all_phone", "0");
		liehuInputs.put("same_device_level2_all_device", "0");
		liehuInputs.put("same_device_level1_all_device", "0");
		liehuInputs.put("same_device_level1_all_phone", "0");
		liehuInputs.put("same_device_count", "0");
		liehuInputs.put("same_device_level2_gray_phone", "0");
		liehuInputs.put("same_device_level2_black_phone", "0");
		liehuInputs.put("same_device_level1_gray_phone", "0");
		liehuInputs.put("same_device_level1_black_phone", "0");
		liehuInputs.put("cust_self_serious", "0");
		liehuInputs.put("level1_black_device", "0");
		liehuInputs.put("level1_gray_device", "0");
		liehuInputs.put("level1_purple_device", "0");
		liehuInputs.put("level1_yellow_device", "0");
		liehuInputs.put("level2_yellow_device", "0");
		liehuInputs.put("same_device_level1_black_device", "0");
		liehuInputs.put("same_device_level1_gray_device", "0");
		liehuInputs.put("same_device_level1_purple_phone", "0");
		liehuInputs.put("same_device_level1_purple_device", "0");
		liehuInputs.put("same_device_level1_yellow_device", "0");
		liehuInputs.put("same_device_level2_black_device", "0");
		liehuInputs.put("same_device_level2_gray_device", "0");
		liehuInputs.put("same_device_level2_purple_phone", "0");
		liehuInputs.put("same_device_level2_purple_device", "0");
		liehuInputs.put("same_device_level2_yellow_device", "0");
		
	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S 猎户所有的输入项</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:38:08
	 * @return
	 */
	public static Map<String,String> getAllLiehuInputs(){
		
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent :  LiehuInputColumn.liehuInputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
	}

}

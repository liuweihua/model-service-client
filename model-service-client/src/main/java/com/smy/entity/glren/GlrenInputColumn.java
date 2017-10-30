package com.smy.entity.glren;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class GlrenInputColumn {
	private static Map<String,String> glrenInputs = new HashMap<String,String>();
	
	
	static{
		setGlrenInputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置关联人所有的输入项和默认值</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void setGlrenInputsAndDefaultVal(){
		
		glrenInputs.put("top10_apply_count", "0");
		glrenInputs.put("top1_reject_count", "0");
		glrenInputs.put("top10_reject_count", "0");
		glrenInputs.put("top10_reject_for_class3_count", "0");
		glrenInputs.put("top1_apply_count", "0");
		glrenInputs.put("top5_apply_count", "0");
		glrenInputs.put("top3_reject_for_class1_count", "0");
		glrenInputs.put("top3_apply_count", "0");
		glrenInputs.put("top5_reject_count", "0");
		glrenInputs.put("top10_reject_for_class1_count", "0");
		glrenInputs.put("top3_reject_for_class2_count", "0");
		glrenInputs.put("top5_reject_for_class2_count", "0");
		glrenInputs.put("top10_reject_for_class2_count", "0");
		glrenInputs.put("top3_reject_for_class3_count", "0");
		glrenInputs.put("same_device_count", "0");
		glrenInputs.put("top5_reject_for_class3_count", "0");
		glrenInputs.put("top3_reject_count", "0");
		glrenInputs.put("same_device_reject_class2", "0");
		glrenInputs.put("top5_reject_for_class1_count", "0");
		glrenInputs.put("same_device_reject_count", "0");
		glrenInputs.put("same_device_reject_class3", "0");
		glrenInputs.put("same_device_reject_class1", "0");
		glrenInputs.put("same_device_reject_for_black", "0");
		glrenInputs.put("top1_reject_for_black", "0");
		
	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S 关联人所有的输入项</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:38:08
	 * @return
	 */
	public static Map<String,String> getAllGlrenInputs(){
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent :  GlrenInputColumn.glrenInputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
	}
}

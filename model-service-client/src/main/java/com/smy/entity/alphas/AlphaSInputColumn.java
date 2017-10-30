package com.smy.entity.alphas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class AlphaSInputColumn {
	
	
	private static Map<String,String> alphasInputs = new HashMap<String,String>();
	
	
	static{
		setAlphaSInputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置approve所有的输入项和默认值</b>
	 * 
	 * @作者：lwh 
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void 	setAlphaSInputsAndDefaultVal(){
		
		alphasInputs.put("shourufuzhai_score", "None");
		alphasInputs.put("cust_age", "");
		alphasInputs.put("liehu_score", "None");
		alphasInputs.put("shilian_score", "None");
		alphasInputs.put("gongzuo_score", "None");
		alphasInputs.put("xueli_score", "None");
		alphasInputs.put("quyu_score", "None");
		alphasInputs.put("renhang_score", "None");
		alphasInputs.put("guanlianren_score", "None");
		alphasInputs.put("fumian2_score", "None");
		alphasInputs.put("fumian1_score", "None");
		alphasInputs.put("tonghua_score", "None");
		alphasInputs.put("tjr_approve_result", "Y");
		alphasInputs.put("marital_status", "20");
		alphasInputs.put("cust_sex", "None");
		alphasInputs.put("double_0", "2");


		
	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S approve所有的输入项(对外不要直接提供静态变量，不熟悉的人会发生灾难)</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:38:08
	 * @return
	 */
	public static Map<String,String> getAllAlphaSInputs(){
		
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent : AlphaSInputColumn.alphasInputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
		
	}

	
	
	
	
	

}

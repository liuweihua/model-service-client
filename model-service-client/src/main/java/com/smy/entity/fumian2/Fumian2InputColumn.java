package com.smy.entity.fumian2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Fumian2InputColumn {
private static Map<String,String> fumian2Inputs = new HashMap<String,String>();
	
	
	static{
		setFumian2InputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置负面2所有的输入项和默认值</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void setFumian2InputsAndDefaultVal(){
		
		fumian2Inputs.put("contact_risk_4_cnt", "0");
		fumian2Inputs.put("contact_risk_1_cnt", "0");
		fumian2Inputs.put("xinyongka", "0");
		fumian2Inputs.put("zhongjie", "0");
		fumian2Inputs.put("daikuan", "0");
		fumian2Inputs.put("daili", "0");
		fumian2Inputs.put("xindai", "0");
		fumian2Inputs.put("banka", "0");
		fumian2Inputs.put("gongjijin", "0");
		fumian2Inputs.put("contact_risk_3_cnt", "0");
		fumian2Inputs.put("jiuba", "0");
		fumian2Inputs.put("dapai", "0");
		fumian2Inputs.put("danbao", "0");
		fumian2Inputs.put("pos_ji", "0");
		fumian2Inputs.put("anmo", "0");
		fumian2Inputs.put("jiazheng", "0");
		fumian2Inputs.put("diya", "0");
		fumian2Inputs.put("taoxian", "0");
		fumian2Inputs.put("da_e", "0");
		fumian2Inputs.put("diandang", "0");
		fumian2Inputs.put("ti_e", "0");
		fumian2Inputs.put("yangka", "0");
		fumian2Inputs.put("contact_risk_2_cnt", "0");
		fumian2Inputs.put("xiaxian", "0");
		fumian2Inputs.put("xiao_e", "0");
		fumian2Inputs.put("gao_e", "0");
		fumian2Inputs.put("dianhuan", "0");
		fumian2Inputs.put("daizhang", "0");
		fumian2Inputs.put("daoshou", "0");
		fumian2Inputs.put("dayan", "0");
		fumian2Inputs.put("caozuo", "0");

		
	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S 负面2所有的输入项</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:38:08
	 * @return
	 */
	public static Map<String,String> getAllFumian2Inputs(){
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent :  Fumian2InputColumn.fumian2Inputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
	}
}

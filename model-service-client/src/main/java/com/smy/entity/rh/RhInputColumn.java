package com.smy.entity.rh;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class RhInputColumn {

	private static Map<String,String> rhInputs = new HashMap<String,String>();
	
	
	static{
		setRhInputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置人行所有的输入项和默认值</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void setRhInputsAndDefaultVal(){
		
		rhInputs.put("limitusedrate", "0");
		rhInputs.put("cdrecorddetail_latest24monthloancardverify", "0");
		rhInputs.put("cdrecorddetail_latest24monthloanverify", "0");
		rhInputs.put("cdrecorddetail_latest1monthloancardverify", "0");
		rhInputs.put("cdrecorddetail_latest3monthloanverify", "0");
		rhInputs.put("cdrecorddetail_latest3monthloancardverify", "0");
		rhInputs.put("cdrecorddetail_latest1monthloanverify", "0");
		rhInputs.put("loan_state", "0");
		rhInputs.put("state_bad", "0");
		rhInputs.put("cdcreditcardinfo_currentoverdueamount", "0");
		rhInputs.put("cdloaninfo_loancurroverdueamount", "0");
		rhInputs.put("cd_creditcard_latest24month_pmt_his", "NNNNNNNNNNNNNNNNNNNNNNNN");
		rhInputs.put("cd_study_loan_latest24month_pmt_his", "NNNNNNNNNNNNNNNNNNNNNNNN");
		rhInputs.put("cd_small_loan_latest24month_pmt_his", "NNNNNNNNNNNNNNNNNNNNNNNN");
		rhInputs.put("delqhist", "NNNNNNNNNNNNNNNNNNNNNNNN");
		rhInputs.put("cd_house_loan_latest24month_pmt_his", "NNNNNNNNNNNNNNNNNNNNNNNN");
		rhInputs.put("cd_large_loan_latest24month_pmt_his", "NNNNNNNNNNNNNNNNNNNNNNNN");
		rhInputs.put("cd_car_loan_latest24month_pmt_his", "NNNNNNNNNNNNNNNNNNNNNNNN");
		rhInputs.put("strategy_branch", "0");
		
	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S 人行所有的输入项</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:38:08
	 * @return
	 */
	public static Map<String,String> getAllRhInputs(){
		
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent :  RhInputColumn.rhInputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
	}
}

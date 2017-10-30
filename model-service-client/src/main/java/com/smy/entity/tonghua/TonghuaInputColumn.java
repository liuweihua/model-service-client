package com.smy.entity.tonghua;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TonghuaInputColumn {
	
private static Map<String,String> tonghuaInputs = new HashMap<String,String>();
	
	
	static{
		setTonghuaInputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置学历所有的输入项和输入项默认值</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void setTonghuaInputsAndDefaultVal(){
		tonghuaInputs.put("yp_rate_4", "0");
		tonghuaInputs.put("total_tonghua_count_4", "0");
		tonghuaInputs.put("yp_count_4", "0");
		tonghuaInputs.put("P2P_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("P2P_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("P2P_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("P2P_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("P2P_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("P2P_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("POS_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("POS_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("POS_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("POS_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("POS_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("POS_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("LCBX_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("LCBX_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("LCBX_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("LCBX_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("LCBX_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("LCBX_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("CSWB_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("CSWB_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("CSWB_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("CSWB_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("CSWB_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("CSWB_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("DBZJ_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("DBZJ_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("DBZJ_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("DBZJ_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("DBZJ_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("DBZJ_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("DB_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("DB_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("DB_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("DB_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("DB_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("DB_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("LCZQ_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("LCZQ_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("LCZQ_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("LCZQ_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("LCZQ_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("LCZQ_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("LCQT_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("LCQT_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("LCQT_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("LCQT_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("LCQT_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("LCQT_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("QTJR_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("QTJR_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("QTJR_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("QTJR_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("QTJR_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("QTJR_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("SHFW_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("SHFW_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("SHFW_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("SHFW_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("SHFW_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("SHFW_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("WLDH_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("WLDH_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("WLDH_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("WLDH_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("WLDH_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("WLDH_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("XFJR_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("XFJR_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("XFJR_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("XFJR_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("XFJR_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("XFJR_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("YSZP_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("YSZP_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("YSZP_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("YSZP_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("YSZP_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("YSZP_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("YH_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("YH_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("YH_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("YH_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("YH_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("YH_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("ZFGS_ZJ_1M_SUM_4", "0");
		tonghuaInputs.put("ZFGS_ZJ_1M_COUNT_4", "0");
		tonghuaInputs.put("ZFGS_ZJ_1M_USETIME_4", "0");
		tonghuaInputs.put("ZFGS_BJ_1M_SUM_4", "0");
		tonghuaInputs.put("ZFGS_BJ_1M_COUNT_4", "0");
		tonghuaInputs.put("ZFGS_BJ_1M_USETIME_4", "0");
		tonghuaInputs.put("P2P_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("P2P_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("P2P_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("P2P_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("P2P_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("P2P_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("P2P_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("P2P_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("P2P_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("P2P_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("P2P_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("P2P_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("POS_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("POS_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("POS_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("POS_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("POS_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("POS_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("POS_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("POS_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("POS_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("POS_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("POS_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("POS_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("LCBX_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("LCBX_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("LCBX_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("LCBX_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("LCBX_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("LCBX_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("LCBX_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("LCBX_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("LCBX_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("LCBX_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("LCBX_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("LCBX_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("CSWB_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("CSWB_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("CSWB_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("CSWB_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("CSWB_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("CSWB_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("CSWB_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("CSWB_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("CSWB_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("CSWB_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("CSWB_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("CSWB_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("DBZJ_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("DBZJ_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("DBZJ_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("DBZJ_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("DBZJ_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("DBZJ_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("DBZJ_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("DBZJ_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("DBZJ_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("DBZJ_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("DBZJ_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("DBZJ_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("DB_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("DB_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("DB_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("DB_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("DB_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("DB_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("DB_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("DB_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("DB_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("DB_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("DB_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("DB_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("LCZQ_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("LCZQ_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("LCZQ_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("LCZQ_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("LCZQ_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("LCZQ_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("LCZQ_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("LCZQ_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("LCZQ_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("LCZQ_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("LCZQ_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("LCZQ_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("LCQT_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("LCQT_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("LCQT_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("LCQT_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("LCQT_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("LCQT_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("LCQT_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("LCQT_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("LCQT_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("LCQT_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("LCQT_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("LCQT_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("QTJR_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("QTJR_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("QTJR_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("QTJR_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("QTJR_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("QTJR_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("QTJR_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("QTJR_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("QTJR_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("QTJR_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("QTJR_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("QTJR_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("SHFW_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("SHFW_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("SHFW_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("SHFW_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("SHFW_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("SHFW_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("SHFW_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("SHFW_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("SHFW_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("SHFW_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("SHFW_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("SHFW_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("WLDH_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("WLDH_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("WLDH_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("WLDH_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("WLDH_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("WLDH_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("WLDH_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("WLDH_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("WLDH_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("WLDH_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("WLDH_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("WLDH_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("XFJR_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("XFJR_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("XFJR_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("XFJR_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("XFJR_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("XFJR_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("XFJR_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("XFJR_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("XFJR_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("XFJR_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("XFJR_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("XFJR_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("YSZP_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("YSZP_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("YSZP_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("YSZP_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("YSZP_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("YSZP_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("YSZP_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("YSZP_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("YSZP_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("YSZP_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("YSZP_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("YSZP_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("YH_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("YH_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("YH_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("YH_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("YH_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("YH_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("YH_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("YH_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("YH_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("YH_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("YH_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("YH_BJ_TT_COUNT_4", "0");
		tonghuaInputs.put("ZFGS_ZJ_1Q_SUM_4", "0");
		tonghuaInputs.put("ZFGS_ZJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("ZFGS_ZJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("ZFGS_BJ_1Q_SUM_4", "0");
		tonghuaInputs.put("ZFGS_BJ_1Q_USETIME_4", "0");
		tonghuaInputs.put("ZFGS_BJ_1Q_COUNT_4", "0");
		tonghuaInputs.put("ZFGS_ZJ_TT_SUM_4", "0");
		tonghuaInputs.put("ZFGS_ZJ_TT_USETIME_4", "0");
		tonghuaInputs.put("ZFGS_ZJ_TT_COUNT_4", "0");
		tonghuaInputs.put("ZFGS_BJ_TT_SUM_4", "0");
		tonghuaInputs.put("ZFGS_BJ_TT_USETIME_4", "0");
		tonghuaInputs.put("ZFGS_BJ_TT_COUNT_4", "0");
	}
	
	/**
	 * 
	 * <b>方法说明：得到Alpha_S 学历所有的输入项</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:38:08
	 * @return
	 */
	public static Map<String,String> getAllTonghuaInputs(){
		
		Map<String, String> map = new HashMap<String, String>();
		for(Entry<String, String> ent :  TonghuaInputColumn.tonghuaInputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
	}

}

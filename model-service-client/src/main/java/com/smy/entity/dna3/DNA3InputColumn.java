package com.smy.entity.dna3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class DNA3InputColumn {
	
	
	private static Map<String,String> dna3Inputs = new HashMap<String,String>();
	
	
	static{
		setDNA3InputsAndDefaultVal();
	}
	
	/**
	 * 
	 * <b>方法说明：设置DNA3.0所有的输入项和默认值</b>
	 * 
	 * @作者：lwh 
	 * @时间：2017-2-15下午2:27:47
	 */
	public static void 	setDNA3InputsAndDefaultVal(){
		
		//运营商数据（Y – 需要查询通话记录，N – 不需要（或无法）查询通话记录，B – 需要查询通话记录、且运营商手机使用时间返回值为：小于3个月、3-6个月、6-12个月、12-24个月、24个月以上）
		dna3Inputs.put("id_match", "0");
		dna3Inputs.put("jxl_phoneinuse", "66");
		dna3Inputs.put("EARLIEST_CALL_DELTA_MONTHS", "5");
		dna3Inputs.put("ratio_contact_calls", "0");
		dna3Inputs.put("xiaohao", "0");
		dna3Inputs.put("CALLOUTTIME", "81791");
		dna3Inputs.put("CALLINTIME", "81030");
		dna3Inputs.put("CALLTIMES6MONTH", "1783");
		dna3Inputs.put("CALLMIN6MONTH", "163108");
		dna3Inputs.put("CALL_DISTINCT", "276");
		dna3Inputs.put("call_contact_intersect_cnt", "0");
		dna3Inputs.put("ratio_contact_cnt", "0");
		dna3Inputs.put("bj_contact_intersect_cnt", "0");
		dna3Inputs.put("zj_contact_intersect_cnt", "0");
		dna3Inputs.put("top1_apply_count", "0");
		dna3Inputs.put("top1_reject_count", "0");
		dna3Inputs.put("top1_reject_class2", "0");
		dna3Inputs.put("top1_reject_class3", "0");
		dna3Inputs.put("top3_apply_count", "0");
		dna3Inputs.put("top3_reject_count", "0");
		dna3Inputs.put("top3_reject_for_class2_count", "0");
		dna3Inputs.put("top3_reject_for_class3_count", "0");
		dna3Inputs.put("top5_apply_count", "0");
		dna3Inputs.put("top5_reject_count", "0");
		dna3Inputs.put("top5_reject_for_class1_count", "0");
		dna3Inputs.put("top5_reject_for_class2_count", "0");
		dna3Inputs.put("top5_reject_for_class3_count", "0");
		dna3Inputs.put("top10_apply_count", "0");
		dna3Inputs.put("top10_reject_count", "0");
		dna3Inputs.put("top10_reject_for_class1_count", "0");
		dna3Inputs.put("top10_reject_for_class2_count", "0");
		dna3Inputs.put("top10_reject_for_class3_count", "0");
		dna3Inputs.put("same_device_apply_count", "0");
		dna3Inputs.put("yp_count_4", "0");
		dna3Inputs.put("total_tonghua_count_4", "0");
		dna3Inputs.put("yp_rate_4", "0");
		dna3Inputs.put("P2P_ZJ_1M_SUM_4", "0");
		dna3Inputs.put("P2P_ZJ_1M_COUNT_4", "0");
		dna3Inputs.put("P2P_ZJ_1M_USETIME_4", "0");
		dna3Inputs.put("P2P_BJ_1M_SUM_4", "0");
		dna3Inputs.put("P2P_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("P2P_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("POS_ZJ_1M_SUM_4", "0");
		dna3Inputs.put("POS_ZJ_1M_COUNT_4", "0");
		dna3Inputs.put("POS_ZJ_1M_USETIME_4", "0");
		dna3Inputs.put("POS_BJ_1M_SUM_4", "0");
		dna3Inputs.put("POS_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("POS_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("LCBX_ZJ_1M_SUM_4", "0");
		dna3Inputs.put("LCBX_ZJ_1M_COUNT_4", "0");
		dna3Inputs.put("LCBX_ZJ_1M_USETIME_4", "0");
		dna3Inputs.put("LCBX_BJ_1M_SUM_4", "0");
		dna3Inputs.put("LCBX_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("LCBX_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("CSWB_BJ_1M_SUM_4", "0");
		dna3Inputs.put("CSWB_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("CSWB_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("DBZJ_BJ_1M_SUM_4", "0");
		dna3Inputs.put("DBZJ_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("DBZJ_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("DB_ZJ_1M_SUM_4", "0");
		dna3Inputs.put("DB_ZJ_1M_COUNT_4", "0");
		dna3Inputs.put("DB_ZJ_1M_USETIME_4", "0");
		dna3Inputs.put("DB_BJ_1M_SUM_4", "0");
		dna3Inputs.put("DB_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("DB_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("LCZQ_ZJ_1M_SUM_4", "0");
		dna3Inputs.put("LCZQ_ZJ_1M_COUNT_4", "0");
		dna3Inputs.put("LCZQ_ZJ_1M_USETIME_4", "0");
		dna3Inputs.put("LCZQ_BJ_1M_SUM_4", "0");
		dna3Inputs.put("LCZQ_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("LCZQ_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("LCQT_ZJ_1M_SUM_4", "0");
		dna3Inputs.put("LCQT_ZJ_1M_COUNT_4", "0");
		dna3Inputs.put("LCQT_ZJ_1M_USETIME_4", "0");
		dna3Inputs.put("LCQT_BJ_1M_SUM_4", "0");
		dna3Inputs.put("LCQT_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("LCQT_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("QTJR_ZJ_1M_SUM_4", "0");
		dna3Inputs.put("QTJR_ZJ_1M_COUNT_4", "0");
		dna3Inputs.put("QTJR_ZJ_1M_USETIME_4", "0");
		dna3Inputs.put("QTJR_BJ_1M_SUM_4", "0");
		dna3Inputs.put("QTJR_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("QTJR_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("SHFW_ZJ_1M_SUM_4", "0");
		dna3Inputs.put("SHFW_ZJ_1M_COUNT_4", "0");
		dna3Inputs.put("SHFW_ZJ_1M_USETIME_4", "0");
		dna3Inputs.put("SHFW_BJ_1M_SUM_4", "0");
		dna3Inputs.put("SHFW_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("SHFW_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("WLDH_ZJ_1M_SUM_4", "0");
		dna3Inputs.put("WLDH_ZJ_1M_COUNT_4", "0");
		dna3Inputs.put("WLDH_ZJ_1M_USETIME_4", "0");
		dna3Inputs.put("WLDH_BJ_1M_SUM_4", "0");
		dna3Inputs.put("WLDH_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("WLDH_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("XFJR_ZJ_1M_SUM_4", "0");
		dna3Inputs.put("XFJR_ZJ_1M_COUNT_4", "0");
		dna3Inputs.put("XFJR_ZJ_1M_USETIME_4", "0");
		dna3Inputs.put("XFJR_BJ_1M_SUM_4", "0");
		dna3Inputs.put("XFJR_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("XFJR_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("YSZP_ZJ_1M_SUM_4", "0");
		dna3Inputs.put("YSZP_ZJ_1M_COUNT_4", "0");
		dna3Inputs.put("YSZP_ZJ_1M_USETIME_4", "0");
		dna3Inputs.put("YSZP_BJ_1M_SUM_4", "0");
		dna3Inputs.put("YSZP_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("YSZP_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("YH_ZJ_1M_SUM_4", "0");
		dna3Inputs.put("YH_ZJ_1M_COUNT_4", "0");
		dna3Inputs.put("YH_ZJ_1M_USETIME_4", "0");
		dna3Inputs.put("YH_BJ_1M_SUM_4", "0");
		dna3Inputs.put("YH_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("YH_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("ZFGS_ZJ_1M_SUM_4", "0");
		dna3Inputs.put("ZFGS_ZJ_1M_COUNT_4", "0");
		dna3Inputs.put("ZFGS_ZJ_1M_USETIME_4", "0");
		dna3Inputs.put("ZFGS_BJ_1M_SUM_4", "0");
		dna3Inputs.put("ZFGS_BJ_1M_COUNT_4", "0");
		dna3Inputs.put("ZFGS_BJ_1M_USETIME_4", "0");
		dna3Inputs.put("P2P_ZJ_1Q_SUM_4", "0");
		dna3Inputs.put("P2P_ZJ_1Q_COUNT_4", "0");
		dna3Inputs.put("P2P_ZJ_1Q_USETIME_4", "0");
		dna3Inputs.put("P2P_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("P2P_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("P2P_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("POS_ZJ_1Q_SUM_4", "0");
		dna3Inputs.put("POS_ZJ_1Q_COUNT_4", "0");
		dna3Inputs.put("POS_ZJ_1Q_USETIME_4", "0");
		dna3Inputs.put("POS_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("POS_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("POS_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("LCBX_ZJ_1Q_SUM_4", "0");
		dna3Inputs.put("LCBX_ZJ_1Q_COUNT_4", "0");
		dna3Inputs.put("LCBX_ZJ_1Q_USETIME_4", "0");
		dna3Inputs.put("LCBX_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("LCBX_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("LCBX_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("CSWB_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("CSWB_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("CSWB_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("DBZJ_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("DBZJ_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("DBZJ_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("DB_ZJ_1Q_SUM_4", "0");
		dna3Inputs.put("DB_ZJ_1Q_COUNT_4", "0");
		dna3Inputs.put("DB_ZJ_1Q_USETIME_4", "0");
		dna3Inputs.put("DB_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("DB_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("DB_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("LCZQ_ZJ_1Q_SUM_4", "0");
		dna3Inputs.put("LCZQ_ZJ_1Q_COUNT_4", "0");
		dna3Inputs.put("LCZQ_ZJ_1Q_USETIME_4", "0");
		dna3Inputs.put("LCZQ_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("LCZQ_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("LCZQ_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("LCQT_ZJ_1Q_SUM_4", "0");
		dna3Inputs.put("LCQT_ZJ_1Q_COUNT_4", "0");
		dna3Inputs.put("LCQT_ZJ_1Q_USETIME_4", "0");
		dna3Inputs.put("LCQT_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("LCQT_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("LCQT_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("QTJR_ZJ_1Q_SUM_4", "0");
		dna3Inputs.put("QTJR_ZJ_1Q_COUNT_4", "0");
		dna3Inputs.put("QTJR_ZJ_1Q_USETIME_4", "0");
		dna3Inputs.put("QTJR_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("QTJR_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("QTJR_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("SHFW_ZJ_1Q_SUM_4", "0");
		dna3Inputs.put("SHFW_ZJ_1Q_COUNT_4", "0");
		dna3Inputs.put("SHFW_ZJ_1Q_USETIME_4", "0");
		dna3Inputs.put("SHFW_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("SHFW_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("WLDH_ZJ_1Q_SUM_4", "0");
		dna3Inputs.put("WLDH_ZJ_1Q_COUNT_4", "0");
		dna3Inputs.put("WLDH_ZJ_1Q_USETIME_4", "0");
		dna3Inputs.put("WLDH_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("WLDH_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("WLDH_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("XFJR_ZJ_1Q_SUM_4", "0");
		dna3Inputs.put("XFJR_ZJ_1Q_COUNT_4", "0");
		dna3Inputs.put("XFJR_ZJ_1Q_USETIME_4", "0");
		dna3Inputs.put("XFJR_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("XFJR_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("XFJR_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("YSZP_ZJ_1Q_SUM_4", "0");
		dna3Inputs.put("YSZP_ZJ_1Q_COUNT_4", "0");
		dna3Inputs.put("YSZP_ZJ_1Q_USETIME_4", "0");
		dna3Inputs.put("YSZP_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("YSZP_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("YSZP_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("YH_ZJ_1Q_SUM_4", "0");
		dna3Inputs.put("YH_ZJ_1Q_COUNT_4", "0");
		dna3Inputs.put("YH_ZJ_1Q_USETIME_4", "0");
		dna3Inputs.put("YH_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("YH_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("YH_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("ZFGS_ZJ_1Q_SUM_4", "0");
		dna3Inputs.put("ZFGS_ZJ_1Q_COUNT_4", "0");
		dna3Inputs.put("ZFGS_ZJ_1Q_USETIME_4", "0");
		dna3Inputs.put("ZFGS_BJ_1Q_SUM_4", "0");
		dna3Inputs.put("ZFGS_BJ_1Q_COUNT_4", "0");
		dna3Inputs.put("ZFGS_BJ_1Q_USETIME_4", "0");
		dna3Inputs.put("P2P_ZJ_TT_SUM_4", "0");
		dna3Inputs.put("P2P_ZJ_TT_COUNT_4", "0");
		dna3Inputs.put("P2P_ZJ_TT_USETIME_4", "0");
		dna3Inputs.put("P2P_BJ_TT_SUM_4", "0");
		dna3Inputs.put("P2P_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("P2P_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("POS_ZJ_TT_SUM_4", "0");
		dna3Inputs.put("POS_ZJ_TT_COUNT_4", "0");
		dna3Inputs.put("POS_ZJ_TT_USETIME_4", "0");
		dna3Inputs.put("POS_BJ_TT_SUM_4", "0");
		dna3Inputs.put("POS_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("POS_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("LCBX_ZJ_TT_SUM_4", "0");
		dna3Inputs.put("LCBX_ZJ_TT_COUNT_4", "0");
		dna3Inputs.put("LCBX_ZJ_TT_USETIME_4", "0");
		dna3Inputs.put("LCBX_BJ_TT_SUM_4", "0");
		dna3Inputs.put("LCBX_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("LCBX_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("CSWB_BJ_TT_SUM_4", "0");
		dna3Inputs.put("CSWB_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("CSWB_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("DBZJ_BJ_TT_SUM_4", "0");
		dna3Inputs.put("DBZJ_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("DBZJ_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("DB_ZJ_TT_SUM_4", "0");
		dna3Inputs.put("DB_ZJ_TT_COUNT_4", "0");
		dna3Inputs.put("DB_ZJ_TT_USETIME_4", "0");
		dna3Inputs.put("DB_BJ_TT_SUM_4", "0");
		dna3Inputs.put("DB_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("DB_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("LCZQ_ZJ_TT_SUM_4", "0");
		dna3Inputs.put("LCZQ_ZJ_TT_COUNT_4", "0");
		dna3Inputs.put("LCZQ_ZJ_TT_USETIME_4", "0");
		dna3Inputs.put("LCZQ_BJ_TT_SUM_4", "0");
		dna3Inputs.put("LCZQ_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("LCZQ_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("LCQT_ZJ_TT_SUM_4", "0");
		dna3Inputs.put("LCQT_ZJ_TT_COUNT_4", "0");
		dna3Inputs.put("LCQT_ZJ_TT_USETIME_4", "0");
		dna3Inputs.put("LCQT_BJ_TT_SUM_4", "0");
		dna3Inputs.put("LCQT_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("LCQT_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("QTJR_ZJ_TT_SUM_4", "0");
		dna3Inputs.put("QTJR_ZJ_TT_COUNT_4", "0");
		dna3Inputs.put("QTJR_ZJ_TT_USETIME_4", "0");
		dna3Inputs.put("QTJR_BJ_TT_SUM_4", "0");
		dna3Inputs.put("QTJR_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("QTJR_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("SHFW_ZJ_TT_SUM_4", "0");
		dna3Inputs.put("SHFW_ZJ_TT_COUNT_4", "0");
		dna3Inputs.put("SHFW_ZJ_TT_USETIME_4", "0");
		dna3Inputs.put("SHFW_BJ_TT_SUM_4", "0");
		dna3Inputs.put("SHFW_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("SHFW_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("WLDH_ZJ_TT_SUM_4", "0");
		dna3Inputs.put("WLDH_ZJ_TT_COUNT_4", "0");
		dna3Inputs.put("WLDH_ZJ_TT_USETIME_4", "0");
		dna3Inputs.put("WLDH_BJ_TT_SUM_4", "0");
		dna3Inputs.put("WLDH_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("WLDH_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("XFJR_ZJ_TT_SUM_4", "0");
		dna3Inputs.put("XFJR_ZJ_TT_COUNT_4", "0");
		dna3Inputs.put("XFJR_ZJ_TT_USETIME_4", "0");
		dna3Inputs.put("XFJR_BJ_TT_SUM_4", "0");
		dna3Inputs.put("XFJR_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("XFJR_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("YSZP_ZJ_TT_SUM_4", "0");
		dna3Inputs.put("YSZP_ZJ_TT_COUNT_4", "0");
		dna3Inputs.put("YSZP_ZJ_TT_USETIME_4", "0");
		dna3Inputs.put("YSZP_BJ_TT_SUM_4", "0");
		dna3Inputs.put("YSZP_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("YSZP_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("YH_ZJ_TT_SUM_4", "0");
		dna3Inputs.put("YH_ZJ_TT_COUNT_4", "0");
		dna3Inputs.put("YH_ZJ_TT_USETIME_4", "0");
		dna3Inputs.put("YH_BJ_TT_SUM_4", "0");
		dna3Inputs.put("YH_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("YH_BJ_TT_USETIME_4", "0");
		dna3Inputs.put("ZFGS_ZJ_TT_SUM_4", "0");
		dna3Inputs.put("ZFGS_ZJ_TT_COUNT_4", "0");
		dna3Inputs.put("ZFGS_ZJ_TT_USETIME_4", "0");
		dna3Inputs.put("ZFGS_BJ_TT_SUM_4", "0");
		dna3Inputs.put("ZFGS_BJ_TT_COUNT_4", "0");
		dna3Inputs.put("ZFGS_BJ_TT_USETIME_4", "0");
		
		dna3Inputs.put("top1_place", "0");
		dna3Inputs.put("top2_place", "0");
		dna3Inputs.put("cust_self_serious", "0");
		dna3Inputs.put("level1_gray_device", "0");
		dna3Inputs.put("level2_gray_device", "0");
		dna3Inputs.put("level2_gray_phone", "0");
		dna3Inputs.put("level2_yellow_phone", "0");
		dna3Inputs.put("first_max_deg", "0");
		dna3Inputs.put("orion_cluster_degree", "2");
		dna3Inputs.put("level1_black_phone", "0");
		dna3Inputs.put("same_device_level1_yellow_phone", "0");
		dna3Inputs.put("level1_all_phone", "0");
		dna3Inputs.put("level2_black_device", "0");
		dna3Inputs.put("same_device_level2_gray_phone", "0");
		dna3Inputs.put("same_device_level1_gray_device", "0");
		dna3Inputs.put("orion_equ_2_mob_cnt", "1");
		dna3Inputs.put("same_device_level1_black_phone", "0");
		dna3Inputs.put("same_device_count", "0");
		dna3Inputs.put("same_device_level2_black_device", "0");
		dna3Inputs.put("level1_yellow_device", "0");
		dna3Inputs.put("level2_yellow_device", "0");
		dna3Inputs.put("level2_black_phone", "0");
		dna3Inputs.put("level2_purple_device", "0");
		dna3Inputs.put("same_device_level1_all_device", "0");
		dna3Inputs.put("level1_yellow_phone", "0");
		dna3Inputs.put("same_device_level2_gray_device", "0");
		dna3Inputs.put("level1_black_device", "0");
		dna3Inputs.put("same_device_level1_gray_phone", "0");
		dna3Inputs.put("level1_gray_phone", "0");
		dna3Inputs.put("level1_all_device", "1");
		dna3Inputs.put("level2_purple_phone", "0");
		dna3Inputs.put("level1_purple_device", "0");
		dna3Inputs.put("level1_purple_phone", "0");
		dna3Inputs.put("same_device_level1_black_device", "0");
		dna3Inputs.put("same_device_level1_all_phone", "0");
		dna3Inputs.put("same_device_level2_black_phone", "0");
		dna3Inputs.put("same_device_level2_purple_phone", "0");
		dna3Inputs.put("same_device_level2_yellow_phone", "0");
		
		//学历数据（Y – 需要查询学历，N – 不需要（或无法）查询学历，Z – 需要查询学历、且返回值为“是否专科及以上，B – 需要查询学历、且返回值为“是否本科及以上）
		dna3Inputs.put("py_degree", "1");
		dna3Inputs.put("college_is_211", "0");
		dna3Inputs.put("py_studystyle", "0");
		
		//同盾数据
		dna3Inputs.put("frd_total_count", "0");
		dna3Inputs.put("frd_p2p_count", "0");
		dna3Inputs.put("frd_xffq_count", "0");
		dna3Inputs.put("frd_xykzx_count", "0");
		dna3Inputs.put("frd_qcjr_count", "0");
		dna3Inputs.put("frd_xfjr_count", "0");
		dna3Inputs.put("frd_xedk_count", "0");
		dna3Inputs.put("frd_qczl_count", "0");
		dna3Inputs.put("frd_lcjg_count", "0");
		dna3Inputs.put("frd_rzzl_count", "0");
		dna3Inputs.put("frd_sbzl_count", "0");
		dna3Inputs.put("frd_ccbx_count", "0");
		dna3Inputs.put("frd_yhgryw_count", "0");
		dna3Inputs.put("frd_yhxwdk_count", "0");
		dna3Inputs.put("frd_yhxfjr_count", "0");
		
		//通讯录数据（Y – 需要获取通讯录，N – 不需要（或无法）获取通讯录）
		dna3Inputs.put("contact_normal_cnt", "0");
		dna3Inputs.put("contact_risk_1_cnt", "0");
		dna3Inputs.put("contact_risk_3_cnt", "0");
		dna3Inputs.put("contact_risk_4_cnt", "0");
		dna3Inputs.put("xinyongka", "0");
		dna3Inputs.put("zhongjie", "0");
		dna3Inputs.put("daikuan", "0");
		dna3Inputs.put("daili", "0");
		dna3Inputs.put("xindai", "0");
		dna3Inputs.put("banka", "0");
		dna3Inputs.put("gongjijin", "0");
		dna3Inputs.put("jiuba", "0");
		dna3Inputs.put("danbao", "0");
		dna3Inputs.put("anmo", "0");
		dna3Inputs.put("taoxian", "0");
		
		//人行数据（Y – 需要查询人行、且有查询结果,N – 需要查询人行但无查询结果，或者，不需要（或无法）查询人行）
		dna3Inputs.put("loan_state", "0");
		dna3Inputs.put("cd_accumulation_edu_info", "0");
		dna3Inputs.put("cdshareanddebtsum_loancard_maxcreditlimitperorg", "0");
		dna3Inputs.put("limitusedrate", "0");
		
		dna3Inputs.put("cd_creditcard_latest24month_pmt_his", "NNNNNNNNNNNNNNNNNNNNNNNN");
		dna3Inputs.put("delqhist", "NNNNNNNNNNNNNNNNNNNNNNNN");
		dna3Inputs.put("cd_house_loan_latest24month_pmt_his", "NNNNNNNNNNNNNNNNNNNNNNNN");
		dna3Inputs.put("strategy_branch", "0");

		dna3Inputs.put("cdrecorddetail_latest1monthloanverify", "0");
		dna3Inputs.put("cdrecorddetail_latest24monthloancardverify", "0");
		dna3Inputs.put("cdrecorddetail_latest24monthloanverify", "0");
		dna3Inputs.put("cdrecorddetail_latest1monthloancardverify", "0");
		dna3Inputs.put("cdrecorddetail_latest3monthloancardverify", "0");
		dna3Inputs.put("cdrecorddetail_latest3monthloanverify", "0");
		dna3Inputs.put("cd_comp_add1", "0");
		dna3Inputs.put("cd_comp_add2", "0");
		dna3Inputs.put("cd_comp_add3", "0");
		dna3Inputs.put("cd_comp_add4", "0");
		dna3Inputs.put("cd_comp_add5", "0");
		dna3Inputs.put("cd_comp_name1", "0");
		dna3Inputs.put("cd_comp_name2", "0");
		dna3Inputs.put("cd_comp_name3", "0");
		dna3Inputs.put("cd_comp_name4", "0");
		dna3Inputs.put("cd_comp_name5", "0");
		
		//人脸数据
		dna3Inputs.put("face_compare_result", "1");
		
		//公安数据
		dna3Inputs.put("gongan_compare_result", "1");
		
		//其他数据
		dna3Inputs.put("marital_status", "2");
		dna3Inputs.put("age_big", "0");
		dna3Inputs.put("phone_type_apple", "2");
		dna3Inputs.put("cust_age", "30");
		dna3Inputs.put("cust_sex", "");
		dna3Inputs.put("double_0", "0");
		dna3Inputs.put("resolution_rank", "1920");
		dna3Inputs.put("detail_address", "0");
		dna3Inputs.put("cust_lbs_adress", "0");

	}
	
	/**
	 * 
	 * <b>方法说明：得到DNA3.0所有的输入项(对外不要直接提供静态变量，不熟悉的人会发生灾难)</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-15下午2:38:08
	 * @return
	 */
	public static Map<String,Object> getAllDNA3Inputs(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		for(Entry<String, String> ent : DNA3InputColumn.dna3Inputs.entrySet()){
			map.put(ent.getKey(), ent.getValue());
		}
		return map;
		
	}
	

	
	
	
	
	

}

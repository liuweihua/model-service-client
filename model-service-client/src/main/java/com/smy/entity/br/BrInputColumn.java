package com.smy.entity.br;

import java.util.ArrayList;
import java.util.List;


public class BrInputColumn {
	
	
	
	private static List<String> allColumns = new ArrayList<String>();
	private static List<String> dv = new ArrayList<String>();
	private static List<String> mccList = new ArrayList<String>();
	private static List<String> pvnList = new ArrayList<String>();
	private static List<String> totList = new ArrayList<String>();
	private static List<String> cateList= new ArrayList<String>();
	
	
	static{
		BrInputColumn.setAllColumns();
		BrInputColumn.setDefualtValue();
		BrInputColumn.setMccList();
		BrInputColumn.setPvnKeys();
		BrInputColumn.setCateKeys();
		BrInputColumn.setTotKeys();
	}
	
	
	
	public static void setAllColumns(){
		allColumns.clear();
		allColumns.add("acm_m6_debit_in");
		allColumns.add("acm_m5_credit_out");
		allColumns.add("acm_m10m12_debit_out");
		allColumns.add("cons_m12_MYYP_pay");
		allColumns.add("pc_thm1_1st_num_mcc");
		allColumns.add("pc_thm2_num");
		allColumns.add("acm_m7m9_credit_out");
		allColumns.add("acm_m16m18_debit_in");
		allColumns.add("stab_addr_num");
		allColumns.add("acm_m16m18_debit_out");
		allColumns.add("acm_m13m15_debit_in");
		allColumns.add("cons_m3_RYBH_num");
		allColumns.add("cons_tot_m3_pay");
		allColumns.add("pc_thm2_1st_num_mcc");
		allColumns.add("acm_m16m18_debit_balance");
		allColumns.add("pc_thm5_max_num_pvn");
		allColumns.add("pc_thm6_num");
		allColumns.add("location_per_addr1");
		allColumns.add("cons_tot_m3_p_catenum");
		allColumns.add("al_m12_cell_notbank_allnum");
		allColumns.add("acm_m5_debit_in");
		allColumns.add("acm_m7m9_debit_in");
		allColumns.add("al_m12_cell_notbank_orgnum");
		allColumns.add("al_m12_id_notbank_allnum");
		allColumns.add("al_m12_id_notbank_orgnum");
		allColumns.add("pc_thm8_pay");
		allColumns.add("acm_m5_debit_out");
		allColumns.add("pc_thm1_1st_pay_mcc");
		allColumns.add("cons_tot_m3_num");
		allColumns.add("acm_m7m9_debit_out");
		allColumns.add("al_m6_id_notbank_allnum");
		allColumns.add("acm_m10m12_credit_cash");
		allColumns.add("al_m6_id_notbank_orgnum");
		allColumns.add("acm_m5_debit_balance");
		allColumns.add("al_m6_cell_notbank_allnum");
		allColumns.add("al_m6_cell_notbank_orgnum");
		allColumns.add("pc_thm6_1st_num_mcc");
		allColumns.add("cons_tot_m12_pay");
		allColumns.add("cons_m3_RYBH_pay");
		allColumns.add("media_tot_m12_visitdays");
		allColumns.add("acm_m13m15_debit_balance");
		allColumns.add("media_max_m12_cate");
		allColumns.add("pc_thm4_1st_num_mcc");
		allColumns.add("stab_auth_key_relation");
		allColumns.add("pc_thm6_pay");
		allColumns.add("pc_thm3_3rd_pay_mcc");
		allColumns.add("acm_m2_credit_out");
		allColumns.add("pc_thm1_pay");
		allColumns.add("media_tot_m3_catenum");
		allColumns.add("acm_m3_credit_out");
		allColumns.add("acm_m2_debit_in");
		allColumns.add("cons_max_m3_pay");
		allColumns.add("media_max_m12_days");
		allColumns.add("pc_thm12_max_num_pvn");
		allColumns.add("acm_m1_credit_out");
		allColumns.add("cons_m12_RYBH_num");
		allColumns.add("cons_tot_m12_v_catenum");
		allColumns.add("acm_m10m12_credit_out");
		allColumns.add("media_max_m3_days");
		allColumns.add("cons_m12_JYDQ_pay");
		allColumns.add("acm_m1_debit_in");
		allColumns.add("pc_thm9_pay");
		allColumns.add("cons_max_m3_num");
		allColumns.add("pc_thm4_1st_pay_mcc");
		allColumns.add("acm_m5_credit_cash");
		allColumns.add("acm_m6_credit_out");
		allColumns.add("pc_thm3_1st_num_mcc");
		allColumns.add("acm_m5_credit_in");
		allColumns.add("media_tot_m3_visitdays");
		allColumns.add("cons_max_m12_pay");
		allColumns.add("cons_m12_RYBH_pay");
		allColumns.add("cons_cont");
		allColumns.add("acm_m13m15_credit_out");
		allColumns.add("pc_thm12_pay");
		allColumns.add("cons_tot_m12_p_catenum");
		allColumns.add("pc_thm3_num");
		allColumns.add("pc_thm11_max_num_pvn");
		allColumns.add("pc_thm3_pay");
		allColumns.add("acm_m1_credit_in");
		allColumns.add("pc_thm2_1st_pay_mcc");
		allColumns.add("acm_m4_credit_out");
		allColumns.add("al_m12_id_bank_orgnum");
		allColumns.add("pc_thm8_num");
		allColumns.add("acm_m10m12_debit_in");
		allColumns.add("acm_m7m9_debit_balance");
		allColumns.add("media_tot_m12_catenum");
		allColumns.add("al_m3_id_notbank_allnum");
		allColumns.add("al_m12_cell_bank_orgnum");
		allColumns.add("pc_thm6_3rd_num_mcc");
		allColumns.add("media_max_m3_cate");
		allColumns.add("pc_thm1_num");
		allColumns.add("al_m3_cell_notbank_allnum");
		allColumns.add("stab_auth_cell");
		allColumns.add("pc_thm5_2nd_num_mcc");
		allColumns.add("acm_m3_debit_in");
		allColumns.add("cons_tot_m12_visits");
		allColumns.add("al_m3_cell_notbank_orgnum");
		allColumns.add("pc_thm2_max_num_pvn");
		allColumns.add("cons_m12_JYDQ_num");
		allColumns.add("pc_thm1_night_num");
		allColumns.add("acm_m3_debit_out");
		allColumns.add("acm_m1_credit_cash");
		allColumns.add("pc_thm8_3rd_pay_mcc");
		allColumns.add("al_m12_cell_bank_allnum");
		allColumns.add("acm_m4_credit_in");
		allColumns.add("cons_max_m12_num");
		allColumns.add("acm_m6_debit_out");
		allColumns.add("al_m12_id_bank_allnum");
		allColumns.add("pc_thm4_max_num_pvn");
		allColumns.add("acm_m13m15_debit_out");
		allColumns.add("al_m3_id_notbank_orgnum");
		allColumns.add("pc_thm2_pay");
		allColumns.add("pc_thm5_num");
		allColumns.add("pc_thm3_1st_pay_mcc");
		allColumns.add("acm_m1_debit_balance");
		allColumns.add("acm_m4_credit_cash");
		allColumns.add("media_m12_CJ_visitdays");
		allColumns.add("pc_thm3_2nd_num_mcc");
		allColumns.add("al_m3_id_bank_allnum");
		allColumns.add("acm_m2_debit_balance");
		allColumns.add("pc_thm10_pay");
		allColumns.add("pc_thm11_1st_num_mcc");
		allColumns.add("pc_thm5_2nd_pay_mcc");
		allColumns.add("cons_max_m3_paycate");
		allColumns.add("pc_thm6_2nd_pay_mcc");
		allColumns.add("acm_m16m18_credit_cash");
		allColumns.add("acm_m6_debit_balance");
		allColumns.add("stab_name_num");
		allColumns.add("pc_thm7_1st_pay_mcc");
		allColumns.add("pc_thm1_3rd_num_mcc");
		allColumns.add("pc_thm8_max_num_pvn");
		allColumns.add("acm_m16m18_credit_out");
		allColumns.add("cons_max_m12_paycate");
		allColumns.add("media_m3_CJ_visitdays");
		allColumns.add("pc_thm10_2nd_num_mcc");
		allColumns.add("cons_m12_MYYP_num");
		allColumns.add("cons_tot_m3_v_catenum");
		allColumns.add("pc_thm4_2nd_pay_mcc");
		allColumns.add("acm_m7m9_credit_in");
		allColumns.add("al_m3_cell_bank_allnum");
		allColumns.add("media_m12_MYYE_visitdays");
		allColumns.add("acm_m4_debit_out");
		allColumns.add("pc_thm2_night_num");
		allColumns.add("pc_thm12_1st_pay_mcc");
		allColumns.add("acm_m7m9_credit_cash");
		allColumns.add("pc_thm1_max_num_pvn");
		allColumns.add("pc_thm4_2nd_num_mcc");
		allColumns.add("media_max_m3_days_prop");
		allColumns.add("pc_thm10_1st_pay_mcc");
		allColumns.add("acm_m13m15_credit_cash");
		allColumns.add("location_per_addr3");
		allColumns.add("pc_thm11_pay");
		allColumns.add("pc_thm4_3rd_num_mcc");
		allColumns.add("pc_thm6_1st_pay_mcc");
		allColumns.add("pc_thm2_3rd_pay_mcc");
		allColumns.add("pc_thm3_max_num_pvn");
		allColumns.add("cons_tot_m12_num");
		allColumns.add("stab_cell_firsttime");
		allColumns.add("pc_thm12_num");
		allColumns.add("media_max_m12_days_prop");
		allColumns.add("location_per_addr2");
		allColumns.add("pc_thm10_1st_num_mcc");
		allColumns.add("pc_thm6_2nd_num_mcc");
		allColumns.add("pc_thm3_2nd_pay_mcc");
		allColumns.add("pc_thm10_max_num_pvn");
		allColumns.add("acm_m16m18_credit_in");
		allColumns.add("acm_m10m12_debit_balance");
		allColumns.add("acm_m4_debit_balance");
		allColumns.add("acm_m3_debit_balance");
		allColumns.add("pc_thm8_2nd_num_mcc");
		allColumns.add("acm_m10m12_credit_def");
		allColumns.add("pc_thm9_num");
		allColumns.add("stab_mail_num");
		allColumns.add("pc_thm1_3rd_pay_mcc");
		allColumns.add("pc_thm4_3rd_pay_mcc");
		allColumns.add("pc_thm3_3rd_num_mcc");
		allColumns.add("al_m6_cell_bank_orgnum");
		allColumns.add("acm_m6_credit_in");
		allColumns.add("stab_auth_name");
		allColumns.add("acm_m1_debit_out");
		allColumns.add("acm_m13m15_credit_def");
		allColumns.add("acm_m3_credit_in");
		allColumns.add("pc_thm5_1st_num_mcc");
		allColumns.add("al_m6_id_bank_orgnum");
		allColumns.add("acm_m4_debit_in");
		allColumns.add("acm_m2_credit_in");
		allColumns.add("pc_thm2_3rd_num_mcc");
		allColumns.add("pc_thm11_2nd_num_mcc");
		allColumns.add("pc_thm10_num");
		allColumns.add("pc_thm10_2nd_pay_mcc");
		allColumns.add("pc_thm1_2nd_num_mcc");
		allColumns.add("al_m6_cell_bank_allnum");
		allColumns.add("pc_thm7_1st_num_mcc");
		allColumns.add("pc_thm1_2nd_pay_mcc");
		allColumns.add("media_m12_WXYS_visitdays");
		allColumns.add("acm_m6_credit_cash");
		allColumns.add("pc_thm11_1st_pay_mcc");
		allColumns.add("pc_thm5_pay");
		allColumns.add("pc_thm4_num");
		allColumns.add("pc_thm9_2nd_num_mcc");
		allColumns.add("acm_m13m15_credit_in");
		allColumns.add("pc_thm12_1st_num_mcc");
		allColumns.add("al_m6_id_bank_allnum");
		allColumns.add("pc_thm4_pay");
		allColumns.add("al_m3_id_bank_orgnum");
		allColumns.add("pc_thm8_2nd_pay_mcc");
		allColumns.add("pc_thm3_night_num");
		allColumns.add("stab_cell_num");
		allColumns.add("pc_thm7_pay");
		allColumns.add("pc_thm5_3rd_pay_mcc");
		allColumns.add("acm_m3_credit_cash");
		allColumns.add("acm_m2_debit_out");
		allColumns.add("pc_thm8_1st_num_mcc");
		allColumns.add("pc_thm6_3rd_pay_mcc");
		allColumns.add("pc_thm7_3rd_num_mcc");
		allColumns.add("stab_tel_num");
		allColumns.add("pc_thm11_num");
		allColumns.add("pc_thm5_3rd_num_mcc");
		allColumns.add("cons_tot_m3_visits");
		allColumns.add("pc_thm7_num");
		allColumns.add("pc_thm11_2nd_pay_mcc");
		allColumns.add("pc_thm8_3rd_num_mcc");
		allColumns.add("cons_m3_MYYP_pay");
		allColumns.add("pc_thm7_3rd_pay_mcc");
		allColumns.add("al_m3_cell_bank_orgnum");
		allColumns.add("pc_thm12_2nd_num_mcc");
		allColumns.add("acm_m10m12_credit_in");
		allColumns.add("pc_thm2_night_pay");
		allColumns.add("acm_m1_credit_def");
		allColumns.add("cons_m3_MYYP_num");
		allColumns.add("pc_thm10_night_num");
		allColumns.add("pc_thm7_night_pay");
		allColumns.add("pc_thm9_max_num_pvn");
		allColumns.add("acm_m7m9_credit_def");
		allColumns.add("pc_thm7_night_num");
		allColumns.add("pc_thm7_2nd_pay_mcc");
		allColumns.add("pc_thm3_night_pay");
		allColumns.add("pc_thm1_night_pay");
		allColumns.add("pc_thm9_2nd_pay_mcc");
		allColumns.add("pc_thm2_2nd_num_mcc");    
		allColumns.add("acm_m2_credit_cash");
		allColumns.add("cons_time_recent");
		allColumns.add("cons_m3_JYDQ_pay");
		allColumns.add("pc_thm12_2nd_pay_mcc");
		allColumns.add("pc_thm9_1st_pay_mcc"); 
		allColumns.add("pc_thm8_1st_pay_mcc");
		allColumns.add("pc_thm9_1st_num_mcc");
		allColumns.add("stab_id_num");
		allColumns.add("pc_thm7_2nd_num_mcc");
		allColumns.add("acm_m16m18_credit_def");
		
	}
	
	
	/**
	 * 
	 * <b>方法说明：添加默认列名</b>
	 * 
	 * @作者：lwh
	 * @时间：2016-12-17下午3:46:20
	 */
	public static void setDefualtValue(){
		dv.clear();
		dv.add("acm_m6_debit_in");
		dv.add("acm_m5_credit_out");
		dv.add("acm_m10m12_debit_out");
		dv.add("cons_m12_MYYP_pay");
		dv.add("pc_thm2_num");
		dv.add("acm_m7m9_credit_out");
		dv.add("acm_m16m18_debit_in");
		dv.add("stab_addr_num");
		dv.add("acm_m16m18_debit_out");
		dv.add("acm_m13m15_debit_in");
		dv.add("cons_m3_RYBH_num");
		dv.add("acm_m16m18_debit_balance");
		dv.add("pc_thm6_num");
		dv.add("location_per_addr1");
		dv.add("al_m12_cell_notbank_allnum");
		dv.add("acm_m5_debit_in");
		dv.add("acm_m7m9_debit_in");
		dv.add("al_m12_cell_notbank_orgnum");
		dv.add("al_m12_id_notbank_allnum");
		dv.add("al_m12_id_notbank_orgnum");
		dv.add("pc_thm8_pay");
		dv.add("acm_m5_debit_out");
		dv.add("acm_m7m9_debit_out");
		dv.add("al_m6_id_notbank_allnum");
		dv.add("acm_m10m12_credit_cash");
		dv.add("al_m6_id_notbank_orgnum");
		dv.add("acm_m5_debit_balance");
		dv.add("al_m6_cell_notbank_allnum");
		dv.add("al_m6_cell_notbank_orgnum");
		dv.add("cons_m3_RYBH_pay");
		dv.add("acm_m13m15_debit_balance");
		dv.add("stab_auth_key_relation");
		dv.add("pc_thm6_pay");
		dv.add("acm_m2_credit_out");
		dv.add("pc_thm1_pay");
		dv.add("media_tot_m3_catenum");
		dv.add("acm_m3_credit_out");
		dv.add("acm_m2_debit_in");
		dv.add("cons_max_m3_pay");
		dv.add("media_max_m12_days");
		dv.add("acm_m1_credit_out");
		dv.add("cons_m12_RYBH_num");
		dv.add("acm_m10m12_credit_out");
		dv.add("media_max_m3_days");
		dv.add("cons_m12_JYDQ_pay");
		dv.add("acm_m1_debit_in");
		dv.add("pc_thm9_pay");
		dv.add("cons_max_m3_num");
		dv.add("acm_m5_credit_cash");
		dv.add("acm_m6_credit_out");
		dv.add("acm_m5_credit_in");
		dv.add("cons_max_m12_pay");
		dv.add("cons_m12_RYBH_pay");
		dv.add("acm_m13m15_credit_out");
		dv.add("pc_thm12_pay");
		dv.add("pc_thm3_num");
		dv.add("pc_thm3_pay");
		dv.add("acm_m1_credit_in");
		dv.add("acm_m4_credit_out");
		dv.add("al_m12_id_bank_orgnum");
		dv.add("pc_thm8_num");
		dv.add("acm_m10m12_debit_in");
		dv.add("acm_m7m9_debit_balance");
		dv.add("media_tot_m12_catenum");
		dv.add("al_m3_id_notbank_allnum");
		dv.add("al_m12_cell_bank_orgnum");
		dv.add("pc_thm1_num");
		dv.add("al_m3_cell_notbank_allnum");
		dv.add("stab_auth_cell");
		dv.add("acm_m3_debit_in");
		dv.add("al_m3_cell_notbank_orgnum");
		dv.add("cons_m12_JYDQ_num");
		dv.add("pc_thm1_night_num");
		dv.add("acm_m3_debit_out");
		dv.add("acm_m1_credit_cash");
		dv.add("al_m12_cell_bank_allnum");
		dv.add("acm_m4_credit_in");
		dv.add("cons_max_m12_num");
		dv.add("acm_m6_debit_out");
		dv.add("al_m12_id_bank_allnum");
		dv.add("acm_m13m15_debit_out");
		dv.add("al_m3_id_notbank_orgnum");
		dv.add("pc_thm2_pay");
		dv.add("pc_thm5_num");
		dv.add("acm_m1_debit_balance");
		dv.add("acm_m4_credit_cash");
		dv.add("media_m12_CJ_visitdays");
		dv.add("al_m3_id_bank_allnum");
		dv.add("acm_m2_debit_balance");
		dv.add("pc_thm10_pay");
		dv.add("acm_m16m18_credit_cash");
		dv.add("acm_m6_debit_balance");
		dv.add("stab_name_num");
		dv.add("acm_m16m18_credit_out");
		dv.add("media_m3_CJ_visitdays");
		dv.add("cons_m12_MYYP_num");
		dv.add("acm_m7m9_credit_in");
		dv.add("al_m3_cell_bank_allnum");
		dv.add("media_m12_MYYE_visitdays");
		dv.add("acm_m4_debit_out");
		dv.add("pc_thm2_night_num");
		dv.add("acm_m7m9_credit_cash");
		dv.add("media_max_m3_days_prop");
		dv.add("acm_m13m15_credit_cash");
		dv.add("location_per_addr3");
		dv.add("pc_thm11_pay");
		dv.add("stab_cell_firsttime");
		dv.add("pc_thm12_num");
		dv.add("media_max_m12_days_prop");
		dv.add("location_per_addr2");
		dv.add("acm_m16m18_credit_in");
		dv.add("acm_m10m12_debit_balance");
		dv.add("acm_m4_debit_balance");
		dv.add("acm_m3_debit_balance");
		dv.add("acm_m10m12_credit_def");
		dv.add("pc_thm9_num");
		dv.add("stab_mail_num");
		dv.add("al_m6_cell_bank_orgnum");
		dv.add("acm_m6_credit_in");
		dv.add("stab_auth_name");
		dv.add("acm_m1_debit_out");
		dv.add("acm_m13m15_credit_def");
		dv.add("acm_m3_credit_in");
		dv.add("al_m6_id_bank_orgnum");
		dv.add("acm_m4_debit_in");
		dv.add("acm_m2_credit_in");
		dv.add("pc_thm10_num");
		dv.add("al_m6_cell_bank_allnum");
		dv.add("media_m12_WXYS_visitdays");
		dv.add("acm_m6_credit_cash");
		dv.add("pc_thm5_pay");
		dv.add("pc_thm4_num");
		dv.add("acm_m13m15_credit_in");
		dv.add("al_m6_id_bank_allnum");
		dv.add("pc_thm4_pay");
		dv.add("al_m3_id_bank_orgnum");
		dv.add("pc_thm3_night_num");
		dv.add("stab_cell_num");
		dv.add("pc_thm7_pay");
		dv.add("acm_m3_credit_cash");
		dv.add("acm_m2_debit_out");
		dv.add("stab_tel_num");
		dv.add("pc_thm11_num");
		dv.add("pc_thm7_num");
		dv.add("cons_m3_MYYP_pay");
		dv.add("al_m3_cell_bank_orgnum");
		dv.add("acm_m10m12_credit_in");
		dv.add("pc_thm2_night_pay");
		dv.add("acm_m1_credit_def");
		dv.add("cons_m3_MYYP_num");
		dv.add("pc_thm10_night_num");
		dv.add("pc_thm7_night_pay");
		dv.add("acm_m7m9_credit_def");
		dv.add("pc_thm7_night_num");
		dv.add("pc_thm3_night_pay");
		dv.add("pc_thm1_night_pay");
		dv.add("acm_m2_credit_cash");
		dv.add("cons_m3_JYDQ_pay");
		dv.add("stab_id_num");
		dv.add("acm_m16m18_credit_def");
		
		
	}
	
	
	
	/**
	 * 
	 * <b>方法说明：添加获取mcc对应的一级编码的列名</b>
	 * 
	 * @作者：lwh
	 * @时间：2016-12-17下午3:46:48
	 */
	public static void setMccList(){
		mccList.clear();
		mccList.add("pc_thm1_1st_num_mcc");
		mccList.add("pc_thm2_1st_num_mcc");
		mccList.add("pc_thm1_1st_pay_mcc");
		mccList.add("pc_thm6_1st_num_mcc");
		mccList.add("pc_thm4_1st_num_mcc");
		mccList.add("pc_thm3_3rd_pay_mcc");
		mccList.add("pc_thm4_1st_pay_mcc");
		mccList.add("pc_thm3_1st_num_mcc");
		mccList.add("pc_thm2_1st_pay_mcc");
		mccList.add("pc_thm6_3rd_num_mcc");
		mccList.add("pc_thm5_2nd_num_mcc");
		mccList.add("pc_thm8_3rd_pay_mcc");
		mccList.add("pc_thm3_1st_pay_mcc");
		mccList.add("pc_thm3_2nd_num_mcc");
		mccList.add("pc_thm11_1st_num_mcc");
		mccList.add("pc_thm5_2nd_pay_mcc");
		mccList.add("pc_thm6_2nd_pay_mcc");
		mccList.add("pc_thm7_1st_pay_mcc");
		mccList.add("pc_thm1_3rd_num_mcc");
		mccList.add("pc_thm10_2nd_num_mcc");
		mccList.add("pc_thm4_2nd_pay_mcc");
		mccList.add("pc_thm12_1st_pay_mcc");
		mccList.add("pc_thm4_2nd_num_mcc");
		mccList.add("pc_thm10_1st_pay_mcc");
		mccList.add("pc_thm4_3rd_num_mcc");
		mccList.add("pc_thm6_1st_pay_mcc");
		mccList.add("pc_thm2_3rd_pay_mcc");
		mccList.add("pc_thm10_1st_num_mcc");
		mccList.add("pc_thm6_2nd_num_mcc");
		mccList.add("pc_thm3_2nd_pay_mcc");
		mccList.add("pc_thm8_2nd_num_mcc");
		mccList.add("pc_thm1_3rd_pay_mcc");
		mccList.add("pc_thm4_3rd_pay_mcc");
		mccList.add("pc_thm3_3rd_num_mcc");
		mccList.add("pc_thm5_1st_num_mcc");
		mccList.add("pc_thm2_3rd_num_mcc");
		mccList.add("pc_thm11_2nd_num_mcc");
		mccList.add("pc_thm10_2nd_pay_mcc");
		mccList.add("pc_thm1_2nd_num_mcc");
		mccList.add("pc_thm7_1st_num_mcc");
		mccList.add("pc_thm1_2nd_pay_mcc");
		mccList.add("pc_thm11_1st_pay_mcc");
		mccList.add("pc_thm9_2nd_num_mcc");
		mccList.add("pc_thm12_1st_num_mcc");
		mccList.add("pc_thm8_2nd_pay_mcc");
		mccList.add("pc_thm5_3rd_pay_mcc");
		mccList.add("pc_thm8_1st_num_mcc");
		mccList.add("pc_thm6_3rd_pay_mcc");
		mccList.add("pc_thm7_3rd_num_mcc");
		mccList.add("pc_thm5_3rd_num_mcc");
		mccList.add("pc_thm11_2nd_pay_mcc");
		mccList.add("pc_thm8_3rd_num_mcc");
		mccList.add("pc_thm7_3rd_pay_mcc");
		mccList.add("pc_thm12_2nd_num_mcc");
		mccList.add("pc_thm7_2nd_pay_mcc");
		mccList.add("pc_thm9_2nd_pay_mcc");
		mccList.add("pc_thm2_2nd_num_mcc");
		mccList.add("pc_thm12_2nd_pay_mcc");
		mccList.add("pc_thm9_1st_pay_mcc");
		mccList.add("pc_thm8_1st_pay_mcc");
		mccList.add("pc_thm9_1st_num_mcc");
		mccList.add("pc_thm7_2nd_num_mcc");
		
	}
		
	/**
	 * 
	 * <b>方法说明：添加最多消费次数所在省份代码对应的列名</b>
	 * 
	 * @作者：lwh
	 * @时间：2016-12-17下午3:47:24
	 */
	public static void setPvnKeys(){
		pvnList.clear();
		pvnList.add("pc_thm5_max_num_pvn");
		pvnList.add("pc_thm12_max_num_pvn");
		pvnList.add("pc_thm11_max_num_pvn");
		pvnList.add("pc_thm2_max_num_pvn");
		pvnList.add("pc_thm4_max_num_pvn");
		pvnList.add("pc_thm8_max_num_pvn");
		pvnList.add("pc_thm1_max_num_pvn");
		pvnList.add("pc_thm3_max_num_pvn");
		pvnList.add("pc_thm10_max_num_pvn");
		pvnList.add("pc_thm9_max_num_pvn");
		
	}
	
	/**
	 * 
	 * <b>方法说明：添加值-1替换为-2，缺失值填充为-2的列名</b>
	 * 
	 * @作者：lwh
	 * @时间：2016-12-17下午3:47:58
	 */
	public static void setTotKeys(){
		totList.clear();
		totList.add("cons_tot_m3_pay");
		totList.add("cons_tot_m3_p_catenum");
		totList.add("cons_tot_m3_num");
		totList.add("cons_tot_m12_pay");
		totList.add("media_tot_m12_visitdays");
		totList.add("cons_tot_m12_v_catenum");
		totList.add("media_tot_m3_visitdays");
		totList.add("cons_tot_m12_p_catenum");
		totList.add("cons_tot_m12_visits");
		totList.add("cons_tot_m3_v_catenum");
		totList.add("cons_tot_m12_num");
		totList.add("cons_tot_m3_visits");
		
	}
	
	/**
	 * 
	 * <b>方法说明：添加C1到C34，依次替换为1-34，C88替换为-2,
	 * C1到C29，依次替换为1-29，C88替换为-2,
	 * T1到T4，分别替换为1-4,
	 * M1到M5，分别替换为1-5,对应的列名</b>
	 * 
	 * @作者：lwh
	 * @时间：2016-12-17下午3:48:11
	 */
	public static void setCateKeys(){
		cateList.clear();
		cateList.add("media_max_m12_cate");
		cateList.add("media_max_m3_cate");
		cateList.add("cons_max_m3_paycate");
		cateList.add("cons_max_m12_paycate");
		cateList.add("cons_cont");
		cateList.add("cons_time_recent");
		
	}
	
	
	/**
	 * 
	 * <b>方法说明：按固定的顺序得到所有的列(对外不要停静态变量，容易发生灾难)</b>
	 * 
	 * @作者：lwh
	 * @时间：2016-12-21下午5:05:07
	 * @return
	 */
	public static List<String> getAllColumns(){
		
		List<String> all = new ArrayList<String>();
		for(String str : BrInputColumn.allColumns){
			all.add(str);
		}
		
		return all;
	}
	
	
	
	
	

}

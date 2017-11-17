package com.smy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smy.common.ModelServiceResponse;
import com.smy.entity.alphas.AlphaSInputColumn;
import com.smy.entity.br.BrInputColumn;
import com.smy.entity.dna3.DNA3InputColumn;
import com.smy.entity.fumian1.Fumian1InputColumn;
import com.smy.entity.fumian2.Fumian2InputColumn;
import com.smy.entity.glren.GlrenInputColumn;
import com.smy.entity.liehu.LiehuInputColumn;
import com.smy.entity.quyu.QuyuInputColumn;
import com.smy.entity.rh.RhInputColumn;
import com.smy.entity.shilian.ShilianInputColumn;
import com.smy.entity.srfuzhai.SrfuzhaiInputColumn;
import com.smy.entity.tonghua.TonghuaInputColumn;
import com.smy.entity.wangcha4.Wangcha4InputColumn;
import com.smy.entity.work.WorkInputColumn;
import com.smy.entity.xueli.XueliInputColumn;
import com.smy.framework.core.util.JacksonUtil;
import com.smy.server.Application_PortType;
import com.smy.server.alphas.Application_AlphaS_Proxy;
import com.smy.server.br.Application_Br_Proxy;
import com.smy.server.dna3.Application_DNA3_Proxy;
import com.smy.server.fumian1.Application_Fumian1_Proxy;
import com.smy.server.fumian2.Application_Fumian2_Proxy;
import com.smy.server.glren.Application_Glren_Proxy;
import com.smy.server.liehu.Application_Liehu_Proxy;
import com.smy.server.quyu.Application_Quyu_Proxy;
import com.smy.server.rh.Application_Rh_Proxy;
import com.smy.server.shilian.Application_Shilian_Proxy;
import com.smy.server.srfuzhai.Application_Srfuzhai_Proxy;
import com.smy.server.tonghua.Application_Tonghua_Proxy;
import com.smy.server.wangcha4.Application_Wangcha4_Proxy;
import com.smy.server.work.Application_Work_Proxy;
import com.smy.server.xueli.Application_NoPyXueli_Proxy;
import com.smy.server.xueli.Application_Xueli_Proxy;



public class Model_WSClient {
	
	
	private static Logger logger = LoggerFactory.getLogger(Model_WSClient.class);
	
	
	
	/**
	 * 
	 * <b>方法说明：根据百融的输入项的值得到百融的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:58
	 * @param cell
	 * @param brInputMap
	 * @return
	 * @throws Exception
	 */
	public static String getBrModelScore(String cell,Map<String, Object> brInputMap) throws Exception{
		
		try {
			List<String> allColumns = BrInputColumn.getAllColumns();
			
			StringBuffer sb = new StringBuffer();
			
			List<String> valueArray = new ArrayList<String>();
			for(String column : allColumns){
				
				String value = null;
				if(brInputMap != null){
					Object obj = brInputMap.get(column);
					if(obj != null){
						if(!(obj instanceof String)){
							value =  obj + "";
						}else{
							value =  (String) obj;
						}
						
					}
				}
				//System.out.println(column+"="+value);
				//对值进行处理(webservice服务端已经做了值的预处理，这边只要对空值做处理即可)
				//value = ColumnDefault.getColumnValue(column, value);
				if(value == null || value.length()==0){
					value = "-2";
				}
				valueArray.add(value);
				//System.out.println("处理后的值："+value);
				sb.append(value+",");
			}
			Application_Br_Proxy proxy = new Application_Br_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			Object brCreditScore = service.modelScore(cell, valueArray,null);
			
			return brCreditScore+"";
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	/**
	 * 
	 * <b>方法说明：根据approve的输入项的值得到approve的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:58
	 * @param cell
	 * @param approveInputMap
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getAlphaSModelScore(String cell,Map<String, Object> alphasInputMap) throws Exception{
		
		
		try {
			
			Map<String, String> allInput = AlphaSInputColumn.getAllAlphaSInputs();
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, String>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, String> ent = it.next();
					Object inputValue = alphasInputMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), inputValue+"" );
						}
					}
				}
			}
			
			String inputJson = "{}";
			if(allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			logger.info(cell+"获取Alpha-S模型分的输入项："+inputJson);
			
			Application_AlphaS_Proxy proxy = new Application_AlphaS_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			Object alphasResult = service.modelScore(cell,inputJson,null);
			
			ModelServiceResponse response = new ModelServiceResponse();
			//返回alpha-S输入项json
			response.setInputParams(inputJson);
			//返回alpha-S的模型结果
			if(alphasResult != null){
				response.setModelResult(String.valueOf(alphasResult));
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	
	/**
	 * 
	 * <b>方法说明：根据DNA3.0的输入项的值得到DNA3.0的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-10-17下午4:49:58
	 * @param custNo
	 * @param dnaInputMap
	 * @param versionBranch 请求版本号(四个资信按顺序：
	 * 学历：1）Y – 需要查询学历
		   2）N – 不需要（或无法）查询学历
		   3）Z – 需要查询学历、且返回值为“是否专科及以上”
           4）B – 需要查询学历、且返回值为“是否本科及以上”
                    运营商：1）Y – 需要查询通话记录
            2）N – 不需要（或无法）查询通话记录
            3）B – 需要查询通话记录、且运营商手机使用时间返回值为：小于3个月、3-6个月、6-12个月、12-24个月、24个月以上
                     人行：1）Y – 需要查询人行、且有查询结果
		   2）N – 需要查询人行但无查询结果，或者，不需要（或无法）查询人行
	        通信录：1）Y – 需要获取通讯录
            2）N – 不需要（或无法）获取通讯录
                    默认：YYYY )
	 * @param shortBranch 缺失版本号(四个资信按顺序：学历、运营商、人行、通信录 。0表示不缺失，1缺失。默认0000)
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getDNA3ModelScore(String custNo,Map<String, Object> dnaInputMap,String versionBranch,String shortBranch) throws Exception{
		
		
		try {
			
			Map<String, Object> allInput = DNA3InputColumn.getAllDNA3Inputs();
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, Object>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, Object> ent = it.next();
					Object inputValue = dnaInputMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), String.valueOf(inputValue));
						}
					}
				}
			}
			
			String inputJson = "{}";
			if(allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			logger.info(custNo+"获取DNA3.0模型分的输入项："+inputJson);
			
			Application_DNA3_Proxy proxy = new Application_DNA3_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("versionBranch", versionBranch);
			params.put("shortBranch", shortBranch);
			Object dna3Result = service.modelScore(custNo,inputJson,params);
			ModelServiceResponse response = new ModelServiceResponse();
			//返回DNA3.0输入项json
			response.setInputParams(inputJson);
			if(dna3Result != null){
				response.setModelResult(String.valueOf(dna3Result));
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	/**
	 * 
	 * <b>方法说明：根据负面1的输入项的值得到负面1的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:13
	 * @param cell
	 * @param fumian1InputMap
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getFumian1ModelScore(String cell,Map<String, Object> fumian1InputMap) throws Exception{
		
		try {
			
			Map<String, String> allInput = Fumian1InputColumn.getAllFumian1Inputs();
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, String>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, String> ent = it.next();
					Object inputValue = fumian1InputMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), inputValue+"" );
						}
					}
				}
			}
			
			String inputJson = "{}";
			if(allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			logger.info(cell+"获取负面1模型分的输入项："+inputJson);
			
			Application_Fumian1_Proxy proxy = new Application_Fumian1_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			Object fumian1Score = service.modelScore(cell,inputJson,null);
			
			ModelServiceResponse response = new ModelServiceResponse();
			//返回负面1输入项json
			response.setInputParams(inputJson);
			//返回负面1的模型分
			if(fumian1Score != null){
				response.setModelResult(String.valueOf(fumian1Score));
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * 
	 * <b>方法说明：根据负面2的输入项的值得到负面2的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:13
	 * @param cell
	 * @param fumian2InputMap
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getFumian2ModelScore(String cell,Map<String, Object> fumian2InputMap) throws Exception{
		
		try {
			
			Map<String, String> allInput = Fumian2InputColumn.getAllFumian2Inputs();
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, String>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, String> ent = it.next();
					Object inputValue = fumian2InputMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), inputValue+"" );
						}
					}
				}
			}
			
			String inputJson = "{}";
			if(allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			logger.info(cell+"获取负面2模型分的输入项："+inputJson);
			
			Application_Fumian2_Proxy proxy = new Application_Fumian2_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			Object fumian2Score = service.modelScore(cell,inputJson,null);
			
			ModelServiceResponse response = new ModelServiceResponse();
			//返回负面2输入项json
			response.setInputParams(inputJson);
			//返回负面2的模型分
			if(fumian2Score != null){
				response.setModelResult(String.valueOf(fumian2Score));
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * 
	 * <b>方法说明：根据关联人的输入项的值得到关联人的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:13
	 * @param cell
	 * @param glrenInputMap
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getGlrenModelScore(String cell,Map<String, Object> glrenInputMap) throws Exception{
		
		try {
			
			Map<String, String> allInput = GlrenInputColumn.getAllGlrenInputs();
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, String>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, String> ent = it.next();
					Object inputValue = glrenInputMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), inputValue+"" );
						}
					}
				}
			}
			
			String inputJson = "{}";
			if(allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			logger.info(cell+"获取关联人模型分的输入项："+inputJson);
			
			Application_Glren_Proxy proxy = new Application_Glren_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			Object glrScore = service.modelScore(cell,inputJson,null);
			
			ModelServiceResponse response = new ModelServiceResponse();
			//返回关联人输入项json
			response.setInputParams(inputJson);
			//返回关联人的模型分
			if(glrScore != null){
				response.setModelResult(String.valueOf(glrScore));
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * 
	 * <b>方法说明：根据猎户的输入项的值得到猎户的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:13
	 * @param cell
	 * @param liehuInputMap
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getLiehuModelScore(String cell,Map<String, Object> liehuInputMap) throws Exception{
		
		try {
			
			Map<String, String> allInput = LiehuInputColumn.getAllLiehuInputs();
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, String>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, String> ent = it.next();
					Object inputValue = liehuInputMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), inputValue+"" );
						}
					}
				}
			}
			
			String inputJson = "{}";
			if(allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			logger.info(cell+"获取猎户模型分的输入项："+inputJson);
			
			Application_Liehu_Proxy proxy = new Application_Liehu_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			Object liehuScore = service.modelScore(cell,inputJson,null);
			
			ModelServiceResponse response = new ModelServiceResponse();
			//返回猎户输入项json
			response.setInputParams(inputJson);
			//返回猎户的模型分
			if(liehuScore != null){
				response.setModelResult(String.valueOf(liehuScore));
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	/**
	 * 
	 * <b>方法说明：得到区域的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:13
	 * @param cell
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getQuyuModelScore(String cell,Map<String, Object> quyuInputsMap) throws Exception{
		
		try {

			Map<String, String> allInput = QuyuInputColumn.getAllQuyuInputs();
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, String>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, String> ent = it.next();
					Object inputValue = quyuInputsMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), inputValue+"" );
						}
					}
				}
			}
			
			String inputJson = "{}";
			if(allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			logger.info(cell+"获取区域模型分的输入项："+inputJson);
			
			Application_Quyu_Proxy proxy = new Application_Quyu_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			
			Object quyuScore = service.modelScore(cell,inputJson,null);
			
			ModelServiceResponse response = new ModelServiceResponse();
			
			//无输入项，返回空字符
			response.setInputParams(inputJson);
			//返回区域模型分
			if(quyuScore != null){
				response.setModelResult(String.valueOf(quyuScore));
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * 
	 * <b>方法说明：根据人行的输入项的值得到人行的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:13
	 * @param cell
	 * @param rhInputMap
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getRhModelScore(String cell,Map<String, Object> rhInputMap) throws Exception{
		
		try {
			
			Map<String, String> allInput = RhInputColumn.getAllRhInputs();
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, String>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, String> ent = it.next();
					Object inputValue = rhInputMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), inputValue+"" );
						}
					}
				}
			}
			
			String inputJson = "{}";
			if(allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			logger.info(cell+"获取人行模型分的输入项："+inputJson);
			
			Application_Rh_Proxy proxy = new Application_Rh_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			Object rhScore = service.modelScore(cell,inputJson,null);
			
			ModelServiceResponse response = new ModelServiceResponse();
			//返回人行输入项json
			response.setInputParams(inputJson);
			//返回人行的模型分
			if(rhScore != null){
				response.setModelResult(String.valueOf(rhScore));
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * 
	 * <b>方法说明：根据失联的输入项的值得到失联的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:13
	 * @param cell
	 * @param shilianInputMap
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getShilianModelScore(String cell,Map<String, Object> shilianInputMap) throws Exception{
		
		try {
			
			Map<String, String> allInput = ShilianInputColumn.getAllShilianInputs();
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, String>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, String> ent = it.next();
					Object inputValue = shilianInputMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), inputValue+"" );
						}
					}
				}
			}
			
			String inputJson = "{}";
			if(allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			logger.info(cell+"获取失联模型分的输入项："+inputJson);
			
			Application_Shilian_Proxy proxy = new Application_Shilian_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			Object shilianScore = service.modelScore(cell,inputJson,null);
			
			ModelServiceResponse response = new ModelServiceResponse();
			//返回失联输入项json
			response.setInputParams(inputJson);
			//返回失联的模型分
			if(shilianScore != null){
				response.setModelResult(String.valueOf(shilianScore));
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * 
	 * <b>方法说明：根据收入负债的输入项的值得到收入负债的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:13
	 * @param cell
	 * @param srfuzhaiInputMap
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getSrfuzhaiModelScore(String cell,Map<String, Object> srfuzhaiInputMap) throws Exception{
		
		try {
			
			Map<String, String> allInput = SrfuzhaiInputColumn.getAllSrfuzhaiInputs();
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, String>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, String> ent = it.next();
					Object inputValue = srfuzhaiInputMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), inputValue+"" );
						}
					}
				}
			}
			
			String inputJson = "{}";
			if(allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			logger.info(cell+"获取收入负债模型分的输入项："+inputJson);
			
			Application_Srfuzhai_Proxy proxy = new Application_Srfuzhai_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			Object shouruScore = service.modelScore(cell,inputJson,null);
			
			ModelServiceResponse response = new ModelServiceResponse();
			//返回收入负债输入项json
			response.setInputParams(inputJson);
			//返回收入负债的模型分
			if(shouruScore != null){
				response.setModelResult(String.valueOf(shouruScore));
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	/**
	 * 
	 * <b>方法说明：根据通话的输入项的值得到通话的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:13
	 * @param cell
	 * @param tonghuaInputMap
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getTonghuaModelScore(String cell,Map<String, Object> tonghuaInputMap) throws Exception{
		
		try {
			
			Map<String, String> allInput = TonghuaInputColumn.getAllTonghuaInputs();
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, String>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, String> ent = it.next();
					Object inputValue = tonghuaInputMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), inputValue+"" );
						}
					}
				}
			}
			
			String inputJson = "{}";
			if(allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			logger.info(cell+"获取通话模型分的输入项："+inputJson);
			
			Application_Tonghua_Proxy proxy = new Application_Tonghua_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			Object tonghuaScore = service.modelScore(cell,inputJson,null);
			
			ModelServiceResponse response = new ModelServiceResponse();
			//返回通话输入项json
			response.setInputParams(inputJson);
			//返回通话的模型分
			if(tonghuaScore != null){
				response.setModelResult(String.valueOf(tonghuaScore));
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * 
	 * <b>方法说明：根据网查3的输入项的值得到网查3的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:13
	 * @param cell
	 * @param wangcha3InputMap
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getWangcha4ModelScore(String cell,Map<String, Object> wangchaInputMap) throws Exception{
		
		try {
			
			Map<String, String> allInput = Wangcha4InputColumn.getAllWangcha4Inputs();
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, String>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, String> ent = it.next();
					Object inputValue = wangchaInputMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), inputValue+"" );
						}
					}
				}
			}
			
			String inputJson = "{}";
			if(allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			logger.info(cell+"获取网查4.0模型分的输入项："+inputJson);
			
			Application_Wangcha4_Proxy proxy = new Application_Wangcha4_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			Object wangchaScore = service.modelScore(cell,inputJson,null);
			
			ModelServiceResponse response = new ModelServiceResponse();
			//返回网查4.0输入项json
			response.setInputParams(inputJson);
			//返回网查4.0的模型分
			if(wangchaScore != null){
				response.setModelResult(String.valueOf(wangchaScore));
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * 
	 * <b>方法说明：根据工作的输入项的值得到工作的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:13
	 * @param cell
	 * @param workInputMap
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getWorkModelScore(String cell,Map<String,Object> workInputMap) throws Exception{
		
		try {
			
			Map<String, String> allInput = WorkInputColumn.getAllWorkInputs();
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, String>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, String> ent = it.next();
					Object inputValue = workInputMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), inputValue+"" );
						}
					}
				}
			}
			
			String inputJson = "{}"; 
			if(allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			logger.info(cell+"获取工作模型分的输入项："+inputJson);
			
			Application_Work_Proxy proxy = new Application_Work_Proxy();
			Application_PortType service = proxy.getApplication_PortType();
			
			Object workSocre = service.modelScore(cell,inputJson,null);
			
			ModelServiceResponse response = new ModelServiceResponse();
			//无输入项，返回空字符
			response.setInputParams(inputJson);
			if(workSocre != null){
				response.setModelResult(String.valueOf(workSocre));
			}
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * 
	 * <b>方法说明：根据学历的输入项的值得到学历的模型分</b>
	 * 
	 * @作者：lwh
	 * @时间：2017-2-14下午4:49:13
	 * @param cell
	 * @param xueliInputMap
	 * @return
	 * @throws Exception
	 */
	public static ModelServiceResponse getXueliModelScore(String cell,Map<String, Object> xueliInputMap,boolean isPynXueli) throws Exception{
		
		try {
			
			Map<String, String> allInput = null;
			if(isPynXueli){
				//有鹏元学历的输入项
				allInput = XueliInputColumn.getAllXueliInputs();
			}else{
				allInput = XueliInputColumn.getAllNoXueliInputs();
			}
			
			if(allInput != null && allInput.size()>0){
				Iterator<Entry<String, String>> it = allInput.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, String> ent = it.next();
					Object inputValue = xueliInputMap.get(ent.getKey());
					if(inputValue != null){
						if(inputValue instanceof String){
							String strVal = inputValue.toString();
							if(StringUtils.isNotBlank(strVal) && !strVal.toLowerCase().equals("null")){
								//不为空，或者null字符串的时候赋值
								allInput.put(ent.getKey(), inputValue.toString() );
							}
						}else{
							allInput.put(ent.getKey(), inputValue+"" );
						}
					}
				}
			}
			String inputJson = "{}";
			if(allInput != null && allInput.size()>0){
				inputJson = JacksonUtil.beanToJson(allInput);
			}
			
			
			
			Application_PortType service = null;
			if(isPynXueli){
				logger.info(cell+"获取鹏元学历模型分的输入项："+inputJson);
				Application_Xueli_Proxy proxy = new Application_Xueli_Proxy();
				service = proxy.getApplication_PortType();
			}else{
				logger.info(cell+"获取非鹏元学历模型分的输入项："+inputJson);
				Application_NoPyXueli_Proxy proxy = new Application_NoPyXueli_Proxy();
				service = proxy.getApplication_PortType();
			}
			
			Object xueliScore = service.modelScore(cell,inputJson,null);
			
			ModelServiceResponse response = new ModelServiceResponse();
			//返回学历模型输入项
			response.setInputParams(inputJson);
			//返回学历模型分
			if(xueliScore != null){
				response.setModelResult(String.valueOf(xueliScore));
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}

	
	public static void main(String[] args) throws Exception {
		
		/*******************百融模型测试**************************/
//		Map<String, Object> brResult = new HashMap<String, Object>();
//		brResult.put("acm_m1_credit_def", "1");
//		brResult.put("acm_m2_credit_def", "0");
//		brResult.put("acm_m3_credit_def", "1");
//		brResult.put("sl_cell_bank_overdue", "0");
//		brResult.put("sl_id_court_bad", "0");
//		//0.91494
//		String result = Model_WSClient.getBrModelScore("1856570",brResult);
//		System.out.println("百融模型分："+result);
		
		Map<String, Object> inputMap = new HashMap<String, Object>();
		String mobile ="13008442221";
		ModelServiceResponse response = null;
		
//		/**********************工作模型测试(-1.0)**********************/
//		inputMap.put("arti_date", "20170317");
//		inputMap.put("cd_comp_name1", "佛山市哈帕萨幕墙门窗有限公司");
//		inputMap.put("cd_comp_name2", "佛山市皇派门窗有限公司");
//		inputMap.put("cd_comp_name3", "四川久大制盐有限责任公司长山盐矿");
//		inputMap.put("cd_comp_name4", null);
//		inputMap.put("cd_comp_name5", null);
//		inputMap.put("cd_comp_info_updt_time1", "20170216");
//		inputMap.put("cd_comp_info_updt_time2", "20161107");
//		inputMap.put("cd_comp_info_updt_time3", "20060823");
//		inputMap.put("cd_comp_info_updt_time4", "");
//		inputMap.put("cd_comp_info_updt_time5", "");
//		response = Model_WSClient.getWorkModelScore(mobile,inputMap);
//		
		/*********************学历模型**************************/
//		inputMap.put("college_is_211", "0");
//		inputMap.put("py_degree", 0);
//		inputMap.put("py_studystyle", "");
//		inputMap.put("age_big", "0");
//		response = Model_WSClient.getXueliModelScore(mobile, inputMap, false);
		
		
//		/*********************区域模型**************************/
//		inputMap.put("cd_comp_add4", "白鹿泉乡下聂庄村");
//		inputMap.put("top2_place", null);
//		inputMap.put("detail_address", "广东省深圳市南山区科苑路42号");
//		inputMap.put("cd_comp_add3", "鹿泉市");
//		inputMap.put("cust_lbs_adress", "130110");
//		inputMap.put("cd_comp_add5", null);
//		inputMap.put("top1_place", null);
//		inputMap.put("cd_comp_add2", "--");
//		inputMap.put("cd_comp_add1", "市鹿泉区杏苑路X号路鹿华路热电西门西行XX米");
//		response = Model_WSClient.getQuyuModelScore(mobile, inputMap);
		
//		/*********************网查模型**************************/
//		inputMap.put("cust_age", "23");
//		response = Model_WSClient.getWangcha4ModelScore(mobile, inputMap);
//		
//		/*********************失联模型**************************/
		inputMap.put("CALLMIN6MONTH", "70067");
		inputMap.put("id_match", "0");
		inputMap.put("xiaohao", "0");
		inputMap.put("zj_contact_intersect_cnt", "61");
		inputMap.put("CALLINTIME", "28368");
		inputMap.put("EARLIEST_CALL_DELTA_MONTHS", "5");
		inputMap.put("contact_normal_cnt", null);
		inputMap.put("CALL_DISTINCT", "154");
		inputMap.put("ratio_contact_calls", "0.70");
		inputMap.put("jxl_phoneinuse", "null");
		inputMap.put("CALLOUTTIME", null);
		inputMap.put("bj_contact_intersect_cnt", "56");
		inputMap.put("call_contact_intersect_cnt", null);
		inputMap.put("CALLTIMES6MONTH", "712");
		response = Model_WSClient.getShilianModelScore(mobile, inputMap);
		
		
		/**********************Alpha-S模型测试*****************/
//		inputMap.put("shilian_score", "s");
//		inputMap.put("renhang_score", "s");
//		inputMap.put("fumian2_score", "s");
//		inputMap.put("tjr_approve_result", "s");
//		response = Model_WSClient.getAlphaSModelScore(mobile, inputMap);
		
		
		/**********************DNA3.0模型测试*****************/
		
		
		/*System.out.println("返回输入项JSON："+response.getInputParams());
		System.out.println("返回输出分数："+response.getModelResult());*/
		
		for(Entry<String, String> ent : AlphaSInputColumn.getAllAlphaSInputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		for(Entry<String, String> ent : Fumian1InputColumn.getAllFumian1Inputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		for(Entry<String, String> ent : Fumian2InputColumn.getAllFumian2Inputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		for(Entry<String, String> ent : GlrenInputColumn.getAllGlrenInputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		for(Entry<String, String> ent : LiehuInputColumn.getAllLiehuInputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		for(Entry<String, String> ent : QuyuInputColumn.getAllQuyuInputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		for(Entry<String, String> ent : RhInputColumn.getAllRhInputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		for(Entry<String, String> ent : ShilianInputColumn.getAllShilianInputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		for(Entry<String, String> ent : SrfuzhaiInputColumn.getAllSrfuzhaiInputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		for(Entry<String, String> ent : TonghuaInputColumn.getAllTonghuaInputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		for(Entry<String, String> ent : Wangcha4InputColumn.getAllWangcha4Inputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		for(Entry<String, String> ent : WorkInputColumn.getAllWorkInputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		for(Entry<String, String> ent : XueliInputColumn.getAllNoXueliInputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		for(Entry<String, String> ent : XueliInputColumn.getAllXueliInputs().entrySet()){
			System.out.println(ent.getKey());
		}
		
		
		
		
		
		
	}
}

package com.smy.common;

import com.smy.common.utils.PropertiesHelper;


public class HttpUrlConfig {
	
	static private HttpUrlConfig httpUrlConfig = new HttpUrlConfig();
	
	private String brUrl = "";
	
	private String alphaSUrl = "";
	
	private String dna3Url = "";
	
	
	
	private HttpUrlConfig(){
		
	}
	
	public static HttpUrlConfig getInstance(){
		
		return httpUrlConfig;
	}

	public String getBrUrl() {
		if (brUrl == null || brUrl == ""){
			httpUrlConfig.setBrUrl(PropertiesHelper.readValue("brUrl"));
		}
		return brUrl;
	}

	public void setBrUrl(String brUrl) {
		this.brUrl = brUrl;
	}

	public String getAlphaSUrlUrl() {
		if (alphaSUrl == null || alphaSUrl == ""){
			httpUrlConfig.setAlphaSUrl(PropertiesHelper.readValue("alphaSUrl"));
		}
		return alphaSUrl;
	}

	public void setAlphaSUrl(String alphaSUrl) {
		this.alphaSUrl = alphaSUrl;
	}

	public String getDna3Url() {
		
		if (dna3Url == null || dna3Url == ""){
			httpUrlConfig.setDna3Url(PropertiesHelper.readValue("dna3Url"));
		}
		return dna3Url;
	}

	public void setDna3Url(String dna3Url) {
		this.dna3Url = dna3Url;
	}

	

	
	
	
	

}

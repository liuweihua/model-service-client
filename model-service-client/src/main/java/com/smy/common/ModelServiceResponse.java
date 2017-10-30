package com.smy.common;

public class ModelServiceResponse {
	
	private String modelScore;
	private String resultCode;
	
	private Object inputParams;
	
	public String getModelScore() {
		return modelScore;
	}
	public void setModelScore(String modelScore) {
		this.modelScore = modelScore;
	}
	public Object getInputParams() {
		return inputParams;
	}
	public void setInputParams(Object inputParams) {
		this.inputParams = inputParams;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	

}

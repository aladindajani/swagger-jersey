package com.opentext.ix.ea.demo.model;

public class ErrorResponse {
	
	private String errorInstanceId;
	private String errorCode;
	private String errorMessage;
	private String errorAdditionalDescription;
	public String getErrorInstanceId() {
		return errorInstanceId;
	}
	public void setErrorInstanceId(String errorInstanceId) {
		this.errorInstanceId = errorInstanceId;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorAdditionalDescription() {
		return errorAdditionalDescription;
	}
	public void setErrorAdditionalDescription(String errorAdditionalDescription) {
		this.errorAdditionalDescription = errorAdditionalDescription;
	}

	public ErrorResponse(){}
	
	public ErrorResponse(String errorInstanceId, String errorCode, String errorMessage, String errorAdditionalDetails)
	{
		this.errorInstanceId = errorInstanceId;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.errorAdditionalDescription = errorAdditionalDetails;
	}
}

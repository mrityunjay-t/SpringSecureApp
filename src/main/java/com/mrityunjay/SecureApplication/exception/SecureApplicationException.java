package com.mrityunjay.SecureApplication.exception;

public class SecureApplicationException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String exceptionCode;
	
	public SecureApplicationException(String exceptionCode) {
		super();
		this.exceptionCode = exceptionCode;
	}

	public String getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SecureApplicationException [exceptionCode=" + exceptionCode + "]";
	}

}

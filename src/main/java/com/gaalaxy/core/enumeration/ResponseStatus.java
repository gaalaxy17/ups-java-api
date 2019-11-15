package com.gaalaxy.core.enumeration;

public enum ResponseStatus {

	OK("OK",200),
	BAD_REQUEST("BAD_REQUEST", 400),
	UNAUTHORIZED("UNAUTHORIZED", 401),
	FORBIDDEN("FORBIDDEN", 403),
	INTERNAL_ERROR("INTERNAL_ERROR", 500);
	
	private ResponseStatus(String desc, Integer code) {
		this.desc = desc;
		this.code = code;
	}
	
	private String desc;
	private Integer code;
	
	public Integer getCode() {
		return this.code;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
}

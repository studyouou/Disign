package com.design.observer;

public enum MyEumn {
	SUCCESS(1,"³É¹¦"),
	FAIL(0,"Ê§°Ü")
	;
	
	MyEumn(int code,String msg) {
		this.code=code;
		this.msg=msg;
	}
	private int code;
	private String msg;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}

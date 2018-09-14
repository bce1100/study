package com.ljj.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用的返回类
 * 
 * @author bce1100
 *
 */
public class Msg {
	private int code;
	private String msg;

	private Map<String, Object> extend = new HashMap<String, Object>();
	
	public static Msg success(){
		Msg result = new Msg();
		result.setCode(100);
		result.setMsg("ojbk");
		return result;
	}
	
	public static Msg fail(){
		Msg result = new Msg();
		result.setCode(400);
		result.setMsg("处理失败");
		return result;
	}

	public static Msg fail(String msg,int code){
		Msg result = new Msg();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
	
	public Msg add(String key,Object value){
		this.getExtend().put(key, value);
		return this;
	}

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

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}

}

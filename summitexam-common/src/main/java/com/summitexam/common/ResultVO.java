package com.summitexam.common;

public class ResultVO<T> {
	 public ResultVO(T data) {
	        this.data = data;
	}
	    
	
    public ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    
    public ResultVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    
    public ResultVO(Integer code, String msg, String token) {
        this.code = code;
        this.msg = msg;
        this.token = token;
    }
    
    public ResultVO(Integer code, String msg, String token, T data) {
        this.code = code;
        this.msg = msg;
        this.token = token;
        this.data = data;
    }
    
    public ResultVO() {
    }

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg = "";

    /**
     * 具体内容
     */
    private T data;
    
    /**
     * Token
     */
    private String token = "";

    
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
    
}


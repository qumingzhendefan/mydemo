package com.example.demo.common.result;

/**
 * 统一响应类
 * @param <T>
 */
public class Result<T> {

	//响应编码
	private int code;
	//响应信息
	private String msg;
	//响应数据
	private T data;

	private Result(T data) {
		this.data = data;
	}

	private Result(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	private Result(CodeMsg codeMsg) {
		if(codeMsg != null) {
			this.code = codeMsg.getCode();
			this.msg = codeMsg.getMsg();
		}
	}

	/**
	 *  成功时候的调用
	 * */
	public static  <T> Result<T> success(T data){
		return new Result<T>(data);
	}
	
	/**
	 *  失败时候的调用
	 * */
	public static  <T> Result<T> error(CodeMsg codeMsg){
		return new Result<T>(codeMsg);
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
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}

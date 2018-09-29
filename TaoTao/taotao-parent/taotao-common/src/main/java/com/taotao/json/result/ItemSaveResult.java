package com.taotao.json.result;

public class ItemSaveResult {
	private Integer status;
	
	//公開的，不可變的， 靜態的  
	public final static ItemSaveResult FAILED = new ItemSaveResult(400);
	
	public final static ItemSaveResult OK = new ItemSaveResult(200);
	
	
	
	private ItemSaveResult(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	} 
	
}

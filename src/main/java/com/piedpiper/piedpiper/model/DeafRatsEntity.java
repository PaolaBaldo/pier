package com.piedpiper.piedpiper.model;

public class DeafRatsEntity {
	
	private String inputString;
	private int deafRatsQuantity;
	
	
	public DeafRatsEntity(String inputString, int deafRatsQuantity) {
		super();
		this.inputString = inputString;
		this.deafRatsQuantity = deafRatsQuantity;
	}
	public String getInputString() {
		return inputString;
	}
	public void setInputString(String inputString) {
		this.inputString = inputString;
	}
	public int getDeafRatsQuantity() {
		return deafRatsQuantity;
	}
	public void setDeafRatsQuantity(int deafRatsQuantity) {
		this.deafRatsQuantity = deafRatsQuantity;
	}
	
	
	

}

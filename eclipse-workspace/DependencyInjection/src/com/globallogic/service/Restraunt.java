package com.globallogic.service;

public class Restraunt {
	String restrauntName;
	Tea tea;
	
	public void setRestrauntName(String restrauntName) {
		this.restrauntName=restrauntName;
	}
	public void setTea(Tea tea) {
		this.tea=tea;
	}
	public void showRestrauntDetails() {
		System.out.println("Restraunt name :"+restrauntName);
		tea.teaPrice();
	}
	

}

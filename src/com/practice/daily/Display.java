package com.practice.daily;

public class Display {
	private String type;
	private Boolean isTochScreen;
	public Display(String type, Boolean isTochScreen) {
		super();
		this.type = type;
		this.isTochScreen = isTochScreen;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getIsTochScreen() {
		return isTochScreen;
	}
	public void setIsTochScreen(Boolean isTochScreen) {
		this.isTochScreen = isTochScreen;
	}
	@Override
	public String toString() {
		return "Display [type=" + type + ", isTochScreen=" + isTochScreen + "]";
	}
	
	

}

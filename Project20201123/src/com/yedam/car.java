package com.yedam;

public class car {
	//field
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	//constructor
	public car() { //아무것도 안붙이면 동일한 패키지 내에서 사용 가능
		
	}
	public car(String company){
		this.company = company;
	}
	public car(String company, String model){
		this.company = company;
		this.model = model;
	}
	public car(String company, String model, String color, int maxSpeed){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;		
}
	//method (클래스의 기능을 담는 곳)
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}

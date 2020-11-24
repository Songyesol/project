package com.yedam.abstracts;

public abstract class Phone { //추상클래스
	public String owner; //필드 
	public Phone() {} //생성자 
	public Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() { //메소드
		System.out.println("전원을 켭니다.");
	}
	public abstract void ring() ; //구현하는 부분이 없는 추상메소드
	public abstract void turnOff();
}

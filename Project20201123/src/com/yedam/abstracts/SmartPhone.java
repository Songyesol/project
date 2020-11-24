package com.yedam.abstracts;

public class SmartPhone extends Phone {

	@Override //부모가 가지고 있는 메소드를 재정의 해서 사용하겠음
	public void ring() {
		System.out.println("스마트폰 벨...");
	}

	@Override
	public void turnOff() {
		
	}

}

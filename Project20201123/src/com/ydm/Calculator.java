package com.ydm;

public class Calculator {

	private String color;
	
	static double pi = 3.14; 
	//static을 붙이면 클래스 명만 호출하면 사용할 수 있음.
	//인스턴스 생성 불필요
	
	public void setColor(String color) {
		this.color = color;
	}
	public static int plus(int a, int b) {
		return a+b;
		
		/*static이 붙는 매소드는 클래스 소속임 
		 * 인스턴스에 붙여 호출해도 에러는 아님*/
	}
	public static int minus (int a, int b) {
		return a - b;
	}
}

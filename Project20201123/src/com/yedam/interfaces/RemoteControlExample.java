package com.yedam.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		Audio audio = new Audio();
		Televison tv = new Televison();
		
		audio.turnOn();
		audio.turnOff();
		
		tv.turnOn();
		tv.turnOff();
		
		RemoteControl/*구현객체*/ rc = audio;
		rc.turnOn();
		rc.turnOff();
		
		rc = tv; //인터페이스도 인터페이스를 구현한 객체들의 값을 담을 수 있음.
		rc.turnOn(); //rc에 담겨져있는 인스턴스의 메소드를 호출 
		rc.turnOff();
	}
}

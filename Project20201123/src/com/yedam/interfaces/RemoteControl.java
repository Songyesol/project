package com.yedam.interfaces;

public interface RemoteControl {
	// 생성자가 없고 상수란 추상메소드가 있음
	public void turnOn(); // abstract 없어도 interface 안의 메소드들은 다 추상메소드이기 때문에 안붙여도 됌

	public void turnOff(); // 추상메소드임!

}

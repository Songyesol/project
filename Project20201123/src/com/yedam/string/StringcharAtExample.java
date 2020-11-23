package com.yedam.string;

public class StringcharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case'2':
		case'4':
			System.out.println("여자입니다.");
			break;
		}
		String subject = "자바 프로그래밍";
		char charValue=subject.charAt(3);
		System.out.println(charValue);
	}

}

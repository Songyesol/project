package com.yedam.string;

public class StringIndexOfExample {
	public static void main(String[] args) {

		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.println(location);

		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련이 없는 책이군요");
		}
		String subject1 = "반갑습니다. 비콘 출결 해주세요.";
		
		int location1 = subject1.indexOf("프로그래밍");
		System.out.println(location1);
	}
}

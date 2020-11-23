package com.yedam.string;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String oldStr1 = "자바는 객체지향 언어입니다자바 자바는 풍부한 API를 지원합니다.";
		String newStr1= oldStr1.replace("객체", "Object");
		System.out.println(oldStr1);
		System.out.println(newStr1);
	}
}

package com.yedam;

public class ObjectExample {
	public static void main(String[] args) {
		System.out.println("Hello");

		Object o1 = new Object();
		boolean sameOrDiff = o1.equals(new Object());
		System.out.println(sameOrDiff);

		System.out.println(o1.toString());
		
	}
}

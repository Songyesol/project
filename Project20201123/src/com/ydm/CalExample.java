package com.ydm;

public class CalExample {

	public static void main(String[] args) {
//		Calculator c1 = new Calculator();
//		c1.setColor("white");
//		c1.plus(3, 5);

		int result = Calculator.plus(3, 5);
		System.out.println(result);
		System.out.println(Calculator.pi);

		result = Calculator.minus(10, 5);
		System.out.println(result);

		result = sum(3, 5);
		System.out.println(result);

	}

	public static int sum(int a, int b) {
		return a + b;
	}

}

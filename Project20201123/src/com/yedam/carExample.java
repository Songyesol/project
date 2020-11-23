package com.yedam;

public class carExample {

	public static void main(String[] args) {
		car c1 = new car();// 뉴라고 하는 키워드로 인스턴스 생성 (아무 매개값이 없는것 - 기본생성자)
		System.out.println(c1.getCompany());

		car c2 = new car("현대", "Sonata", "white", 200);
		System.out.println(c2.getCompany());
		System.out.println(c2.getMaxSpeed());

		car c3 = new car("삼성", "SM5");
		c3.setColor("yellow");
		c3.setMaxSpeed(210);

		car c4 = new car("삼성", "SM3");
		c4.setColor("black");
		c4.setMaxSpeed(180);

		car[] cars = { c1, c2, c3, c4 };
		for (car car : cars) {
			if (car != null) {
			if ("삼성".equals(car.getCompany())) {
					System.out.println(car.getModel());
					System.out.println(car.getMaxSpeed());
				}

			}

		}

	}
}

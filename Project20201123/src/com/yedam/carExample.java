package com.yedam;

public class carExample {

	public static void main(String[] args) {
		Car c1 = new Car();// 뉴라고 하는 키워드로 인스턴스 생성 (아무 매개값이 없는것 - 기본생성자)
		System.out.println(c1.getCompany());

		Car c2 = new Car("현대", "Sonata", "white", 200);
		System.out.println(c2.getCompany());
		System.out.println(c2.getMaxSpeed());

		Car c3 = new Car("삼성", "SM5");
		c3.setColor("yellow");
		c3.setMaxSpeed(210);

		Car c4 = new Car("삼성", "SM3");
		c4.setColor("black");
		c4.setMaxSpeed(180);

		Car[] cars = { c1, c2, c3, c4 };
		for (Car car : cars) {
			if (car != null) {
			if ("삼성".equals(car.getCompany())) {
					System.out.println(car.getModel());
					System.out.println(car.getMaxSpeed());
				}

			}

		}

	}
}

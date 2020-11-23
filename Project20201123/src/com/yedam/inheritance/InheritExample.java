package com.yedam.inheritance;

public class InheritExample {
	public static void main(String[] args) {
		Parent p1 = new Parent("필드값1");
		System.out.println(p1.field1);
		p1.method1();
		
		Child c1 = new Child ("자식필드1", "자식필드2");
		System.out.println(c1.field1);
		System.out.println(c1.field2);

		c1.method1();
		c1.method2();
		
		NewChild nc1 = new NewChild("또다른자식1", "또다른자식3");
		System.out.println(nc1.field1);
		System.out.println(nc1.field3);
		nc1.method1();
		nc1.method3();
		
		GrandChild gc1 = new GrandChild() ;
		System.out.println(gc1.field1);
		System.out.println(gc1.field2);
		gc1.method1();
		gc1.method2();
		
		Parent p=new Parent();
		p= new Child();
		p=new GrandChild();
		/*Parent>Child>GrandChild
		*필드는 그랜드차일드가 가장 많이 가지고 있는 것처럼 보이나 제일 큰 부모클래스가 모든것을 포괄함
		*부모클래스는 자식클래스의 인스턴스, 그 자식의 인스턴스까지 받을 수 있음
		*안돼는 예시- Child c = new Parent(); */ 
		
		/* 비슷한 느낌...)) long > int > short > byte */
		
	}
	
}

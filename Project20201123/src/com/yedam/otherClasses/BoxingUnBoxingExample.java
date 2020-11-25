package com.yedam.otherClasses;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		//Boxing 
		Integer obj1 = new Integer(100); //기본타입의 int값
		Integer obj2 = new Integer("200"); //문자열 타입의 int값
		Integer obj3= Integer.valueOf("300"); // 문자열 타입의 int 값을 정적메소드로 박싱
		Double obj4 = new Double(1.645);
		Double obj5 = Double.valueOf("6.45");
		
		//unboxing 다시 기본 타입의값 얻어내기 
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		double value4 = obj4.doubleValue() ;
		double value5 = obj5.doubleValue();
		
		int[] values1 = {value1, value2, value3};
		double[] values2 = {value4, value5};
		
		for(int r:values1) {
			System.out.println(r);			
		}
		for(double rt:values2) {
			System.out.println(rt);			
		}
	}

}

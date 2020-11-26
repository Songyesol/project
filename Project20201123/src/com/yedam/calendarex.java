package com.yedam;

import java.util.Calendar;

public class calendarex {

	public static void showCal(int year, int month) {

		Calendar cal = Calendar.getInstance();

		cal.set(year, (month - 1), 1);

		int startDay = cal.get(Calendar.DAY_OF_WEEK); // 2020 06월은 월요일이 1일
		System.out.println("startDay> " + startDay);
		int lastDate = cal.getActualMaximum(Calendar.DATE); // 2020 06월 마지막날은 30일
		System.out.println("lastDate> " + lastDate);


		System.out.println("\t[" + year + "년" + month + "월]");
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]); // %d는 정수형 %s는 실수형
		}
		System.out.println();

		for (int i = 1; i < startDay; i++) {
			System.out.printf("%4s", " ");
		}
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4s", i);

			startDay++; //반복문을 수행하며 날짜가 증가할 때 마다 요일도 함께 긍가할 수 있도록 처리
			if (startDay % 7 == 1) { //증가한 요일이 일요일이 될때 개행 
				System.out.println();
			}

		}

	}

	public static void main(String[] args) {

//		Calendar cal = Calendar.getInstance();
////		cal.set(2020, 6, 1); // 2020/1/1 
//		System.out.println("년도: " + cal.get(Calendar.YEAR));
//		System.out.println("월: " + cal.get(Calendar.MONTH)); //캘린더 클래스는 1월이 0 으로 설정
//		System.out.println("날짜: "+ cal.get(Calendar.DATE));
//		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK)); //일)1, 월)2, 화)3...
//		System.out.println("마지막날: "+ cal.getActualMaximum(Calendar.DATE)); //이번달 마지막날 
		showCal(2020, 3);

//				for(int i = 1; i<31; i++) {
//			System.out.printf("%3d",i);
//			if( i%7 ==0 ) {
//				System.out.println();
//			}
//		}

		// printf: "%3d" 왼쪽에 여백을 주고 싶을 때 숫자 갯수 만큼의 공란을 만들고 그 사이에 숫자를 채우겠다.
//		System.out.printf("%3d",2); 
//		System.out.printf("%3d",2);
//		System.out.printf("%3d",2);
//		System.out.println();
//		System.out.printf("%3d",12);
//		System.out.printf("%3d",12);
//		System.out.printf("%3d",12);
//		System.out.println();
//		System.out.printf("%3d",2);
//		System.out.printf("%3d",2);
//		System.out.printf("%3d",2);
//		System.out.println();
//		System.out.printf("%3d",123);
//		System.out.printf("%3d",123);
//		System.out.printf("%3d",123);

	}// end of main
}// end of class

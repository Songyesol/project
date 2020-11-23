package com.yedam.inheritance;

public class StudentExample {
	public static void main(String[] args) {
		Student st1= new Student();
		st1.name = "Hong";
		st1.school = "Yedam";
		st1.study();
		
		HighStudent hs1 = new HighStudent();
		hs1.name = "Hwang";
		hs1.school = "Ydm";
		hs1.grade = "2";
		hs1.study();
		hs1.showGrade();
		
		//Student > HighSchool
		st1 = new HighStudent();
		/*hs1 = new Student(); */
}
}

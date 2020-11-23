package com.ydm;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setUniName("우리대학교");
		s1.setStudentNo("11-1121");
		s1.setName("송예솔");
		s1.setMajor("콜라비학과");

		Student s2 = new Student("우리대학교", "14-4567");
		s2.setName("홍식");
		s2.setMajor("감귤재배학과");

		Student s3 = new Student("감귤대학교", "20-4141", "귤식", "한라봉과");

		Student[] students = { s1, s2, s3 };
		for (int i = 0; i < students.length; i++) {
			students[i].showStudentInfo();

		}
		for (Student std : students) {
			if ("우리대학교".equals(std.getUniName())) {
				std.showStudentInfo();
			}

		}

	}
}

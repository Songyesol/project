package com.ydm;

public class Student {
	private String uniName;
	private String studentNo;
	private String name;
	private String major;

	public Student() {

	}

	public Student(String uniName, String studentNo) {
		this.uniName = uniName;
		this.studentNo = studentNo;
	}

	public Student(String uniName, String studentNo, String name, String major) {
		this.uniName = uniName;
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}

	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void showStudentInfo() {
		System.out.println("학교명: " + uniName + ", 학번:" + studentNo + ", 이름:" + name);
	}

}

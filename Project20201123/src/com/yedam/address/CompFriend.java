package com.yedam.address;

public class CompFriend extends Friend {
	private String company;
	private String department;

	public CompFriend(String name, String phone) {
		super(name, phone);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override/*(재정의)*/
	public void showFriendInfo() {
//		super.showFriendInfo();
		System.out.println("이름:" +super.getName()/*클래스가 달라도 접근가능*/ + "연락처:" + super.getPhone()+ 
				           "회사명: "+ this.company + "부서: "+ this.department);
	}
	
}

package com.yedam.string;

public class Gender {

	
	private String birth;
	private String gender;
	
	public Gender (String birth) {
		this.birth = birth;
	}
	public Gender (String[] birth) {

	}
	
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void getGenderInfo(String[] birth1) {
		String birth = null;
		char sex = birth.charAt(7);
		switch(sex) {
		case '1' :
		case '3' : 
			System.out.println("남성");
		case '2':
		case '4':
			System.out.println("여성");
			break;
		}
	}

}


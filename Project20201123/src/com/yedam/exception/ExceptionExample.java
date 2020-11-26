package com.yedam.exception;

import java.sql.Connection;
import java.sql.SQLException;

import com.yedam.common.DAO;

public class ExceptionExample {
	public static void main(String[] args) {
		int num = 20;
		try {
			int[] numbers = new int[3];
			numbers[3] = 10;
		} catch (Exception e) {
			System.out.println("에러가 발생했습니다.");
//			e.printStackTrace();
		}

		try {
			String str = null;
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("출력값이 없습니다."); //에러가 발생하더라도 강제종료 되지않고 에러를 알려주게 하는 방법
		}
	
		//예외처리를 해줘야하는 것 
		Connection conn = DAO.getConnection();
		try {
			conn.close();
		} catch (SQLException e) { //exception클래스를 상속받은 클래스들은 예외처리를 안하면 컴파일이 안돼도록 설정되어있음.
			e.printStackTrace();
		}
	}
}

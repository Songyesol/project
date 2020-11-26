package com.yedam.db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
//statement를 상속받는 인터페이스로 SQL구문을 실행시키는 기능을 갖는 객체
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO; //다른패키지에 있기 때문에 임포트

public class EmpDAO { // db처리
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 전체조회
	public List getEmplist() {
		conn = DAO.getConnection();
		sql = "select * from emp1 order by 1";
		List list = new ArrayList();

		try {
			pstmt = conn.prepareStatement(sql); //텍스트 sql 호출
			rs = pstmt.executeQuery(); // rs에 쿼리의 결과가 담겨져있음
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.setPhoneNumber(rs.getString("phone_number"));
				vo.setSalary(rs.getInt("salary"));
				list.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	// 한건조회
	public EmployeeVO getEmp(int empId) {
		conn = DAO.getConnection();
		sql = "select * from emp1 where employee_id = ?";
		EmployeeVO vo = new EmployeeVO();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.setPhoneNumber(rs.getString("phone_number"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return vo;

	}

	// 한건입력
	public void insertEmp(EmployeeVO vo) {
		conn = DAO.getConnection();
		sql = "insert into emp1(employee_id,last_name, email, job_id, hire_date)" 
		+ "values(?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmployeeId());
			pstmt.setString(2, vo.getLastName());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getJobId());
			pstmt.setString(5, vo.getHireDate());
			int r= pstmt.executeUpdate();
				System.out.println(r+"건 입력완료.");
				
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 한건수정
	public void updateEmp(EmployeeVO vo) {
		
		conn = DAO.getConnection();
		sql = "UPDATE emp1 "
				+ "SET email = NVL('" + vo.getEmail()+ "', email)" //원래있던 컬럼값을 그대로 쓰세요 
				+ ", phone_number= '"+vo.getPhoneNumber()+"'"//스트링 타입은 ' ' 사용
				+ ", salary = " + vo.getSalary() 
				+ "WHERE employee_id = " + vo.getEmployeeId();
		
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt .executeUpdate();
			System.out.println(r + "건 수정됨.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	// 한건삭제
	public void deleteEmp(int empId) {
		conn = DAO.getConnection();
		sql= "delete from emp1 where employee_id = ?";
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			int r = pstmt .executeUpdate();
			System.out.println(r + "건 삭제됨.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

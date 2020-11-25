package com.yedam.db2;

import java.util.List;

public interface EmpService {
	public List getEmpList(); // 리스트조회 
	public EmployeeVO getEmp(int empId); //한건조회 
	public void insertEmp(EmployeeVO empV); // 입력
	public void updateEmp(EmployeeVO empV);// 수정
	public void deleteEmp(int empId); // 삭제 

}

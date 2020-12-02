package com.yedam.db2;

import java.util.List;

import com.yedam.board.BoardVO;

public interface EmpService {
	public List getEmpList(); // 리스트조회 
	public EmployeeVO getEmp(int empId); //한건조회 
	public void insertEmp(EmployeeVO empV); // 입력
	public void updateEmp(EmployeeVO empV);// 수정
	public void deleteEmp(int empId); // 삭제 
	public List<EmployeeVO> getDeptList(String dept); //부서정보 조회

}

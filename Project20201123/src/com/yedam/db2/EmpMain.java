package com.yedam.db2;

import java.util.List;
import java.util.Scanner;

import com.yedam.db.Employee;

public class EmpMain {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImp1();

		while (true) {

			System.out.println("==============================================================");
			System.out.println("1.전체조회 | 2.검색 | 3.입력 | 4.수정 | 5.삭제 | 6.부서별 조회 | 7.종료");
			System.out.println("==============================================================");
			System.out.println("선택> ");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				List list = service.getEmpList();
				for (Object vo : list) {
					EmployeeVO emp = (EmployeeVO) vo; // 강제 캐스팅
					emp.showEmpInfo();
				}
			} else if (selectNo == 2) {
				System.out.print("사원번호> ");
				int empId = scn.nextInt();
				EmployeeVO vo = service.getEmp(empId);
				vo.showEmpInfo();

			} else if (selectNo == 3) {

				System.out.print("사원번호를 입력하세요> ");
				int employeeId = scn.nextInt();scn.nextLine();
				System.out.print("성을 입력하세요> ");
				String lastName = scn.nextLine();
				System.out.print("이메일을 입력하세요> ");
				String email = scn.nextLine();
				System.out.print("직무를 입력하세요> ");
				String jobId = scn.nextLine();
				System.out.print("입사일을 입력하세요 ex>1999/00/00> ");
				String hireDate = scn.nextLine();

				EmployeeVO vo = new EmployeeVO();
				
				vo.setEmployeeId(employeeId);
				vo.setLastName(lastName);
				vo.setEmail(email);
				vo.setJobId(jobId);
				vo.setHireDate(hireDate);
				
				service.insertEmp(vo);

			} else if (selectNo == 4) { // 수정
				System.out.println("수정할 사원번호> ");
				int empId = scn.nextInt();scn.nextLine();
				System.out.println("수정할 이메일> ");
				String email = scn.nextLine();
				System.out.println("수정할 전화번호> ");
				String phoneNumber = scn.nextLine();
				System.out.println("수정할 급여> ");
				int salary = scn.nextInt(); // 값이 있다면 문장을 넘기겠다. 라는 의미 
				
				
				EmployeeVO vo = new EmployeeVO();
				
				vo.setEmployeeId(empId);
				vo.setEmail(email);
				vo.setPhoneNumber(phoneNumber);
				vo.setSalary(salary);
				
				service.updateEmp(vo);

			} else if (selectNo == 5) {
				System.out.println("삭제할 사원번호> ");
				int empId = scn.nextInt();
				
				service.deleteEmp(empId);
				
			} else if (selectNo == 6) {
				System.out.println("부서명을 입력하세요> ");
				String deptId = scn.nextLine();
				List<EmployeeVO> list = service.getDeptList(deptId);
				for (Object vo : list) {
					EmployeeVO emp = (EmployeeVO) vo; // 강제 캐스팅
					emp.showEmpInfo();
				}
			} else if(selectNo == 7) {
				break;
			}
			

		}
		System.out.println("*프로그램 종료*");
	}

}

package com.yedam.nyh.Interfaces.control;

import java.util.Scanner;

import com.yedam.nyh.Interfaces.impl.EmpServiceImpl;
import com.yedam.nyh.Interfaces.model.EmpService;
import com.yedam.nyh.Interfaces.model.Employee;
import com.yedam.nyh.Interfaces.model.Employees;

public class EmpProc {
	Employee[] employees = new Employee[10];
	Scanner scn = new Scanner(System.in);
	EmpService service = new EmpServiceImpl();

	public void execute() {
		System.out.println("프로그램 시작");
		while (true) {
			System.out.println("=========================================");
			System.out.println("1.추가|2.조회|3.리스트|4.삭제|5.종료|6.디비조회|7.DB입력|8.수정|9.삭제");
			System.out.println("=========================================");
			System.out.println("선택 >");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.println("이름");
				String name = scn.nextLine();
				System.out.println("사원번호");
				int empNo = scn.nextInt();
				System.out.println("급여");
				int salary = scn.nextInt();
				Employee emp = new Employee(name, empNo, salary);
				service.addEmp(emp, employees);

			} else if (menu == 2) {
				System.out.println("사원번호 입력: ");
				int no = scn.nextInt();
				// service.searchEmp(no, employees);
				Employees emp = service.getDBEmployee(no);
				System.out.println(emp);

			} else if (menu == 3) {
				service.empList(employees);

			} else if (menu == 4) {
				System.out.println("사원번호 입력: ");
				int no = scn.nextInt();
				service.delEmp(no, employees);

			} else if (menu == 5) {
				break;
			} else if (menu == 6) {
				service.searchEmployees();
			} else if (menu == 7) {
				System.out.println("last 입력");
				String lastName = scn.nextLine();
				System.out.println("이메일 입력");
				String email = scn.nextLine();
				System.out.println("업무입력");
				String jobId = scn.nextLine();
				Employees emp = new Employees();
				emp.setLastName(lastName);
				emp.setEmail(email);
				emp.setJobId(jobId);

				service.insertEmployees(emp);
			} else if (menu == 8) {
				System.out.println("조회 사원번호 입력 :");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.println("급여 인상분 입력 : (엔터) ");
				String salNum = scn.nextLine();
				int sal = 0;
				if (salNum != null && !salNum.equals(""))
					sal = Integer.parseInt(salNum);
				System.out.println("변경할 이메일 입력 : (엔터)");
				String email = scn.nextLine();

				Employees emp = new Employees();
				emp.setSalary(sal);
				emp.setEmail(email);
				emp.setEmployeeId(empId);

				service.updateDBemp(emp);

			} else if (menu == 9) {
				System.out.println("삭제 사원번호 입력 :");
				int empId = scn.nextInt();

				service.deleteDBemp(empId);
			}
		} // end of while
		System.out.println("프로그램 종료");
	}
}

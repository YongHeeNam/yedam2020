package com.yedam.nyh.Interfaces.control;

import java.util.Scanner;

import com.yedam.nyh.Interfaces.impl.EmpServiceImpl;
import com.yedam.nyh.Interfaces.impl.EmpServiceImpl2;
import com.yedam.nyh.Interfaces.model.EmpService;
import com.yedam.nyh.Interfaces.model.Employee;

public class EmpProc {
	Employee[] employees = new Employee[10];
	Scanner scn = new Scanner(System.in);
	EmpService service = new EmpServiceImpl2();

	public void execute() {
		System.out.println("프로그램 시작");
		while (true) {
			System.out.println("===============================");
			System.out.println("1.추가|2.조회|3.리스트|4.삭제|5.종료");
			System.out.println("===============================");
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
		            service.searchEmp(no, employees);
				
			} else if (menu == 3) {
				service.empList(employees);
				
			} else if (menu == 4) {
				System.out.println("사원번호 입력: ");
	            int no = scn.nextInt();
				service.delEmp(no, employees);
				
			} else if (menu == 5) {
				break;
			}
		} // end of while
		System.out.println("프로그램 종료");
	}
}

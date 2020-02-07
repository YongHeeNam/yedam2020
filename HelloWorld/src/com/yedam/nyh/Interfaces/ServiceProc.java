package com.yedam.nyh.Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.nyh.Interfaces.model.Employees;

public class ServiceProc {
	List<Employees> list = new ArrayList<>();
	Service service = new ServiceImpl();
	Scanner scn = new Scanner(System.in);
//한건 입력, 전체조회, 한건조회, 수정 , 삭제
	public void execute() {
		System.out.println("=================================");
		System.out.println("1 2 3 4 5");
		System.out.println("=================================");
		System.out.println("선택 > ");
		int menu = scn.nextInt();
		if(menu == 1) {
			System.out.println("id 입력 : ");
			System.out.println("firstName 입력: ");
			Employees emp = new Employees();
//			emp.setEmployeeId(employeeId);
	//		emp.setFirstName(firstName);
			
			service.addMember(emp, list);
		} else if(menu == 2) {
			List<Employees> List = service.getMemberList(list);
		} else if(menu == 3) {
//			service.getMember(memberId, list);
		} else if (menu == 4) {
	//		service.updateMember(emp, list);
		} else if (menu == 5) {
	//		break;
		}
	} // end of while
} // end of execute

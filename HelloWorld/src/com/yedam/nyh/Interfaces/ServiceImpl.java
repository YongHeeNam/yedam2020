package com.yedam.nyh.Interfaces;

import java.util.ArrayList;
import java.util.List;

import com.yedam.nyh.Interfaces.model.Employees;

public class ServiceImpl implements Service {

	@Override
	public void addMember(Employees emp, List<Employees> list) {
		
	}

	@Override
	public Employees getMember(int memberId, List<Employees> list) {
		return null;
	}

	@Override
	public List<Employees> getMemberList(List<Employees> list) {
		List<Employees> destList = new ArrayList<>();
		for(Employees emp : list) {
			destList.add(emp);
		}
		return null;
	}

	@Override
	public void updateMember(Employees emp, List<Employees> list) {

	}

}

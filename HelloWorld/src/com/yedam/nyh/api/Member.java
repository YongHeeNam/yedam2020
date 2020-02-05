package com.yedam.nyh.api;

public class Member {
	String name;
	int age;
	
	@Override
	public boolean equals(Object obj) {
		Member m = (Member)obj;
		return this.age == m.age && this.name.equals(m.name);
	}
	
}

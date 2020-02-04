package com.yedam.nyh.classes.abstractPkg;

public class Dog extends Animal {
	Dog(){
		kind = "포유류";
	}
	
	@Override
	void sound() {
		System.out.println(kind + "멍멍");
	}

	@Override
	void sleep() {
		System.out.println("춘삼이 자는 중");
		
	}

}
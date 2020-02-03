package com.yedam.nyh.classes;

public class Student {
	// 필드
	private String name; // private 직접접근제한 , 외부로부터 숨김
	private int age;
	private int height;
	private int weight;
	static String major;
	
	
	// 생성자(인스턴스를 만들면서 필드값을 초기화)
	public Student() { //default 생성자 초기값은 없다
	}

	public Student(String name) {
		this.name = name; // this는 Student의 필드를 의미한다
	}

	Student(String name, int age, int height, int weight) { // 4개의 필드값을 초기화
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 메소드
	public void study() {
		System.out.println("공부한당.");
	}

	public void eat() {
		System.out.println("밥먹는당.");
	}

	public void sleep() {
		System.out.println("잠을잔당.");
	}

	public void setAge(int age) {
		if (age >= 0)
			this.age = age;
		else
			this.age = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}

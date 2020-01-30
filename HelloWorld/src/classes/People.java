package classes;

public class People {
	//필드
	String name;
	int age;
	String sex;
	int height;
	int weight;
	long phno;
	//생성자
	People(){
	}
	People(String name, int age, String sex, int height, int weight, long phno) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
		this.weight = weight;
		this.phno = phno;
	}
	//메소드
	void book() {
		System.out.println("독서하기");
	}
	void music() {
		System.out.println("음악듣기");
	}
	void movie() {
		System.out.println("영화보기");
	}
	void jogging() {
		System.out.println("산책하기");
	}
	void shop() {
		System.out.println("쇼핑하기");
	}
	int getOld() {
		return (age+1);
	}
}

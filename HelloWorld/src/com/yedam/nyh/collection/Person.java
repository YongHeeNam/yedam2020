package com.yedam.nyh.collection;

public class Person implements Comparable<Person>{
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}

}

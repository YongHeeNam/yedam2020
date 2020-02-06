package com.yedam.nyh.exceptions.generic;

import java.util.ArrayList;
import java.util.List;

import com.yedam.nyh.Interfaces.model.Employees;
import com.yedam.nyh.exceptions.generic.before.Apple;
import com.yedam.nyh.exceptions.generic.before.Orange;

public class BoxExample {
	public static void main(String[] args) {
		Box<Orange> orangeBox = new Box<Orange>();
		Box<Apple> appleBox = new Box<Apple>();

		orangeBox.set(new Orange());
		Orange orange = orangeBox.get();

		appleBox.set(new Apple());
		Apple apple = appleBox.get();

		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("Wolrd");
		for (String str : list) {
			System.out.println(str);
		}

		List<Employees> empList = null;
		
		List<Apple> appleList = new ArrayList<>();
		appleList.add(new Apple());

	}
}

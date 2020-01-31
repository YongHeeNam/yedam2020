package com.yedam.nyh.referenceType;
import java.util.Scanner;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		int num1 = 10;
		byte by1 = 10;
		by1 = (byte) num1;
		
		String str = new String ("Hello");
		String str2 = new String ("Hello");
	System.out.println(str.equals(str2));
	}
}

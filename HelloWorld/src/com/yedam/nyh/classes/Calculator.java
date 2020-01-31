package com.yedam.nyh.classes;

import java.util.Scanner;

public class Calculator {
	static double PI = 3.14;
	

	public static void cal(int a, int b, String oper) {
		double result = 0;
		if (oper.equals("+"))
			result = sum(a, b);
		else if (oper.equals("*"))
			result = multi(a, b);
		else if (oper.equals("-"))
			result = minus(a, b);
		else if (oper.equals("/"))
			result = divide(a, b);
		System.out.println("계산값은 " + result);
	}

	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int multi(int num1, int num2) {
		return num1 * num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static double divide(int num1, int num2) {
		return (double) num1 / num2;
	}
}

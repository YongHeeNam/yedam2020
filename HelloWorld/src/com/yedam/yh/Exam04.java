package com.yedam.yh;

//1~100 숫자 중에서 2의 배수 이거나 또는 3의 배수의 합
public class Exam04 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0 | i % 3 == 0 | i % 6 == 0)
				sum = sum + i;
			i++;
		}
		System.out.println("합은" + sum);
	}
}

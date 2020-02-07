package com.yedam.nyh.classes;

import java.util.Scanner;

public class ElectricFare {
public static void main(String[] args) {
	
	double result = 0;
	double input_Num;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("전기 사용량을 입력하세요 : ");
	input_Num = scan.nextDouble();
	
	if(input_Num <= 0 ) {
		System.out.println("사용하지 않았습니다.");
	} else if (input_Num <=100) {
		result = input_Num * 100;
	} else if (input_Num <= 200) {
		result = input_Num *150;
	} else if (input_Num <= 300) {
		result = input_Num * 230; 
	} else if (input_Num > 300); {
		result = input_Num *300;
	}
	System.out.println("전기료는 " + result + "원입니다.");
}
}

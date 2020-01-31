package com.yedam.nyh.classes;

import java.util.Scanner;

//2,3 배수 이외의 경우는 기타.
//종료 999입력
public class MultiplesExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println( "숫자를 입력하세요 >> / 999 : 종료");
			int operator = scn.nextInt();
			if (operator == 999) {
				break;
			} else if (operator % 2 ==0 ) {
				System.out.println("2의 배수입니다." + operator);
			} else if (operator % 3 ==0) {
				System.out.println("3의 배수입니다." + operator);
			} else if (operator % 6 ==0) {
				System.out.println("2와 3의 배수입니다." + operator);
			} else if (operator % 2 != 0 && operator % 3 != 0 && operator % 6 !=0) {
				System.out.println("기타입니다." + operator);
			}
		}
		System.out.println("종료");
	}
}

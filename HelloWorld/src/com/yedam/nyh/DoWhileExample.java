package com.yedam.nyh;
import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("메세지를 입력하세요.");
		System.out.println("종료하려면 q 입력 >");
		String input = scn.nextLine();
		do {
			System.out.println("==>" + input);
			input = scn.nextLine();
			System.out.println(input);
		} while (!input.contentEquals("q"));
		System.out.println("프로그램 종료.");
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		} while (i <= 5);
	}

}

package com.yedam.nyh.referenceType;
//1. 1차원배열 -> 10개 크기

//2. 2차원배열 -> [5][5]배열
//3. 야구게임

public class ForWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		method2();
	} // end of main

	public static void method1() {
		System.out.println("1번문제");
		int[] intAry = new int[10];
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (i + 1);
			System.out.print(intAry[i] + " ");
		}
		System.out.println();
	} // end of method1

	public static void method2() {
		System.out.println("2번문제");
		int[][] intAry = new int[5][5];
		int count = 1;
		// 배열에 숫자 입력 (1~25)
		System.out.println("정방향 출력");
		for (int i = 0; i < intAry.length; i++) {
			//위에 왜 intAry가되는지 알아보자...
			for (int j = 0; j < intAry[i].length; j++) {
				intAry[i][j] = count++;
				System.out.printf("%3d", intAry[i][j]);
				if (intAry[i][j] % 5 == 0) {
					System.out.println();
				}
			}
		}

	}
}

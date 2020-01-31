package com.yedam.nyh;

public class WhileAndWhileExample {
	public static void main(String[] args) {
		// while 이용해서 구구단 출력
		int i = 1;
		while (i <= 9) {
			int j = 2;
			while (j <= 9) {
				System.out.print(j + "단   ");
				System.out.print(j + "x" + i + "=" + (i * j) + "  " );
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

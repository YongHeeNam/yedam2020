package com.yedam.nyh.common;

// *가 순차적으로 나오게 배열하기
public class MorningPrac {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}
}

package com.yedam.nyh.Interfaces;

import java.util.Scanner;

public class MorningCode { // 10진수 > 2진수
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			System.out.println("숫자값을 입력해주세요> ");
			int num = scn.nextInt();
			int[] a = new int[100];

			int i = 0;
			while (num != 1) {
				a[i++] = num % 2;
				num = num / 2;
			}
			a[i] = num;

			for (int j = i; j >= 0; j--) {
				System.out.print(a[j]);
			}
		}
	}



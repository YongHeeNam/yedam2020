package com.yedam.nyh.classes;

public class SortAry {
	public static void main(String[] args) {
		int[] ary = { 89, 72, 97, 13, 43, 66 };
		int sort = 0;
		System.out.println("원래 배열 값은: ");
		for (int a = 0; a < ary.length; a++) {
			System.out.print(ary[a] + " ");
		}
		System.out.println();

		for (int i = 0; i < ary.length; i++) {
			for (int j = i + 1; j < ary.length; j++) {
				if (ary[i] > ary[j]) {
					sort = ary[i]; // (1) sort = 89, ary[0] = 72, ary[1] = 0
					ary[i] = ary[j]; // (2) sort = 97 , ary[2]= 13 , ary[3] = 89
					ary[j] = sort; // (3)
				}
			}

		}
		System.out.println("오름차순은: ");
		for (int a = 0; a < ary.length; a++) {
			System.out.print(ary[a] + " ");
		}
		System.out.println();
		for (int i = 0; i < ary.length; i++) {
			for (int j = i + 1; j < ary.length; j++) {
				if (ary[i] < ary[j]) {
					sort = ary[i]; // (1) sort = 89, ary[0] = 72, ary[1] = 0
					ary[i] = ary[j]; // (2) sort = 97 , ary[2]= 13 , ary[3] = 89
					ary[j] = sort; // (3)
				}
			}

		}
		System.out.println("내림차순은: ");
		for (int a = 0; a < ary.length; a++) {
			System.out.print(ary[a] + " ");
		}
	}
}

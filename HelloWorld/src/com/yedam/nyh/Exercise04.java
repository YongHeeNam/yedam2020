package com.yedam.nyh;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		while (true) {
			num1 = (int)(Math.random() *6) +1;
			num2 = (int)(Math.random() *6) +1;
			if(num1 +num2 ==5) {
				break;
			}
			System.out.println("("+ num1 + "," + num2 + ")" );
		}
	}

}

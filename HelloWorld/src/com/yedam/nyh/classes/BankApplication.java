package com.yedam.nyh.classes;

import java.util.Scanner;

public class BankApplication {
	static Account[] acntAry = new Account[10];

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("============================================");
			System.out.println("1.계좌생성|2.예금|3.출금|4.계좌목록|5.계좌조회|9.종료");
			System.out.println("============================================");
			System.out.println("선택>");
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) { // 계좌생성.
				System.out.print("계좌번호입력:");
				String ano = scn.nextLine();
				System.out.print("이름입력:");
				String owner = scn.nextLine();
				System.out.print("금액입력:");
				int balance = scn.nextInt();
				Account acnt = new Account(ano, owner, balance);
				for (int i = 0; i < acntAry.length; i++) {
					if (acntAry[i] == null) {
						acntAry[i] = acnt;
						break;
					}
				}
			} else if (selectNo == 2) {
				System.out.println("조회 계좌 입력 :");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo);
				System.out.println("금액입력:");
				int amount = scn.nextInt();
				acnt.setBalance(amount);

			} else if (selectNo == 3) {
				System.out.println("조회 계좌 입력 :");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo);
				System.out.println("출금액입력:");
				int amount = scn.nextInt();
				acnt.withdrawBalance(amount);

			} else if (selectNo == 4) { //계좌목록 조회
				for (int i = 0; i < acntAry.length; i++) {
					if (acntAry[i] != null) // 값이 있는 경우만
						System.out.println(acntAry[i]);
				}

			} else if (selectNo == 5) { //계좌조회
				System.out.println("조회 계좌 입력 :");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo);
				System.out.println(acnt);

			} else if (selectNo == 6) {
				run = false;
			}
		} // end of while
	}// end of main()

	public static Account findAccount(String acntNo) {
		Account acnt = null;
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] != null && acntNo.equals(acntAry[i].getAno())) {
				acnt = acntAry[i];
			}
		}
		return acnt;
	}
}// end of class

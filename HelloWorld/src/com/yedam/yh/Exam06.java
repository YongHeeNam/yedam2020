package com.yedam.yh;

import java.util.Scanner;

public class Exam06 {
	static Student[] stdAry = new Student[10];

public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	boolean run = true;
	
	while (run) {
		System.out.println("=============================");
		System.out.println("1.등록|2.조회|3.리스트|4.수정|5.종료");
		System.out.println("=============================");
		System.out.println("선택 > ");
		int selectNo =scn.nextInt();
		scn.nextLine();
		if (selectNo == 1) { //학생등록
		System.out.println("이름 : ");
		String name = scn.nextLine();
		System.out.println("학번 : ");
		int stuId = scn.nextInt();
		System.out.println("영어점수 : ");
		int engScore = scn.nextInt();
		System.out.println("수학점수 : ");
		int mathScore = scn.nextInt();
		
		Student std = new Student(name, stuId, engScore, mathScore);
		for(int i = 0; i<stdAry.length; i++) {
			if(stdAry[i] == null) {
				stdAry[i] = std;
				break;
			}
		}
	} else if (selectNo == 2) { // 학생조회
		System.out.println("조회 학생 이름 입력 : ");
		String name = scn.nextLine();
		Student std = findStudent(name);
		System.out.println(std);
		
	} else if (selectNo == 3) { // 리스트조회
		for (int i = 0; i<stdAry.length; i++) {
			if (stdAry[i] != null)
				System.out.println(stdAry[i]);
		}
		
	} else if (selectNo == 4) { // 수정
		System.out.println("수정 학생이름 입력 : ");
		String name = scn.nextLine();
		System.out.println("영어점수 입력 : / 미변경시(엔터)");
		String engScore = scn.nextLine();
		int eScore = 0;
		if (engScore != null && !engScore.equals(""))
			eScore = Integer.parseInt(engScore);
		System.out.println("수학점수 입력 : / 미변경시(엔터)");
		String mathScore = scn.nextLine();
		int mScore = 0;
		if (mathScore != null && !mathScore.equals(""))
			mScore = Integer.parseInt(mathScore);
		
		
		
	} else if (selectNo == 5) { //종료
		break;
	}
}
}

private static Student findStudent(String name) {
	// TODO Auto-generated method stub
	return null;
}
}

package com.yedam.yh;

public class Student {

	String name;
	int stuId;
	int engScore;
	int mathScore;
	
//생성자
	public Student(String name, int stuId, int engScore, int mathScore) {
        super();
		this.name = name;
		this.stuId = stuId;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

//get/set 메소드
	public String getName() {
		return name;
	}
	public int getStuId() {
		return stuId;
	}
	public int getEngScore() {
		return engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

// 필요한 메소드 정의
	@Override
	public String toString() {
		return "Student [name=" + name + ", stuId=" + stuId + ", engScore=" + engScore + ", mathScore=" + mathScore
				+ "]";
	}

	
}

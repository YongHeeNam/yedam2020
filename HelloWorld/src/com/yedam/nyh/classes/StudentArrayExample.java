package com.yedam.nyh.classes;

public class StudentArrayExample {
	public static void main(String[] args) {
	
		Student[] stdAry = new Student[3]; //참조유형의 데이터Type
		
		
		Student sn = new Student ("choi",20,180,70);
		
		Student stnt = new Student(); //student class의 인스턴스
		stnt.setName("hong");
		stnt.setAge(20);
		stnt.setHeight(170);
		stnt.setWeight(65);
		
		
		Student snt = new Student();
		snt.setName("park");
		snt.setAge(43);
		snt.setHeight(178);
		snt.setWeight(70);
		
		
		stdAry[0] = sn;
		stdAry[1] = snt;
		stdAry[2] = stnt;
		
		stdAry[0] = stdAry[1];
		stdAry[1] = stdAry[2];
		stdAry[2] = stdAry[0];
		
		for(int i=0; i<stdAry.length; i++) {
//			if(stdAry[i].getName.equals("choi"))
			System.out.println(stdAry[i].getName() + "  " + stdAry[i].getAge());
		}
		
		
		
	}
	}

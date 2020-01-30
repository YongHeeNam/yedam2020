package classes;

public class PeopleExample {
	public static void main(String[] args) {
		
	People pp = new People ("김또깡",33,"male",178,73,110011);
	System.out.println(pp.name);
	System.out.println(pp.age);
	System.out.println(pp.sex);
	System.out.println(pp.height);
	System.out.println(pp.weight);
	System.out.println(pp.phno);
	
	System.out.println();
	
	People ppl = new People();
	ppl.name = "Nam";
	ppl.age = 28;
	ppl.sex = "male";
	ppl.height = 170;
	ppl.weight = 60;
	ppl.phno = 1041316559;
	System.out.println(ppl.name);
	System.out.println(ppl.age);
	System.out.println(ppl.sex);
	System.out.println(ppl.height);
	System.out.println(ppl.weight);
	System.out.println(ppl.phno);
	ppl.book();
	ppl.music();
	System.out.println(ppl.getOld());
	
	System.out.println();
	
	ppl.name = "Kim";
	ppl.age = 30;
	ppl.sex = "female";
	ppl.height = 180;
	ppl.weight = 73;
	ppl.phno = 1029803559;
	System.out.println(ppl.name);
	System.out.println(ppl.age);
	System.out.println(ppl.sex);
	System.out.println(ppl.height);
	System.out.println(ppl.weight);
	System.out.println(ppl.phno);
	ppl.jogging();
	ppl.movie();
	System.out.println(ppl.getOld());
}
}

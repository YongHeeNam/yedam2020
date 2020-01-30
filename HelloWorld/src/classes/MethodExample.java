package classes;

public class MethodExample {
	public static void main(String[] args) {
		Method m = new Method(); // m -> leftfield, rightfield
		m.setLeftField(30); //메소드 m.leftField => 30
		m.setRightField(4); //메소드m.rightField => 4
		int result = m.thisSum() // 30 +4 
				+ m.thisMinus(); //30-4
		int result2 = m.sum(20, 10) * m.minus(30, 25); // 필드랑 상관없이 매개값을 받는다
		m.setLeftField(100);
		System.out.println("1필드의 계산결과 : " + result);
		System.out.println("1두매개값의 계산결과 : " + result2);
		
		m.setLeftField(100); // m.leftField => 100
		m.setRightField(50); // m.rightFiedl => 50
		result = m.thisSum() + m.thisMinus();
		result2 = m.sum(20, 10) * m.minus(30, 25);
		System.out.println("2필드의 계산결과 : " + result);
		
		m = null; // 
		System.out.println(m.getLeftField());
	}
}

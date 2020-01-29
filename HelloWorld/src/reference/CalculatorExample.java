package reference;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		print(5, "&&&");
		printstar();
	}
	public static void print (int a, String str) {
		for (int i = 0; i <a; i++)
			System.out.println(str);
	}
	public static void printstar() {
		for (int i = 0; i < 5; i ++) {
			for (int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
		
		
//		int num1 = 10;
//		int num2 = 20;
//		sum(num1, num2);
//		minus(num1, num2);
//		multi(55, 3);
//		divide(7,3);
//	}
	
	public static void sum(int a, int b ) {
		int result = a +b;
		System.out.println("두수의 합은: " + result);
	}
	public static void minus(int x, int y) {
		int result = x - y;
		System.out.println("두수의 차이는: " + result);
	}
	public static void multi (int v, int b) {
		int result = v * b;
		System.out.println("두수의 곱은: "+ result);
	}
	public static void divide(int w, int e) {
		double result = (double) w / e;
		System.out.println("나눈 결과는 :" + result);
	}
}

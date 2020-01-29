package reference;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		print(5, "&&&");
		printstar(5, "+");
		sum(1, 2);
		int r = sum2(1, 2);
		System.out.println("r의 값은: " +r);
		String nyh = welcome("박규림");
		System.out.println(nyh);
	}
	
	public static int sum2(int a, int b) {
		int result;
		result = a + b;
		return result ;
	}
	public static String welcome(String name) {
		return "Hello " + name;
	}
	
	public static void print (int a, String str) {
		for (int i = 0; i <a; i++)
			System.out.println(str);
	}
	public static void printstar(int k, String str) {
		for (int i = 0; i < k; i ++) {
			for (int j = 0; j <= i; j++)
				System.out.print(str);
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

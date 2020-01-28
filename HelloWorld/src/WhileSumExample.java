
public class WhileSumExample {
	public static void main(String[] args) {
//		// 1~100 수중에서 짝수의 합을 구하는 while
//		int sum = 0;
//		int i = 1;
//		while (i<=100) {
//			if (i % 2 == 0)
//			sum = sum +i;
//			i++;
//		}
//		System.out.println("합계는 " + sum);
//	}
//}
		// 구구단 5단을 출력하는 프로그램 (while)
		int i =5;
		int n= 1 ;
		while (n<=9) {
			System.out.println(i + "x" + n + "=" + (i*n) );
			n++;
		}
		
	}
}
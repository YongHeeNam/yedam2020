
public class ForSumExample {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <=5; i++) {
			sum = sum +i;
			System.out.println("i: " + i + ", sum: " +sum);
		}
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
//		sum = sum + 6;
		System.out.println("합계는 :" + sum);
}
}

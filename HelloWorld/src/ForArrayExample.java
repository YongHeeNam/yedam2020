
public class ForArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) 배열크기가 100인 배열 intAry
		// (1~100 값을 담아주세요)
		int[] intAry = new int[100];
		for (int i = 0; i <= 99; i++) {
			intAry[i]= i +1;
			System.out.println("1~100의 값" + intAry[i]);
		}
		//2)배열의 홀수번째 위치에 있는 값을
		//합하는 for 구문
		int sum = 0;
		for(int i = 0; i <=99; i++) {
			if(i % 2 == 1)
				sum +=intAry[i];
		}
		System.out.println("합 : " + sum);
	}
	

}

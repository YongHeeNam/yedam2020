package reference;
import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				//작성위치
			} else if(selectNo ==2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" +i+ "]>" );
					int score = scanner.nextInt();
					scores[i] = score;
				}
				//작성위치
			} else if(selectNo ==3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]" + scores[i]);
				}
				//작성위치
			} else if(selectNo ==4) {
				int max =0;
				int sum = 0;
				double avg=0;
				for (int i = 0; i<studentNum; i++) {
					sum += scores[i];
					if (max <scores[i])
						max = scores[i];
					}
				avg = (double)sum/studentNum;
				
				System.out.println("최고점수: " +  max );
				System.out.println("평균점수: " + avg);
				//작성위치
			}else if(selectNo ==5) {
				run = false; //end of while
			}
		}
		
		System.out.println("프로그램 종료");
	}

}

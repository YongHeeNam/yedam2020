package com.yedam.nyh.referenceType;

public class GetMaxValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int max = 0;
		int[]intAry = {8, 7, 10, 5, 9};
//		for(int i=0; i < intAry.length; i++) {
//			if (max < intAry[i]) {
//				max = intAry[i];
//			}
//		}
		System.out.println("최대값은: " + getMaxValue(intAry));
		
	}
	public static int getMaxValue(int[]ary) {
		int max = 0;
		for (int i =0; i <ary.length; i++) {
			if (max < ary[i]) {
				max =ary[i];
			}
		}
		return max;
		
	}
}

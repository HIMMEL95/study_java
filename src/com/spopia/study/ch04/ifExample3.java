package com.spopia.study.ch04;

public class ifExample3 {

	public static void main(String[] args) {

		int intValue1 = 10;
		int intValue2 = 20;
		
		if (intValue1 >  intValue2) {
			System.out.println("두 변수 중 더 큰 수는 : " + intValue1);
		} else if (intValue1 < intValue2) {
			System.out.println("두 변수 중 더 큰 수는 :" + intValue2);
		} else {
			System.out.println("두 변수는 서로 같은 값입니다.");
		}
	}

}

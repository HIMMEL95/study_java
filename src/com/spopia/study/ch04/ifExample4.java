package com.spopia.study.ch04;

public class ifExample4 {

	public static void main(String[] args) {

		int intValue = 0;
		
//		if (intValue % 2 == 0)
//			System.out.println("짝수 입니다.");
//		else 
//			System.out.println("홀수 입니다.");
		
		if (intValue != 0) {
			if (intValue % 2 == 0)
				System.out.println("짝수 입니다.");
			else 
				System.out.println("홀수 입니다.");
		} else 
			System.out.println("0은 홀짝을 판단할 수 없습니다.");
	}

}

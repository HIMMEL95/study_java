package com.spopia.study.ch04;

public class ifExample6 {

	public static void main(String[] args) {

		int num1 = 7, num2 = 7, num3 = 7;
		
		if (num1 != num2 && num2 != num3 && num3 != num1) {
			if (num1 > num2 && num1 > num3)
				System.out.println("최댓값은 num1 : " + num1);
			else if (num2 > num1 && num2 > num3)
				System.out.println("최댓값은 num2 : " + num2);
			else
				System.out.println("최댓값은 num3 : " + num3);
			
			if (num1 < num2 && num1 < num3)
				System.out.println("최솟값은 num1 : " + num1);
			else if (num2 < num1 && num2 < num3)
				System.out.println("최솟값은 num2 : " + num2);
			else
				System.out.println("최솟값은 num3 : " + num3);
		} else 
			System.out.println("적어도 2개 이상의 동일한 정수가 존재 합니다. 수정해 주세요.");
		
		
//		compare_max(num1, num2, num3);
//		compare_min(num1, num2, num3);
		
	}
	
//	static void compare_max(int num1, int num2, int num3) {
//		
//		int max = 0;
//		
//		if (num1 < num2) {
//			if (num2 < num3)
//				max = num3;
//			else
//				max = num2;
//		} else if (num1 > num2){
//			if (num1 > num3)
//				max = num1;
//			else
//				max = num3;
//		} else {
//			if (num1 == num3)
//				max = num1;
//			else if (num1 > num3)
//				max = num1;
//			else
//				max = num3;				
//		}
//		 System.out.println("최댓값은 " + max  + "입니다.");
//	}
//	
//	static void compare_min(int num1, int num2, int num3) {
//		
//		int min = 0;
//		
//		if (num1 < num2) {
//			if (num1 < num3)
//				min = num1;
//			else
//				min = num3;
//		}
//		else if (num1 > num2){
//			if (num2 > num3)
//				min = num3;
//			else
//				min = num2;
//		} else {
//			if (num1 > num3)
//				min = num3;
//			else if (num1 < num3)
//				min = num1;
//			else
//				min = num1;
//		}
//		 System.out.println("최솟값은 " + min  + "입니다.");
//	}

}

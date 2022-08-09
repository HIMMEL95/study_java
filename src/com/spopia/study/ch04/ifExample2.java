package com.spopia.study.ch04;

public class ifExample2 {

	public static void main(String[] args) {
		int grade = 5;
		int price = 100000;
		
		if (grade == 1) {
			price *= 0.95;
			System.out.println("일반 등급 5% 할인적용가 : " + price);
		}
		else if (grade == 2) {
			price *= 0.9;
			System.out.println("브론즈 등급 10% 할인적용가 : " + price);
		}
		else if (grade == 3) {
			price *= 0.85;
			System.out.println("실버 등급 15% 할인적용가 : " + price);
		}
		else if (grade == 4) {
			price *= 0.8;
			System.out.println("골드 등급 20% 할인적용가 : " + price);
		}
		else {
			price *= 0.973;
			System.out.println("플래티넘 등급 2.7% 할인적용가 : " + price);
		}
	}

}

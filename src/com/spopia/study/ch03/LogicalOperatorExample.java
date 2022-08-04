package com.spopia.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {

//		&& = & : and : 논리곱 : 연산 참 + 참 = 참, 나머지 false
//		|| = | : or : 논리합 : 연산 참 + 거짓 = 참, 거짓 + 참 = 참, 참 + 참 = 참, 거짓 + 거짓 = 거짓
//		^ : 배타적 논리합 : 연산 참 + 참 = 거짓, 거짓 + 거짓 = 거짓, 참 + 거짓 = 참, 거짓 + 참 = 참
		
		int a = 65;
		
		boolean result = (a >= 65);
		System.out.println("result : " + result);

		boolean result1 = (a <= 90);
		System.out.println("result : " + result1);
		
		if (a >= 65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		if (a >= 65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		System.out.println("-----------------------------------");
		
		if (a >= 65 | a <= 90) {
			System.out.println("둘다참");
		}
		if (a >= 66 | a <= 90) {
			System.out.println("한 개만 참");
		}
		if (a >= 66 | a <= 50) {
			System.out.println("둘 다 false라서 이 글은 보이지 않아야 하는데 말이야.....");
		}
		
		if (a >= 65 || a <= 90) {
			System.out.println("둘다참");
		}
		if (a >= 66 || a <= 90) {
			System.out.println("한 개만 참");
		}
		if (a >= 66 || a <= 50) {
			System.out.println("둘 다 false라서 이 글은 보이지 않아야 하는데 말이야.....");
		}
		System.out.println("-----------------------------------");
		
//		참 + 거짓
		if (a >= 65 ^ a <= 50)
			System.out.println("참 + 거짓 = 참");
//		거짓 + 참
		if (a > 65 ^ a <= 90)
			System.out.println("거짓 + 참 = 참");
//		거짓 + 거짓
		if (a > 65 ^ a <= 50)
			System.out.println("거짓 + 거짓 = 거짓");
//		참 + 참
		if (a >= 65 ^ a <= 90)
			System.out.println("참 + 참 = 거짓");
		
	}

}

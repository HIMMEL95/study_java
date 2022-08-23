package com.spopia.study.ch06;

public class Arithmetic {
	
	int total = 0;
	
	public int sum(int a, int b) {
		total = a + b;
		return total;
	}
	
	public int minus(int a, int b) {
		if (a > b)
			total = a - b;
		else
			total = b - a;
		return total;
	}
	
	public int multi(int a, int b) {
		if (a != 0 && b != 0) {
			total = a * b;
		} else {
			System.out.println("0말고 다른 숫자를 입력하세요!!");
			total = 0;
		}
		return total;
	}
	
	public int div(int a, int b) {
		if (a != 0 && b != 0) {
			if (a > b)
				total = a / b;
			else
				total = b / a;
		} else {
			System.out.println("0말고 다른 숫자를 입력하세요!!");
			total = 0;
		}
		return total;
	}

	public int rest(int a, int b) {
		if (a != 0 && b != 0) {
			if (a > b)
				total = a % b;
			else
				total = b % a;
		} else {
			System.out.println("0말고 다른 숫자를 입력하세요!!");
			total = 0;
		}
		return total;
	}
	
	public void print(int result) {
		System.out.println("result : " + result);
	}
	
	public String sumString(String a, String b) {
		String result = a + b;
		return result;
	}
	
	public void printString(String result) {
		System.out.println("result : " + result);
	}
}

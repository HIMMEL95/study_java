package com.spopia.study.ch04;

public class MultiplicationTable {

	public static void main(String[] args) {

		//2 단 출력
		int num = 2;
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		System.out.println();
		
		//2단 부터 9단 까지 출력하는 프로그램 작성
		
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
	}
}

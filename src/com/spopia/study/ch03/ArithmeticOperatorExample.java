package com.spopia.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {

//		int 변수 v1에 초기값 5
//		int 변수 v2에 초기값 2
		
		int v1 = 5, v2 = 2;
		
		int result1 = v1 + v2;
		int result2 = v1 - v2;
		int result3 = v1 * v2;
		int result4 = v1 / v2;
		int result5 = v1 % v2;
		double result6 = v1 / v2;
		double result7 = (double) v1 / v2;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		System.out.println("result6 : " + result6);
		System.out.println("result7 : " + result7);
		
		System.out.println();
		
		double a = (double) 5/3;
		double b = (double) 5/8;
		double c = (double) 49/5;
		
		double first = a - b;
		double second = first * c;
		
		System.out.println(second);

		double w = 5;
		double x = (double) 11/6;
	    double y = (double) 12/17;
		double z = 3.25;
		
		first = z - x;
		second = first * y;
		double third = w - second;
		
		System.out.println(third);
		
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);		
		System.out.println();
		
		avg("홍길동", 60, 70 ,85, 90, 45);
		avg("박말순", 50, 75, 70, 60, 70);
		avg("고장난", 55, 60, 64, 58, 90);
		avg("도룡뇽", 80, 70, 63, 88, 78);
		
	}
	
	static void sum(int a, int b, int c) {
		System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));
	}
	
	static void avg(String name, int english, int math, int physics, int music, int athletic) {
		
		double sum = athletic + english + math + physics + music;
		double result = sum / 5;
		
		System.out.println(name + " 평균 : " + result);
	}
		
}

package com.spopia.study.ch05;

public class KoreanExample {

	public static void main(String[] args) {

		Korean korean1 = new Korean("이하늘", "123456-1234567");
		System.out.println("korean1.name : " + korean1.name);
		System.out.println("korean1.ssn : " + korean1.ssn);

		Korean korean2 = new Korean("박지성", 40);
		System.out.println("korean2.name : " + korean2.name);
		System.out.println("korean2.age : " + korean2.age);
	}
}

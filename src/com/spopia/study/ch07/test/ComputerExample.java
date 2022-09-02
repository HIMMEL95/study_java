package com.spopia.study.ch07.test;

public class ComputerExample {

	public static void main(String[] args) {
		
		System.out.println("원의 반지름 : 7");
		System.out.println();

		Calculator calculator = new Calculator();
		double total = calculator.calc(7);
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적 : " + total);
		System.out.println();
		
		Computer computer = new Computer();
		double total1 = computer.calc(7);
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적 : " + total1);
	}

}

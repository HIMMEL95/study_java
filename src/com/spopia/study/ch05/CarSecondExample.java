package com.spopia.study.ch05;

public class CarSecondExample {

	public static void main(String[] args) {

		CarSecond carSecond = new CarSecond();
		System.out.println("carSecond.name : " + carSecond.name);
		System.out.println("carSecond.cc : " + carSecond.cc);
		System.out.println("carSecond.color : " + carSecond.color);
		
		System.out.println("===============================");
		
		CarSecond carSecond2 = new CarSecond("쏘나타");
		System.out.println("carSecond2.name : " + carSecond2.name);
		System.out.println("carSecond2.cc : " + carSecond2.cc);
		System.out.println("carSecond2.color : " + carSecond2.color);
		
		System.out.println("===============================");

		CarSecond carSecond3 = new CarSecond("쏘나타", 2000);
		System.out.println("carSecond3.name : " + carSecond3.name);
		System.out.println("carSecond3.cc : " + carSecond3.cc);
		System.out.println("carSecond3.color : " + carSecond3.color);
		
		System.out.println("===============================");

		CarSecond carSecond4 = new CarSecond("그랜져", 3000, "starlight");
		System.out.println("carSecond4.name : " + carSecond4.name);
		System.out.println("carSecond4.cc : " + carSecond4.cc);
		System.out.println("carSecond4.color : " + carSecond4.color);
	
	}

}

package com.spopia.study.ch06;

public class CarExmaple {

	public static void main(String[] args) {
 
		Car abc = new Car();
//		int a = 1;
//		int c = 1;
//		
//		int[] b = new int[1];
		
		System.out.println("car.name : " + abc.name);
		System.out.println("car.name2[1] : " + abc.name2[1]);

		
		Car car = new Car();
		System.out.println("car.name : " + car.name);
		System.out.println("car.name2[1] : " + car.name2[1]);
		
		car.name = "쏘나타";
		System.out.println("차 이름 : " + car.name);
	}

}

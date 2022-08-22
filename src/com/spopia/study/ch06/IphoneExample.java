package com.spopia.study.ch06;

public class IphoneExample {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		System.out.println("Iphone.name[0]: " + iphone.name[0]); 
		System.out.println("Iphone.name[1] : " + iphone.name[1]); 
		System.out.println("Iphone.name[2] : " + iphone.name[2]); 
		System.out.println("Iphone.name[3] : " + iphone.name[3]);
		
		iphone.pr();
		
		Car car = new Car();
		
		System.out.println("car.name : " +  car.name);
	}

}

package com.spopia.study.ch07.sixth;

public class Cat extends Animal{

	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	@Override
	public void sound(String aaa) {
		System.out.println("야옹 : " + aaa);
	}
}

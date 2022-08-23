package com.spopia.study.ch05;

public class CarSecond {
	
	String color = "red";
	int cc = 1600;
	String name = "아반떼";
	
	
	// 이렇게 하는 것을 오버로드라고 한다.
	CarSecond() {
	}
	
	CarSecond(String name) {
		this.name = name;
	}
	
	CarSecond(String name, int cc) {
		this.name = name;
		this.cc = cc;
	}
	
	CarSecond(String name, int cc, String color) {
		this.name = name;
		this.cc = cc;
		this.color = color;
	}
	
}

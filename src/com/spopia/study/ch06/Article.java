package com.spopia.study.ch06;

public class Article {

	String name = "손흥민";
	int count = 1;
	boolean useNY = false;
	
	Article() {}

	Article(String name) {
		this.name = name;
	}
	
	Article(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	Article(String name, boolean useNY) {
		this.name = name;
		this.useNY = useNY;
	}
	
	Article(String name, int count, boolean useNY) {
		this.name = name;
		this.count = count;
		this.useNY = useNY;
	}
	
	void print() {
		System.out.println("name : " + name + "count : "+ count + "useNY : " + useNY);
	}
	
	static String nationality = "대한민국";
	
	static int staticTest(int a) {
		return a + 10;
	}
	
	int staticTest2 (int a) {
		return a + 2;
	}
	
	

}

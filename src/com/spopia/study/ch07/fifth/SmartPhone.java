package com.spopia.study.ch07.fifth;

public class SmartPhone extends Phone{
	
	// 생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// method
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}

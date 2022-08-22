package com.spopia.study.ch06;

public class BagExample {

	public static void main(String[] args) {

		Handbag bags = new Handbag();
		
		for (String bag : bags.name) {
			System.out.println("여성 가방 브랜드 : " + bag);
		}
	}

}

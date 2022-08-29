package com.spopia.study.ch07.fifth;

public class Example {

	public static void main(String[] args) {
		Parent parent = new Parent();
		
		int result = parent.result(15, 213, 21);
		System.out.println("result : " + result);
		
		Child child = new Child();
		int result2 = child.result(15, 213, 21);
		System.out.println("result2 : " + result2);
		
		System.out.println("result2 - resutl : " + (result2-result));
	}
}

package com.spopia.study.ch07.fifth;

public class Example {

	public static void main(String[] args) {
//		Parent parent = new Parent();
//		
//		int result = parent.result(15, 213, 21);
//		System.out.println("result : " + result);
//		
//		Child child = new Child();
//		int result2 = child.result(15, 213, 21);
//		System.out.println("result2 : " + result2);
//		
//		System.out.println("result2 - resutl : " + (result2-result));
		
		Parent parent = new Parent();
		Child child = new Child();
		
		int[] arr = {40, 10, 20};
		
		System.out.println("정렬 전 ");
		parent.printArr(arr);
		System.out.println("정렬 후 ");
		parent.SortByAsc(arr);
		parent.printArr(arr);
		
		System.out.println("부모 메서드 2 : ");
		System.out.println(parent.getSum(arr));
		System.out.println("자식 메서드 : ");
		System.out.println(child.getSum(arr));
		
		System.out.println("값 차이 ");
		System.out.println(parent.getSum(arr) - child.getSum(arr));
	}
}

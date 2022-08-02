package com.spopia.study.ch03;

public class IncreaseDecreaseOpertaorExample {

	public static void main(String[] args) {

//		++/-- 피연산자 : 다른 연산 수행전에 피연산자 1증가/감속 ++i;
//		피연산자 ++/-- : 다른 연산 수행후에 피연산자 1증가/감속 i++;
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		
//		int 변수 a,b를 선언하고 초기값으로 1을 넣어준다.
//		a 앞이 감소연산
//		b 뒤에 감소연산
//		두 변수의 결과를 출력
		
		int a = 1;
		int b = 1;
		
		--a;
		b--;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
//		int 변수 k 선언 후 초기값으로 i뒤에 증감 연산
		int k = i++;
		System.out.println("k : " + k);
		System.out.println("i : " + i);
		
		int m = ++j;
		System.out.println("m : " + m);
		System.out.println("j : " + j);
		
		int z = ++i + j++;
//		5 3 2 
		System.out.println("z : " + z);
		System.out.println("i : " + i);
		System.out.println("j : " + j);
	
	}

}

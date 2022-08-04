package com.spopia.study.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {

		String str1 = "장원영";
		String str2 = "장원영";
		String str3 = new String("장원영");
		
		boolean result1 = (str1 == str2);
		System.out.println("result1 : " + result1);

		boolean result2 = (str1 == str3);
		System.out.println("result2 : " + result2);
		
//		문자열 비교는 equals를 사용한다.
		
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		
	}

}

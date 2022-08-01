package com.spopia.study.ch02;

public class CastingExample {

	public static void main(String[] args) {

		// 강제 형변환 : casting : (원하는 형) 변수형
		
		double doubleValue = 1234567;
		System.out.println("doubleValue : " + doubleValue);
		
		double doubleValue2 = 1234567891;  // 7자리 이상인 경우에는 e로 표현됨 
		System.out.println("doubleValue2 : " + doubleValue2);
		
		// float 변수에 double 대입
		float floatValue = (float) doubleValue;
		System.out.println("floatValue : " + floatValue);
		
		// long 변수에 float 대입
		long longValue = (long) floatValue;
		System.out.println("longValue : " + longValue);
		
		// int 변수에 long 대입
		int intValue = (int) longValue;
		System.out.println("intValue : "+ intValue);
		
		// short 변수에 int 대입
		short shortValue = (short) intValue;
		System.out.println("shortValue : " + shortValue);
		
		// byte 변수에 short 대입
		byte byteValue = (byte) shortValue;
		System.out.println("byteValue : " + byteValue);
			
		// int -> string
		int intValue2 = 123;
		String stringValue = Integer.toString(intValue2);
		System.out.println("stringValue (toString) : " + stringValue);
		String stringValue2 = String.valueOf(intValue2);  // 많이 사용
		System.out.println("stringValue2 (valueOf) : " + stringValue2);
		
		// String -> int
		int intValue3 = Integer.parseInt(stringValue); // 많이 사용
		System.out.println("intValue3 (parseInt) : " + intValue3);
		int intValue4 = Integer.valueOf(stringValue2);
		System.out.println("intValue4 (valueOf) : " + intValue4);
	}

}

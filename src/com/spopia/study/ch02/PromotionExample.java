package com.spopia.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {

//		자동 타입 변환 (promotion)
//		작은 형이 큰 형으로 변환은 문제가 발생하지 않는다.
//		큰 형이 작은 형으로 변환이 되려면 문제가 생기거나 변환이 이루어져도 데이터 손실이 발생한다.
//		byte < short < int < long < float < double
		
		byte byteValue = 10;
		System.out.println("byteValue : " +  byteValue);
		
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		float floatValue = intValue;
		System.out.println("floatValue : " + floatValue);
		
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
		
//		int intValue2 = 123456789;
//		System.out.println("intValue2 : " + intValue2);
//		
//		byte byteValue2 = (byte) intValue2;
//		System.out.println("byteValue2 : " + byteValue2);
		
		int intValue3 = 200;
		System.out.println("intValue3 : " + intValue3 + " 입니다!");
		
		double doubleValue2 = intValue3;
		System.out.println("doubleValue2 : " + doubleValue2 + " 입니다!");
		
		// int에 short 대입 후 출력
		
		short var1 = 20;
		int var2 = var1;
		System.out.println("intValue : " + var2);
		
		// long에 int 대입 후 출력
		long var3 = var2;
		System.out.println("longValue : " +  var3);
		
		// float 에 long 대입 후 출력
		float var4 = var3;
		System.out.println("floatValue : " + var4);
		
		// double 에 float 대입 후 출력
		double var5 = var4;
		System.out.println("doubleValue : " + var5);
		
	}

}

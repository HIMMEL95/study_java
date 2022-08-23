package com.spopia.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {

		Arithmetic arithmetic = new Arithmetic();
		
		int result = arithmetic.sum(3, 5);
		int result1 = arithmetic.minus(7, 4);
		int result2 = arithmetic.multi(2, 5);
		int result3 = arithmetic.div(10, 5);
		int result4 = arithmetic.rest(7, 5);
		
		arithmetic.print(result);
		arithmetic.print(result1);
		arithmetic.print(result2);
		arithmetic.print(result3);
		arithmetic.print(result4);
		
		String result5 = arithmetic.sumString("Java", " & Spring");
		arithmetic.printString(result5);
		
	}

}

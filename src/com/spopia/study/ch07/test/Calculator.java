package com.spopia.study.ch07.test;

public class Calculator {

	Constants constants = new Constants();
	
	public double calc(int r) {
		
		double result = r * r * constants.PAI_1;
		return result;
	}
}

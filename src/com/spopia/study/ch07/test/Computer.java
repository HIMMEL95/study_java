package com.spopia.study.ch07.test;

public class Computer extends Calculator {
	
	@Override
	public double calc(int r) {
		
		double result = r * r * constants.PAI_2;
		return result;
	}

}

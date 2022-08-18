package com.spopia.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {

		Week abc;
		Week xyz;
		
//		abc = 1;
//		abc = "absdfsd";
//		abc = 1.1;
		abc = Week.MONDAY;
		
		System.out.println("Week.FRIDAY : " + Week.FRIDAY);
		System.out.println("abc : " + abc);
		
//		String name = abc;
		String name = abc.name();
		System.out.println("abc.name() : " + name);
		
		int ordinal = abc.ordinal();
		System.out.println("abc.ordinal() : " + ordinal);
		
		xyz = Week.THURSDAY;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		Week[] days = Week.values();
		int index = 0;
		for (Week day: days) {
			System.out.println(index + " : day : " + day);
			System.out.println(day.ordinal() + " : day : " + day);
			index++;
		}
	}

}

package com.spopia.study.ch06;

public class Hyundai {

	public static void main(String[] args) {

		HyundaiMotor hyundaiMotors = new HyundaiMotor();
		
		for (int i=0; i<hyundaiMotors.name.length; i++) {
			System.out.println("hyundaiMotors.name["+ i + "] : " + hyundaiMotors.name[i]);
		}
	}

}

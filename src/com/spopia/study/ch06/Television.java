package com.spopia.study.ch06;

public class Television {

	public static String company = "Samsung";
	public static String model = "QLED";
	public static String info;
	
	public String version = "1.0";
	
	static {
		info = company + " " + model;
	}
}

package com.spopia.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {
		
		// 명시적 생성자를 사용하여 객체를 생성하고 
		// 모든 필드를 츨력하시오
		Student student = new Student("이하늘", "951008-1234567", 23);
		student.print();
		
		Student student2 = new Student("박지성", "930507-2345678");
		student2.print();
	}

}

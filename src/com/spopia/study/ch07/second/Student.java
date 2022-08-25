package com.spopia.study.ch07.second;

public class Student extends People{
	
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);  // super() 부모의 생성자를 의미, 기본생성자
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	
	public Student() {
		super();
	}
	
	void print() {
		System.out.println("이름 : " + name + ", ssn : " + ssn + ", studentNo : " + studentNo);
	}
}

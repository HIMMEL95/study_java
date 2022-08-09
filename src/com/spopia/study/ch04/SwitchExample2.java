package com.spopia.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {
		
		int grade = 3, cost = 12000;
		double salesCost = 0.0;
		
		switch(grade) {
			case 1:
				salesCost = cost * (1 - 0.05);
				System.out.println("읿반 등급은 정가인 " + cost + " 에서 5% 할인 적용되어서 " + (int) salesCost + "원 입니다.");
				break;
			case 2:
				salesCost = cost * (1 - 0.1);
				System.out.println("브론즈 등급은 정가인 " + cost + " 에서 10% 할인 적용되어서 " + (int) salesCost + "원 입니다.");
				break;
			case 3:
				salesCost = cost * (1 - 0.15);
				System.out.println("실버 등급은 정가인 " + cost + " 에서 15% 할인 적용되어서 " + (int) salesCost + "원 입니다.");
				break;
			case 4:
				salesCost = cost * (1 - 0.2);
				System.out.println("골드 등급은 정가인 " + cost + " 에서 20% 할인 적용되어서 " + (int) salesCost + "원 입니다.");
				break;
			case 5:
				salesCost = cost * (1 - 0.027);
				System.out.println("플래티넘 등급은 정가인 " + cost + "에서  2.7% 할인 적용되어서 " + (int) salesCost + "원 입니다.");
				break;
			default:
				System.out.println("해당하는 등급이 없습니다. 다시 입력하세요.");
				break;
		}
	}

}

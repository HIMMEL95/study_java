package com.spopia.study.ch04;

public class ifExample5 {

	public static void main(String[] args) {

		int a = 0, b = 1;
		
		if (a > 0 && b > 0) 
			System.out.println("제 1사분면 입니다.");
		else if (a > 0 && b < 0)
			System.out.println("제 4사분면 입니다.");
		else if (a < 0 && b > 0)
			System.out.println("제 2사분면 입니다.");
		else if (a < 0 && b < 0) 
			System.out.println("제 3사분면 입니다.");
		else {
			if (a == 0 && b != 0)
				System.out.println("x축 위에 있습니다.");
			else if (b == 0 && a != 0)
				System.out.println("y축 위에 있습니다.");
			else 
				System.out.println("원점 입니다.");
		}
	}

}

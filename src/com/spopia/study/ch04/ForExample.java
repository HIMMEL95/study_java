package com.spopia.study.ch04;

public class ForExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == 2 || i == 3 || i == 4) {
					if (j == 1 || j == 10) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == 10) {
					if (j == 10) {
						System.out.print(0);
					} else if (j % 2 == 0) {
						System.out.print(" ");
					} else {
						System.out.print(j);
					}
				} else {
					System.out.print(j);
					if(i == j) {
						break;
					}
				}
			}
			System.out.println();
		}
	}

}

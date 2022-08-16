package com.spopia.study.ch04;

import java.util.Random;

public class RandomSum2 {

	public static void main(String[] args) {
		
		int sum = 0, min = 0, max = 0;
		
		Random rand = new Random();
		
		// int random = (int) ((Math.random() * (100 - 1)) + 1);
		
		int random1 = rand.nextInt(100);
		int random2 = rand.nextInt(100);

		if (random1 > random2) {
			max = random1;
			min = random2;
		} else if (random1 < random2) {
			max = random2;
			min = random1;
		} else {
			System.out.println("서로 같은 수가 나왔습니다. 종료합니다.");
			max = random2;
			min = random1;
//			return ;
		}
		
		System.out.println("min : " + min + ", max : " + max);
		
		for (int i = min; i <= max; i++) {
			sum += i;
			System.out.println(i + " : " + sum);
		}
		
		System.out.println("total : " + sum);
	}
}
package com.spopia.study.ch05;

import java.util.Arrays;
import java.util.Random;

public class lotto {

	public static void main(String[] args) {

		int[] nums = new int[6];
		Random rand = new Random();
		
		for (int i=0; i<6; i++) {
			int num = rand.nextInt(45);
			for (int j=0; j<i; j++) {
				if (nums[i] == nums[j])
					continue;
				else {
					nums[i] = rand.nextInt(45);
				}
			}
		}
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
	}

}

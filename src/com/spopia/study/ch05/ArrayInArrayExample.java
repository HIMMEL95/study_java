package com.spopia.study.ch05;

import java.util.Arrays;

public class ArrayInArrayExample {

	public static void main(String[] args) {

		int[][] scores = {{99, 88, 55}, {55, 77, 66}, {55, 55, 44}, {55, 55, 44}, {55, 55, 77}};
		
//		System.out.println("scores[1][1] : " + scores[1][1]);
//		System.out.println("scores[2][2] : " + scores[2][2]);
//		System.out.println("scores[4][0] : " + scores[4][0]);
		
		String[] name = {"한찬구", "장동건", "고소영", "박태환", "싸이"};
		String[] subject = {"국어", "영어", "수학"};
		
		
		for (int i=0; i<scores.length; i++) {
			int sum = 0;
			for (int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
			}
			System.out.println(name[i] + "의 평균 점수는 : " + ((double)sum/scores[i].length));
		}
		
		System.out.println("=====================");
		
		for (int j=0; j<scores[0].length; j++) {
			int sum = 0;
			for (int i=0; i<scores.length; i++) {
				sum += scores[i][j];
			}
			System.out.println(subject[j] + "과목의 평균 점수는 : " + ((double)sum/scores.length));
		}
		
		System.out.println(Arrays.deepToString(scores));
		
		int[] temp = new int[3];
		
		for (int i=0; i<scores.length/2;i++) {
			temp = scores[i];
			scores[i] = scores[scores.length-i-1];
			scores[scores.length-i-1] = temp;
		}
		
		int temp1 = 0;
		
		for (int i=0; i<scores.length; i++) {
			for (int j=0; j<scores[i].length/2; j++) {
				temp1 = scores[i][j];
				scores[i][j] = scores[i][scores[i].length-j-1];
				scores[i][scores[i].length-j-1] = temp1;
			}
		}
		
		System.out.println(Arrays.deepToString(scores));
	}

}

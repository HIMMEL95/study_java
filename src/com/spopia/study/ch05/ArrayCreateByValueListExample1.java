package com.spopia.study.ch05;


public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

		int[] scoreEnglish;
		int scoreMath[];
		
		int[] scoreChemistry = {88, 99, 45, 86, 34};
		
		String[] name = {"장원영", "장동건", "고소영"};
		
		System.out.println("명지님 화학성적 : " + scoreChemistry[0]);
		
		System.out.println("누굴까 : " + name[1]);
		
		double sum = 0, avg = 0;
		
		for (int i=0; i<scoreChemistry.length; i++) {
			sum += scoreChemistry[i];
		}
		
		avg = sum / 5;
		
		System.out.println("총점은 : " + sum + ", 평점은 : " + avg);
	}
}
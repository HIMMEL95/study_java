package com.spopia.study.ch07.fifth;

public class Parent {
	
	int sum;
	int[] lists = new int[3];
	
	void sort(int a, int b, int c) {
		lists[0] = a;
		lists[1] = b;
		lists[2] = c;
		
		int temp = 0;
		
		for(int i=0; i<lists.length; i++) {
			for (int j=i+1; j<lists.length; j++) {
				if (lists[i] > lists[j]) {
					temp = lists[i];
					lists[i] = lists[j];
					lists[j] = temp;
				}
			}
		}
	}
	
	int result(int a, int b, int c) {
		sort(a, b, c);
		
		a = lists[0];
		b = lists[1];
		c = lists[2];
		
		sum = (a*b) + c;
		return sum;
	}
}

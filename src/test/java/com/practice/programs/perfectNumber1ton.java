package com.practice.programs;

public class perfectNumber1ton {

	public static void main(String[] args) {

		int n = 100;
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
if(sum==i) {
	System.out.println(i);
}
		}
		
	}
}

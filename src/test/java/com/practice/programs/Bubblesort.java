package com.practice.programs;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int a[] = { 74, 4, 88, 1, 5 };
		for (int j = 0; j < a.length - 1; j++) 
		{
			for (int i = 0; i < a.length - 1; i++) 
			{

				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
				System.out.println(Arrays.toString(a));

			}

		}
	}
}

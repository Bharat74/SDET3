package com.practice.programs;

public class primeNumber1ton {

	public static void main(String[] args) {
		
		int n=100;
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if (i%j==0)
				{
					count++;
				}
			}
			if(count==2) {
				System.out.println(i+"primenumber");
			}
			else
			{
				System.out.println(i+"not primenumber");
			}
		}

	}

}

package com.practice.programs;

public class primeNumber {

	public static void main(String[] args) {
		int  num=7,count=0;
		for(int i=1;i<=7;i++)
		{
			if(num%i==0) {
				count++;
			}
		}
		if(count==2)
System.out.println("is prime number");
		else
		
			System.out.println("not peime number");
		
	}

}

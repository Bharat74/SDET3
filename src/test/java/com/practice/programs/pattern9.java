package com.practice.programs;

public class pattern9 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
				
			{
				//if(i==j || i+j==6)
					//if(i==3 || j==3)
				      if(i==1 || i==5 || j==1 || j==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");

	}
	}
}

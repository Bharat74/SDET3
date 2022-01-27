package com.practice.programs;

public class pattern4 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==3 && j==3)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}

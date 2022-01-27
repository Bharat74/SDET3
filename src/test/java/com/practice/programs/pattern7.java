package com.practice.programs;

public class pattern7 {

	public static void main(String[] args) {
		for(int i=4;i>=1;i--)  
		//	for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			//	for(int j=4;j>=1;j--)
			{
				if(i>=j)
					System.out.print("#");
				else
					System.out.print("");
			}
			System.out.println(" ");
		}
	}

}

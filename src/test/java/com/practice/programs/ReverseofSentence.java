package com.practice.programs;

public class ReverseofSentence {

	public static void main(String[] args) 
	{
		String s1="Testyantra Software Solution";
		String s2[] =s1.split(" ");
		for(int i=s1.length()-1;i>0;i--)
		{
			System.out.println(s2[i]+" ");
		}
		

	}

}

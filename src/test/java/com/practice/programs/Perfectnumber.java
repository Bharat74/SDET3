package com.practice.programs;

public class Perfectnumber {

	public static void main(String[] args) {
		int num=6,sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
if(sum==num)
{
	System.out.println(sum+"perfect");
}
else
{
	System.out.println(sum+"notperfect");
}
	}

}

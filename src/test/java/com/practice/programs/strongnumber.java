package com.practice.programs;

public class strongnumber {

	public static void main(String[] args) {
	int num=145,lastd;
	int actual=num,result=0;
	while(num>0)
	{
		lastd=num%10;
		int res=1,i=1;
		while(i<=lastd)
		{
			res=res*i;
			i++;
		}
		result=result+res;
		num=num/10;
		
	}
	if(actual==result)
	{
		System.out.println(actual+"is strongNumber");
	}
	else
	{
		System.out.println(actual+"is not strongNumber");
	}

	}

}

package com.practice.programs;

public class sumofnumberinaString {

	public static void main(String[] args) {
		
		String s="ty7ss7";
		
char[] c=s.toCharArray();
int sum=0;
for(int i=0;i<s.length();i++)
{
	if(Character.isDigit(c[i]))
	{
		  int a = Integer.parseInt(String.valueOf(c[i]));
		  sum=sum+a;
	}
}
System.out.println("sum of digit is:"+sum);
	}

}

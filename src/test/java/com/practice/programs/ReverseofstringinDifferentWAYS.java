package com.practice.programs;

public class ReverseofstringinDifferentWAYS {

	public static void main(String[] args) {
		
		//By using concatination 
		String s1="abcd";
		String s2=" ";
		
//		for(int i=s1.length()-1;i>=0;i--)
//		{
//			s2=s2+s1.charAt(i);
//		}
//		System.out.println("reverseof strng:"+s2);

		//By using Character Array
//		char a[]=s1.toCharArray();
//		for(int i=s1.length()-1;i>=0;i--)
//		{
//			s2=s2+a[i];
//		}
//		System.out.println("reverse of string:"+s2);
		
		//By using stringBuffer class
		StringBuffer sb=new StringBuffer(s1);
		System.out.println("revers of str:" +sb.reverse());
	}

}

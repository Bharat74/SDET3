package com.practice.programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 123, rem = 0, rev = 0, backup = num;
		while (num > 0) {
			rem = num % 10;
		num = num / 10;
		rev = rev * 10 +rem;

	}

System.out.println("original num:"+backup);
System.out.println("reverse of num:"+rev);

if(backup==rev)
	System.out.println("palindrome");
	
else
		System.out.println("non palindrome");
	}
}

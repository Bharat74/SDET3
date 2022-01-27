package com.practice.programs;

public class CountofCharacterInaString {

	public static void main(String[] args) {

		String s = "JAYA BHARAT TEJA";
         int Totalcount=s.length();
       // int remove =s.replace("T", "").length();
        int remove=s.replace("A", "").length();
        int count=Totalcount-remove;
        System.out.println("occurence of char is:"+count);
	}

}

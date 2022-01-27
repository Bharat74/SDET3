package com.practice.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringisALPHANUMERICorNOT {

	public static void main(String[] args) {

		String s = "neotesla99";
		if (s.matches("[a-zA-Z0-9]{10}")) {

			System.out.println("ALPHANUMERIC");
		} else {
			System.out.println("not aplphanumeric");
		}
 
	}

}

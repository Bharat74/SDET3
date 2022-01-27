package com.practice.programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153, arm = 0, rem = 0, backup = num;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			arm = arm + rem * rem * rem;
		}
		if (arm == backup)

			System.out.println("armstrongnumber");
		else
			System.out.println("not armstrongnumber");
	}

}

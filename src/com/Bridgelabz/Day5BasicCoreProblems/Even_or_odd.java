package com.Bridgelabz.Day5BasicCoreProblems;

import java.util.Scanner;

public class Even_or_odd {
	
	/*
	 * Check given NUmber is Even or Odd
	 */
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number n : ");
		n = scan.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Given number " + n + " is Even number");
		}else {
			System.out.println("Given number " + n + " is Odd number");
		}
	}

}

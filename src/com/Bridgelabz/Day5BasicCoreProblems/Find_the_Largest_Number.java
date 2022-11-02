package com.Bridgelabz.Day5BasicCoreProblems;

import java.util.Scanner;

public class Find_the_Largest_Number {
	/*
	 * Find the Largest Among Three Numbers
	 */

	public static void main(String[] args) {
		int a, b, c;
		int max;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Three Numbers :  \na = ");
		a = scanner.nextInt();

		System.out.print("b = ");
		b = scanner.nextInt();

		System.out.print("c = ");
		c = scanner.nextInt();

		max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println("Largest Number = " + max);
	}
}

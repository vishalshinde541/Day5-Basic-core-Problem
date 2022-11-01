package com.Bridgelabz.Day5BasicCoreProblems;

import java.util.Scanner;

public class Harmonic_number {
	/*
	 * 4. Harmonic Number a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ...
	 * + 1/N (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html). b. I/P
	 * -> The Harmonic Value N. Ensure N != 0 c. Logic -> compute 1/1 + 1/2 + 1/3 +
	 * ... + 1/N d. O/P -> Print the Nth Harmonic Value.
	 */

	public static void main(String[] args) {
		int N = 0;
		double H = 1;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the last Harmonic value \nN = ");
		N = scanner.nextInt();

		if (N == 0) {
			System.out.print("Enter Valid Harmonic Value \nN = ");
			N = scanner.nextInt();
		}

		for (double i = 2; i <= N; i++) {
			H = H + (1 / i);
		}
		System.out.println("Harmonic number for given value of N is : " + H);
	}

}

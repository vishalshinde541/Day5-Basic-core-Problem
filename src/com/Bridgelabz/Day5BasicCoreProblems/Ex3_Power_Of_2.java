package com.Bridgelabz.Day5BasicCoreProblems;

import java.util.Scanner;

/*
   3. Power of 2
      a. Desc -> This program takes a command-line argument N and prints a table of the
         powers of 2 that are less than or equal to 2^N.
      b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
      c. Logic -> repeat until i equals N.
      d. O/P -> Print the year is a Leap Year or not.
*/
public class Ex3_Power_Of_2 {
	public static void main(String[] args) {

		int powerOf2 = 1;
		int N;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of N :");
		N = scanner.nextInt();

		if (N < 0 || N > 31) {
			System.out.print("Enter power between 0 to 31 \nN= ");
			N = scanner.nextInt();
		}

		for (int i = 0; i < N; i++) {
			powerOf2 = powerOf2 * 2;
		}
		System.out.println("2^" + N + " = " + powerOf2);
	}

}

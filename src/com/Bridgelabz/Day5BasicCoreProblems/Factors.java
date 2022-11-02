package com.Bridgelabz.Day5BasicCoreProblems;

import java.util.Scanner;

public class Factors {
	/*
	 * 5. Factors 
	 *    a. Desc -> Computes the prime factorization of N using bruteforce.  
	 *    b. I/P -> Number to find the prime factors 
	 *    c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency. 
	 *    d. O/P -> Print the prime factors of number N.
	 */

	public static void main(String[] args) {
		int N;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find the Prime factors \nn=");
		N = scan.nextInt();

		System.out.println("Prime factors of " + N + " are");
		for (int i = 2; i * i <= N; i++) {
			while (N % i == 0) {
				N = N / i;
				System.out.println(i);
			}
		}

		if (N != 1) {
			System.out.println(N);
		}
	}
}

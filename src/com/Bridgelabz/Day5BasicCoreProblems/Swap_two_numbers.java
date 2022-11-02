package com.Bridgelabz.Day5BasicCoreProblems;

import java.util.Scanner;

public class Swap_two_numbers {
	
	/*
	 * Swap Two Numbers
	 */
	
	public static void main(String[] args) {
		int A, B, C;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of A");
		A = scan.nextInt();
		System.out.println("Enter the value of B");
		B = scan.nextInt();
		
		System.out.println("Value of the A & B before swaping \nA : " + A +"\nB : " + B);
		
		C = A;
		A = B;
		B = C;
		
		System.out.println("Value of the A & B After swaping \nA : " + A +"\nB : " + B);
		
	}

}

package com.Bridgelabz.Functional_Problem;

import java.util.Scanner;

public class Sum_of_three_integers_add_to_zero {
	/*
	 *  2. Sum of three Integer adds to ZERO
          a. Desc -> A program with cubic running time. Read in N integers and counts the
             number of triples that sum to exactly 0.
          b. I/P -> N number of integer, and N integer input array
          c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
          d. O/P -> One Output is number of distinct triplets as well as the second output is to
             print the distinct triplets.
	 */

	public static void main(String[] args) {
		int N;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Size of Array \nN: ");
		
		N = scan.nextInt();
		
		int[] arr = new int[N];
		System.out.println("Enter values in an Array : ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = scan.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1 ; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if (sum == 0) {
						System.out.println(arr[i]+" + "+arr[j]+" + "+arr[k]+" =0");
						count++;
					}
				}
			}
		}
		
		System.out.println("No of triplets = " + count);
	}
}

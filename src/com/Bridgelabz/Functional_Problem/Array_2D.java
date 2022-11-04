package com.Bridgelabz.Functional_Problem;

import java.util.Scanner;

public class Array_2D {
	/*
	 * 2D Array
        a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
        standard input and printing them out to standard output.
        b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
        c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
        d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
        OutputStreamWriter to print the output to the screen.
	 */
	
	public static void main(String[] args) {
		int M = 2;
		int N = 3;
		
		Scanner scan = new Scanner(System.in);
		int arr[][] = new  int[M][N];
		System.out.println("Enter values in array :");
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("arr[" + i + "][" + j + "] : ");
				arr[i][j]= scan.nextInt();
			}
		}
		
		System.out.println("Printing the Array values :");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

package com.Bridgelabz.Functional_Problem;

import java.util.Scanner;

public class Distance {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.print("Enter the value of y: ");
		int y = sc.nextInt();
		
		double d = ((x*x)+(y*y));
		
		double euclideanDistance = Math.pow(d, 0.5);
		
		System.out.println("Euclidean distance from the origin is "+ euclideanDistance);
	}

}

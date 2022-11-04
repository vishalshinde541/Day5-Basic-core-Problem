package com.Bridgelabz.Functional_Problem;

import java.util.Scanner;

public class WindChill {
	/*
	 *  5. Write a program WindChill.java that takes two double command-line arguments t
        and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
        temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
        National Weather Service defines the effective temperature (the wind chill) to be:
        Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
        than 120 or less than 3 (you may assume that the values you get are in that range).
	 */
	
	public static void main(String[] args) {
		double t, v, w;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the temprature 't' in fahrenheight \nt :");
		t = scan.nextDouble();
		
		if (t > 50) {
			System.out.print("Invalid tempratur..!!\nEnter the temp below 50 \nt :");
			t = scan.nextDouble();
		}
		
		System.out.println("Enter the speed 'v' in miles per hour \nv :");
		v = scan.nextDouble();
		
		if (v > 120 || v < 3) {
			System.out.print("Invalid Speed..!! \nEnter the speed in range of 3 to 120 \nv :");
			v = scan.nextDouble();
		}
		
		 w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
	        System.out.println("WindChill = "+w);
	}

}

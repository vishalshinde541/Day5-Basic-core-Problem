package com.Bridgelabz.Day5BasicCoreProblems;

import java.util.Scanner;

public class Ex2_Leap_Year {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year : ");
		int year = sc.nextInt();

		if (year < 1000 || year > 9999) {
			System.out.println("Invalid Input : Please enter 4 digit number as year");
		}

		else if (year % 100 != 0 && year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " is a leap year");
		}

		else {
			System.out.println(year + " is not a leap year");
		}
	}

}

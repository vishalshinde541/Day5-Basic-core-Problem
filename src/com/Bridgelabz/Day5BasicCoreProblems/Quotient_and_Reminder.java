package com.Bridgelabz.Day5BasicCoreProblems;

import java.util.Scanner;

public class Quotient_and_Reminder {
	/*
    Compute Quotient and Remainder
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the devident : ");
        int devident=scanner.nextInt();
        System.out.print("Enter the divisior : ");
        int divisior=scanner.nextInt();

        int quotient=devident/divisior;
        System.out.println("Quotient = "+quotient);

        int remainder=devident%divisior;
        System.out.println("Remainder = "+remainder);
    }

}

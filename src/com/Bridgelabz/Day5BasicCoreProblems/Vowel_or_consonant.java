package com.Bridgelabz.Day5BasicCoreProblems;

import java.util.Scanner;

public class Vowel_or_consonant {
	/*
	 * Check Whether an Alphabet is Vowel or Consonant
	 */
	
	public static void main(String[] args) {
		
		char c;
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter character : ");
		c = scan.next().charAt(0);
		
		if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			 System.out.println(c+ " is Vowel");
        }
        else {
            System.out.println(c+ " is Consonant");
        }
		
		
	}

}

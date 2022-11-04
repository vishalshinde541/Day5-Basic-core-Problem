package com.Bridgelabz.Functional_Problem;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] Strings)   {  
	
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the value of a: ");  
	double a = sc.nextDouble();  
	System.out.print("Enter the value of b: ");  
	double b = sc.nextDouble();  
	System.out.print("Enter the value of c: ");  
	double c = sc.nextDouble();  
	
	double delta= b * b - 4.0 * a * c;  
	
	if (delta > 0.0)   
	{  
	double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);  
	double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);  
	System.out.println("The roots are " + r1 + " and " + r2);  
	}   
	
	else if (delta == 0.0)   
	{  
	double r1 = -b / (2.0 * a);  
	System.out.println("The root is " + r1);  
	} 
	
	else   
	{  
	System.out.println("Roots are not real.");  
	}  
	}  

}

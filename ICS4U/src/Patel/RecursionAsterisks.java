package Patel;
/*
 * Jitesh Patel
 * September 14, 2016
 * RecursionAsterisks
 * This program gets a number from the user and outputs 2^number *s
 */
import java.util.Scanner;

public class RecursionAsterisks {
	/**
	 * This is the main method. It gets a number from the user, and calls the starString method 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int userInput=0;
		System.out.println("Please enter a number");
		
		starString(userInput=Integer.parseInt(scn.nextLine()));
		

	}
	/**
	 * This method gets a number and outputs 2^number asterisks in an organized fashion.
	 * @param double x
	 */
	public static void starString(double x){
		if (x==0)
		{			
			System.out.println("*");
			return;
		}
		starString(x-1);
		for (int i=0;i<Math.pow(2, x);i++)
			System.out.print("*");
		System.out.println();
		
	}

}

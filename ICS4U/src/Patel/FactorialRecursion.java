package Patel;
/*
 *Jitesh Patel
 * September 18, 2016
 * FactorialRecursion
 * This program gets two numbers from the user and outputs the number of permutations the two have
 * */
import java.util.Scanner;

public class FactorialRecursion {
	
	public static int counter=0;
	/**
	 * This is the main method. It gets user input, and calls the permut method
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int userInputOne=0;
		int userInputTwo=0;
		System.out.println("Please enter a number");
		userInputOne=Integer.parseInt(scn.nextLine());
		System.out.println("Please enter another number");
		userInputTwo=Integer.parseInt(scn.nextLine());
		permut(userInputOne,userInputTwo);
		//hi
		
	}
	/**
	 * This method calls the factorial method, calculates the permutations number of permutations, and then outputs them.
	 * @param int x
	 * @param int y
	 */
	public static void permut(int x, int y){
		int numberOne=xFactorial(x);
		int numberTwo=xFactorial(x-y);
		System.out.println("There are "+numberOne/numberTwo+" permutations");
	}
	/**
	 * This method gets a number and returns its factorial.
	 * @param int z
	 * @return int z
	 */
	public static int xFactorial(int z){
		if (z==1)
		{
			return z;
		}
		return z*xFactorial(z-1);
			
		
	}
	

}

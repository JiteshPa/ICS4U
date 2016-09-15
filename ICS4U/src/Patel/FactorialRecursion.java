package Patel;

import java.util.Scanner;

public class FactorialRecursion {
	
	public static int counter=0;

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int userInputOne=0;
		int userInputTwo=0;
		System.out.println("Please enter a number");
		userInputOne=Integer.parseInt(scn.nextLine());
		System.out.println("Please enter another number");
		userInputTwo=Integer.parseInt(scn.nextLine());
		permut(userInputOne,userInputTwo);
		
	}
	public static void permut(int x, int y){
		int numberOne=xFactorial(x);
		int numberTwo=xFactorial(x-y);
		System.out.println("There are "+numberOne/numberTwo+" permutations");
	}
	public static int xFactorial(int z){
		if (z==1)
		{
			return z;
		}
		return z*xFactorial(z-1);
			
		
	}
	

}

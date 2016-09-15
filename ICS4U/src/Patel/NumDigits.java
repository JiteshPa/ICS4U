package Patel;
/*
 * Jitesh Patel
 * September 13, 2016
 * NumDigits
 * This program gets a number from the user and outputs how many digits that number is made up of
 */

import java.util.Scanner;



public class NumDigits {
	//Global counter
	public static int counter=0;
	/**
	 * This is the main method. It gets a number from the user, and calls the recursive method.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		while (true){
			counter=0;
			int usersNumber=0;
			System.out.println("Please enter a number.");
			//get user input
			while (true){
				try{
					usersNumber=Integer.parseInt(scn.nextLine());
					break;
				} catch (NumberFormatException ie) {
					System.out.println("Please enter an integer");
				}
			}
			//output the number of integers
			System.out.println(usersNumber+" has "+numDigits(usersNumber)+" digit(s).");
			System.out.println("Would you like to enter another number?");
			scn.nextLine();
			String yesNo=scn.nextLine();
			//loop for playing again
			while (true){
				
				if (!yesNo.equalsIgnoreCase("Yes")&&!yesNo.equalsIgnoreCase("No")){
					System.out.println("Please enter yes or no");
					yesNo=scn.nextLine();
				}
				else
					break;
			}
			//if statement for playing again
			if (yesNo.equalsIgnoreCase("No"))
			{
				System.out.println("Okay, bye!");
				break;
			}
		}
	}
	/**
	 * This is the recursive method that figures out how many integers the users number is made up of.
	 * @param int n
	 * @return int counter
	 */
	public static int numDigits(int n){
		
		//special case
		if (n==0)
			return 1;
		//all other cases
		else{
			counter++;
			//recursion
			numDigits(n/10);
		}		
		return counter;
	}
	

}

package Patel;
/*
 * Jitesh Patel
 * September 15, 2016
 * ReverseLetters
 * This program takes in two words and checks if one is the reverse of the other
 */

import java.util.Scanner;

public class ReverseLetters {

	public static int counter=0;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter a word");
		String firstWord=scn.nextLine();
		System.out.println("Please enter another word");
		String secondWord=scn.nextLine();
		isReverse(firstWord,secondWord);
		
	}
	public static boolean isReverse(String x, String y){
		while (true){
			if (x.charAt(counter)!= (y.charAt((y.length())-counter))){
				return false;
			}
			else{
				counter++;
				
			}
		}
			
		
	}
	public static void charCheck(char x, char y){
		
	}
	

}

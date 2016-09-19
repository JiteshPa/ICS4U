package Patel;
/*
 *Jitesh Patel
 * September 19, 2016
 * PalidromeTester
 * This program takes a word from the user and checks if it's a palidrome
 * */
import java.util.Scanner;

public class PalidromeTester {
	
	public static int counter=0;
	public static String word;
	/**
	 * This is the main method. It gets a word from the user and checks if it's a palidrome
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter a String.");
		word=scn.next();
		String wordBackwards=reverseWord(word);
		for (int i=0;i<word.length();i++)
		{
			if (word.charAt(i)!=wordBackwards.charAt(i))
			{
				System.out.println("That string is NOT a palidrome.");
				break;
			}
			if (i==word.length()-1)
				System.out.println("That string IS a palidrome.");
		}

	}
	/**
	 * This method takes a word and reverses the order of the letters
	 * @param x
	 * @return backwards
	 */
	public static String reverseWord(String x){
		char backwards = x.charAt(x.length()-1);
		
		if(x.length() == 1) 
			return Character.toString(backwards);   

		return backwards + reverseWord(x.substring(0,x.length()-1));
	}

}

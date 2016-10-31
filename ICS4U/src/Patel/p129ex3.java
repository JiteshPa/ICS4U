package Patel;

import java.util.Scanner;

public class p129ex3  {
	public static void main (String []args){
		Scanner scn=new Scanner (System.in);
		double a=scn.nextInt();
		double x=24;
		double b;
		while (true){
			b=Math.pow(2.0, x);
			if (b<=a){

				System.out.println((int)(x));
				break;
			}
			else
				x--;
		}
			
	}
		
	
}

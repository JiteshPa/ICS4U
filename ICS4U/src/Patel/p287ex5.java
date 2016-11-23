package Patel;

import java.util.Scanner;

public class p287ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner (System.in);
		int x=scn.nextInt();
		scn.nextLine();
		for(int i=0;i<x;i++){
			String y=scn.nextLine();
			if(y.charAt(0)=='-')
				System.out.println(y.length()-1);
			else
				System.out.println(y.length());
		}

	}

}

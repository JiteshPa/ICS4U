package Patel;

import java.util.Scanner;

public class wc15fj1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String o=scn.nextLine();
		for (int i=0;i<o.length();i++)
		{
			System.out.print(o.charAt(i)+" ");
		}
		System.out.println();
		for (int i=1;i<o.length();i++)
		{
			System.out.println(o.charAt(i));
		}
	}

}

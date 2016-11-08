package Patel;

import java.util.Scanner;

public class manga {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		String[] a=new String [x];		
		double[] b=new double [x];	
		for (int i=0;i<x;i++)
		{
			a[i]=scn.next();
			b[i]=scn.nextDouble();
			scn.nextLine();
		}
		double y=0;
		for (int i=0;i<x;i++)
		{
			if (i==0){
				y=b[i];
			}
			else{
				if (b[i]>y)
					y=b[i];
			}
		}

	}
}
package Patel;

import java.util.Scanner;

public class bf3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		while (true){
			int counter=0;
			for (int i=1;i<x;i++){
				if(x%i==0){
					counter++;
				}
			}
			if (counter>1){
				x++;
			}
			else{
				break;
			}
			
		}
		System.out.println(x);
	}

}

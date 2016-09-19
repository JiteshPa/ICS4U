package Patel;
/*
 *Jitesh Patel
 * September 19, 2016
 * TowerHanoi
 * This program solves the tower of Hanoi problem for a specific number of disks
 * */

import java.util.Scanner;

public class TowerHanoi {

	/**
	 * This is the main method. It gets the number of disks from the user, and calls the solve method.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		System.out.println("How many disks are there?");
		int disks=scn.nextInt();
		System.out.println("Src is peg 1, Aux is peg 2, Dst is peg 3.");
		solve("Src", "Aux", "Dst",disks);
		

	}
	/**
	 * This method solves the tower of Hanoi problem 
	 * @param Src
	 * @param Aux
	 * @param Dst
	 * @param disks
	 */
	public static void solve(String Src,String Aux, String Dst,int disks)
	{
		if (disks==0)
			return;
		else{
			solve(Src, Dst, Aux, disks-1);
		    System.out.println("Move from "+Src+" to "+Dst);
		    solve(Aux, Src, Dst,disks-1);
		}
	}

}

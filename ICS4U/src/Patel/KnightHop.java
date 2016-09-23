package Patel;

import java.util.Scanner;

public class KnightHop {
	//public static int[][]board=new int [8][8]; 
	public static int counter=0;

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		/*for (int i=0;i>board.length;i++)
		{
			for (int j=0;j>board.length;j++)
				board[i][j]=j;
		}
		*/
		long startX=scn.nextInt();
		long startY=scn.nextInt();
		long endX=scn.nextInt();
		long endY=scn.nextInt();
		checker1(startX,startY,endX,endY);
		if (counter==0)
			checker1(startX,startY,endX,endY);
		if (counter==0)
			checker2(startX,startY,endX,endY);
		if (counter==0)
			checker3(startX,startY,endX,endY);
		if (counter==0)
			checker4(startX,startY,endX,endY);
		if (counter==0)
			checker5(startX,startY,endX,endY);
		if (counter==0)
			checker6(startX,startY,endX,endY);
		if (counter==0)
			checker7(startX,startY,endX,endY);
		if (counter==0)
			checker8(startX,startY,endX,endY);
		System.out.println(counter);

	}
	
	public static void checker1(long x, long y, long z, long w)
	{
		if (0>x||x>8||0>y||y>8)
		{
			counter=0;
			return;
		}
		if (x==z&&y==w){
			return;
		}
		else{
			counter++;
			checker1(x+2,y-1,z,w);			
		}
	}
	public static void checker2(long x, long y, long z, long w)
	{
		if (0>x||x>8||0>y||y>8)
		{
			counter=0;
			return;
		}
		if (x==z&&y==w){
			return;
		}
		else{
			counter++;
			checker2(x-2,y-1,z,w);			
		}
	}
	public static void checker3(long x, long y, long z, long w)
	{
		if (0>x||x>8||0>y||y>8)
		{
			counter=0;
			return;
		}
		if (x==z&&y==w){
			return;
		}
		else{
			counter++;
			checker3(x+2,y+1,z,w);			
		}
	}
	public static void checker4(long x, long y, long z, long w)
	{
		if (0>x||x>8||0>y||y>8)
		{
			counter=0;
			return;
		}
		if (x==z&&y==w){
			return;
		}
		else{
			counter++;
			checker4(x-2,y+1,z,w);			
		}
	}
	public static void checker5(long x, long y, long z, long w)
	{
		if (0>x||x>8||0>y||y>8)
		{
			counter=0;
			return;
		}
		if (x==z&&y==w){
			return;
		}
		else{
			counter++;
			checker5(x+1,y-2,z,w);			
		}
	}
	public static void checker6(long x, long y, long z, long w)
	{
		if (0>x||x>8||0>y||y>8)
		{
			counter=0;
			return;
		}
		if (x==z&&y==w){
			return;
		}
		else{
			counter++;
			checker6(x+1,y+2,z,w);			
		}
	}
	public static void checker7(long x, long y, long z, long w)
	{
		if (0>x||x>8||0>y||y>8)
		{
			counter=0;
			return;
		}
		if (x==z&&y==w){
			return;
		}
		else{
			counter++;
			checker7(x-1,y-2,z,w);			
		}
	}
	public static void checker8(long x, long y, long z, long w)
	{
		if (0>x||x>8||0>y||y>8)
		{
			counter=0;
			return;
		}
		if (x==z&&y==w){
			return;
		}
		else{
			counter++;
			checker8(x-1,y+2,z,w);			
		}
	}

}

package Patel;

import java.util.Scanner;

public class KnightHopTwo {

	public static int [][]dist=new int[2][8];
	public static int counter=0;
	public static int []moves=new int[8]; 
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int startX=scn.nextInt();
		int startY=scn.nextInt();
		int endX=scn.nextInt();
		int endY=scn.nextInt();
		/*for (int i=0;i<board.length;i++)
		{
			for (int j=0;j<board.length;j++)
			{
				board[i][j];
			}
		}*/
		int [] prev =new int[8];
		for (int i=0;i<dist.length;i++)
		{
			for (int j=0;j<dist.length;j++)
			{
				dist[i][j]=Integer.MAX_VALUE;
			}
		}
		if ((startX>=8&&startX<=1)&&(startY>=8&&startY<=1)&&(endX>=8&&endX<=1)&&(endY>=8&&endY<=1)){
			movePiece(startX,startY,endX,endY);
		}

	}
	public static int movePiece(int x, int y, int z, int w){
		if ((x==z)&&(y==w)){
			return counter;
		}
		else
		{
			
		}
	}
	public static boolean goodMove(int x, int y){
		 if (goodMove(x,y)){
			   dist[0][0] =x + 2;
			   dist [0][1]=y+1;
		 }

			  if (isValid(board, row + 1, col + 2))
			   points[1] = new Coordinate(row + 1, col + 2);

			  if (isValid(board, row - 1, col + 2))
			   points[2] = new Coordinate(row - 1, col + 2);

			  if (isValid(board, row - 2, col + 1))
			   points[3] = new Coordinate(row - 2, col + 1);

			  if (isValid(board, row - 2, col - 1))
			   points[4] = new Coordinate(row - 2, col - 1);

			  if (isValid(board, row - 1, col - 2))
			   points[5] = new Coordinate(row - 1, col - 2);

			  if (isValid(board, row + 1, col - 2))
			   points[6] = new Coordinate(row + 1, col - 2);

			  if (isValid(board, row + 2, col - 1))
			   points[7] = new Coordinate(row + 2, col - 1);
	}
	
}

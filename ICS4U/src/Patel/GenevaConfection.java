package Patel;

import java.util.Scanner;
import java.util.Stack;

public class GenevaConfection {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		for(int i=0;i<x;i++){
			int n=scn.nextInt();
			Stack<Integer> mountain=new Stack<Integer>();
			Stack <Integer>branch=new Stack <Integer>();
			int c=1;
			for (int j=0;j<n;j++){
				mountain.push(scn.nextInt());
			}
			while(true){
				if (mountain.isEmpty()&&branch.isEmpty())
				{
					System.out.println("Y");
					break;
				}
				else if (mountain.isEmpty()&&branch.peek()!=c){
					System.out.println("N");
					break;
				}
				
				if (!mountain.isEmpty()){
					
					if(mountain.peek()==c){
						mountain.pop();
						c++;
					}
					else{
						branch.push(mountain.pop());
					}
				}
				
				else 
				{
						if (!mountain.isEmpty()){
							if (mountain.peek()==c){
									branch.pop();
									c++;
								}
						}						
						else if(!branch.isEmpty()){
							if(branch.peek()==c) {
								branch.pop();
								c++;
							}
							else{
								branch.push(mountain.pop());
							}	
						}
							
					
				}
			}
			
		}

	}

}

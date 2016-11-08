import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] a=new int [10];
		for (int i=0;i<a.length;i++)
		{
			a[i]=i;
		}
		System.out.println("What type of search would you like to use?(Linear/Binary)");
		String x=scn.nextLine();
		if(x.equalsIgnoreCase("linear")){
			System.out.println("What type of variable will you be compareing?(String, double, int)");
			x=scn.nextLine();
		}
			
		System.out.println(Search.binary(a, scn.nextInt()));

	}

}

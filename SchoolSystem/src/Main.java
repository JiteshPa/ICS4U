import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] a= {5,7,19,24,36,42,78};
		double[] b={3.0,7.8,9.2,9.7,10.8,16.4,20.0};
		String []c={"A","B","H","K","N","O","P","S","V"};
		
		System.out.println(Search.linear(a, 8));
		System.out.println(Search.linear(b,7.8 ));
		System.out.println(Search.linear(c, "K"));
																																										
		System.out.println(Search.binary(a, 24));
		System.out.println(Search.binary(a, 36));
		System.out.println(Search.binary(a, 20));
		
		System.out.println(Search.binary(b, 9.2));
		System.out.println(Search.binary(b, 9.7));
		System.out.println(Search.binary(b, 16.4));
		
		System.out.println(Search.binary(c, "A"));
		System.out.println(Search.binary(c, "N"));
		System.out.println(Search.binary(c, "S"));
	}
																
}

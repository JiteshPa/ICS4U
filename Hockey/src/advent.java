import java.util.Scanner;

public class advent {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int [][]map=new int[1000][1000];
		String input=scn.nextLine();
		for (int i=0;i<182;i++){
			if(input.charAt(i)=='R'||input.charAt(i)=='L')
			{
				while (true){
					
					if (input.charAt(i)==','){
						break;
					}
					i++;
				}
			}
		}
		
	}

}

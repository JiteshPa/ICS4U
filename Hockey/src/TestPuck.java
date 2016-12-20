import java.util.Scanner;

public class TestPuck {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Please input the radius of the puck in inches");
		double radius=scn.nextDouble();
		System.out.println("Please input the thickness of the puck in inches");
		double thickness=scn.nextDouble();
		System.out.println("Please input the weight of the puck in ounces");
		double weight=scn.nextDouble();
		Puck hockey=new Puck(radius,thickness);
		hockey.setWeight(weight);
		
		System.out.println(hockey.getRadius());
		System.out.println(hockey.getThickness());
		System.out.println(hockey.getDivision());
		System.out.println(hockey.getWeight());
		
		Puck official=new Puck(1.5,1.0);
		
		if(hockey.equals(official)==true){
			System.out.println("This is an official puck");
		}
		else{
			System.out.println("This is not an official puck");
		}
	}

}

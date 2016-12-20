
public class Puck extends Disk {
	public Puck(double r, double t) {
		super(r, t);
	}
	
	private boolean standard;
	private boolean youth;
	private double  weight;
	private String division;
	private double thickness;
	private boolean checker;
	
	public void setThickness(double x){
		thickness=x;
	}
	public double getThickness(){
		return thickness;
	}
	public void setWeight(double x){
		weight=x;
	}
	public double getWeight(){
		return weight;
	}
	public String getDivision(){
		return setDivision(weight);
	}
	public String setDivision(double x){
		if (5<x&&x<5.5){
			standard=true;
			return "Standard";
		}
		else if (4<x&&x<4.5){
			youth=true;
			return "Youth";
		}
		else{
			checker=true;
			return "N/A";
		}
	}
	public boolean equals(Object d){
		Puck testObj=(Puck)d;
		if (testObj.getRadius()==super.getRadius()&&testObj.getThickness()==thickness&&!checker){
			return true;
		}
		else{
			return false;
		}
		
	}
	public String toString(double thickness){
		String diskString;
		diskString="The disk has a radius "+super.getRadius()+" and thickness "+thickness+".";
		return (diskString);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


public class Search {
	public static int linear(int []a, int target){
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==target)
				return i;
		}
		return -1;
	}
	public static int linear(double []a, double target){
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==target)
				return i;
		}
		return -1;
	}
	public static int linear(String []a, String target){
		for (int i=0;i<a.length;i++)
		{
			if (a[i].equals(target))
				return i;
		}
		return -1;
	}
	
	
	
	
	public static int binary(int[]a,int target){
		return(binary(a,0,a.length-1,target));
	}
	
	private static int binary(int []a,int start,int end,int target){
		if (start>end)
			return -1;
		int midpoint=(start+end)/2;
		if (target==a[midpoint])
			return midpoint;
		else if (target<a[midpoint])			
			return binary(a,start,midpoint-1,target);			
		else if (target>a[midpoint])
			return binary(a,midpoint+1,end,target);
		return -1;
	}
	
}

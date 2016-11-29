import java.util.Arrays;

/**
 * Jitesh Patel 
 * This class sorts arrays in order from least to greatest using different methods.
 * November 15, 2016
 */
public class Sort {
	/**
	 * This method takes an int array and sorts it using the insertion method
	 * 
	 * @param int[] a
	 */
	public static void insertion(int[] a) {
		int x = 0;
		int j = 0;
		for (int i = 1; i < a.length; i++) {
			x = a[i];
			if (a[i] < a[i - 1]) {
				for (j = i - 1; (j >= 0) && (a[j] > x); j--) {
					a[j + 1] = a[j];
				}
				a[j + 1] = x;
			}

		}

	}

	/**
	 * This method takes an string array and sorts it using the insertion method
	 * 
	 * @param String [] a
	 */
	public static void insertion(String[] a) {
		String x = null;
		int j = 0;
		for (int i = 1; i < a.length; i++) {
			x = a[i];
			if (a[i].compareTo(a[i - 1]) < 0) {
				for (j = i - 1; (j >= 0) && (a[j].compareTo(x) > 0); j--) {
					a[j + 1] = a[j];
				}
				a[j + 1] = x;
			}

		}

	}

	/**
	 * This method takes an double array and sorts it using the insertion method
	 * 
	 * @param double [] a
	 */
	public static void insertion(double[] a) {
		double x = 0;
		int j = 0;
		for (int i = 1; i < a.length; i++) {
			x = a[i];
			if (a[i] < a[i - 1]) {
				for (j = i - 1; (j >= 0) && (a[j] > x); j--) {
					a[j + 1] = a[j];
				}
				a[j + 1] = x;
			}

		}
	}

	/**
	 * This method takes an int array and sorts it using the selection method
	 * 
	 * @param String [] a
	 */
	public static void selection(String[] a) {
		String x = null;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
	}

	/**
	 * This method takes an int array and sorts it using the selection method
	 * 
	 * @param int [] a
	 */
	public static void selection(int[] a) {
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
	}

	/**
	 * This method takes an double array and sorts it using the selection method
	 * 
	 * @param double [] a
	 */
	public static void selection(double[] a) {
		double x = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
	}
	/**
	 * This method takes an int array and sorts it using the bubble method
	 * 
	 * @param int [] a
	 */
	public static void bubble(int[] a) {
		int x=0;
		int counter=0;
		for (int i=0;i<a.length;i++){
			for (int j=0;j<a.length-1;j++){
				counter=0;
				if(a[j+1]<a[j]){					
					x = a[j];
					a[j] = a[j+1];
					a[j+1] = x;
					counter++;
				}				
			}
		}
		if (counter==0)
			return;	
	}
	/**
	 * This method takes an double array and sorts it using the bubble method
	 * 
	 * @param double [] a
	 */
	public static void bubble(double[] a) {
		double x=0;
		int counter=0;
		for (int i=0;i<a.length;i++){
			for (int j=0;j<a.length-1;j++){
				counter=0;
				if(a[j+1]<a[j]){					
					x = a[j];
					a[j] = a[j+1];
					a[j+1] = x;
					counter++;
				}
				
			}
		}
		if (counter==0)
			return;		
	}
	/**
	 * This method takes an String array and sorts it using the bubble method
	 * 
	 * @param string [] a
	 */
	public static void bubble(String[] a) {
		String x=null;
		int counter=0;
		for (int i=0;i<a.length;i++){
			for (int j=0;j<a.length-1;j++){
				counter=0;
				if(a[j+1].compareTo(a[j])<0){					
					x = a[j];
					a[j] = a[j+1];
					a[j+1] = x;
					counter++;
				}
				
			}
		}
		if (counter==0)
			return;		
	}
	
	public static int[] merge(int []a){
		//for (int i=1;i<a.length;i=2*i){
			//for (int j=0;j<a.length-1;j=j-2*i){
				
			//}
		//}
		int[] b = Arrays.copyOfRange(a, 0, a.length/2);
		int[] c = Arrays.copyOfRange(a, b.length, a.length);
		if (a.length==1){
			return a;
		}
		else{
			merge(b);
			merge(c);	
			return merge(b,c);
		}


//			
//		
	}
	private static int[] merge(int []a,int []b){
		int x=0;
		int y=0;
		int[]c = new int[a.length+b.length];
		
		
		for (int i=1;i<b.length;i++){
		if(b[i]<b[i-1])
		{
			int temp=0;
			temp=b[i-1];
			b[i-1]=b[i];
			b[i]=temp;
		}
	}
	for (int i=1;i<a.length;i++){
		if(a[i]<a[i-1])
		{
			int temp=0;
			temp=a[i-1];
			a[i-1]=a[i];
			a[i]=temp;
		}
	}
	int counter=0;
	System.out.println(a[a.length-1]);
	System.out.println(b[b.length-1]);
	System.out.println();
	while(true)
	{
		if((x==a.length)&&(y==b.length)){
			
			break;
		}
		if (x==a.length){
			for (int i=counter;i<c.length;i++){
				
				b[y]=c[i];
				y++;
			}
			
			if (c[c.length-1]==0){
				b[b.length-1]=c[c.length-1];
			}
			
			break;
		}
		else if (y==b.length){
			for (int i=counter;i<c.length;i++){
				a[x]=c[i];
				x++;	
			}
			
			if (c[c.length-1]==0){
				a[a.length-1]=c[c.length-1];
			}
			
			break;
		}
		else if (a[x]<b[y]){
			c[counter]=a[x];
			x++;
		}
		else{
			c[counter]=b[y];
			y++;
		}
		
		counter++;	
	}
	
//	printArray(a);
//	System.out.println();
//	printArray(b);
//	System.out.println();
//	
	return c;
	}
	public static void quickSort(int []a){ 
		int pivot=a[a.length-1];		 
	}
	private static void printArray(int []x){
		for (int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
	}
	public static void partition(int []a, int pivot){
		int j=0;
		int i=-1;
		int temp=0;
		for (int k=1;k<a.length;k++){
			if (a[j]<a[k]){
				i++;
				temp=a[j];
				a[j]=a[k];
				a[k]=temp;
			}
		}	
	}
}

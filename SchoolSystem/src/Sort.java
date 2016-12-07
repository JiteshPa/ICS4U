import java.util.Arrays;

/**
 * Jitesh Patel This class sorts arrays in order from least to greatest using
 * different methods. November 15, 2016
 */
public class Sort {
	/**
	 * This method takes an int array and sorts it using the insertion method
	 * 
	 * @param int[]
	 *            a
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
	 * @param String
	 *            [] a
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
	 * @param double
	 *            [] a
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
	 * @param String
	 *            [] a
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
	 * @param int
	 *            [] a
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
	 * @param double
	 *            [] a
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
	 * @param int
	 *            [] a
	 */
	public static void bubble(int[] a) {
		int x = 0;
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				counter = 0;
				if (a[j + 1] < a[j]) {
					x = a[j];
					a[j] = a[j + 1];
					a[j + 1] = x;
					counter++;
				}
			}
		}
		if (counter == 0)
			return;
	}

	/**
	 * This method takes an double array and sorts it using the bubble method
	 * 
	 * @param double
	 *            [] a
	 */
	public static void bubble(double[] a) {
		double x = 0;
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				counter = 0;
				if (a[j + 1] < a[j]) {
					x = a[j];
					a[j] = a[j + 1];
					a[j + 1] = x;
					counter++;
				}

			}
		}
		if (counter == 0)
			return;
	}

	/**
	 * This method takes an String array and sorts it using the bubble method
	 * 
	 * @param string
	 *            [] a
	 */
	public static void bubble(String[] a) {
		String x = null;
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				counter = 0;
				if (a[j + 1].compareTo(a[j]) < 0) {
					x = a[j];
					a[j] = a[j + 1];
					a[j + 1] = x;
					counter++;
				}

			}
		}
		if (counter == 0)
			return;
	}

	private static void mergeSort(int a[], int start, int end)
	{
		if(start<end)
		{
			int mid = (end + start) / 2;
			mergeSort(a, start, mid);
			mergeSort(a, mid+1, end);
			merge(a, start, mid, end);
		}
	}

	public static int[] mergeSort(int []a)
	{
		int start = 0;
		int end = a.length-1;
		mergeSort(a, start, end);
		return a;
	}


	private static void merge(int[] a,int start, int mid, int end )
	{
		int [] c = new int[a.length];
		for (int i = 0; i < a.length; i++)
		{
			c[i] = a[i];
		}
		int count = start;
		int num = mid+1;
		int i = start;
		while (count <= mid && num <= end)
		{
			if (c[count] <= c[num]) 
			{
				a[i] =c[count];
				count++;
				
			} 
			else
			{
				a[i] = c[num];
				num++;
			}
			i++;
		}
		while (count <= mid)
		{
			a[i] = c[count];
			i++;
			count++;
		}
		while(num <= end)
		{
			a[i] = c[num];
			i++;
			num++;
		}
	}


	public static int[] quickSort(int []a)
	{	
		int i=0;
		int j=a.length-1;
		quickSort(a, i, j);
		return a;

	}

	private static void quickSort(int a[], int i, int j)
	{

		int num = partition(a, i, j);

		if (i< num - 1)
		{
			quickSort(a, i, num - 1);
		}
		if (num < j)
		{
			quickSort(a, num,j);
			
		}

	}

	private static int partition (int a[], int i, int j)
	{

		int  mid= (i+j)/2;
		int pivot = a[mid];

		while (i <= j) 
		{

			while (a[i] < pivot)
			{
				i++;
			}
			while (a[j] > pivot)
			{
				j= j-1;
			}
			if (i <= j) 
			{
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;		
				i++;
				j= j-1;
			}
		}

		return i;
	
	}

	private static void printArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}

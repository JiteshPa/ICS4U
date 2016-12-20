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
	 * This method takes a double array and sorts it using the bubble method
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
	 * This method takes a String array and sorts it using the bubble method
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
	/**
	 * This method takes a array and splits it up continuously
	 * @param a the array
	 * @param start beginning of the array
	 * @param end end of the array
	 */
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
	/**
	 * This method sets up values for merge sort
	 * @param a the unsorted array
	 * @return the sorted array
	 */
	public static int[] mergeSort(int []a)
	{
		int start = 0;
		int end = a.length-1;
		mergeSort(a, start, end);
		return a;
	}

	/**
	 * 
	 * @param a array that needs to be sorted
	 * @param start beginning of the array
	 * @param mid middle of the array
	 * @param end end of the array
	 */
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
	/**
	 * This method takes an array and splits it up continuously
	 * @param a the array
	 * @param start beginning of the array
	 * @param end end of the array
	 */
	private static void mergeSort(double a[], int start, int end)
	{
		if(start<end)
		{
			int mid = (end + start) / 2;
			mergeSort(a, start, mid);
			mergeSort(a, mid+1, end);
			merge(a, start, mid, end);
		}
	}
	/**
	 * This method sets up values for merge sort
	 * @param a the unsorted array
	 * @return the sorted array
	 */
	public static double[] mergeSort(double []a)
	{
		int start = 0;
		int end = a.length-1;
		mergeSort(a, start, end);
		return a;
	}

	/**
	 * 
	 * @param a array that needs to be sorted
	 * @param start beginning of the array
	 * @param mid middle of the array
	 * @param end end of the array
	 */
	private static void merge(double[] a,int start, int mid, int end )
	{
		double [] c = new double[a.length];
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
	/**
	 * This method takes a array and splits it up continuously
	 * @param a the array
	 * @param start beginning of the array
	 * @param end end of the array
	 */
	private static void mergeSort(String a[], int start, int end)
	{
		if(start<end)
		{
			int mid = (end + start) / 2;
			mergeSort(a, start, mid);
			mergeSort(a, mid+1, end);
			merge(a, start, mid, end);
		}
	}
	/**
	 * This method sets up values for merge sort
	 * @param a the unsorted array
	 * @return the sorted array
	 */
	public static String[] mergeSort(String []a)
	{
		int start = 0;
		int end = a.length-1;
		mergeSort(a, start, end);
		return a;
	}

	/**
	 * 
	 * @param a array that needs to be sorted
	 * @param start beginning of the array
	 * @param mid middle of the array
	 * @param end end of the array
	 */
	private static void merge(String[] a,int start, int mid, int end )
	{
		String [] c = new String[a.length];
		for (int i = 0; i < a.length; i++)
		{
			c[i] = a[i];
		}
		int count = start;
		int num = mid+1;
		int i = start;
		while (count <= mid && num <= end)
		{
			if (c[count].compareTo(c[num]) <= 0) 
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


	/**
	 * This method takes an array and gets values ready for quicksort.
	 * @param a array of ints
	 * @return int array the merged array
	 */
	public static int[] quickSort(int []a)
	{	
		int i=0;
		int j=a.length-1;
		quickSort(a, i, j);
		return a;

	}
	/**
	 * This method takes an array of ints and sorts its values recursively using a helper method
	 * @param a array of ints
	 * @param i start of the array
	 * @param j end of the array
	 */
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
	/**
	 * This method takes an array, and sorts it using the quicksort method
	 * @param a the array
	 * @param i start of the array
	 * @param j end of the array
	 * @return int location of pivot
	 */
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
	/**
	 * This method takes an array of doubles and gets values ready for quicksort.
	 * @param a array of doubles
	 * @return double array the sorted array
	 */
	public static double[] quickSort(double []a)
	{	
		int i=0;
		int j=a.length-1;
		quickSort(a, i, j);
		return a;

	}
	/**
	 * This method takes an array of doubles and sorts its values recursively using a helper method
	 * @param a array of doubles
	 * @param i start of the array
	 * @param j end of the array
	 */
	private static void quickSort(double a[], int i, int j)
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
	/**
	 * This method takes an array of doubles, and sorts it using the quicksort method
	 * @param a the array
	 * @param i start of the array
	 * @param j end of the array
	 * @return int location of pivot
	 */
	private static int partition (double a[], int i, int j)
	{

		int  mid= (i+j)/2;
		double pivot = a[mid];

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
				double temp=a[j];
				a[j]=a[i];
				a[i]=temp;		
				i++;
				j= j-1;
			}
		}

		return i;
	
	}
	/**
	 * This method takes an array of doubles and gets values ready for quicksort.
	 * @param a array of doubles
	 * @return int array the merged array
	 */
	public static String[] quickSort(String []a)
	{	
		int i=0;
		int j=a.length-1;
		quickSort(a, i, j);
		return a;

	}
	/**
	 * This method takes an array of doubles and sorts its values recursively using a helper method
	 * @param a array of doubles
	 * @param i start of the array
	 * @param j end of the array
	 */
	private static void quickSort(String a[], int i, int j)
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
	/**
	 * This method takes an array of doubles, and sorts it using the quicksort method
	 * @param a the array
	 * @param i start of the array
	 * @param j end of the array
	 * @return int location of pivot
	 */
	private static int partition (String a[], int i, int j)
	{

		int  mid= (i+j)/2;
		String pivot = a[mid];

		while (i <= j) 
		{

			while (a[i].compareTo(pivot)<0)
			{
				i++;
			}
			while (a[j].compareTo(pivot) > 0)
			{
				j= j-1;
			}
			if (i <= j) 
			{
				String temp=a[j];
				a[j]=a[i];
				a[i]=temp;		
				i++;
				j= j-1;
			}
		}

		return i;
	
	}
	/**
	 * This method takes an array and prints out every element in order
	 * @param a the array that needs to be sorted
	 */
	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

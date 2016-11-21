/**
 * Jitesh Patel This class sorts arrays in order from least to greatest using either the selection or insertion sorting methods.
 * November 15, 2016
 */
public class Sort {
	/**
	 * This method takes an int array and sorts it using the insertion method
	 * 
	 * @param int
	 *            [] a
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
	 * @param int
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
	 * @param int
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
	 * @param int
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
	 * @param int
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
	public static void bubble(int[] a) {
		int x=0;
		for (int j=a.length;0<j;j--){
			for (int i=1;i<a.length;i++){
				if(a[i]>a[i-1]){
					x = a[i];
					a[i] = a[i-1];
					a[i-1] = x;
				}
			}
		}
		
	}
	
}

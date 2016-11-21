/**
 * Jitesh Patel This class searches through arrays for specific values
 *  November 9, 2016
 */
public class Search {
	/**
	 * This method does a linear search for ints
	 * 
	 * @param a
	 *            array of ints
	 * @param target
	 *            the element that must be found
	 * @return int the index of the number in the array(-1 if it isn't in the
	 *         array)
	 */
	public static int linear(int[] a, int target) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target)
				return i;
		}
		return -1;
	}

	/**
	 * This method does a linear search for doubles
	 * 
	 * @param a
	 *            array of doubles
	 * @param target
	 *            the element that must be found
	 * @return int the index of the number in the array(-1 if it isn't in the
	 *         array)
	 */
	public static int linear(double[] a, double target) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target)
				return i;
		}
		return -1;
	}

	/**
	 * This method does a linear search for Strings
	 * 
	 * @param a
	 *            array of Strings
	 * @param target
	 *            the element that must be found
	 * @return int the index of the number in the array(-1 if it isn't in the
	 *         array)
	 */
	public static int linear(String[] a, String target) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(target))
				return i;
		}
		return -1;
	}

	/**
	 * This method sets up the binary search method for ints
	 * 
	 * @param a
	 *            array of ints
	 * @param target
	 *            the element that must be found
	 * @return int the index of the number in the array(-1 if it isn't in the
	 *         array)
	 */
	public static int binary(int[] a, int target) {
		return (binary(a, 0, a.length - 1, target));
	}

	/**
	 * This method determines the targets position in the array(int), and
	 * returns -1 if it isn't in the array.
	 * 
	 * @param a
	 *            array of ints
	 * @param start
	 *            starting index
	 * @param end
	 *            ending index
	 * @param target
	 *            target the method is searching for
	 * @return int index of the element in the array
	 */
	private static int binary(int[] a, int start, int end, int target) {
		if (start > end) {
			return -1;
		}
		int midpoint = (start + end) / 2;
		if (target == a[midpoint])
			return midpoint;
		else if (target < a[midpoint])
			return binary(a, start, midpoint - 1, target);
		else if (target > a[midpoint])
			return binary(a, midpoint + 1, end, target);
		return -1;

	}

	/**
	 * This method sets up the binary search method for doubles
	 * 
	 * @param a
	 *            array of doubles
	 * @param target
	 *            the element that must be found
	 * @return int the index of the number in the array(-1 if it isn't in the
	 *         array)
	 */
	public static int binary(double[] a, double target) {
		return (binary(a, 0, a.length - 1, target));
	}

	/**
	 * This method determines the targets position in the array(double), and
	 * returns -1 if it isn't in the array.
	 * 
	 * @param a
	 *            array of doubles
	 * @param start
	 *            starting index
	 * @param end
	 *            ending index
	 * @param target
	 *            target the method is searching for
	 * @return int index of the element in the array
	 */
	private static int binary(double[] a, int start, int end, double target) {
		if (start > end)
			return -1;

		int midpoint = (start + end) / 2;
		if (target == a[midpoint])
			return midpoint;
		else if (target < a[midpoint])
			return binary(a, start, midpoint - 1, target);
		else if (target > a[midpoint])
			return binary(a, midpoint + 1, end, target);
		return -1;

	}

	/**
	 * This method sets up the binary search method for Strings
	 * 
	 * @param a
	 *            array of Strings
	 * @param target
	 *            the element that must be found
	 * @return int the index of the number in the array(-1 if it isn't in the
	 *         array)
	 */
	public static int binary(String[] a, String target) {
		return (binary(a, 0, a.length - 1, target));
	}

	/**
	 * This method determines the targets position in the array(string), and
	 * returns -1 if it isn't in the array.
	 * 
	 * @param a
	 *            array of strings
	 * @param start
	 *            starting index
	 * @param end
	 *            ending index
	 * @param target
	 *            target the method is searching for
	 * @return int index of the element in the array
	 */
	private static int binary(String[] a, int start, int end, String target) {
		if (start > end) {
			return -1;
		}
		int midpoint = (start + end) / 2;
		if (target.compareToIgnoreCase(a[midpoint]) == 0)
			return midpoint;
		else if (target.compareToIgnoreCase(a[midpoint]) < 0)
			return binary(a, start, midpoint - 1, target);
		else if (target.compareToIgnoreCase(a[midpoint]) > 0)
			return binary(a, midpoint + 1, end, target);
		return -1;

	}

}

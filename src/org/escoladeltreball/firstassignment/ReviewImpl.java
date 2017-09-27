/**
 * 
 */
package org.escoladeltreball.firstassignment;

import java.util.Arrays;



/**
 * @author Pep Méndez
 *
 */
public final class ReviewImpl implements Review {

	public static void main(String[] args) {

		int[] v = { 2, 3, 4, 5, 3, 2, 1 };
		ReviewImpl main = new ReviewImpl();
		
		int[] values = {3, 7, 9, 10, 13, 21 };
		int[] result = main.merge(values, 11);
		System.out.println(Arrays.toString(result));
		
	}
	/**
	 * 
	 * @param values
	 *            and array of unordered integers
	 * @param n
	 *            the value to check out
	 * @return the frequency of n in values
	 */
	private int frequency(int[] values, int n) {
		int counter = 0;
		for (int value : values) {
			if (n == value) {
				counter++;
			}
		}
		return counter;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.escoladeltreball.firstassignment.Utils#frequencyPercentage(int[],
	 * int)
	 */
	@Override
	public double frequencyPercentage(int[] values, int n) {
		
		return  values.length == 0 ? 0 : ((double) frequency(values, n)) / values.length * 100;
	}
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.firstassignment.Utils#merge(int[], int)
	 */
	@Override
	public int[] merge(int[] values, int n) {
		int[] result = new int[values.length+1];
		int j = 0;
		int indexOriginal = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] <= n) {
				result[j] = values[i];
				result[j+1] = n;
				j++;
			}
			indexOriginal = i - 1;
		}
		j++;
		
		while(j < result.length) {
			result[j] = values[indexOriginal];
			indexOriginal++;
			j++;
		}		
		return result;

	}

	/*
	 * This method returns an integer matrix with row 0 holding even numbers and
	 * row 1 holding odd numbers.
	 * 
	 * NOTE: Don't waste space!!!
	 */
	@Override
	public int[][] split(int[] values) {
		return null;
	}

}

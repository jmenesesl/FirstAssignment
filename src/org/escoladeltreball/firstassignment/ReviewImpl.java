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
		return values.length == 0 ? 0 : ((double) frequency(values, n)) / values.length * 100;
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.firstassignment.Utils#merge(int[], int)
	 */
	@Override
	public int[] merge(int[] values, int n) {
		int[] merged = new int[values.length + 1];
		int i = 0;
		for (int value : values) {		
			merged[i] = value;
			i++;
		}
		merged[i++] = n;
		Arrays.sort(merged);		
		return merged;
	}

	/*
	 * This method returns an integer matrix with row 0 holding even numbers and
	 * row 1 holding odd numbers.
	 * 
	 * NOTE: Don't waste space!!!
	 */
	@Override
	public int[][] split(int[] values) {
		int[][] matrix = new int[2][];
		int evenNumbersCounter = 0, oddNumbersCounter = 0;
		int evenNumbersIndex = 0, oddNumbersIndex = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] % 2 == 0) {
				evenNumbersCounter++;
			} else {
				oddNumbersCounter++;
			}
		}
		matrix[0] = new int[evenNumbersCounter];
		matrix[1] = new int[oddNumbersCounter];
		for (int i = 0; i < values.length; i++) {
			if (values[i] % 2 == 0) {
				matrix[0][evenNumbersIndex++] = values[i];
			} else {
				matrix[1][oddNumbersIndex++] = values[i];
			}
		}		
		return matrix;
	}

}

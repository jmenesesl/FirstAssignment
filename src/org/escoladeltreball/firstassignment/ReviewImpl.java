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
		int[] result = main.merge(values, 12);
		// System.out.println(Arrays.toString(result));
		
		int[] values1 = { 1, 2, 3, 5, 7, 9, 11, 15 };
		main.split(values1);
	    
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
	 * @param values
	 *            and array of unordered integers
	 * @param n
	 *            the value to check out
	 * @return the frequency in percentage of n in values 
	 */
	@Override
	public double frequencyPercentage(int[] values, int n) {
		return  values.length == 0 ? 0 : ((double) frequency(values, n)) / values.length * 100;
	}
	

	/*
	 * @param values
	 *            and array of ordered integers
	 * @param n
	 *            the value to add
	 * @return the Array of n and values merged
	 */
	@Override
	public int[] merge(int[] values, int n) {
		int[] valuesMerged = new int[values.length+1];
		int i = 0;
		while( i < values.length && values[i] <= n) { // Se añadiran uno a uno si el numero a añadir es mayor a el resto.
			valuesMerged[i] = values[i];
			i++;
		}
		valuesMerged[i] = n;
		
		while(i < values.length) {
			valuesMerged[i + 1] = values[i];
			i++;
		}
		return valuesMerged;

	}

	/*
	 * This method returns an integer matrix with row 0 holding even numbers and
	 * row 1 holding odd numbers.
	 * 
	 * NOTE: Don't waste space!!!
	 */
	@Override
	public int[][] split(int[] values) {
		int numbersOdd = 0; // determinar cantidad de numeros pares e inpares
		int numbersEven = 0;
		int indexEven = 0; // Indices para añadir los numeros pares e inpares
		int indexOdd = 0;
		for (int i = 0; i < values.length; i++) {
			if ((values[i] % 2) == 0) {
				numbersEven++;
			} else {
				numbersOdd++;
			}
		}
//		System.out.println("pares: " + numbersEven + " Inpares: " + numbersOdd);
		int[][] splited = new int[2][]; // Creo un array de 2 x ?
			splited[0] = new int [numbersEven];
			splited[1] = new int [numbersOdd];

		for(int i = 0; i < values.length; i++) {
			if(values[i] % 2 == 0) {
				splited[0][indexEven] = values[i];
				indexEven++;
			} else {
				splited[1][indexOdd] = values[i];
				indexOdd++;
			}
		}
		return splited;
	}

}

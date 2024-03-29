package com.synechron.basics.array;

public class ArrayDemo1 {

	// Find the numbers from the array which are divisible by 3 and 7
	public static void main(String[] args) {

		int a[] = new int[50];
		// we will use it when we want to manipulate the data
		// on the basis of index.
		for (int i = 0; i < a.length; i++) {
			a[i]= (int) (Math.random()*100);
		}
		// Returns a double value with a positive sign, 
		// greater than or equal to 0.0 and less than 1.0.

		// when we want to find and print the numbers divisible by 3 and 7 in the array
		for (int i : a) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println(i + " is divisible by 3 and 7");
			}
		}
	}
}
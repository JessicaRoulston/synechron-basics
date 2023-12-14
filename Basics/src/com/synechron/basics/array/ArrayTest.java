package com.synechron.basics.array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2, 4, 6, 8, 10}; 
        int searchValue = 6;
        boolean isPresent = false; 
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println(searchValue + " is present in the array.");
        } else {
            System.out.println(searchValue + " is not present in the array.");
        }
    }

}



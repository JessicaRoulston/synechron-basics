package com.synechron.basics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Scanner ; it will help us to accept the values from the user.
		// this class is introduced from javaSE5

		// print
		System.out.println("Hello");
		// array: set of similar type of elements
		// array index ; will start with 0 and end with size -1
		// int array declaration
		// int a [] = {1,2,3,4,5}; //we can provide it via {}
		// System.out.println(a[4]);
		// array will be allocated in heap memory of system
		// stack- limited amount of memory compared to heap, all method memories
		// heap - all run time objects
		// to traverse the array
		// for each loop
		// will build the implicit condition to traverse, increment the counter
		// and directly it will assign the value to i
		// for (int i : a) {
		// System.out.println(i);

		// }

		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 1000);

		}
		for (int i : a) {

			System.out.println(i);
		}
		System.out.println("enter the value to delete from array");
		int userInput = scanner.nextInt(); // to accept the integer value
		// nextXX() : XXX name of the data type
		// 8 data types. + String

		System.out.println(userInput);
		for (int i = 0; i < a.length; i++) {

			if (a[i] == userInput) {
				System.out.println("number found and deleted");
				for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
				//i+1 => i....if i+1 (a.length) should place 0
				}
				
			
			}

		}
		for (int i : a) {
			System.out.println(i);
		}
		// delete the value
		// delete the index?
	}

}

//data structure 
//1. linear - follow a sequential way - array, linked list, stack
//2. non linear - tree, graph

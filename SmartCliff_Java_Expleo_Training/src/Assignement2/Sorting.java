/*
 * Write a program to sort the elements of an array in sequence. 
 */
package Assignement2;

import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) { // it will check 2 index sequentially
					int t = arr[j]; // make the temp variable
					arr[j] = arr[j + 1]; // swap the value which is min an high
					arr[j + 1] = t;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

/*
 * Write a program to merge two arrays into a third array. Display the values of three 
arrays.
 */
package Assignement2;

import java.util.*;

public class Merge2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[n + m];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = s.nextInt();
		}
		for (int i = 0; i < n + m; i++) {
			if (i < n)
				c[i] = a[i]; // upto last index
			else
				c[i] = b[i - n]; // when 1st array is completed 2nd array started like 
		}
		System.out.println("Merged Array");
		for (int i = 0; i < n + m; i++) {
			System.out.print(c[i] + " ");
		}
	}

}

/*
 * Write a program to find the duplicate number on a given integer array. 
 */
package Assignement2;

import java.util.*;

public class DuplicateOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		boolean[] v = new boolean[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (v[i])
				continue;
			boolean a = false;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					a = true;
					v[j] = true;
				}
			}
			if (a)
				System.out.println("Duplictae number " + arr[i]);
		}
	}

}

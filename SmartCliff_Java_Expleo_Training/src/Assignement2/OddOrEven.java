/*
 * Write a program to add even and odd numbers from 1 to 10. Store and display their 
results in two separate arrays. 
 */
package Assignement2;

import java.util.*;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] even = new int[5];
		int[] odd = new int[5];
		int a = 0, b = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {// it check odd or even
				even[a++] = i;// it will sum even number
			} else {
				odd[b++] = i;// it will sum odd number
			}
		}
		System.out.println("Even Array");
		for (int i = 0; i < 5; i++) {
			System.out.print(even[i] + " ");

		}
		System.out.println();
		System.out.println("odd Array");

		for (int i = 0; i < 5; i++) {
			System.out.print(odd[i] + " ");

		}

	}

}

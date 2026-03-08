/*
 * In a school there are Indian, NRI and Foreigners studying. Their heights are given in 
three different values. To represent their class, they need to stand in height order in 
a single line. Given three arrays X, Y, Z of different sizes M, N and O, write a 
program to merge the three arrays and make it a single sorted array. 
Sample Input: 
5 
2 7 9 15 25 
4 
5 8 13 20 
5 
2 45 3 4 3 
Sample Output: 
2 2 3 3 4 5 7 8 9 13 15 20 25 45
 */
package Assignement2;

import java.util.*;

public class Merge3Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int z = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[z];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = s.nextInt();
		}
		for (int i = 0; i < z; i++) {
			c[i] = s.nextInt();
		}
		int[] d = new int[n + m + z];
		for (int i = 0; i < n + m + z; i++) {
			if (i < n)
				d[i] = a[i];     // adding 1st array
			else if (i < n + m)
				d[i] = b[i - n];   //adding 2nd array
			else
				d[i] = c[i - n - m];  // adding 3rd array
		}
		Arrays.sort(d);
		for (int i : d) {
			System.out.println(i + " ");
		}
	}

}

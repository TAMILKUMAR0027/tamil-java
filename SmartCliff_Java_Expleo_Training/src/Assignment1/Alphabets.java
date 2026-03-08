/*
 * 
 */
package Assignment1;

import java.util.*;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = new char[26];

		for (int i = 0; i < 26; i++) {
			a[i] = (char) ('a' + i);
		}
		int n = a.length;
		for (int i = 0; i < 26; i++) {
			System.out.print(a[i] + "" + a[n - i - 1] + " ");
		}
	}

}

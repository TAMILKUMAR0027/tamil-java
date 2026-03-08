/*
 * Numbers and Alphabets has equivalent ASCII values i.e Numbers (0 to 9) equivalent 
ASCII value is 48 to 57, uppercase alphabet (A to Z) equivalent ASCII value is 65 to 90 
and lowercase alphabet (a to z) equivalent ASCII value is 97 to 120. Write a program to 
sort numbers 0 to 9, alphabets in upper and lowercase using equivalent ASCII values. 
 */
package Assignment1;

import java.util.*;

public class SortingASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		char[] a = st.toCharArray();
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}

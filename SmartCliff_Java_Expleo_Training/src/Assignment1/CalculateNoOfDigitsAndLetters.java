/*
 * Accepts a string and calculate the number of digits and letters. 
Sample I/O: 
Enter String: India became independent in 1947 
Output: 
Letters: 24, Digits: 4, Other Symbols: 4 
 */
package Assignment1;

import java.util.*;

public class CalculateNoOfDigitsAndLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		char[] a = st.toCharArray();
		int letters = 0, digits = 0, Symbol = 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] >= 'A' && a[i] <= 'Z') || (a[i] >= 'a' && a[i] <= 'z')) {
				letters++;
			} else if (a[i] - '0' >= 0 && a[i] - '0' <= 9) {
				digits++;
			} else {
				Symbol++;
			}
		}
		System.out.println("Letters : " + letters + " Digits : " + digits + " Other Symbols : " + Symbol);
	}

}

/*
 * Write a program to print sum of digits of a given number.
 */
package Assignment1;

import java.util.*;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.println(sum);
	}

}

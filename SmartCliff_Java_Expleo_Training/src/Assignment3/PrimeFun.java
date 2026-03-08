/* 
 * Write a function to find the prime numbers between 1 to 100. 
 */
package Assignment3;

import java.util.*;

public class PrimeFun {
	static boolean isprime(int i) {
		if (i <= 1)
			return false;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {  // frequently checking the it is prime or not
				return false;  // if it is not prime return false
			}
		}
		return true; // if it prime return true
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 100; i++) {
			if (isprime(i)) {
				System.out.println("Prime number : " + i);
			}
		}
	}

}

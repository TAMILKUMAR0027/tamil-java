/*
 * To speed up his composition of generating unpredictable rhythms, Aniruth wants the 
list of prime numbers available in a range of numbers. Can you help him out? Write a 
C# program to print all prime numbers in the interval [x,y] (x and y, both 
inclusive).(Use separate function to print all prime numbers in the given interval) 
Sample Input 1: 
2 
15 
Sample Output 1: 
2 3 5 7 11 13 
 
Sample Input 2: 
8 
5 
Sample Output 2: 
Provide valid input 
Sample Input 3: 
1 
10 
Sample Output 3:  
2 3 5 7 
 */
package Assignment3;

import java.util.*;

public class LowerUpperPrimeNumber {
	static boolean primefun(int i) {
		if (i <= 1)
			return false;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) { // frequently checking the it is prime or not
				return false; // if it is not prime return false
			}
		}
		return true; // if it prime return true
	}

	static void displayPrime(int n, int m) {
		for (int i = n; i <= m; i++) {
			if (primefun(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Start number ");
		int n = s.nextInt();
		System.out.println("End number ");
		int m = s.nextInt();
		if (m >= n) {
			displayPrime(n, m);
		} else {
			System.out.println("Please provide valid input");
		}
	}

}

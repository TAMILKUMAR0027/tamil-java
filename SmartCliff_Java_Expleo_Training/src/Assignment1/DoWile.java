/*
 * Write a program using do-while loop to evaluate the series 1+2+3+…..+i. 
 */
package Assignment1;

import java.util.Scanner;

public class DoWile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		} while (n >= i);
		System.out.println(sum);
	}
}


/*
 * Divisible by 7 or not
 */
package Assignment1;

import java.util.Scanner;

public class Divisibleby7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n % 7 == 0) {
			System.out.print("The number is divisor by 7");
		} else {
			System.out.println("The number is undivided");
		}
	}

}

/*
 * To check whether the given number is Armstrong number or not. 
Note: Armstrong number is 3 digit number, the sum of cubes of each digit is equal to 
the number itself. 
 */
package Assignment1;

import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int t = n, sum = 0, l = String.valueOf(n).length();
		while (t != 0) {
			int d = t % 10;
			sum += Math.pow(d, l);
			t /= 10;
		}
		if (sum == n) {
			System.out.println("This is Armstrong");
		} else {
			System.out.println("Tthis is not Armstrong");
		}
	}

}

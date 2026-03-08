/*
 * Ana planned to choose the four digit lucky number for her car. Her lucky numbers are 3, 
5 and 7. Help her to find the number, whose sum is divisible by 3 or 5 or 7. Provide a 
valid car number, Fails to provide a valid input then display that number is not a valid 
car number. 
 */
package Assignment1;

import java.util.*;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n < 1000 || n > 9999) {
			System.out.println("Not a valid car number");
			return;
		}
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
			System.out.print("Lucky Number");
		} else {
			System.out.println("Not a lucky number");
		}
	}

}

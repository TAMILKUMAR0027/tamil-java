/*
 * Calculate purchase amount to be paid after discount using if-else. Consider 10 % 
discount for the Sale amount above 1000 and 5% discount for the Sale amount less 
than 1000. 
Formula: 
Purchase Amount = price * quantity 
Discount Amount = Purchase amount * 0.10(10%) 
Paid Amount = Purchase Amount – Discount Amount 
 */
package Assignment1;

import java.util.*;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int quan = s.nextInt();
		int price = s.nextInt();
		int total = quan * price;
		int dis = 0;
		if (total >= 1000) {
			dis = (int) (total * 0.10);
		} else {
			dis = (int) (total * 0.05);

		}
		System.out.println("Total amt " + (total - dis));
	}

}

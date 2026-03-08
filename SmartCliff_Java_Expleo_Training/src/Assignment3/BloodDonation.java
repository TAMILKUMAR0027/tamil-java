/*
 * Write a function to find whether the blood donor is eligible or not for donating blood. 
The rules laid down are as follows. 
a.   Age should be above 18 yrs but not more than 55 yrs. 
b.   Weight should be more than 45kg. 
 */
package Assignment3;

import java.util.*;

public class BloodDonation {
	static void eligible(int n, int m) {
		if ((n > 18 && n <= 55) && (m > 45)) {  /// checking the eligibility for donating trhe bloood greater than 18 anfd less than 55 and weight is more 45
			System.out.println("Your are eligible for donating the blood");
		} else
			System.out.println("Your are not eligible for donating the blood");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age of donar ");
		int n = s.nextInt();
		System.out.println("Enter the weight of donor ");
		int m = s.nextInt();
		eligible(n, m);
	}

}

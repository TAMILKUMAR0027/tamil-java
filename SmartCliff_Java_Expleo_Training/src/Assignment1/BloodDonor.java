/*
 * Write a program using if statement to check whether the blood donor is eligible or not 
for donating blood. The rules laid down are as follows. 
a. Age should be above 18 yrs but less than 55 yrs. 
b. Weight should be more than 45kg. 
 */
package Assignment1;

import java.util.*;

public class BloodDonor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age ");
		int age = s.nextInt();
		System.out.println("Enter the weight ");
		int weight = s.nextInt();
		if ((age > 18 && age < 55) && (weight > 45)) {
			System.out.println("You are eligible to donate the blood");
		} else {
			System.out.println("You are not eligible");
		}
	}

}

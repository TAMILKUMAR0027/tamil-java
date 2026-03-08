/*
 * A person is elligible to vote if his/her age is greater than or equal to 18. Define a 
method to find out if he/she is elligible to vote
 */
package Assignment3;

import java.util.Scanner;

public class EligibleForVote {
	static boolean Eligible(int n) {
		if (n >= 18) {      // checking the age is eligible for vote by greater than or eqal to 18
			return true;  
		} else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (Eligible(n)) {
			System.out.println("Yes the person is eligible to vote");
		} else {
			System.out.println("no the person is no eligible to vote");
		}
	}

}

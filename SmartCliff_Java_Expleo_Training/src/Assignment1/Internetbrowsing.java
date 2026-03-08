/*
 * Write a program to calculate bill for Internet browsing. The conditions are: 
a. 1 hr 50 Rs. 
b. 1min 1 Re. 
c. 5 hrs 200 Rs.  
d. User can only browse maximum 7 hrs
 */
package Assignment1;

import java.util.*;

public class Internetbrowsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int hour = s.nextInt();
		int temp = hour;
		int min = s.nextInt();
		int t = 0;
		if (hour <= 7) {
			if (hour >= 5) {
				t += 200;
				hour = hour - 5;
				t += hour * 50;

			} else {
				t += hour * 50;
			}
		} else {
			System.out.println("Fail");
			return;
		}
		if (min != 0 && temp < 7) {
			t += min;
		} else {
			System.out.print("Fail");
			return;
		}
		System.out.println(t);
	}

}

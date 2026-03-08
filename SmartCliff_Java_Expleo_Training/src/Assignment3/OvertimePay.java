/*
 * The employees working in Sugan Factory are paid Rs.15.00 per hour if they work 
overtime for more than 40 hours. Consider that the employees do not work for 
fractional part of an hour. Write a C program to calculate overtime pay for 5 
employees.
 */
package Assignment3;

import java.util.*;

public class OvertimePay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int overtimehr = 40;
		int payment = 15;

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the hours of working for employee " + (i + 1) + " :");
			int n = s.nextInt();
			int salary = 0;
			if (n > 40) {
				salary += payment * (n - overtimehr);
				System.out.println("The salary of overtimeing employee : " + (i + 1) + " is " + salary);
			} else {
				System.out.println("The salary of overtimeing employee : " + (i + 1) + " is " + salary);

			}
		}
	}

}

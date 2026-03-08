/*
 * Write a program to get employee details, wages and number of days worked from user 
and find total salary.
 */
package Assignment1;

import java.util.Scanner;

public class Totalsalarycal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Employee Name ");
		String name = s.nextLine();
		System.out.println("Enter the employee ID");
		String id = s.next();
		s.nextLine();
		System.out.println("Enter the per day salary ");
		int salary = s.nextInt();
		System.out.println("Enter total Number days worked ");
		int totaldays = s.nextInt();
		System.out.println("Employee Details");
		System.out.println("Employee Name : " + name);
		System.out.println("Employee ID : " + id);
		System.out.println("Employee salary per day : " + salary);
		System.out.println("Total no of day workedd by Employee : " + totaldays);
		System.out.println("Employee total salary : " + (totaldays * salary));

	}

}

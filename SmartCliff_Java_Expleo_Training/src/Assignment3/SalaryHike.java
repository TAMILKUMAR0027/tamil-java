/*
 * Get the salary per month and hike from user and the write a C# program to 
calculate new salary with hike. 
Hint: The formula is Salary hike = oldSalaryPerMonth + (oldSalaryPerMonth X 
hike/100) 
 */
package Assignment3;

import java.util.*;

public class SalaryHike {
	static void calculateSalary(int salary, double hike) {
		double salryHike = salary + (salary * hike / 100); // the formula for calculaet the salary
		System.out.println(salryHike);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the salary : ");
		int salary = s.nextInt();
		System.out.println("Enter the hike amt : ");
		double hike = s.nextDouble();
		calculateSalary(salary, hike);
	}

}

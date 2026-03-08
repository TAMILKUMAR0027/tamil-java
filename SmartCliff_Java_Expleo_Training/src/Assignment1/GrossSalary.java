/*
 * To input basic salary of an employee and calculate gross salary based on the condition 
given below using if-else-if ststement: 
Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary is between 10001 to 20000: HRA = 25%, DA = 90% 
Basic Salary >= 20001 : HRA = 30%, DA = 95% 
Gross Salary=Basic Salary + HRA + DA
 */
package Assignment1;

import java.util.*;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int salary = s.nextInt();
		int HRA = 0, DA = 0;
		if (salary <= 10000) {
			HRA = (int) (salary * 0.2);
			DA = (int) (salary * 0.8);
		} else if (salary > 10000 && salary <= 20000) {
			HRA = (int) (salary * 0.25);
			DA = (int) (salary * 0.9);
		} else {
			HRA = (int) (salary * 0.3);
			DA = (int) (salary * 0.95);
		}
		System.out.print("Gross Salary " + (salary + HRA + DA));
	}

}

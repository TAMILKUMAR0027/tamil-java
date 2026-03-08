/*
 * XYZ Technologies is in the process of increment the salary of the employees. This 
increment is done based on their salary and their performance appraisal rating. 
a. If the appraisal rating is between 1 and 4, the increment is 10% of the salary. 
b.  If the appraisal rating is between 4.1 and 7, the increment is 25% of the salary. 
c. If the appraisal rating is between 7.1 and 10, the increment is 30% of the salary.  
Help them to do this, by writing a program that displays the incremented salary.  
(Use separate function to calculate the increment)  
Note   :   If either the salary is 0 or negative (or) if the appraisal rating is not in the 
range 1 to 10 (inclusive), then the output should be “Invalid Input”.  
Sample Input 1 :  
Enter the salary 80000 
Enter the appraisal rating 3 
Sample Output 1 :  
88000  
Sample Input 2 :  
Enter the salary 75000 
Enter the Performance appraisal rating 4.3 
Sample Output 2 :  
93750  
 */
package Assignment3;

import java.util.*;

public class SalaryIncrement {
	static void calculateRating(int salary, float rating) {
		if (salary <= 0 || rating < 1 || rating > 10) {
            System.out.println("Invalid Input");
            return;
        }
		if (rating >= 1 && rating <= 4) {
			System.out.println(salary + (salary * 0.10));
		} else if (rating > 4 && rating <= 7) {
			System.out.println(salary + (salary * 0.25));
		} else {
			System.out.println(salary + (salary * 0.30));
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int salary = s.nextInt();
		float rating = s.nextFloat();
		calculateRating(salary, rating);
	}

}

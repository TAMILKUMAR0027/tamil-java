/*
 * The final grade of a student in a course is calculated as 30% of the exercise’s grade and 
as 70% of the exam’s grade, only if both grades are greater than or equal to 5; 
otherwise, the final grade will be their minimum. Write a program that reads 
continuously pairs of grades (exercises and exam grades) and displays the final grade 
for each student, until the user enters a pair of grades containing the value −1. Before it 
ends, the program should display the average grade of all students in the course. The 
program should check that all given grades belong in [0,10]. 
 */
package Assignment1;
import java.util.*;
public class GradeChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int exe=s.nextInt();
		int prati=s.nextInt();
		
		if((exe>=30/2)&&(prati>=70/2)) {
			System.out.println("Grade "+(exe+prati)/10);
		}
	}

}

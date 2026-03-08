/*
 * XYZ college wants to recognize the department which has succeeded in getting the 
maximum number of placements for this academic year. The departments that have 
participated in the recruitment drive are CS, EC, ME. Help the college to find the 
department getting maximum placements. Check for all the possible output given in 
the sample snapshot.  
Note: If any input is negative, the output should be "Input is invalid". If all departments 
have equal number of placements, the output should be "None of the department has 
got the highest placement". 
(Use separate function to check the maximum placements)  
Sample Input 1: 
Enter the no of students placed in CS:90  
Enter the no of students placed in EC:45  
Enter the no of students placed in ME:70  
Sample Output 1: 
Highest placement CS 
Sample Input 2: 
Enter the no of students placed in CS:55  
Enter the no of students placed in EC:85  
Enter the no of students placed in ME:85  
Sample Output 2: 
Highest placement EC ME 
Sample Input 3: 
Enter the no of students placed in CS:0  
Enter the no of students placed in EC:0  
Enter the no of students placed in ME:0  
Sample Output 3: 
None of the department has got the highest placement 
Sample Input 4: 
Enter the no of students placed in CS:10  
Enter the no of students placed in EC: -50  
Enter the no of students placed in ME:40  
Sample Output 4: 
Input is Invalid
 */
package Assignment3;

import java.util.*;

public class HighestPlacement {
	static void Placement(int n, int m, int z) {
		if (n < 0 || m < 0 || z < 0) {
			System.out.println("Input is Invalid");
			return;
		}
		if (n == m && m == z) {
            System.out.println("None of the department has got the highest placement");
            return;
        }
		int max = Math.max(n, Math.max(m, z));
		System.out.print("Highest placement ");
		if (n == max)
			System.out.print("CS ");
		if (m == max)
			System.out.print("EC ");
		if (z == max)
			System.out.print("ME ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CS");
		int n = s.nextInt();
		System.out.println("Enter the no of students placed in EC");
		int m = s.nextInt();
		System.out.println("Enter the no of students placed in ME");
		int z = s.nextInt();
		Placement(n, m, z);
	}

}

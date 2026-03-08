/*
 * Write a program to calculate bill of a job work done as follows by using if-else 
statement. 
a. Rate of typing 3 Rs. per page 
b. Printing of 1s copy Rs. per page and later every copy 3 Rs. per page.

no proper understand

 */
package Assignment1;

import java.util.*;

public class TypingPages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of page");
		int page = s.nextInt();
		System.out.println("Enter no of copies");
		int n = s.nextInt();
		if (n == 0) {
			System.out.println(page * 3);
			return;
		} else if (page == 0) {
			System.out.println("Type some pages");
			return;
		}
		int total = (page * 3) + page * 3 * (n - 1) + page;
		System.out.print(total);

	}

}

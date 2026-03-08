/*
 * rite a program that reads an integer continuously and displays "Hello" as many times 
as the value of the integer. If the user enters a negative number, the insertion of 
integers should end and the program should display the total number of the displayed 
"Hello". 
 */
package Assignment1;

import java.util.Scanner;

public class DisplayHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while (true) {
			int n = s.nextInt();
			if (n > 0) {
				for (int i = 0; i < n; i++)
					System.out.println("Hello");
			} else {
				System.out.println("Program stopped");
				break;
			}
		}
	}

}

/*
 * Write a program to check whether the given Character is an Alphabet/ Digit /Special 
Symbol using if-else-if statement. 
 */
package Assignment1;

import java.util.*;

public class CharacterChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char a = s.next().toLowerCase().charAt(0);
		if (a >= '0' && a <= '9') {
			System.out.println("This is number");
		} else if (a >= 'a' && a <= 'z') {
			System.out.println("This is alphabet");
		} else {
			System.out.println("This is symbol");
		}
	}

}

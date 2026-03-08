/*
 * Use switch case structure to print the appropriate message to recognize the entered 
character is vowel, consonant or symbol. 
 */
package Assignment1;

import java.util.Scanner;

public class VomelOrConsonantOrSysmbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch = s.next().toLowerCase().charAt(0);
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("This is Vowel");
			break;
		default:
			if (ch >= 'a' && ch <= 'z') {
				System.out.println("This consonant");
			} else if (ch >= '0' && ch <= '9') {
				System.out.println("This is a number");
			} else {
				System.out.println("This is symbol");
			}
		}
	}

}

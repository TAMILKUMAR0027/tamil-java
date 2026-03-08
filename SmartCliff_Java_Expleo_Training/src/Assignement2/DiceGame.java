/*
 * Arun and Naveen are playing a dice game. Each one will get one chance to roll the 
dice. Dice values are recorded in two different tables. After 10 turns, the winner has 
to be decided by calculating each value recorded in each table. 
Sample Input: 
Arun Dice Choice: 5, 6, 2, 1, 2, 5, 6, 3, 4, 2  
Naveen Choice: 5, 5, 4, 3, 3, 5, 6, 2, 1, 1  
Sample Output:  
Naveen Wins!!! 
 */
package Assignement2;

import java.util.*;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int[] arun = new int[10];
		int[] naveen = new int[10];
		for (int i = 0; i < 10; i++) {
			arun[i] = s.nextInt();  // getting 10 inputs from 2 users for random dice rolling
			naveen[i] = s.nextInt();
		}
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < 10; i++) {
			sum1 += arun[i];
			sum2 += naveen[i];  // adding all the values
		}
		if (sum1 > sum2) {       //arun sum have max value then arun wins
			System.out.println("Arun wins");
		} else {
			System.out.println("Naveen wins");
		}
	}

}

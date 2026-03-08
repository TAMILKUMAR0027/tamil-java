/*
 *  There are N friends in a group. Each of them has Xi chocolates. Write a program to 
check whether they can share all of these chocolates among themselves such that 
each one of them has equal number of chocolates. 
Input: 
First line contains of a single line of input, an integer N denoting no. of friends in 
the group. 
Next line contains N space separated integers Xi denoting the no. chocolates ith 
friend has. 
Output: 
Output "Yes" if it is possible to share equally else "No" (without " "). 
Sample Input: 
3 
1 2 3 
Sample Output: 
Yes
 */
package Assignement2;

import java.util.*;

public class EqualSharing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i]; //adding all the parts
		}
		if (sum % n == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

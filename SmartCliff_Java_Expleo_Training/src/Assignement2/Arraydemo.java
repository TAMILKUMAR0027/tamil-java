/*
 * Mark enters randomly twenty five numbers from the keyboard and stores it into an 
array. He wants to search if the number is present in the array and if it is present, he 
needs to display the number of times it appears in the array.  
 */
package Assignement2;

import java.util.*;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = 25;
		int[] arr = new int[25];
		for (int i = 0; i < 25; i++) {
			arr[i] = s.nextInt();
		}
		int k = s.nextInt();
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == k)
				c++;
		}

		if (c > 0)
			System.out.println("The element is found and repeated time : " + c);
		else
			System.out.println("Item is not found");
	}

}

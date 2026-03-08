
/*Write a program to find the frequency of each element in the array 
 */
package Assignement2;

import java.util.*;

public class FrequencyOfEachElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		boolean[] visit = new boolean[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int c = 0;
			if (visit[i] == true)
				continue; // when it is already visited it skip that iteration
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					c++;
					visit[j] = true;// when we visited the element we made changes false to true like we already
									// checked the number
				}

			}
			System.out.println(arr[i] + " : " + c);
		}

	}

}

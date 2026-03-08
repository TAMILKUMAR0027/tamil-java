package Assignement2;

import java.util.Scanner;

public class FrequencyOfTennaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int[] arr = {10,10,10,10,20,20,20,20,40,40,50,50,30};;
		boolean[] visit = new boolean[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int c = 0;
			if (visit[i] == true)
				continue; // when it is already visited it skip that iteration
			for (int j = 0; j <arr.length; j++) {
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

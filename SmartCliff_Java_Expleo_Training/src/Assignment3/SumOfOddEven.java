package Assignment3;

import java.util.*;

public class SumOfOddEven {
	static void sum(int[] arr) {
		int oddsum = 0;
		int evensum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) { // checking this odd or even
				evensum += arr[i]; // when it is even it sum the even number
			} else {
				oddsum += arr[i]; // when it is odd it will sum the odd number
			}
		}
		System.out.println("Even Sum : " + evensum);
		System.out.println("Odd Sum : " + oddsum);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		sum(arr);
	}
}

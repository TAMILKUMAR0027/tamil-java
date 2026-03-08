/*
 * Consider the program that reads integers from the standard input (until it gets a 
negetive number) and puts them into an array. After that it calls processArray on the 
array, and then prints the contents of the array on standard output. 
For this question, we define a black number as any number that is divisible by 7, and 
a white number that is divisible by 8. 
Currently, processArray does not modify the array. You have to change this program 
so that any number in the array is replaced by -2 if it is a blck number, with -9 if it is 
a white number, and with -6 if it is both a black and white number. To do this, you 
have to put your code inside processArray. Do not change anything else in the 
program. 
Sample input: 
84 
13 
96 
56 -1 
Sample output: -2 
13 -9 -6
 */
package Assignement2;
import java.util.*;
public class BlackWhiteNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int[] arr=new int[100];
		int n=0;
		while(true) {
			arr[n++]=s.nextInt();
			if(arr[n-1]<0) {
				break;
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%7==0 && arr[i]%8==0) {
				arr[i]=-6;  // if num is divide by 7 and 8 then store -6
			}else if(arr[i]%7==0) {
				arr[i]=-2;   // if num is divide by 7 then store -2
			}else if(arr[i]%8==0) {
				arr[i]=-9; // if num is divide by 8 then store -9
			}
			// else then store only same number
		}
		for(int i=0;i<n-1;i++) {
			System.out.println(arr[i]);
		}
	}

}

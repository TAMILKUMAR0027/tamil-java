/*
 * Write a program to check whether a specific element is present in this Array or not. 
Input:  
arr[] = [5, 1, 1, 9, 7, 2, 6, 10], key = 7 
Output:  
true 
Input:  
arr[] = [-1, 1, 5, 8], key = -2 
Output:  
false 

 */
package Assignement2;
import java.util.*;
public class Linersearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int key=s.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				System.out.println(true);
				return ;
			}
		}
		System.out.println(false);
	}

}

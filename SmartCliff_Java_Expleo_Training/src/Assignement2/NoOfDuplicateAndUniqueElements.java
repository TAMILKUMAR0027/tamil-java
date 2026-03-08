/*
 * Write a program to count a total number of duplicate and unique elements in the 
given array. 
 */
package Assignement2;
import java.util.*;
public class NoOfDuplicateAndUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		boolean[] v=new boolean[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int dupc=0,unic=0;
		for(int i=0;i<n;i++) {
			int c=0;
			if(v[i])continue;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					c++;
					v[j]=true;
				}
				
			}
			if(c>0) {
				dupc++; // if duplicate count is increased it will update the duplicate count
			}else
				unic++; // otherwise it will update the unique count
		}
		System.out.println("No of duplicate elements : "+dupc);
		System.out.println("No of unique elements : "+unic);
		
	}

}

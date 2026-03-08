/*
 * Write a program to find the missing number in a given integer array of 1 to 100. 
 */
package Assignement2;
import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int [] a=new int[99];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			sum+=a[i];
		}
		int n=(100*101)/2;
		System.out.println("The missing number "+(n-sum));
	}

}

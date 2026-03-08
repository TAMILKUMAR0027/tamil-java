/*
 * . Write a program to print the following number pattern 
Sample I/O 
Enter the N value: 5 
1 
2  2 
3  3  3 
4  4  4  4 
5  5  5  5  5
 */
package Assignment1;

import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print((i+1)+" ");
			}
			System.out.println();
		}
	}

}

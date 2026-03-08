/*
 * Write a C# program to find the sums of the running odd numbers and even numbers 
from a given lowerbound to an upperbound. Also compute their absolute 
difference. (Use separate function to find the sum of odd and even numbers 
from lowerbound to upperbound) 
Sample Input and Output 
The sum of odd numbers from 1 to 1000 is: 250000  
The sum of even numbers from 1 to 1000 is: 250500  
The absolute difference between the two sums is: 500
 */
package Assignment3;
import java.util.*;
public class AbsoluteDiff {
	static int Calculatesum(int n,int m) {
		int evensum=0;
		for(int i=n;i<=m;i++) {
			if(i%2==0) {
				evensum+=i;   // add the even sum
			}
		}
		return evensum;
	}
	public static int CalculateOddsum(int n,int m) {
		int oddsum=0;
		for(int i=n;i<=m;i++) {
			if(i%2!=0) {
				oddsum+=i;  // add the odd sum
			}
		}
		return oddsum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the lower bound ");
		int n=s.nextInt();
		System.out.println("Enter the upper bound ");
		int m=s.nextInt();
		int evensum=Calculatesum(n,m);
		int oddsum=CalculateOddsum(n,m);
		int diff=Math.abs(evensum-oddsum);  // it will give absolute values
		System.out.println("The sum of odd numbers between "+n+" to "+m+" : "+oddsum);
		System.out.println("The sum of even numbers between "+n+" to "+m+" : "+evensum);
		System.out.println("The Absolute difference is : "+diff);
	}

}

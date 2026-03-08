/*
 *  A cloth showroom has announced the following festival discounts on the purchase of 
items based on the total cost of the items purchased: 
Total Cost 
Less than Rs. 2000 
Discount Rate 
Rs. 2000 to less than Rs. 5000 
5% 
Rs. 5000 to less than Rs. 10,000 
25% 
Rs. 10,000 and above 
35% 
50% 
Write a program to input the total cost and to compute and display the amount to be 
paid by the customer availing the discount. 
Sample Input 1: 
4500 
Sample Output 1: 
3375.0 
Sample Input 2: 
6800 
Sample Output 2: 
4420.0
 */
package Assignment1;
import java.util.*;
public class DiscountCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		float dis=0;
		if(n<2000) {
			dis=(float)(n*0.05);
		}else if(n>=2000 && n<5000) {
			dis=(float)(n*0.25);
		}else if(n>=5000 && n<10000) {
			dis=(float)(n*0.35);
		}else {
			dis=(float)(n*0.5);
		}
		System.out.println(n-dis);
	}

}

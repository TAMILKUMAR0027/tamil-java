
/*
 * Roll the dice 100 times and display the frequency of each number rolled using 
arrays. package Assignement2;
 */
package Assignement2;
import java.util.*;
public class RollTheDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[100];
		Random r=new Random();
		int[] fre=new int[6];
		for(int i=0;i<100;i++) {
			arr[i]=r.nextInt(6)+1;
			fre[arr[i]-1]++;
		}
		for(int i=0;i<6;i++)
		System.out.println((i+1)+" : "+fre[i]);
	}

}

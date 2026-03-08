/*
 * 
 */
package Assignement2;
import java.util.*;
public class GreatestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a=new int[3][3];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=s.nextInt();
			}
		}
		int max=Integer.MAX_VALUE;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(max<a[i][j])
					max=a[i][j];
			}
		}
		System.out.println("Greatest Elemnet of N dimensional Arrays is : "+max);
	}

}

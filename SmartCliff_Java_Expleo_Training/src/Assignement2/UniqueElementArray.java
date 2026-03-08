package Assignement2;

import java.util.Scanner;

public class UniqueElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		boolean[] v=new boolean[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int[]arr1 = new int[n];
		int k=0;
		for(int i=0;i<n;i++) {
			int c=0;
			if(v[i])continue; // if already visited we need to skip the iteration
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {// check there is any duplicates
					c++;
					v[j]=true;
				}
				
			}
			if(c==0)
			arr1[k++]=arr[i]; //store the unique numbers
		}
		for(int i=0;i<k;i++) {
			System.out.println(arr1[i]+" ");
		}
	}

}

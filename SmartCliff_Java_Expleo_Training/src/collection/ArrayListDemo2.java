package collection;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>arr=new ArrayList<>();
		System.out.println("Initial Size of array : "+arr.size());
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println("After the insertion of an elemets : "+arr.size());
		System.out.println("Array Elements : "+arr);
		Integer[] ia = new Integer[arr.size()];
        ia = arr.toArray(ia);
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println(sum);
		
	}

}

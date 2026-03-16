package collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arr=new ArrayList<String>();
		System.out.println("Size of the arraylist : "+arr.size());
		arr.add("c");
		arr.add("D");
		arr.add("f");
		arr.add("g");
		arr.add(1,"z");
		System.out.println("Size of the arraylist : "+arr.size());
		System.out.println("Array Elements : "+arr);
		arr.remove("f");
		arr.remove(2);
		System.out.println("Array Elements : "+arr);
	}

}

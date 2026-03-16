package collection;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<String>();
		System.out.println("size before insertion : "+list.size());
		list.add("Javaa");
		list.add("C++");
		list.add("Java Script");
		System.out.println("After the size of insertion : "+list.size());
		System.out.println(list);
		list.add(1,"ruby");
		
		System.out.println(list);
	}

}

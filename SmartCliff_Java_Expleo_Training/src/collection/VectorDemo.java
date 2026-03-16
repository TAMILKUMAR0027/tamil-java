package collection;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>v=new Vector<String>(10,5);
		System.out.println("Size pf the vector list before intialization : "+v.size());
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		
		System.out.println("Elements in vector "+v);
		System.out.println(v.capacity());
		System.out.println("Size of the vector list : "+v.size());
	}

}

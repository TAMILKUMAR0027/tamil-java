package collection;
import java.util.*;
public class stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>st=new Stack<String>();
		st.add("A");
		st.add("B");
		st.add("c");
		st.add("D");
		st.add("A");
		st.add("B");
		st.add("c");
		st.add("D");
		st.add("A");
		st.add("B");
		st.add("c");
		st.add("D");
		st.push("E");
		System.out.println(st.parallelStream());
		System.out.println(st.capacity());
		st.pop();
		System.out.println(st);
		System.out.println(st.getLast());
		System.out.println(st.lastElement());
	}

}

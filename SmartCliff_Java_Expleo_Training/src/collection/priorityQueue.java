package collection;
import java.util.*;
public class priorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String>pq=new PriorityQueue<String>();
		pq.add("c");
		pq.add("w");
		pq.add("f");
		pq.add("d");
		pq.add("b");
		pq.add("a");
		while(!pq.isEmpty())
		System.out.println(pq.poll());
	}

}

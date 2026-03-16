package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Double> tm = new HashMap<String, Double>();
		System.out.println("Size of hashmap befoe insert : " + tm.size());
		tm.put("Tamil", 2700.20);
		tm.put("Krishna", 3456.45);
		tm.put("Muhi", 27452.3);
		tm.put("Jeeva", 1112.3);
		tm.put("Rishi", 3400.21);
		System.out.println(tm);
		System.out.println("AFter insertion size:" + tm.size());
		Set<Map.Entry<String, Double>> set = tm.entrySet();
		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}

	}

}

package TKSCJC;

import java.util.*;
 																																																														
public class Employee {
	int id;
	String name;

	public void setDetails(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	void display() {
		System.out.println("Employee details");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Employee a = new Employee();
		a.setDetails(s.nextInt(), s.next());
		a.display();
		a.setDetails(s.nextInt(), s.next());
		a.display();
	}

}

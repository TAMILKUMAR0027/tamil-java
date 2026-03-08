package TKSCJC;

import java.util.*;

public class ArrayOfObjects {
	int id;
	String name;

	public void setDetail(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("Employee details ");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayOfObjects a[] = new ArrayOfObjects[5];
		for (int i = 0; i < 5; i++) {
			a[i] = new ArrayOfObjects();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter Id and Name for Employee " + (i + 1));
			int id = s.nextInt();
			String name = s.next();
			a[i].setDetail(id, name);
		}
		for (int i = 0; i < 5; i++) {
			a[i].display();
		}
	}

}

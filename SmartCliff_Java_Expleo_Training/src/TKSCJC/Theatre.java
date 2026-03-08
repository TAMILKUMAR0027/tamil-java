package TKSCJC;

import java.util.*;

public class Theatre {
	int id = 234;
	String name = "INOX";
	String location = "Salem";

	public void display() {
		System.out.println("Theatre Id : " + id);
		System.out.println("Theatre Name : " + name);
		System.out.println("Theatre Location : " + location);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre a = new Theatre();
		a.display();
	}

}

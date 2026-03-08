package TKSCJC;
import java.util.*;
public class Static {
	 int id;
	 String name;
	static String company = "ABC Company";
	public Static(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println("Company details : "+company);
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static a=new Static(12,"Tamil");
		a.display();
		
	}

}

package TKSCJC;
import java.util.*;
public class TheatreConstructor {
	int id;
	String name;
	int screans;
	String location;
	
	public TheatreConstructor() {
		System.out.println("Enter some values");
	}
	public TheatreConstructor(int id, String name, int screans, String location) {
		this.id = id;
		this.name = name;
		this.screans = screans;
		this.location = location;
	}
	
	public TheatreConstructor(int id, String name, int screans) {
		this.id = id;
		this.name = name;
		this.screans = screans;
	}
	
	public TheatreConstructor(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println("Theatre details ");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Total Screans : "+screans);
		System.out.println("Location "+location);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheatreConstructor a=new TheatreConstructor();
		TheatreConstructor a1=new TheatreConstructor(12,"Tamil");
		a1.display();
		TheatreConstructor a2=new TheatreConstructor(12,"Tamil",4,"salem");
		a2.display();
		
	}

}

package TKSCJC;
import java.util.*;
public class ThisKeyword {
	int id;
	String name;
	float salary;
	public ThisKeyword(int id, String name) { //1 current class instancd variable
		this.id = id;
		this.name = name;
	}
	ThisKeyword(){
		this(12,"Tamil"); //2 current class constructor
	}
	void register() {
		this.display(); // 3  call another method
	}
	void display() {
		System.out.println("Employee details");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
	}
	void send() {
        hr t = new hr(); 
        t.update(this); //4 current object as an argument
    }
	ThisKeyword update(ThisKeyword t) {  //5 current instance class
		this.salary=salary+100;
		return this;
	}
	class hr{
		void employee(ThisKeyword a) {
			System.out.println("Hr dept processing");
			System.out.println("Processed employe :"+a.id+" "+a.name);
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword a1=new ThisKeyword(13,"Jeeva");
		ThisKeyword a2=new ThisKeyword();
		a1.register();
		a2.salary=1000;
		a2.send();
		 System.out.println("Salary: " + a2.salary);
	}

}

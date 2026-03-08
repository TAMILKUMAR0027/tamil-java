package TKSCJC;
import java.util.*;
public class programmer extends ProjectLeader {
	String programmerName;
	int empid;

	void setDetails(String programmerName, int empid) {
		this.programmerName = programmerName;
		this.empid = empid;

	}
	void display() {
		System.out.println("The project lead name : "+pName);
		System.out.println("THe project lead id : "+id);
		System.out.println("The programmer name : "+programmerName);
		System.out.println("The employee id : "+empid);
		print();
	}
	public static void main(String[] args) {
		programmer p=new programmer();
		p.setDetails("Tamil",12);
		p.display();
	}
}

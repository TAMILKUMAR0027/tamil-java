package TKSCJC;

public class Staff extends Person {
	String school;
	double pay;
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Staff [school=" + school + ", pay=" + pay + ", name=" + name + ", address=" + address + "]";
	}
	public static void main(String[] args) {
		Staff a=new Staff("Tamil","Salem","KIOT",10000);
		System.out.println(a);
		Student b=new Student("Tamil","address","JAVA",2026,1000);
		System.out.println(b);
		
	}
	
}

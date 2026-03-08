package TKSCJC;
class outer{
	int age=18;
	public void checkage() {
		System.out.println("The outer class");
	}
	class inner{
	public void ishow() {
			System.out.println("The inner class");
			outer b=new outer();
			b.checkage();
		}
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer a=new outer();
		System.out.println("The outer class : "+a.age);
		a.checkage();
		outer.inner a1=a.new inner();
		a1.ishow();
		
		
		
	}

}

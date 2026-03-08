package TKSCJC;
class outer1{
	int value =56;
	public void outerClassMethod() {
		System.out.println("Inside the method of outer class");
		class inner1{
			public void innerClassMethod(){
				System.out.println("Inside the method of inner class ");
				System.out.println("Value : "+value);
			}
		}
		inner1 i=new inner1();
		i.innerClassMethod();
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer1 o=new outer1();
		o.outerClassMethod();
	}

}

package Generics;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo <Integer> obj=new Demo<Integer>();
		obj.set(25);
		System.out.println(obj.get());
		Demo<String> sobj=new Demo<String>();
		sobj.set("demo");
		System.out.println(sobj.get());
	}

}

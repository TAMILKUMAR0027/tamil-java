package Generics;

public class genericdem {
	public static void main(String[] args) {
		Test<String,Integer,Float> obj=new Test<>("Test",12,2.1f);
		obj.print();
	}
}

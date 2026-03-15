package Generics;

public class GenericMethod {
	static<T>void display(T element){
		System.out.println(element);
		System.out.println(element.getClass().getName()+" = "+element);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(11);
		display("Tamil");
		display(1.0f);
	}

}

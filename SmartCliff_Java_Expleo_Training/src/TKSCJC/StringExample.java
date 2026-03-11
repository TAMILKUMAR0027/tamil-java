package TKSCJC;
import java.io.*;
public class StringExample {
	public static void concat(String s1) {
		s1=s1+"Tamil";
	}
	public static void concat2(StringBuilder s2) {
		s2.append("Jeeva");
	}
	public static void concat3(StringBuffer s3) {
		s3.append("Muhindhar");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		concat(s1);
		System.out.println("String : "+s1);
		StringBuilder s2=new StringBuilder("Hello ");
		concat2(s2);
		System.out.println("Stringbuilder : "+s2);
		StringBuffer s3=new StringBuffer("Hello ");
		concat3(s3);
		System.out.println("String buffer : "+s3);
		
		
	}

}

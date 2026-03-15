package Generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
	public static double sum(List<? extends Number>list) {
		double sum=0;
		for(Number n:list) {
			sum+=n.doubleValue();
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>in=new ArrayList<>();
		List<Float>ins=new ArrayList<Float>();
		ins.add(2.3f);
		ins.add(4.2f);
		float sumof=(float) sum(ins);
		System.out.println(sumof);
		in.add(3);
		in.add(5);
		in.add(10);
		double sum=sum(in);
		System.out.println("Sum of inputs : "+sum);
	}

}

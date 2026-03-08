package TKSCJC;

import java.util.*;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int age = 15;
		int weight = 72;
		if (age > 18) {
			if (weight > 50)
				System.out.println("You are eligible to donate the blood");
		} else {
			System.out.println("You are not eligible");
		}
	}

}

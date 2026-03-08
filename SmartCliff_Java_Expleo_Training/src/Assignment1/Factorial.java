package Assignment1;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int temp = n;
		while (temp > 1) {
			if (temp % i != 0) {
				System.out.println("This is not a factorial divisor");
				return;
			}
			temp /= i;
			i++;
		}
		System.out.println(i - 1);
	}

}

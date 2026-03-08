package Assignment1;
import java.util.*;
public class glossary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the price");
		int p=s.nextInt();
		System.out.println("ENter the quatity of purchased");
		int a=s.nextInt();
		
		if(a>500) {
			long total=p*a;
			double n=total*0.15;
			System.out.println(total-n);
		}else {
			System.out.println("Same Price"+p*a);
		}
	}

}

package TKSCJC;
import java.util.*;
public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean isBroken=s.nextBoolean();
		boolean GreaterThan3years=s.nextBoolean();
		if((isBroken)||(GreaterThan3years)) {
			System.out.println("New Phone");
		}else {
			System.out.println("No New Phone");
		}
	}
} 

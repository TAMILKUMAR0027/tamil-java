package TKSCJC;
import java.util.*;
public class Movieticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean seata=s.nextBoolean();
		System.out.println("Enter the Seat number : ");
		String seat=s.next();
		if(seata) {
			System.out.println("Seat is available "+seat);
		}
	}

}

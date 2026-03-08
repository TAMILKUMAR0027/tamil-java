package TKSCJC;
import java.util.*;
public class TheatreScreen {
	private static int totalseats=20;
	
	public TheatreScreen() {
		System.out.println("Current seats available : "+totalseats);
	}
	public static void  Bookticket(int ticket) {
		if(ticket<=totalseats) {
		System.out.println("No of seats booekd : "+ticket);
		totalseats-=ticket;
		System.out.println("Current seats available : "+totalseats);
		}else {
			System.out.println("Seat limit execeeded");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheatreScreen a=new TheatreScreen();
		Bookticket(7);
		TheatreScreen a1=new TheatreScreen();
		a1.Bookticket(8);

	}

}

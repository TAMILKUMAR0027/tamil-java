/*
 *  Write a program that reads continuously a month number (1 = Jan, 12 = Dec), the day 
that the month begins (1 = Mon, 7 = Sun), and displays the calendar for that month. If 
the selected month is February, the program should prompt the user to enter the 
month’s number of days, that is, 28 or 29. If the given month is out of [1, 12], the 
program should terminate. 
 */
package Assignment1;
import java.util.*;
public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] mon = {"Jan", "Feb", "Mar", "Apr","May", "Jun", "July", "Aug","Sep", "Oct", "Nov", "Dec"};
		String[] day= {"mon","tue","wed","thu","Fri","sat","sun"};
		int[] no={31,28,30,31,30,31,30,31,30,31,30,31};
		int month=s.nextInt()-1;
		System.out.println(mon[month]);
		int start=s.nextInt();
		System.out.println("mon tue wed thu Fri sat sun");
		for(int i=1;i<=no[month];i++) {
			System.out.println(i);
			
		}
	}

}

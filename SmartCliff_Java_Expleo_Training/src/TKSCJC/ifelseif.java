/*
 * seat alloaction
 */
package TKSCJC;

import java.util.*;

public class ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("Type of seat Available\n REGULAR \n PREMIUM \n EXECUTIVE\n VIP\n choose any one ");
		String seattype = s.next();
		if (seattype.equals("REGULAR")) {
			System.out.println("You have selected the regular seat cost is 80");
		} else if (seattype.equals("PREMIUM")) {
			System.out.println("You have selected the premium seat cose is 100");
		} else if (seattype.equals("EXECUTIVE")) {
			System.out.println("You have selected the executive seat cose is 200");
		} else if (seattype.equalsIgnoreCase("VIP")) {
			System.out.println("You have selected the VIP seat cose is 500");
		} else {
			System.out.println("You dont booked any seats");
		}
	}

}

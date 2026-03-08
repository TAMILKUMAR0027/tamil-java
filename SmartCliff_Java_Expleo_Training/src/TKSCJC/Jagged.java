package TKSCJC;

import java.util.*;

public class Jagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] seat = { { 'A', 'A', 'B' }, { 'A', 'A', 'B', 'B' }, { 'A', 'B' }, { 'A', 'A', 'B', 'B', 'A' } };
		int vip = 0, pre = 0, reg = 0;
		System.out.println("    Movie Seat Arrangement");
		for (int i = 0; i < seat.length; i++) {
			if (i == 0) {
				System.out.println("       VIP SEATS");
			} else if (i == 1) {
				System.out.println("       Premimum Seats");
			} else if (i == 3) {
				System.out.println("       Regular Seats");
			}
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print("  " + seat[i][j] + "  ");
				if (i == 0 && seat[i][j] == 'A') {
					vip++;
				} else if ((i == 1) || (i == 2) && (seat[i][j] == 'A')) {
					pre++;
				} else if (i == 3 && seat[i][j] == 'A') {
					reg++;
				}
			}
			System.out.println();
		}
		System.out.println("Seat Booking Details");
		System.out.println("VIP seats Available : " + vip);
		System.out.println("Preminum Seats Available : " + pre);
		System.out.println("Regular Seats Available : " + reg);
		int prem=seat[1].length+seat[2].length;
		System.out.println("VIP Booken seats: " + (seat[0].length - vip) + " Available seats: " + vip + " Total: "
				+ seat[0].length);
		System.out.println("Premimum Booken seats: " + (prem - pre) + " Available seats: " + pre + " Total: "
				+ prem);
		System.out.println("Reg Booken seats: " + (seat[3].length- reg) + " Available seats: " + reg + " Total: "
				+ seat[3].length);

	}

}

package TKSCJC;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class reactMovies {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Movie ID : ");
		int id = s.nextInt();
		System.out.println("Enter Movie Name : ");
		s.nextLine();
		String Moviename = s.nextLine();
		System.out.println("Enter the movie name Description : ");
		String MovieDescription = s.nextLine();
		System.out.println("Enter the Movie Langiage : ");
		String Lan = s.nextLine();
		System.out.println("Enter the Movie genre : ");
		String genre = s.nextLine();
		System.out.println("Enter the movie Realese Date (dd/MM/yyyy) : ");
		String date = s.next();
		SimpleDateFormat m = new SimpleDateFormat("dd/MM/yyyy");
		Date rel = m.parse(date);
		s.nextLine();
		System.out.println("Enter the movie seat Cost : ");
		float cost = s.nextFloat();
		System.out.println("ENTERED MOVIE DETAILS ARE");
		System.out.println("Enter Movie ID : " + id);
		System.out.println("Enter Movie Name : " + Moviename);
		System.out.println("Enter the movie name Description : " + MovieDescription);
		System.out.println("Enter the Movie Langiage : " + Lan);
		System.out.println(" Enter the Movie genre : " + genre);
		System.out.println("Enter the movie Realese Date (dd/mm/yyyy) : " + rel);
		System.out.println("Enter the movie seat Cost : " + cost);

	}

}

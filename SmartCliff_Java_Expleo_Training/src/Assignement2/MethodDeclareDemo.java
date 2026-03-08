package Assignement2;
import java.util.*;
public class MethodDeclareDemo {
	static void MovieDisplay(String moviename,String movieDes,int movieduration,String movielan,String movieReleaseDate,String country,String genre) {
		System.out.println("Movie Name : "+moviename);
		System.out.println("Movie Description : "+movieDes);
		System.out.println("Movie Duration : "+movieduration);
		System.out.println("Movie Language : "+movielan);
		System.out.println("Movie Release Date : "+movieReleaseDate);
		System.out.println("Movie Country : "+country);
		System.out.println("Movie genre : "+genre);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the movie details");
		String moviename=s.nextLine();
		String movieDes=s.nextLine();
		int movieduration=s.nextInt();
		s.nextLine();
		String movielan=s.nextLine();
		String movieReleaseDate=s.nextLine();
		String country=s.nextLine();
		String genre=s.nextLine();
		MovieDisplay(moviename, movieDes, movieduration, movielan, movieReleaseDate, country, genre);
	}

}

package TKSCJC;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mainn {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();

        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat d = date;

        String formattedDate = d.format(today);

        Movie m = new Movie("AAA", "Drama", "English", "Good Movie", formattedDate, "India");
        c.addMovie(m);

        m.getMovieDetail();
    }
}
class Movie {

    String title;
	String genre;
    String language;
    String description;
    String date;
    String Country;
    public Movie(String title, String genre, String language, String description, String date, String country) {
		this.title = title;
		this.genre = genre;
		this.language = language;
		this.description = description;
		this.date = date;
		Country = country;
	}
    

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void getMovieDetail() {
        System.out.println("Title : " + title);
        System.out.println("Language : " + language);
        System.out.println("Genre : " + genre);
        System.out.println("Description : " + description);
        System.out.println("Date : "+date);
        System.out.println("Country : "+Country);
    }
}

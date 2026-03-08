package TKSCJC;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface Search {
    void searchByGenre(String genre);
}

interface SearchByTitle {
    void searchByTitle(String title);
}

class Catalog implements SearchByTitle, Search {

    private static Date lastUpdated;
    private static List<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie m) {
        movieList.add(m);
    }

    @Override
    public void searchByTitle(String title) {
        for (Movie movie : movieList) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                movie.getMovieDetail();
            }
        }
    }

    @Override
    public void searchByGenre(String genre) {
        for (Movie movie : movieList) {
            if (movie.getGenre().equalsIgnoreCase(genre)) {
                movie.getMovieDetail();
            }
        }
    }
}
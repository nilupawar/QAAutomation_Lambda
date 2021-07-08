package application;

public class Movie {
    private String name;
    private int rating;
    private MovieType movieType;

    public Movie(String name, int rating, MovieType movieType) {
        this.name = name;
        this.rating = rating;
        this.movieType = movieType;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public String toString() {
        return "Name : " + name + " -- " + " Rating : " + rating + " -- " + " MovieType : " + movieType;
    }
}

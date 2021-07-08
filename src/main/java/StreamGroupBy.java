import application.Movie;
import application.MovieType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Group stream element ( Grouping actually means creating a MAP )

public class StreamGroupBy {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Movie_1_A", 4, MovieType.ACTION),
                new Movie("Movie_2_C", 4, MovieType.COMEDY),
                new Movie("Movie_3_D", 4, MovieType.DRAMA),
                new Movie("Movie_4_A", 4, MovieType.ACTION),
                new Movie("Movie_5_A", 4, MovieType.ACTION),
                new Movie("Movie_6_C", 4, MovieType.COMEDY),
                new Movie("Movie_7_C", 4, MovieType.COMEDY)
        );

        Map<MovieType, List<Movie>> result = movies.stream()
                .collect(Collectors.groupingBy(Movie::getMovieType));

        result.entrySet().stream()
                .forEach(movie -> System.out.println("\nGroupName : " + movie.getKey() + ", Movie details : " + movie.getValue()));

        //System.out.println(result);
    }
}

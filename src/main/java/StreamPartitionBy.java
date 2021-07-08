import application.Movie;
import application.MovieType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitionBy {
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

        Map<Boolean, List<Movie>> result = movies.stream()
                .collect(Collectors.partitioningBy(movie -> movie.getMovieType() == MovieType.ACTION));

        System.out.println(result.get(true));
        System.out.println(result.get(false));

    }
}

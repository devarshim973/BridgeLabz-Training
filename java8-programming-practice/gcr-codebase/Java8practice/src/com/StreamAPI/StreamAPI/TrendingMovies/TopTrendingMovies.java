package com.StreamAPI.StreamAPI.TrendingMovies;

import java.util.*;

public class TopTrendingMovies {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("Inception", 2010, 8.8),
            new Movie("Dune", 2021, 8.2),
            new Movie("Oppenheimer", 2023, 9.1),
            new Movie("Avatar 2", 2022, 7.9),
            new Movie("John Wick 4", 2023, 8.7),
            new Movie("The Batman", 2022, 8.5),
            new Movie("Tenet", 2020, 7.5)
        );

        movies.stream()

            // filter recent movies
            .filter(movie -> movie.getReleaseYear() >= 2021)

            // sort by rating desc, then year desc
            .sorted(Comparator
                    .comparing(Movie::getRating).reversed()
                    .thenComparing(Movie::getReleaseYear).reversed())

            // limit to top 5
            .limit(5)

            // print result
            .forEach(System.out::println);
    }
}

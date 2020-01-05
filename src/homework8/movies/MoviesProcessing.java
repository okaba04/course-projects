package homework8.movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoviesProcessing {
    private List<Movie> firstMoviesList = new ArrayList<>();
    private List<Movie> secondMoviesList = new ArrayList<>();

    private void buildMoviesLists() {
        firstMoviesList.add(new Movie("comics", 200));
        firstMoviesList.add(new Movie("animation", 150));
        firstMoviesList.add(new Movie("horror", 110));
        firstMoviesList.add(new Movie("comics", 190));
        firstMoviesList.add(new Movie("horror", 100));
        firstMoviesList.add(new Movie("horror", 90));

        secondMoviesList.add(new Movie("animation", 140));
        secondMoviesList.add(new Movie("animation", 125));
        secondMoviesList.add(new Movie("horror", 95));
        secondMoviesList.add(new Movie("comics", 185));
        secondMoviesList.add(new Movie("comedy", 80));
        secondMoviesList.add(new Movie("comedy", 85));
    }

    private Map<String, List<Movie>> groupMoviesByGenre() {
        buildMoviesLists();
        return Stream.concat(firstMoviesList.stream(), secondMoviesList.stream())
                .collect(Collectors.groupingBy(Movie::getGenre));
    }

    public void calculateAveragePriceByGenre() {
        groupMoviesByGenre().forEach((genre, movies) -> {
            System.out.println("Average price for " + genre + " is: " +
                    movies.stream().mapToDouble(Movie::getPrice).average().orElse(Double.NaN));
            System.out.println("Film count: " + movies.size());
        });
    }
}

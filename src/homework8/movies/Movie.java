package homework8.movies;

public class Movie {

    private String genre;
    private Integer price;

    Movie(String genre, Integer price) {
        this.genre = genre;
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getPrice() {
        return price;
    }
}
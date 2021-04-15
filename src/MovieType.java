public class MovieType {
    private int movieId;
    private String type;

    public MovieType(int movieId, String type) {
        this.movieId = movieId;
        this.type = type;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

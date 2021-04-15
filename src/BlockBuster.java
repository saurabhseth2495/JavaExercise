public class BlockBuster {
    private int movieId;
    private boolean is_movie_blockbuster;

    public BlockBuster(int movieId, boolean is_movie_blockbuster) {
        this.movieId = movieId;
        this.is_movie_blockbuster = is_movie_blockbuster;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public boolean isIs_movie_blockbuster() {
        return is_movie_blockbuster;
    }

    public void setIs_movie_blockbuster(boolean is_movie_blockbuster) {
        this.is_movie_blockbuster = is_movie_blockbuster;
    }
}

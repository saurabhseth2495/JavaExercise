public class MovieInfo {
    private String movieName;
    private String year;
    private String language;
    private String genre;
    private String releaseDate;
    private String type;
    private float averageProductionCost;
    private String foodStore;
    private boolean blockBuster;

    public MovieInfo(String movieName, String year, String language, String genre, String releaseDate, String type, float averageProductionCost, String foodStore, boolean blockBuster) {
        this.movieName = movieName;
        this.year = year;
        this.language = language;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.type = type;
        this.averageProductionCost = averageProductionCost;
        this.foodStore = foodStore;
        this.blockBuster = blockBuster;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getAverageProductionCost() {
        return averageProductionCost;
    }

    public void setAverageProductionCost(float averageProductionCost) {
        this.averageProductionCost = averageProductionCost;
    }

    public String getFoodStore() {
        return foodStore;
    }

    public void setFoodStore(String foodStore) {
        this.foodStore = foodStore;
    }

    public boolean isBlockBuster() {
        return blockBuster;
    }

    public void setBlockBuster(boolean blockBuster) {
        this.blockBuster = blockBuster;
    }
}

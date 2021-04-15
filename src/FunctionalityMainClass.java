import java.text.DateFormat;
import java.util.*;

public class FunctionalityMainClass {
    private List<Movie> movieList;
    private List<MovieType> movieTypeList;
    private List<FoodStore> foodStoreList;
    private List<AverageCost> averageCostList;
    private List<BlockBuster> blockBusterList;
    private String year;
    private String releaseDate;
    private List<MovieInfo> movieInfoList = new ArrayList<>();

    public static void main(String[] args) {
        FunctionalityMainClass functionalityClass = new FunctionalityMainClass();
        functionalityClass.insertDummyMovieData();
        functionalityClass.insertDummyMovieTypeData();
        functionalityClass.insertDummyFoodStoreData();
        functionalityClass.insertDummyAverageCostData();
        functionalityClass.insertDummyBlockBusterData();
        /*for (int i = 0; i < functionalityClass.getAllMovies().size(); i++) {
            System.out.println("All Movie Name :- " + functionalityClass.getAllMovies().get(i));
        }
        for (int i = 0; i < functionalityClass.getSpecificTypeMovie("Hollywood").size(); i++) {
            System.out.println(" Hollywood Movie Name :- " + functionalityClass.getSpecificTypeMovie("Hollywood").get(i));
        }
        for (int i = 0; i < functionalityClass.getSpecificTypeMovie("Tollywood").size(); i++) {
            System.out.println(" Tollywood Movie Name :- " + functionalityClass.getSpecificTypeMovie("Tollywood").get(i));
        }
        for (int i = 0; i < functionalityClass.getSpecificTypeMovie("Bollywood").size(); i++) {
            System.out.println(" Bollywood Movie Name :- " + functionalityClass.getSpecificTypeMovie("Bollywood").get(i));
        }
        for (int i = 0; i < functionalityClass.blockBusterList.size(); i++) {
            System.out.println("Movie name :- " + functionalityClass.getAllMovies().get(i)
                    + "  blockbuster :- " + functionalityClass.blockBusterList.get(i).isIs_movie_blockbuster()
            );
        }
        functionalityClass.insertDummyBlockBusterData();
        System.out.println("Second time...");
        for (int i = 0; i < functionalityClass.blockBusterList.size(); i++) {
            System.out.println("Movie name :- " + functionalityClass.getAllMovies().get(i)
                    + "  blockbuster :- " + functionalityClass.blockBusterList.get(i).isIs_movie_blockbuster()
            );
        }*/
        for (MovieInfo movieInfo : functionalityClass.getAllMoviesInfo()) {
            System.out.println("  Movie Name : " + movieInfo.getMovieName()
                    + "  Movie Genre: " + movieInfo.getGenre()
                    + "  Free Food: " + movieInfo.getFoodStore()
                    + "  Movie Language: " + movieInfo.getLanguage()
                    + "  Movie Type: " + movieInfo.getType()
                    + "  Movie Average Production Cost: " + movieInfo.getAverageProductionCost()
                    + "  Movie BlockBuster : " + movieInfo.isBlockBuster()
                    + "  Movie Year: " + movieInfo.getYear()
                    + "  Movie Release Date : " + movieInfo.getReleaseDate());
        }
        System.out.println("After selecting one of movie.");
        for (MovieInfo movieInfo : functionalityClass.getSpecificTypeMovieInfo("Hollywood")) {
            System.out.println("  Movie Name : " + movieInfo.getMovieName()
                    + "  Movie Genre: " + movieInfo.getGenre()
                    + "  Free Food: " + movieInfo.getFoodStore()
                    + "  Movie Language: " + movieInfo.getLanguage()
                    + "  Movie Type: " + movieInfo.getType()
                    + "  Movie Average Production Cost: " + movieInfo.getAverageProductionCost()
                    + "  Movie BlockBuster : " + movieInfo.isBlockBuster()
                    + "  Movie Year: " + movieInfo.getYear()
                    + "  Movie Release Date : " + movieInfo.getReleaseDate());
        }
    }

    public List<MovieInfo> getAllMoviesInfo() {
        movieInfoList.clear();
        for (Movie movie : movieList) {
            float averageProductionCost = getAverageProductionCost(getMovieType(movie.getMovieId()));
            String movieType = getMovieType(movie.getMovieId());
            String FreeDish = getFoodDish(getMovieType(movie.getMovieId()));
            boolean blockBuster = isBlockBusterOrNot(movie.getMovieId());
            MovieInfo movieInfo = new MovieInfo(
                    movie.getName()
                    , movie.getYear()
                    , movie.getLanguage()
                    , movie.getGenre()
                    , movie.getReleaseDate()
                    , movieType
                    , averageProductionCost
                    , FreeDish
                    , blockBuster);
            movieInfoList.add(movieInfo);
        }
        return movieInfoList;
    }

    public List<MovieInfo> getSpecificTypeMovieInfo(String type) {
        movieInfoList.clear();
        for (Movie movie : movieList) {
            float averageProductionCost = getAverageProductionCost(getMovieType(movie.getMovieId()));
            String FreeDish = getFoodDish(getMovieType(movie.getMovieId()));
            boolean blockBuster = isBlockBusterOrNot(movie.getMovieId());
            if (type.equals(getMovieType(movie.getMovieId()))) {
                MovieInfo movieInfo = new MovieInfo(
                        movie.getName()
                        , movie.getYear()
                        , movie.getLanguage()
                        , movie.getGenre()
                        , movie.getReleaseDate()
                        , type
                        , averageProductionCost
                        , FreeDish
                        , blockBuster);
                movieInfoList.add(movieInfo);
            }
        }
        return movieInfoList;
    }

    public List<String> getAllMovies() {
        List<String> nameList = new ArrayList<>();
        movieInfoList = new ArrayList<>();
        for (Movie movie : movieList) {
            float averageProductionCost = getAverageProductionCost(getMovieType(movie.getMovieId()));
            String movieType = getMovieType(movie.getMovieId());
            String FreeDish = getFoodDish(getMovieType(movie.getMovieId()));
            boolean blockBuster = isBlockBusterOrNot(movie.getMovieId());
            MovieInfo movieInfo = new MovieInfo(
                    movie.getName()
                    , movie.getYear()
                    , movie.getLanguage()
                    , movie.getGenre()
                    , movie.getReleaseDate()
                    , movieType
                    , averageProductionCost
                    , FreeDish
                    , blockBuster);
            movieInfoList.add(movieInfo);
            String movieName = movie.getName();
            nameList.add(movieName);
        }
        return nameList;
    }


    public List<String> getSpecificTypeMovie(String type) {
        List<String> nameList = new ArrayList<>();
        nameList.clear();
        for (MovieType movieType : movieTypeList) {
            if (movieType.getType().equals(type)) {
                if (getMovieById(movieType.getMovieId()) != null) {
                    String movieName = getMovieById(movieType.getMovieId()).getName();
                    nameList.add(movieName);
                }
            }
        }
       /* movieInfoList = new ArrayList<>();
        for (Movie movie : movieList) {
            float averageProductionCost = getAverageProductionCost(getMovieType(movie.getMovieId());
//            String movieType = getMovieType(movie.getMovieId());
            String FreeDish = getFoodDish(getMovieType(movie.getMovieId()));
            boolean blockBuster = isBlockBusterOrNot(movie.getMovieId());
            if (type.equals(getMovieType(movie.getMovieId()))) {
                MovieInfo movieInfo = new MovieInfo(
                        movie.getName()
                        , movie.getYear()
                        , movie.getLanguage()
                        , movie.getGenre()
                        , movie.getReleaseDate()
                        , type
                        , averageProductionCost
                        , FreeDish
                        , blockBuster);
                movieInfoList.add(movieInfo);
            }
        }*/
        return nameList;
    }

    private Movie getMovieById(int movieId) {
        for (Movie movie : movieList) {
            if (movie.getMovieId() == movieId) {
                return movie;
            }
        }
        return null;
    }


    private String getReleaseDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        if (year != 0) {
            calendar.add(Calendar.YEAR, year);
        }
        if (month != 0) {
            calendar.add(Calendar.MONTH, month);
        }
        if (day != 0) {
            calendar.add(Calendar.DAY_OF_MONTH, day);
        }

        Date date = calendar.getTime();
        DateFormat dateFormatReleaseDate = DateFormat.getDateInstance(DateFormat.SHORT);
        String releaseDate = dateFormatReleaseDate.format(date);
        return releaseDate;
    }

    private String getYear(int y) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, y);
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        return year;
    }

    private void insertDummyMovieData() {
        movieList = new ArrayList<>();
        year = getYear(-4);
        releaseDate = getReleaseDate(-4, 0, 0);
        Movie movie1 = new Movie(123, "Bahubali", year, "Telgu", "Action", releaseDate);
        year = getYear(-2);
        releaseDate = getReleaseDate(-2, 0, 0);
        Movie movie2 = new Movie(122, "Kites", year, "Hindi", "Adventure", releaseDate);
        year = getYear(-3);
        releaseDate = getReleaseDate(-3, 0, 0);
        Movie movie3 = new Movie(125, "Gravity", year, "English", "ScienceFiction", releaseDate);
        year = getYear(-7);
        releaseDate = getReleaseDate(-7, 0, 0);
        Movie movie4 = new Movie(126, "Avenger", year, "English", "Action", releaseDate);
        year = getYear(-9);
        releaseDate = getReleaseDate(-9, 0, 0);
        Movie movie5 = new Movie(121, "Dus", year, "Hindi", "Action", releaseDate);
        year = getYear(-1);
        releaseDate = getReleaseDate(-1, 0, 03);
        Movie movie6 = new Movie(129, "1920", year, "Hindi", "Horror", releaseDate);
       /* System.out.println("movie name :- " + movie6.getName() + "   movie language :- " + movie6.getLanguage()
                + " movie genre :- " + movie6.getGenre()
                + " movie year :- " + movie6.getYear()
                + "  movie releaseDate :- " + movie6.getReleaseDate());*/
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        movieList.add(movie6);
    }

    private void insertDummyFoodStoreData() {
        foodStoreList = new ArrayList<>();
        FoodStore foodStore1 = new FoodStore("Tollywood", "Dosa");
        FoodStore foodStore2 = new FoodStore("Bollywood", "Dal Makhni");
        FoodStore foodStore3 = new FoodStore("Hollywood", "Pepper Steak");
        foodStoreList.add(foodStore1);
        foodStoreList.add(foodStore2);
        foodStoreList.add(foodStore3);
    }

    private String getMovieType(int movieId) {
        for (MovieType movieType : movieTypeList) {
            if (movieType.getMovieId() == movieId) {
                return movieType.getType();
            }
        }
        return null;
    }

    private String getFoodDish(String type) {
        for (FoodStore foodStore : foodStoreList) {
            if (foodStore.getType().equals(type)) {
                return foodStore.getDish();
            }
        }
        return null;
    }

    private boolean isBlockBusterOrNot(int movieId) {
        for (BlockBuster blockBuster : blockBusterList) {
            if (blockBuster.getMovieId() == movieId) {
                return blockBuster.isIs_movie_blockbuster();
            }
        }
        return false;
    }

    private float getAverageProductionCost(String type) {
        for (AverageCost averageCost : averageCostList) {
            if (averageCost.getType().equals(type)) {
                return averageCost.getAverage_cost_production();
            }
        }
        return 0.0f;
    }


    private void insertDummyMovieTypeData() {
        movieTypeList = new ArrayList<>();
        MovieType movieType1 = new MovieType(123, "Tollywood");
        MovieType movieType2 = new MovieType(122, "Bollywood");
        MovieType movieType3 = new MovieType(125, "Hollywood");
        MovieType movieType4 = new MovieType(126, "Hollywood");
        MovieType movieType5 = new MovieType(121, "Bollywood");
        MovieType movieType6 = new MovieType(129, "Bollywood");
        movieTypeList.add(movieType1);
        movieTypeList.add(movieType2);
        movieTypeList.add(movieType3);
        movieTypeList.add(movieType4);
        movieTypeList.add(movieType5);
        movieTypeList.add(movieType6);
    }

    private void insertDummyAverageCostData() {
        averageCostList = new ArrayList<>();
        AverageCost averageCost1 = new AverageCost("Tollywood", 70.25f);
        AverageCost averageCost2 = new AverageCost("Bollywood", 90.25f);
        AverageCost averageCost3 = new AverageCost("Hollywood", 700.25f);
        averageCostList.add(averageCost1);
        averageCostList.add(averageCost2);
        averageCostList.add(averageCost3);
    }

    private void insertDummyBlockBusterData() {
        List<BlockBuster> blockBusterList1 = new ArrayList<>();
        Random rd = new Random();
        BlockBuster blockBuster1 = new BlockBuster(123, rd.nextBoolean());
        BlockBuster blockBuster2 = new BlockBuster(122, rd.nextBoolean());
        BlockBuster blockBuster3 = new BlockBuster(125, rd.nextBoolean());
        BlockBuster blockBuster4 = new BlockBuster(126, rd.nextBoolean());
        BlockBuster blockBuster5 = new BlockBuster(121, rd.nextBoolean());
        BlockBuster blockBuster6 = new BlockBuster(129, rd.nextBoolean());
        blockBusterList1.add(blockBuster1);
        blockBusterList1.add(blockBuster2);
        blockBusterList1.add(blockBuster3);
        blockBusterList1.add(blockBuster4);
        blockBusterList1.add(blockBuster5);
        blockBusterList1.add(blockBuster6);
        SingletonClassForBlockBuster singletonClassForBlockBuster =
                SingletonClassForBlockBuster.getSingletonClassForBlockBusterInstance(blockBusterList1);
        blockBusterList = singletonClassForBlockBuster.getBlockBusterList();
    }
}

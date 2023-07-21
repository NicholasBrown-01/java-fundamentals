package inheritance;


public class Movies {
    // Properties
    private String movieTitle;


    //Constructor

    public Movies() {
    }

    public Movies(String movieTitle) {
        this.movieTitle = movieTitle;
    }

// Getters and Setters


    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movieTitle='" + movieTitle + '\'' +
                '}';
    }
}



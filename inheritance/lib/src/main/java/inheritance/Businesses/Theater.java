package inheritance.Businesses;

import inheritance.ParentClass.BusinessBlueprint;
import inheritance.Movies;
import java.util.ArrayList;

public class Theater extends BusinessBlueprint {

    // ***Properties*** // Only if something is Unique from the parent
    public ArrayList<Movies> movies = new ArrayList<>();

    // ***CONSTRUCTORS*** //
    public Theater() {
        super(); // Use the Parent's Constructor(super)
    }

    public Theater(String name, String priceCategory) { // Must have these at a minimum just like the Parent
        super(name, priceCategory); // Talk to the Parent to set these values, and get ready to initialize everything else (starRating etc.)
        this.movies = new ArrayList<>();
    }


    // Adding Movies to Theater //

    public Movies addMovies(Movies movies) {
        this.movies.add(movies);
        return movies;
    }

    public Movies removeMovies(Movies movies) {
        this.movies.remove(movies);
        return movies;
    }

    public ArrayList<Movies> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movies> movies) {
        this.movies = movies;
    }

}



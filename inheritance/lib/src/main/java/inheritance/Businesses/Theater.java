package inheritance.Businesses;
import inheritance.ParentClass.BusinessBlueprint;

import java.util.ArrayList;

public class Theater extends BusinessBlueprint {
    // ***Properties*** // Only if something is Unique from the parent
    public ArrayList<Movies> movies = new ArrayList<>();

    // ***CONSTRUCTORS*** //
    public Theater() { super(); // Use the Parent's Constructor(super)
    }

    public Theater(String name, String priceCategory) { // Must have these at a minimum just like the Parent
        super(name, priceCategory); // Talk to the Parent to set these values, and get ready to initialize everything else (starRating etc)
        this.movies = new ArrayList<>();
    }

    public Movies changeMovies(Movies movies) {
        this.movies.add(movies);
//        this.movies.remove(movies);
        return movies;
    }

}



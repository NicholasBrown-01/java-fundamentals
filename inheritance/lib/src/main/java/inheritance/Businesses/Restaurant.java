package inheritance.Businesses;
import inheritance.ParentClass.BusinessBlueprint;

public class Restaurant extends BusinessBlueprint {
    // ***Properties*** // Only if something is Unique from the parent


    // ***CONSTRUCTORS*** //
    public Restaurant() { super(); // Use the Parent's Constructor(super)
    }

    public Restaurant(String name, String priceCategory) { // Must have these at a minimum just like the Parent
        super(name, priceCategory); // Talk to the Parent to set these values, and get ready to initialize everything else (starRating etc)
    }


}



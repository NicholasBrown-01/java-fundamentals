package inheritance.Businesses;
import inheritance.ParentClass.BusinessBlueprint;

public class Shop extends BusinessBlueprint {
    // ***Properties*** // Only if something is Unique from the parent
    public String description;

    // ***CONSTRUCTORS*** //
    public Shop() { super(); // Use the Parent's Constructor(super)
    }

    public Shop(String name, String description, String priceCategory) { // Must have these at a minimum just like the Parent
        super(name, priceCategory); // Talk to the Parent to set these values, and get ready to initialize everything else (starRating etc)
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "description='" + description + '\'' +
                '}';
    }
}



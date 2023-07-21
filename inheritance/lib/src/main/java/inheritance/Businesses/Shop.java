package inheritance.Businesses;
import inheritance.ParentClass.BusinessBlueprint;

public class Shop extends BusinessBlueprint {
    // ***Properties*** // Only if something is Unique from the parent
    public String description;

    // ***CONSTRUCTORS*** //
    public Shop() { super(); // Use the Parent's Constructor(super)
    }

    public Shop(String name, String description, String priceCategory) {
        super(name, priceCategory);
        this.description = description;
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
                ", name='" + name + '\'' +
                ", reviews=" + reviews +
                ", starRating=" + starRating +
                ", totalStarReviews=" + totalStarReviews +
                ", avgStarRating=" + avgStarRating +
                ", priceCategory='" + priceCategory + '\'' +
                '}';
    }
}





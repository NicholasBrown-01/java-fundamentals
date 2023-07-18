package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    //Properties
    private String name;
    private boolean haveFood;
    private int menuItems;
    private int tablesAvail;
    private List<Review> reviews; //Fun Fact:Using List lets me choose what type later such as Array, ArrayList, Stack, Linked etc.

    //Constructor
    public Restaurant() {
        this.reviews = new ArrayList<>();
    }

    public Restaurant(String name, boolean haveFood, int menuItems, int tablesAvail) {
        this.name = name;
        this.haveFood = haveFood;
        this.menuItems = menuItems;
        this.tablesAvail = tablesAvail;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHaveFood() {
        return haveFood;
    }

    public void setHaveFood(boolean haveFood) {
        this.haveFood = haveFood;
    }

    public int getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(int menuItems) {
        this.menuItems = menuItems;
    }

    public int getTablesAvail() {
        return tablesAvail;
    }

    public void setTablesAvail(int tablesAvail) {
        this.tablesAvail = tablesAvail;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", haveFood=" + haveFood +
                ", menuItems=" + menuItems +
                ", tablesAvail=" + tablesAvail +
                ", reviews=" + reviews +
                '}';
    }
}



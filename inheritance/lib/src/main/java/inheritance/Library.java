/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {

    public static void main(String[] args) {

        Restaurant steakEaters = new Restaurant("Steak Eaters", true, 7, 20);
//        System.out.println(steakEaters.toString());
        Review revSteakEaters = new Review("Food bad", "Charles Schwabb", 1.5f, steakEaters);
        steakEaters.addReview(revSteakEaters);
        //System.out.println(revSteakEaters.toString());


        Restaurant vegEaters = new Restaurant("Veggie Eaters", true, 7, 20);
//        System.out.println(vegEaters.toString());
        Review revVegEaters = new Review("Food good", "Tony Baloni", 3.5f, vegEaters);
        vegEaters.addReview(revVegEaters);
        //System.out.println(revVegEaters.toString());
    }

}
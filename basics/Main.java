import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Pluralize Method

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide an animal (Ex: Dog, Cat etc):");
        String userWord = String.valueOf(scanner.nextLine());

        System.out.println("Please input any number");
        int userNumber = Integer.valueOf(scanner.nextLine());

        pluralize(userWord, userNumber);
        flipNHeads();
        clock();

    }

    static void pluralize(String userWord, int userNumber) {

        if (userNumber > 1 || userNumber == 0) {
            System.out.println("I own " + userNumber + " " + userWord + "s.");

        } else {
            System.out.println("I own " + userNumber + " " + userWord + ".");
        }

    }

    static void flipNHeads() {

        // FlipNHeads Method

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int headsCounter = 0;
        int totalCounter = 0;

        System.out.println("How many Heads in a row would you like to see before the program ends?");
        int userHeads = Integer.valueOf(scanner.nextLine());

        while (headsCounter < userHeads) {
            int flip = random.nextInt(2) + 1;

            if (flip == 1) {
                System.out.println("Heads");
                headsCounter++;
                totalCounter++;
            } else {
                System.out.println("Tails");
                headsCounter = 0;
                totalCounter++;
            }
        }
        System.out.println("It took " + totalCounter + " flips to flip " + userHeads + " in a row.");
    }

    static void clock() {

        
        System.out.println("You must enter \"Ctrl + C\" or Stop via the IDE to end this time counting program.");
        String previousTime = "";
        
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            if (!time.equals(previousTime)) {
                System.out.println(time);
                previousTime = time;
            }
        }

    }

}